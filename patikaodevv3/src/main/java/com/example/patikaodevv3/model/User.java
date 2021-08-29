package com.example.patikaodevv3.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@MappedSuperclass
@Table(name="users")
public abstract class User {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name="id")
    private  int id;

    @Column(name="name")
    private String name;

    @Column(name="address")
    private String address;

}
