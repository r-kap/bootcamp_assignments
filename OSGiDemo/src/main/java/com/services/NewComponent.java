package com.services;

import com.pojos.Student;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;

/*
    This is a dummy component to demonstrate how the services are being consumed.

    @Reference is used to denote that a reference is being made to the service.
 */
@Component()
public class NewComponent {

    @Reference(target = "(name=student.service)")
    protected StudentClassService studentService;

    Student s1 = new Student(1, "Rohit", 22, 82);
    Student s2 = new Student(2, "Ishrat", 22, 85);

    @Activate
    @Modified
    protected void activate(){

        System.out.println("Hello World");
        studentService.addStudents(s1);
        studentService.addStudents(s2);
        System.out.println(studentService.isStudentPassed(1));
        System.out.println(studentService.getStudent(1));
        System.out.println(studentService.getAllStudents());
    }


}
