package com.workshop.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workshop.course.entities.User;

@RestController
@RequestMapping("/users")
public class UserResource {


    @GetMapping
    public ResponseEntity<User> findAllUsers(){
        var u = new User(1L, "Maria", "maria@gmail.com", "982327300", "12345");
        return ResponseEntity.ok().body(u);
    }
    
}
