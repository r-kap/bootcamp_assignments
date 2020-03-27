package com.ttn.bootcamp.configs;


import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

import java.util.Date;

@ObjectClassDefinition(name = "TechBlogConfig")
public @interface TechBlogConfig {

    @AttributeDefinition(name = "BlogCategory",type = AttributeType.STRING)
    String blogCategory() default "";

    @AttributeDefinition(name = "DateCreated", type = AttributeType.STRING)
    String dateCreated();

    @AttributeDefinition(name = "Rank", type = AttributeType.INTEGER)
    int rank() default 0;
}
