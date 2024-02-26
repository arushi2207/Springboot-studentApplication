package com.example.studentApplication.model;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
public class StudentDataModel {
    public String id;
    public String name;
    public int age;
    public String aadhar;
    public String university;
}