package com.dhia.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> findAllStudents(){
        return List.of(new Student(
                        "dhia",
                        "thabet",
                        "email",
                        LocalDate.now(), 23
                ),
                new Student(
                        "dhia",
                        "thabet",
                        "email",
                        LocalDate.now(), 23
                )
        );
    }
}
