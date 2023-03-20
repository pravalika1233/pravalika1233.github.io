package com.example.studentsapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studentsapplication.data.entity.Student;
import com.example.studentsapplication.data.entity.StudentsRepository;

@Service
public  class StudentServiceMySQL
    implements StudentService
{

    private final StudentsRepository studentsRepository;

    public StudentServiceMySQL( @Autowired StudentsRepository studentsRepository )
    {
        this.studentsRepository = studentsRepository;
    }

    @Override
    public Iterable<Student> all()
    {
        return studentsRepository.findAll();
    }

    @Override
    public Student get( int studentId )
    {
        return studentsRepository.findById( studentId );
    }

    @Override
    public void save( Student student )
    {
        studentsRepository.save( student );
    }

    @Override
    public void delete( int studentId )
    {
        studentsRepository.deleteById( studentId );
    }

//	@Override
//	public List<Student> getAllStudents() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public Student findById(int studentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
		
	}
}