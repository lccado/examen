package cl.ayudantia.examen.repository;

import org.springframework.data.repository.CrudRepository;

import cl.ayudantia.examen.model.UserCourse;

public interface UserCourseRepository extends CrudRepository<UserCourse, Long>{
    
}
