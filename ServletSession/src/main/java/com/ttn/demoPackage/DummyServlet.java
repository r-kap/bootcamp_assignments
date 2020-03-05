package com.ttn.demoPackage;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        name = "DummyServlet",
        urlPatterns = {"/get-world", "/post-world", "/"},
        initParams = {
                @WebInitParam(name = "hello", value ="driver")
        }
)
public class DummyServlet extends HttpServlet{

    String initParam;

    @Override
    public void init() throws ServletException {
        initParam = getServletConfig().getInitParameter("hello");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();
        out.write("Hello World!");
        out.flush();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doPost(req, resp);
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String name = req.getParameter("Name");
        String email = req.getParameter("Email");
        String age = req.getParameter("Age");
        out.println("<h2>You have been registered with:</h2>"+"</br>");

        String str= "<table>\n" +
                "    <tr>\n" +
                "        <th>Name</th>\n" +
                "        <th>email</th>\n" +
                "        <th>Age</th>\n" +
                "    </tr>\n" +
                "    <tr>\n" +
                "<td>"+name+"</td>"+
                "<td>"+email+"</td>"+
                "<td>"+age+"</td>"+
                "        \n" +
                "    </tr>\n" +
                "</table>";
        out.println("<h4>"+str+ "</h4>");
    }

    @Override
    public void destroy() {
        //super.destroy();
        initParam = null;
    }
}
