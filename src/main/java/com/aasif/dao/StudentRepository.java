package com.aasif.dao;

import com.aasif.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
    @Query("select count(s) from Student s")
    Long totalStudents();

}
