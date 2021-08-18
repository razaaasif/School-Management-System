package com.aasif.entity;

import lombok.Data;
import lombok.extern.apachecommons.CommonsLog;

import javax.persistence.*;

@Entity
@Table
@Data
public class Student {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column
    private int id;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String email;
    @Column
    private String fatherName;
    @Column
    private String course;
    @Column
    private String branch;
    @Column
    private String session;

    public Student() {
    }

    public Student(String firstName, String lastName, String email, String fatherName, String course, String branch, String session) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.fatherName = fatherName;
        this.course = course;
        this.branch = branch;
        this.session = session;
    }
}
