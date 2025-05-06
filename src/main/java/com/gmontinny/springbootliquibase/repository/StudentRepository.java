package com.gmontinny.springbootliquibase.repository;

import com.gmontinny.springbootliquibase.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
