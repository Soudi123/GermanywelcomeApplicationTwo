package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin
    @RestController
    public class HelloController {
@Autowired
        @GetMapping("/hello")
        public String sayHello() {
            return "Guten Tag. Wie geht es dir? Ma name ist Soudeh. ";
        }
    }



