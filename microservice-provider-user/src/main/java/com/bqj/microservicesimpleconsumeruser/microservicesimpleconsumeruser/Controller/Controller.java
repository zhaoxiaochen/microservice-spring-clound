package com.bqj.microservicesimpleconsumeruser.microservicesimpleconsumeruser.Controller;

import com.bqj.microservicesimpleconsumeruser.microservicesimpleconsumeruser.Repository.UserRepository;
import com.bqj.microservicesimpleconsumeruser.microservicesimpleconsumeruser.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/simple/{id}")
    public User findOne(@PathVariable Long id){
        return userRepository.findOne(id);
    }

}
