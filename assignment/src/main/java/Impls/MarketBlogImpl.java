package Impls;

import configs.MarketBlogConfig;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;
import services.MarketBlogService;

@Component(name = "MarketBlog_Implementation", service = MarketBlogService.class)
@Designate(ocd = MarketBlogConfig.class)
public class MarketBlogImpl implements MarketBlogService {

    String category;
    int rank;

    @Activate
    public void activate(MarketBlogConfig marketBlogConfig) {
        System.out.println("MarketBlog started");
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
