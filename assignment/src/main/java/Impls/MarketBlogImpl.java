package Impls;

import configs.MarketBlogConfig;
import org.apache.log4j.Logger;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;
import services.BlogService;

@Component(name = "MarketBlog_Implementation", service = BlogService.class, property = {"version=Market"})
@Designate(ocd = MarketBlogConfig.class)
public class MarketBlogImpl implements BlogService {

    String category;
    int rank;

    @Activate
    public void activate(MarketBlogConfig marketBlogConfig) {
        category = marketBlogConfig.blog_category();
        rank = marketBlogConfig.rank();
    }


    public String getBlogCategory() {
        return category;
    }

    public int getRank() {
        return rank;
    }
}
