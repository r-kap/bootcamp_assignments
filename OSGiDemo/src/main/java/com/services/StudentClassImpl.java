package com.services;

import com.pojos.Student;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component(property = {"name=student.service"},immediate = true)
public class StudentClassImpl implements StudentClassService {

    @Reference
    private ClassroomService classConfigurationService;

    List<Student> students = new ArrayList<>();


    @Deactivate
    public void deactivate(){
        deleteStudent(1);
        System.out.println("student deleted");
        System.out.println("Service shutdown");
    }

    public void addStudents(Student s) {
        if(classConfigurationService.isClassLimitReached(students)){
            System.out.println("Class is full. Remove students to add more.");
        }
        else{
            students.add(s);
        }
    }

    public void deleteStudent(int id) {
        Iterator<Student> iter = students.iterator();
        while (iter.hasNext()) {
            if (iter.next().getId() == id) {
                iter.remove();
                break;
            }
        }
    }

    public boolean isStudentPassed(int id) {
        Iterator<Student> iter = students.iterator();
        while (iter.hasNext()) {
            if (iter.next().getId() == id) {
                if (iter.next().getMarks_obtained() >= classConfigurationService.getPassingMarks()) {
                    return true;
                }
            }
        }
        return false;
    }

    public Student getStudent(int id) {
        Iterator<Student> iter = students.iterator();
        while (iter.hasNext()) {
            if (iter.next().getId() == id) {
                return iter.next();
            }
        }
        return null;
    }

    public List<Student> getAllStudents(){
        return students;
    }

}
