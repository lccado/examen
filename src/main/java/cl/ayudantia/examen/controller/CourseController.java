package cl.ayudantia.examen.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.ayudantia.examen.model.Course;
import cl.ayudantia.examen.repository.CourseRepository;

@RestController
@RequestMapping("course")
public class CourseController {
    @Autowired
    private CourseRepository courseRepository;

    @PostMapping("/new")
    public Course createCourse(@RequestBody Course course) {
        return courseRepository.save(course);
    }

    @GetMapping("/{id}")
    public Course getCourse(@PathVariable Long id) {
        Optional<Course> op = courseRepository.findById(id);
        if(op.isPresent()) {
            return op.get();
        } else {
            return null;
        }
    }
}
