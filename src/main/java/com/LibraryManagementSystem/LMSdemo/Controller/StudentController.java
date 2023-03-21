package com.LibraryManagementSystem.LMSdemo.Controller;

import com.LibraryManagementSystem.LMSdemo.DTO.StudentRequestDTO;
import com.LibraryManagementSystem.LMSdemo.DTO.StudentResponseDTO;
import com.LibraryManagementSystem.LMSdemo.Entity.Student;
import com.LibraryManagementSystem.LMSdemo.Repository.StudentRepository;
import com.LibraryManagementSystem.LMSdemo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("student")
public class StudentController {

    @Autowired
    StudentService service;
    @PostMapping("/add")
    public StudentResponseDTO addStudent(@RequestBody StudentRequestDTO studentRequestDTO){

         return service.addStudent(studentRequestDTO);
    }
}
