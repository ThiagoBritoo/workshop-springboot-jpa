package com.workshop.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workshop.course.entities.User;
import com.workshop.course.services.UserService;

@RestController
@RequestMapping("/users")
public class UserResource {


    @Autowired
    private UserService userService;


    @GetMapping
    public ResponseEntity<List<User>> findAllUsers(){        
        return ResponseEntity.ok().body(userService.findAllUsers());
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable(name = "id") Long id){
        return ResponseEntity.ok().body(userService.findById(id));
    }
}
