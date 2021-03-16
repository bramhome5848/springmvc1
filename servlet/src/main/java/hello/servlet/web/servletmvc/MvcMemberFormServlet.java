package hello.servlet.web.servletmvc;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 서블릿을 컨트롤러로 사용하고, JSP를 뷰로 사용해서 MVC 패턴을 적용
 * Model은 HttpServletRequest 객체를 사용
 * request는 내부에 데이터 저장소를 가지고 있는데
 * request.setAttribute() , request.getAttribute() 를 사용하면 데이터를 보관하고, 조회할 수 있다
 */
@WebServlet(name = "mvcMemberFormServlet", urlPatterns = "/servlet-mvc/members/new-form")
public class MvcMemberFormServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //WEB-INF -> 이 경로안에 JSP 가 있으면 외부에서 직접 JSP를 호출할 수 없음.
        //우리가 기대하는 것은 항상 컨트롤러를 통해서 JSP를 호출하는 것
        String viewPath = "/WEB-INF/views/new-form.jsp";
        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
        dispatcher.forward(request, response);  //다른 서블릿이나 JSP 로 이동할 수 있는 기능
        /**
         *  redirect vs forward
         * 리다이렉트는 실제 클라이언트(웹 브라우저)에 응답이 나갔다가, 클라이언트가 redirect 경로로 다시 요청한다.
         * 따라서 클라이언트가 인지할 수 있고, URL 경로도 실제로 변경된다.
         * 반면에 포워드는 서버 내부에서 일어나는 호출이기 때문에 클라이언트가 전혀 인지하지 못한다.
         */
    }
}
