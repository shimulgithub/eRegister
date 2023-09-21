package edu.mum.cs.cs425.eRegister.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.mum.cs.cs425.eRegister.models.Student;
import edu.mum.cs.cs425.eRegister.repositoies.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student getById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student create(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student update(Long id, Student student) 
    {
        if (studentRepository.existsById(id)) {
            student.setStudentId(id);
            return studentRepository.save(student);
        }
        return null; // Handle the case where the student with the given ID doesn't exist
    }

    @Override
    public void delete(Long id) {
        studentRepository.deleteById(id);
    }
}