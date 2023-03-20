package com.example.studentsapplication.service;

import com.example.studentsapplication.data.entity.Student;

public interface StudentService {
	 Iterable<Student> all();

	    Student get( int studentId );

	    void save( Student student );

	    void delete( int studentId );

		Student findById(int studentId);

		void deleteById(String id);
}
