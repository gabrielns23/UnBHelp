package com.example.demo.controllers;

@RestController
@RequestMapping("/discipline")
public class DisciplineController {
    @getMapping
    public ResponseEntity getAllDiscipline(){
        return ResponseEntity.ok();
    }
}
