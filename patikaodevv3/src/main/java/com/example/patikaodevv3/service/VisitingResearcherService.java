package com.example.patikaodevv3.service;

import com.example.patikaodevv3.model.VisitingResearcher;

import java.util.List;
import java.util.Optional;

public interface VisitingResearcherService {

    List<VisitingResearcher> findAll();
    Optional<VisitingResearcher> findById(int id);
    VisitingResearcher save(VisitingResearcher visitingResearcher);
    void deleteById(int id);
    void update(VisitingResearcher visitingResearcher);
    List<VisitingResearcher> findFirst3ByHourlySalaryGreaterThan();
    List<VisitingResearcher> findFirst3ByHourlySalaryOrderByHourlySalaryDesc();
}
