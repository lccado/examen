package cl.ayudantia.examen.repository;

import org.springframework.data.repository.CrudRepository;

import cl.ayudantia.examen.model.User;

public interface UserRepository extends CrudRepository<User, Long>{
    
}
