package com.LibraryManagementSystem.LMSdemo.Repository;

import com.LibraryManagementSystem.LMSdemo.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
