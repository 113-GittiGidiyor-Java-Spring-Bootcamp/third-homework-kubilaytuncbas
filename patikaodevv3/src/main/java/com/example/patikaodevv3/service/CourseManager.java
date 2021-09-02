package com.example.patikaodevv3.service;

import com.example.patikaodevv3.model.Course;
import com.example.patikaodevv3.repository.CourseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import java.util.List;


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
    @Transactional(readOnly = true)
    public Course findById(int id) {
        return courseDao.findById(id).get();
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
