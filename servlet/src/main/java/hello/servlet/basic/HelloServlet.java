package hello.servlet.basic;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

@WebServlet(name = "helloServlet", urlPatterns = "/hello")  //servlet name, url mapping
public class HelloServlet extends HttpServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

        System.out.println("HelloServlet.service");
        System.out.println("req = " + req); //org.apache.catalina.connector.RequestFacade@2ddf7e1a
        System.out.println("res = " + res); //org.apache.catalina.connector.ResponseFacade@5bfc028b

        String username = req.getParameter("username"); //parameter
        System.out.println("username = " + username);   //parameter print

        res.setContentType("text/plain");   //response contentType
        res.setCharacterEncoding("utf-8");  //response encode -> korean
        res.getWriter().write("hello " + username); //response to browser
    }
}
