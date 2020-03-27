package com.ttn.bootcamp.servlets;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import com.ttn.bootcamp.services.*;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@Component(service = Servlet.class,
        property = {
                "sling.servlet.methods=GET",
                "sling.servlet.paths=bin/DemoServlet"
        })
public class DemoServlet extends SlingSafeMethodsServlet{

    @Reference
    BlogsCollector blogsCollector;

    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) throws ServletException, IOException {
        //super.doGet(request, response);

        String output;
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        List<BlogService> list = blogsCollector.getBlogsByDate();

        output = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "\n" +
                "<body>\n" +
                "\n" +
                "    <form method=\"GET\">\n" +
                "\n" +
                "        <select name=\"order\">\n" +
                "            <option>Ascending</option>\n" +
                "            <option>Descending</option>\n" +
                "        </select>\n" +
                "    </form>\n" +
                "\n" +
                "</body>\n" +
                "\n" +
                "</html>";

        //--------------------------------------------------------------------------------------



        response.getWriter().write(output);


    }
}
