package com.aasif.dao;

import com.aasif.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TeacherRepository extends JpaRepository<Teacher,Integer> {
    @Query("select count(t) from Teacher t")
    Long findCount();
}
