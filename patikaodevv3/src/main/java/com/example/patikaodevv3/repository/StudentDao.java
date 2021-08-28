package com.example.patikaodevv3.repository;

import com.example.patikaodevv3.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentDao extends CrudRepository<Student,Integer> {
}
