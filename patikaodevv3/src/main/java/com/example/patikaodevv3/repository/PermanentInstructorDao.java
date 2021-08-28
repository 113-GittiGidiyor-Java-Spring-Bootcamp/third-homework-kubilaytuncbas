package com.example.patikaodevv3.repository;

import com.example.patikaodevv3.model.PermanentInstructor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PermanentInstructorDao extends CrudRepository<PermanentInstructor,Integer> {

    List<PermanentInstructor> findFirst3ByFixedSalaryGreaterThan();
    List<PermanentInstructor> findFirst3ByFixedSalaryOrderByFixedSalaryDesc();

}
