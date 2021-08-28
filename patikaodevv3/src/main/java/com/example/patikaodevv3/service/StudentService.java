package com.example.patikaodevv3.service;

import com.example.patikaodevv3.model.Student;

import java.util.List;

public interface StudentService {

    List<Student> findAll();
    Student findById(int id);
    Student save(Student student);
    void deleteById(int id);
    void update(Student student);
}
