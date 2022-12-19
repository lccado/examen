package cl.ayudantia.examen.repository;

import org.springframework.data.repository.CrudRepository;

import cl.ayudantia.examen.model.Course;

public interface CourseRepository extends CrudRepository<Course, Long>{
    
}
