package com.example.demo.controllers;

@RestController
@RequestMapping("/professor")
public class ProfessorController {
    @GetMapping
    public ReponseEntity getAllProfessor(){
        return ResponseEntity.ok();
    }
}
