package com.example.patikaodevv3.service;

import com.example.patikaodevv3.model.Course;

import java.util.List;

public interface CourseService {
    List<Course> findAll();
    Course findById(int id);
    Course save(Course course);
    void deleteById(int id);
    void update(Course course);
}
