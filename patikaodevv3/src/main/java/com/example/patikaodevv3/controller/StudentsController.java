package com.example.patikaodevv3.controller;

import com.example.patikaodevv3.model.Student;
import com.example.patikaodevv3.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentsController {

    StudentService studentService;

    @Autowired
    public StudentsController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<Student>> findAll(){
        return new ResponseEntity<>(studentService.findAll(), HttpStatus.OK);
    }
    @GetMapping("/findById/{id}")
    public ResponseEntity<Student> findStudentById(@PathVariable int id){
        return new ResponseEntity(studentService.findById(id),HttpStatus.OK);
    }
    @PostMapping("/saveStudent")
    public Student saveStudent(Student student){
        return studentService.save(student);
    }
    @PostMapping("/deleteStudent")
    public  void deleteStudent(int id){
        studentService.deleteById(id);
    }
    @PutMapping("/updateStudent")
    public void updateStudent(Student student){
        studentService.update(student);
    }

}
