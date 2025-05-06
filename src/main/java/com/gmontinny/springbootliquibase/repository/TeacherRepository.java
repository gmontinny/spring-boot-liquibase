package com.gmontinny.springbootliquibase.repository;

import com.gmontinny.springbootliquibase.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {}
