package com.example.studentApplication.service;

import com.example.studentApplication.model.StudentDataModel;
import com.example.studentApplication.repository.StudentDataRepo;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.UUID;

@Service
public class StudentService {
    @Autowired
    private static StudentDataRepo StudentDataRepo;

    public static String AddStudent(String name, int age, String aadhar, String university){
        String rid = UUID.randomUUID().toString();
        StudentDataModel StudentModel = StudentDataRepo.addStudent(rid,name,age,aadhar,university);
        return StudentModel.getId();
    }

    public static ArrayList GetAllStudentByUniversity(String university){
        return StudentDataRepo.getAllStudentByUniversity(university);
    }
    public static StudentDataModel GetStudentById(String id){
        return StudentDataRepo.GetStudentById(id);
    }
}