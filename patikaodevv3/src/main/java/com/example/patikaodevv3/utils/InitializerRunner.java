package com.example.patikaodevv3.utils;

import com.example.patikaodevv3.model.Course;
import com.example.patikaodevv3.repository.CourseDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class InitializerRunner implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(InitializerRunner.class);

    @Autowired
    CourseDao courseDao;

    @Override
    public void run(String... args) throws Exception {
        courseDao.deleteAll();

        courseDao.save(Course.builder().courseCode("101").courseName("Fizik").creditScore(5).build());
        courseDao.save(Course.builder().age(35).name("Hasan").email("ha@ah.com").build());
        courseDao.save(Course.builder().age(56).name("Ahmet").email("ahmet@ah.com").build());
        courseDao.save(Course.builder().age(22).name("Ayşe").email("ayse@a.com").build());

        courseDao.findAll().forEach(course -> logger.info("{}", course));

    }
}
