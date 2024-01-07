package com.second_spring_project.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


@RestController
@RequestMapping(path = "students")
public class StudentController {

    @GetMapping
    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "maha",
                        "maha.jamal@gmail.com",
                        LocalDate.of(2000, Month.JANUARY,16),
                        21

                )

        ) ;
    }

}
