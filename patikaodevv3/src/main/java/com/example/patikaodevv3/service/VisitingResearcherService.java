package com.example.patikaodevv3.service;

import com.example.patikaodevv3.model.VisitingResearcher;

import java.util.List;

public interface VisitingResearcherService {

    List<VisitingResearcher> findAll();
    VisitingResearcher findById(int id);
    VisitingResearcher save(VisitingResearcher visitingResearcher);
    void deleteById(int id);
    void update(VisitingResearcher visitingResearcher);
}
