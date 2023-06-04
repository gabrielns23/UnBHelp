package com.example.demo.controllers;

@RestController
@RequestMapping
public class DepartmentController {
    @getMapping
    public ResponseEntity getAllDepartment(){
        return ResponseEntity.ok();
    }
}
