package hello.servlet.web.frontcontroller.v4;

import java.util.Map;

/**
 * 실제 컨트톨러 인터페이스를 구현하는 개발자 입장에서 보면, 항상 ModelView 객체를 생성하고 반환해야 하는 부분이 조금은 번거롭다.
 * 좋은 프레임워크는 아키텍처도 중요하지만, 그와 더불어 실제 개발하는 개발자가 단순하고 편리하게 사용할 수 있어야 한다.
 * v3를 조금 변경해서 실제 구현하는 개발자들이 매우 편리하게 개발할 수 있는 v4 버전을 개발해보자.
 */
public interface ControllerV4 {

    String process(Map<String, String> paramMap, Map<String, Object> model);
}
