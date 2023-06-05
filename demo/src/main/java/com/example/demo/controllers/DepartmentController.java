package com.example.demo.controllers;

@RestController
@RequestMapping
public class DepartmentController {
    @GetMapping
    public ResponseEntity getAllDepartment(){
        return ResponseEntity.ok();
    }
}
