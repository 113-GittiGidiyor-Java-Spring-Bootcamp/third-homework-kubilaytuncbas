package com.example.patikaodevv3.repository;

import com.example.patikaodevv3.model.VisitingResearcher;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VisitingResearcherDao extends CrudRepository<VisitingResearcher,Integer> {
    List<VisitingResearcher> findFirst3ByHourlySalaryGreaterThan();
    List<VisitingResearcher> findFirst3ByHourlySalaryOrderByHourlySalaryDesc();
}
