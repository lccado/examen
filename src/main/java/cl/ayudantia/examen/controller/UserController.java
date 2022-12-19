package cl.ayudantia.examen.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.ayudantia.examen.model.User;
import cl.ayudantia.examen.repository.UserRepository;
import lombok.extern.java.Log;

@RestController
@RequestMapping("/user")
@Log
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/new")
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping("/{id}")
    public User createUser(@PathVariable Long id) {
        Optional<User> op = userRepository.findById(id);
        if(op.isPresent()) {
            //return op.get();
            log.info(op.get().toString());
            return null;
        } else {
            return null;
        }
    }

}
