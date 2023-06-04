package com.example.demo.controllers;

@RestController
@RequestMapping("/professor")
public class ProfessorController {
    @getMapping
    public ReponseEntity getAllProfessor(){
        return ResponseEntity.ok();
    }
}
