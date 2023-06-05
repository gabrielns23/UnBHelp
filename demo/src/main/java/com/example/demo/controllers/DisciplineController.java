package com.example.demo.controllers;

@RestController
@RequestMapping("/discipline")
public class DisciplineController {
    @GetMapping
    public ResponseEntity getAllDiscipline(){
        return ResponseEntity.ok();
    }
}
