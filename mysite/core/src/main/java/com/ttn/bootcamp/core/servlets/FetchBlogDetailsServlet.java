package com.ttn.bootcamp.core.servlets;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ttn.bootcamp.core.impls.MarketBlogImpl;
import com.ttn.bootcamp.core.services.BlogService;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletResourceTypes;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

@Component(service = Servlet.class,immediate = true, property = {
        "sling.servlet.methods=GET",
        "sling.servlet.resourceTypes=services/blogs",
        "sling.servlet.selectors=data",
        "sling.servlet.extensions=json"
})

public class FetchBlogDetailsServlet extends SlingSafeMethodsServlet {

    @Reference(target = "(version=Market)")
    BlogService marketCollector;

    @Reference(target = "(version=Tech)")
    public BlogService techCollector;

    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) throws ServletException, IOException {
        //super.doGet(request, response);

        Gson gson = new Gson();
        String x;
        x = gson.toJson(marketCollector);
        x+= gson.toJson(techCollector);
        PrintWriter out = response.getWriter();

        out.println(x);

    }
}
