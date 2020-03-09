package comps;

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
        System.out.println("Blogs Collector");
        System.out.println(marketBlog.getBlogCategory());
        System.out.println(marketBlog.getRank());
        System.out.println("Blogs Collector");
        System.out.println(techBlog.getBlogCategory());
        System.out.println(techBlog.getRank());
    }

    @Deactivate
    public void deactivate(){
        System.out.println("Service shutdown");
    }
}
