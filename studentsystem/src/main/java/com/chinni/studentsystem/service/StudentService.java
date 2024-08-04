package com.chinni.studentsystem.service;

import com.chinni.studentsystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student>getAllStudents();
}
