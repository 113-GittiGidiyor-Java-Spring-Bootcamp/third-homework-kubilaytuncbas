package com.example.patikaodevv3.service;

import com.example.patikaodevv3.model.Course;
import com.example.patikaodevv3.repository.CourseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseManager implements CourseService{
    CourseDao courseDao;
    @Autowired
    public CourseManager(CourseDao courseDao) {
        this.courseDao = courseDao;
    }

    @Override
    public List<Course> findAll() {
        return (List<Course>) courseDao.findAll();
    }

    @Override
    public Optional<Course> findById(int id) {
        return courseDao.findById(id);
    }

    @Override
    public Course save(Course course) {
        return courseDao.save(course);
    }

    @Override
    public void deleteById(int id) {
        courseDao.deleteById(id);
    }

    @Override
    public void update(Course course) {
        courseDao.save(course);
    }
}
