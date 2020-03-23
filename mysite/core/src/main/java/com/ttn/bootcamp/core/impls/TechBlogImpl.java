package com.ttn.bootcamp.core.impls;

import com.ttn.bootcamp.core.configs.TechBlogConfig;
import org.apache.log4j.Logger;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;
import com.ttn.bootcamp.core.services.BlogService;

@Component(name = "TechBlog_Implementation", property = {"version=Tech"})
@Designate(ocd = TechBlogConfig.class)
public class TechBlogImpl implements BlogService {

    String category;
    int rank;



    @Activate
    public void activate(TechBlogConfig techBlogConfig){
        Logger logger = Logger.getLogger(TechBlogImpl.class);
        logger.info("TechBlog started");
        category = techBlogConfig.blog_category();
        rank = techBlogConfig.rank();
    }

    public String getBlogCategory(){
        return category;
    }

    public int getRank(){
        return rank;
    }

    public String toString(){
        return "Rank: "+rank+ " Category: "+ category;
    }

}
