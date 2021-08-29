package com.example.patikaodevv3.controller;

import com.example.patikaodevv3.model.Course;
import com.example.patikaodevv3.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CoursesController {

    CourseService courseService;

    @Autowired
    public CoursesController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/findcourses")
    public ResponseEntity<List<Course>> findAll(){
        return new ResponseEntity<>(courseService.findAll(), HttpStatus.OK);
    }
    @PostMapping("/saveCourse")
    public Course saveCourse(@RequestBody Course course){
        return courseService.save(course);
    }
    @PutMapping("/updateCourse")
    public void updateCourse(@RequestBody Course course){
        courseService.update(course);
    }
    @PostMapping("/delete")
    public void deleteCourse(@RequestBody int id){
        courseService.deleteById(id);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Course> findCourseById(@PathVariable int id ){
        return new ResponseEntity(courseService.findById(id),HttpStatus.OK);
    }

}
