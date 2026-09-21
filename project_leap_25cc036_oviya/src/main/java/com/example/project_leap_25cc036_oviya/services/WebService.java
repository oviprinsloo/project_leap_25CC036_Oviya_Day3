package com.example.project_leap_25cc036_oviya.services;

import com.example.project_leap_25cc036_oviya.model.Student;

import java.util.List;

public interface WebService {

    Student save(Student student);
    void deleteStudent(Long id);
    List<Student> readStudents();
    Student updateStudent(Student student);

    List<Student> getStudents();
}
