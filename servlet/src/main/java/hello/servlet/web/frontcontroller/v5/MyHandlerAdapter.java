package hello.servlet.web.frontcontroller.v5;

import hello.servlet.web.frontcontroller.ModelView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 어댑터 패턴을 이용하여 프론트 컨트롤러가 다양한 방식의 컨트롤러를 처리할 수 있도록 변경
 */
public interface MyHandlerAdapter {

    //어댑터가 해당 컨트롤러를 처리할 수 있는지 판단하는 메서드
    boolean supports(Object handler);   //handler -> 컨트롤러를 의미

    ModelView handle(HttpServletRequest request, HttpServletResponse response,
                     Object handler) throws ServletException, IOException;
}
