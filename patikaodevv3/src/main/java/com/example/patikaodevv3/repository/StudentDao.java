package com.example.patikaodevv3.repository;

import com.example.patikaodevv3.model.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentDao extends CrudRepository<Student,Integer> {

    @Query("select s.Gender from Student s Group by s.Gender")
    List<Student> getStudentsWithGroupByGender();
}
