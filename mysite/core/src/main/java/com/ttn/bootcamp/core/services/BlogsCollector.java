package com.ttn.bootcamp.core.services;

import org.apache.log4j.Logger;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

import java.util.ArrayList;
import java.util.List;

@Component(name = "Blogs_Collector", service = BlogsCollector.class)
public class BlogsCollector {

    @Reference(target = "(version=Market)")
    BlogService marketBlog;

    @Reference(target="(version=Tech)")
    BlogService techBlog;

    List<Integer> myList = new ArrayList();
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

    public void getBlogsByRank(){


    }

    @Deactivate
    public void deactivate(){

        logger.info("Service shutdown. Bye-Bye");
    }
}
