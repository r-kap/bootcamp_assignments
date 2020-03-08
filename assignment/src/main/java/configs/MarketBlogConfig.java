package configs;


import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name = "Market_Blog_Configuration")
public @interface MarketBlogConfig {

    @AttributeDefinition(name = "Blog category", type = AttributeType.STRING)
    String blog_category() default "Marketing";

    @AttributeDefinition(name = "Rank", type = AttributeType.INTEGER)
    int rank() default 2;
}
