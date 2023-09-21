package edu.mum.cs.cs425.eRegister.repositoies;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.mum.cs.cs425.eRegister.models.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
