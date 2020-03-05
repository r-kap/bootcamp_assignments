package com.configurations;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;


@ObjectClassDefinition(name = "Class Definition", description = "Basic details about the class")
public @interface ClassConfiguration {

    @AttributeDefinition(name = "Number of Students", type = AttributeType.INTEGER, description = "Tells the number of students in the class")
    int no_Of_Students() default 4;

    @AttributeDefinition(name = "Required minimum marks", type = AttributeType.INTEGER, description = "Tells the threshold marks for passing the class.")
    int min_marks_to_pass() default 50;
}
