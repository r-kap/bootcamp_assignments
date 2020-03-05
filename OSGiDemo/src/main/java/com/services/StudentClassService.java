package com.services;

import com.pojos.Student;

import java.util.List;

public interface StudentClassService {

    public void addStudents(Student s);
    public void deleteStudent(int id);
    public boolean isStudentPassed(int id);
    public Student getStudent(int id);
    public List<Student> getAllStudents();
}
