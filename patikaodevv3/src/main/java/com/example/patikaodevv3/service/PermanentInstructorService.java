package com.example.patikaodevv3.service;

import com.example.patikaodevv3.model.PermanentInstructor;

import java.util.List;

public interface PermanentInstructorService {

    List<PermanentInstructor> findAll();
    PermanentInstructor findById(int id);
    PermanentInstructor save(PermanentInstructor permanentInstructor);
    void deleteById(int id);
    void update(PermanentInstructor permanentInstructor);
}
