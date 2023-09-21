package edu.mum.cs.cs425.eRegister.services;

import java.util.List;

import edu.mum.cs.cs425.eRegister.models.Student;

public interface StudentService {
    Student getById(Long id);
    List<Student> getAll();
    Student create(Student student);
    Student update(Long id, Student student);
    void delete(Long id);
}