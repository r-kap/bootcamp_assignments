package Impls;

import configs.TechBlogConfig;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;
import services.BlogService;

@Component(name = "TechBlog_Implementation", immediate = true, property = {"version=Tech"})
@Designate(ocd = TechBlogConfig.class)
public class TechBlogImpl implements BlogService {

    String category;
    int rank;

    @Activate
    public void activate(TechBlogConfig techBlogConfig){
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
