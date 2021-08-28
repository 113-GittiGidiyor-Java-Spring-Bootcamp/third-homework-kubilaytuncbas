package com.example.patikaodevv3.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ManyToAny;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="permanent_instructors")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PermanentInstructor extends User {

    @Column(name="phone_number")
    private String phoneNumber;

    @Column(name="fixed_salary")
    private int fixedSalary;

    @OneToMany(mappedBy = "permanentInstructor")
    private List<Course> courseList=new ArrayList<>();
}
