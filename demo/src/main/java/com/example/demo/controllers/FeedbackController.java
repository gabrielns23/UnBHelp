package com.example.demo.controllers;

@RestController
@RequestMapping("/controller")
public class FeedbackController {
    @GetMapping
    public ResponseEntity getAllFeedback(){
        return ResponseEntity.ok();
    }
}
