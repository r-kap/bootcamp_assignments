package com.ttn.bootcamp.core.services;

import org.apache.log4j.Logger;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Component(name = "Blogs_Collector", service = BlogsCollector.class)

public class BlogsCollector {

    @Reference(target = "(version=Market)")
    BlogService marketBlog;

    @Reference(target = "(version=Tech)")
    BlogService techBlog;

    List<Integer> myList = new ArrayList();
    List<BlogService> myBlog = new ArrayList<>();
    Logger logger = Logger.getLogger(BlogsCollector.class);

    @Activate
    public void activateMarket() {

        logger.info("Blogs Collector");
        logger.info(marketBlog.getBlogCategory());
        logger.info(marketBlog.getRank());
        logger.info("Blogs Collector");
        logger.info(techBlog.getBlogCategory());
        logger.info(techBlog.getRank());
        myBlog.add(techBlog);
        myBlog.add(marketBlog);
    }


    public List<BlogService> getBlogsByRank() {

        Collections.sort(myBlog, new Comparator<BlogService>() {
            @Override
            public int compare(BlogService o1, BlogService o2) {
                return o1.getRank() > o2.getRank() ? o1.getRank() : o2.getRank();
            }
        });

        return myBlog;
    }

    @Deactivate
    public void deactivate() {

        logger.info("Service shutdown. Bye-Bye");
    }

}