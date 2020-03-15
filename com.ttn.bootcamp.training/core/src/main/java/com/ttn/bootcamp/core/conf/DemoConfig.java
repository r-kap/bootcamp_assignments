package com.ttn.bootcamp.core.conf;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(
        name = "Demo_Config",id = "1"
)
public @interface DemoConfig {

    @AttributeDefinition(name = "Name", type = AttributeType.STRING)
    String name() default "Rohit";

    @AttributeDefinition(name = "id", type = AttributeType.INTEGER)
    int id() default 1;
}
