package com.aasif;

import com.aasif.dao.StudentRepository;
import com.aasif.dao.TeacherRepository;
import com.aasif.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
@Component
public class SchedularClass {

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private TeacherRepository teacherRepository;
    @PostConstruct
    @Scheduled(fixedRate = 2000)
    public void printData(){

        Long s = studentRepository.totalStudents();
        Long t = teacherRepository.totalTeachers();
        System.out.println();
        System.out.println();
        System.out.println("Total No. Of Students are : "+s);
        System.out.println("Total No. Of Teachers are : "+s);
        System.out.println();
        System.out.println();
    }
}
