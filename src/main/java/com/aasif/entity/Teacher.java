package com.aasif.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class Teacher {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column
    private int id;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String department;

    public Teacher() {
    }

    public Teacher( String firstName, String lastName, String department) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.department=department;
    }
}
