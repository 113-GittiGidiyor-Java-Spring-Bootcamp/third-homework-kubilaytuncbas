package com.example.patikaodevv3.service;

import com.example.patikaodevv3.model.Student;
import com.example.patikaodevv3.repository.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentManager implements StudentService{

    StudentDao studentDao;
    @Autowired
    public StudentManager(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public List<Student> findAll() {
        return (List<Student>) studentDao.findAll();
    }

    @Override
    public Optional<Student> findById(int id) {
        return studentDao.findById(id);
    }

    @Override
    public Student save(Student student) {
        return studentDao.save(student);
    }

    @Override
    public void deleteById(int id) {
        studentDao.deleteById(id);
    }

    @Override
    public void update(Student student) {
        studentDao.save(student);
    }

    @Override
    public List<Student> getStudentsWithGroupByGender() {
        return studentDao.getStudentsWithGroupByGender();
    }
}
