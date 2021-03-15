package hello.servlet.basic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "helloServlet", urlPatterns = "/hello")  //servlet name, url mapping
public class HelloServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("HelloServlet.service");
        System.out.println("req = " + request); //org.apache.catalina.connector.RequestFacade@2ddf7e1a
        System.out.println("res = " + response); //org.apache.catalina.connector.ResponseFacade@5bfc028b

        String username = request.getParameter("username"); //parameter
        System.out.println("username = " + username);   //parameter print

        response.setContentType("text/plain");   //response contentType
        response.setCharacterEncoding("utf-8");  //response encode -> korean
        response.getWriter().write("hello " + username); //response to browser
    }
}
