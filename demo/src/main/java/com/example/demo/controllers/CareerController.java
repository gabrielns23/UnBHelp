package com.example.demo.controllers;


@RestController
@RequestMapping("/career")
public class CareerController {
    @getMapping
    public ResponseEntity getAllCareer(){
        return ResponseEntity.ok();
    }
}
