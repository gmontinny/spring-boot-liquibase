package com.gmontinny.springbootliquibase.resource;

import com.gmontinny.springbootliquibase.model.Student;
import com.gmontinny.springbootliquibase.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class StudentResource {

    private final StudentService service;

    @GetMapping("/students")
    List<Student> findAll() {
        return service.findAll();
    }

}
