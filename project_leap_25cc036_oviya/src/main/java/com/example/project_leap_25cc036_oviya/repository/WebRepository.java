package com.example.project_leap_25cc036_oviya.repository;

import com.example.project_leap_25cc036_oviya.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WebRepository extends JpaRepository<Student,Long> {

}

