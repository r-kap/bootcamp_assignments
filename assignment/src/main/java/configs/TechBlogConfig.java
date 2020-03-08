package configs;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name = "Tech_Blog_Config")
public @interface TechBlogConfig {

    @AttributeDefinition(name = "type", type = AttributeType.STRING)
    String blog_category() default "technology";

    @AttributeDefinition(name = "Rank", type = AttributeType.INTEGER)
    int rank() default 1;
}
