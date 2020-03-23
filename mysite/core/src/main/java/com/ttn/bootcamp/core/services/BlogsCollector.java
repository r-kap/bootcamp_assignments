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

public class BlogsCollector{

    @Reference(target = "(version=Market)")
    BlogService marketBlog;

    @Reference(target = "(version=Tech)")
    BlogService techBlog;

    List<BlogService> myBlog = new ArrayList<>();
    void add(){
        myBlog.add(techBlog);
        myBlog.add(marketBlog);
    }
    Logger logger = Logger.getLogger(BlogsCollector.class);

    @Activate
    public void activateMarket() {

        logger.info("Blogs Collector");
        logger.info("MarketBlog started");
        logger.info(marketBlog.getBlogCategory());
        logger.info(marketBlog.getRank());
        logger.info("Blogs Collector");
        logger.info("TechBlog started");
        logger.info(techBlog.getBlogCategory());
        logger.info(techBlog.getRank());


       // logger.info("Blogs sorted in order of their Rank:"+getBlogsByRank());

        //logger.info(myBlog);
    }


    public List<BlogService> getBlogsByRank() {
            add();
        Collections.sort(myBlog, new Comparator<BlogService>() {
            @Override
            public int compare(BlogService o1, BlogService o2) {
                return o1.getRank() - o2.getRank();
            }
        });
    return myBlog;
    }

    @Deactivate
    public void deactivate() {

        logger.info("Service shutdown. Bye-Bye");
    }


}