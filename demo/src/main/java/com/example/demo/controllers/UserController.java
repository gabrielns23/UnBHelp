package com.example.demo.controllers;


import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.getMapping;



@RestController
@RequestMapping("/user")
public class UserController {
    @getMapping
    public ResponseEntity getAllUser(){
        return ResponseEntity.ok();
    }
}
