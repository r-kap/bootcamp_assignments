package comps;

import org.apache.log4j.Logger;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import services.BlogService;

@Component(name = "Blogs_Collector")
public class BlogsCollector {

    @Reference(target = "(version=Market)")
    BlogService marketBlog;

    @Reference(target="(version=Tech)")
    BlogService techBlog;


    @Activate
    public void activateMarket(){

        Logger logger = Logger.getLogger(BlogService.class);
        logger.info("Blogs Collector");
        logger.info("MarketBlog started");
        logger.info(marketBlog.getBlogCategory());
        logger.info(marketBlog.getRank());
        logger.info("Blogs Collector");
        logger.info("TechBlog started");
        logger.info(techBlog.getBlogCategory());
        logger.info(techBlog.getRank());
    }

    @Deactivate
    public void deactivate(){
        System.out.println("Service shutdown");
    }
}
