package com.example.demo.controllers;

@RestController
@RequestMapping("/controller")
public class FeedbackController {
    @getMapping
    public ResponseEntity getAllFeedback(){
        return ResponseEntity.ok();
    }
}
