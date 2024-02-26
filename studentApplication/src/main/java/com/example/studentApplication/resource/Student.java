package com.example.studentApplication.resource;

import com.example.studentApplication.model.StudentDataModel;
import com.example.studentApplication.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;


@RestController
@RequestMapping("/Student")
public class Student {
    @Autowired
    private StudentService StudentData;

    @GetMapping("/GetStudentById/{id}")
    public StudentDataModel GetStudentById(@PathVariable String id) throws Exception {
        return StudentService.GetStudentById(id);
    }

    @PostMapping("/AddStudent/{name}/{age}/{adhar}/{university}")
    public String AddStudent(@PathVariable String name, @PathVariable int age,@PathVariable String aadhar, @PathVariable String university) {
        return StudentService.AddStudent(name,age,aadhar,university);
    }

    @GetMapping("/GetAllStudentByUniversity/{university}")
    public ArrayList GetAllStudentByUniversity(@PathVariable String university) throws Exception {
        return StudentService.GetAllStudentByUniversity(university);
    }
}