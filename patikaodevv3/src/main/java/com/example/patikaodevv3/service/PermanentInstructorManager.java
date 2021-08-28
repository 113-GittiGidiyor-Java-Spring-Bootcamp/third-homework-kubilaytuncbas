package com.example.patikaodevv3.service;

import com.example.patikaodevv3.model.PermanentInstructor;
import com.example.patikaodevv3.repository.PermanentInstructorDao;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PermanentInstructorManager implements PermanentInstructorService{
    PermanentInstructorDao permanentInstructorDao;

    public PermanentInstructorManager(PermanentInstructorDao permanentInstructorDao) {
        this.permanentInstructorDao = permanentInstructorDao;
    }

    @Override
    public List<PermanentInstructor> findAll() {
        return (List<PermanentInstructor>) permanentInstructorDao.findAll();
    }

    @Override
    public Optional<PermanentInstructor> findById(int id) {
        return permanentInstructorDao.findById(id);
    }

    @Override
    public PermanentInstructor save(PermanentInstructor permanentInstructor) {
        return permanentInstructorDao.save(permanentInstructor);
    }

    @Override
    public void deleteById(int id) {
        permanentInstructorDao.deleteById(id);
    }

    @Override
    public void update(PermanentInstructor permanentInstructor) {
        permanentInstructorDao.save(permanentInstructor);
    }

    @Override
    public List<PermanentInstructor> findFirst3ByFixedSalaryGreaterThan() {
        return permanentInstructorDao.findFirst3ByFixedSalaryGreaterThan();
    }

    @Override
    public List<PermanentInstructor> findFirst3ByFixedSalaryOrderByFixedSalaryDesc() {
        return permanentInstructorDao.findFirst3ByFixedSalaryOrderByFixedSalaryDesc();
    }
}
