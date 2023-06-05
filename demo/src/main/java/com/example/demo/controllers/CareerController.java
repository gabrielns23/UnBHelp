package com.example.demo.controllers;


@RestController
@RequestMapping("/career")
public class CareerController {
    @GetMapping
    public ResponseEntity getAllCareer(){
        return ResponseEntity.ok();
    }
}
