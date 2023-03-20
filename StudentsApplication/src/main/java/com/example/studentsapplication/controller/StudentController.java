package com.example.studentsapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentsapplication.data.entity.Student;
import com.example.studentsapplication.service.StudentService;

@RestController

public class StudentController {

    private final StudentService studentService;


    public StudentController(@Autowired StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/student")
    public  Iterable<Student> all() {
        return studentService.all();
    }

    @GetMapping("/student/{id}")
    public Student get( int studentId ) {
    	return studentService.findById(studentId);
    }

    @PostMapping("/student")
    public void save(@RequestBody Student student) {
        studentService.save(student);
    }

    @PutMapping("/student")
    public void update(@RequestBody Student student) {
        studentService.save(student);
    }

    @DeleteMapping("/student/{id}")
    public void delete(@PathVariable String id) {
        studentService.deleteById(id);
    }
}