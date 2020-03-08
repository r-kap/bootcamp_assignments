package Impls;

import configs.TechBlogConfig;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;
import services.TechBlogService;

@Component(name = "TechBlog_Implementation", immediate = true)
@Designate(ocd = TechBlogConfig.class)
public class TechBlogImpl implements TechBlogService {

    String category;
    int rank;

    @Activate
    public void activate(TechBlogConfig techBlogConfig){
        System.out.println("TechBlog started");
        category = techBlogConfig.blog_category();
        rank = techBlogConfig.rank();
    }

    public String getBlogCategory(){
        return category;
    }

    public int getRank(){
        return rank;
    }

}
