package com.gmontinny.springbootliquibase.service;

import com.gmontinny.springbootliquibase.model.Student;
import com.gmontinny.springbootliquibase.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class StudentService {
    private final StudentRepository repository;

    /**
     * Método para buscar todos os estudantes utilizando programação funcional
     *
     * @return Lista de estudantes
     */
    public List<Student> findAll() {
        return repository.findAll()
                .stream()
                .collect(Collectors.toList());
    }

}
