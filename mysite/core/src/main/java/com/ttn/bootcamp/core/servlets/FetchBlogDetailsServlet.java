package com.ttn.bootcamp.core.servlets;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ttn.bootcamp.core.impls.MarketBlogImpl;
import com.ttn.bootcamp.core.services.BlogService;
import com.ttn.bootcamp.core.services.BlogsCollector;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

@Component(service = Servlet.class,
        property = {
            "sling.servlet.methods="+ HttpConstants.METHOD_GET,
            "sling.servlet.resourceTypes=" + "",
            "sling.servlet.extensions="+ "json",
            "sling.servlet.selectors="+ "data"

        }
)
public class FetchBlogDetailsServlet extends SlingSafeMethodsServlet {

    @Reference(target = "(version=Market)")
    BlogService marketCollector;

    @Reference(target = "(version=Tech)")
    BlogService techCollector;

    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) throws ServletException, IOException {
        //super.doGet(request, response);

        Gson gson = new Gson();
        String x = marketCollector.toString();
        String y = techCollector.toString();
        x = gson.toJson(x);
        y = gson.toJson(y);

        PrintWriter out = response.getWriter();

        out.println(x);
        out.println(y);

    }
}
