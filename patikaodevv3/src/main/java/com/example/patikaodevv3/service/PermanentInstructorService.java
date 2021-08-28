package com.example.patikaodevv3.service;

import com.example.patikaodevv3.model.PermanentInstructor;

import java.util.List;
import java.util.Optional;

public interface PermanentInstructorService {

    List<PermanentInstructor> findAll();
    Optional<PermanentInstructor> findById(int id);
    PermanentInstructor save(PermanentInstructor permanentInstructor);
    void deleteById(int id);
    void update(PermanentInstructor permanentInstructor);
    List<PermanentInstructor> findFirst3ByFixedSalaryGreaterThan();
    List<PermanentInstructor> findFirst3ByFixedSalaryOrderByFixedSalaryDesc();
}
