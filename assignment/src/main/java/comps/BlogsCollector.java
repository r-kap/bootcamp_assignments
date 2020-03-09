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

    Logger logger = Logger.getLogger(BlogsCollector.class);

    @Activate
    public void activateMarket(){

        logger.info("Blogs Collector");
        logger.info(marketBlog.getBlogCategory());
        logger.info(marketBlog.getRank());
        logger.info("Blogs Collector");
        logger.info(techBlog.getBlogCategory());
        logger.info(techBlog.getRank());
    }

    @Deactivate
    public void deactivate(){

        logger.info("Service shutdown. Bye-Bye");
    }
}
