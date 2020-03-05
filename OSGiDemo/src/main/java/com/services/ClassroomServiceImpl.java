package com.services;

import com.configurations.ClassConfiguration;
import com.pojos.Student;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.Designate;

import java.util.List;

@Component(property = {"name=class service", "version = 1.0"}, immediate = true)
@Designate(ocd = com.configurations.ClassConfiguration.class)
public class ClassroomServiceImpl implements ClassroomService {

    @Activate
    ClassConfiguration classConfiguration;

    @Activate
    @Modified
    protected void activate(){
        System.out.println("Hello World.");
    }

    public boolean isClassLimitReached(List <Student> students){
        int s = students.size();
        return s == classConfiguration.no_Of_Students();
    }


    public int getPassingMarks(){
        return classConfiguration.min_marks_to_pass();
    }
}
