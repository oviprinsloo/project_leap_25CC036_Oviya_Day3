package com.example.project_leap_25cc036_oviya.controller;

import com.example.project_leap_25cc036_oviya.model.Student;
import com.example.project_leap_25cc036_oviya.services.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WebController {
    @Autowired
    private WebService webService;

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return webService.save(student);
    }
    @GetMapping
    public List<Student> getStudents() {
        return webService.getStudents();
    }
}
