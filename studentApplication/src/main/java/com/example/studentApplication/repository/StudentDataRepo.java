package com.example.studentApplication.repository;

import com.example.studentApplication.model.StudentDataModel;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class StudentDataRepo {
    private Map<String, StudentDataModel> StudentMap;
    public StudentDataRepo(){
        StudentMap = new HashMap<>();
    }
    public StudentDataModel addStudent(String id, String name, int age, String aadhar, String university){
        StudentMap.put(id,new StudentDataModel(id,name,age,aadhar,university));
        return null;
    }
    public StudentDataModel GetStudentById(String id){
        return StudentMap.get(id);
    }
    public ArrayList<StudentDataModel> getAllStudentByUniversity(String University){
        ArrayList<StudentDataModel> list = new ArrayList<>();
        for(Map.Entry<String, StudentDataModel> entry : StudentMap.entrySet()){
            StudentDataModel student = entry.getValue();
            if(student.getUniversity().equals(University)){
                list.add(student);
            }
        }
        return list;
    }
}