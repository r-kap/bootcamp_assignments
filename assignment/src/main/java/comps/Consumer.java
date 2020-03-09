package comps;


import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import services.BlogsCollector;

@Component
public class Consumer {

    @Reference
    BlogsCollector blog;
}
