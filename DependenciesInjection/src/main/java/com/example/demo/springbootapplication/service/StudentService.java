package com.example.demo.springbootapplication.service;

import java.util.List;

import com.example.demo.springbootapplication.model.Student;

public interface StudentService {

	void add( Student student );

	    void delete( Student student );

	    List<Student> all();

	    Student findById (String id);
	    
}
