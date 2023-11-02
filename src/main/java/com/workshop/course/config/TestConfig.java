package com.workshop.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.workshop.course.entities.User;
import com.workshop.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
    
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        var u1 = new User(null, "Maria Brown", "maria@gmail.com", "982327300", "123456");
        var u2 = new User(null, "Alex Green", "alex@gmail.com", "973462542", "123456");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }

}
