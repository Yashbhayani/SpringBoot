package com.example.demo.Service.IMPL;

import com.example.demo.Repository.StudentRepository;
import com.example.demo.Service.StudentService;
import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceIMPL implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student create(Student student){
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(Integer id){
        return studentRepository.findById(id).get();
    }

    @Override
    public Student update(Student student){
        return studentRepository.save(student);
    }

    @Override
    public String deleteStudent(Integer id){
        studentRepository.deleteById(id);
        return "Id Deleted";
    }
}
