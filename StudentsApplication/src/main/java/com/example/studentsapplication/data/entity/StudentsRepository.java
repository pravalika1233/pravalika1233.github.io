package com.example.studentsapplication.data.entity;

import org.springframework.data.repository.CrudRepository;

public interface StudentsRepository
extends CrudRepository<Student, Integer>
{

Student findById( int id );

}