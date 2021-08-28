package com.example.patikaodevv3.service;

import com.example.patikaodevv3.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentManager implements StudentService{
    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public Student findById(int id) {
        return null;
    }

    @Override
    public Student save(Student student) {
        return null;
    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public void update(Student student) {

    }
}
