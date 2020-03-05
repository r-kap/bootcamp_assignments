package com.services;

import com.pojos.Student;

import java.util.List;

public interface ClassroomService {

    boolean isClassLimitReached(List<Student> students);

    int getPassingMarks();
}
