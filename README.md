# Interceptor

interceptor란 말 그대로 가로채는 것을 말합니다. <br>
컨트롤러에서 들어요는 요청(HttpRequest)와 응당(HttpResponse)를 가로채는 역할을 합니다. <br>
찾아보니 주로 회원 인증 및 관리자 접근 페이지에서 사용된다고 합니다.

filter랑 interceptor는 좀 다릅니다.
- filter는 웹 어플리케이션(web.xml)에서 관리가 되는 반면 interceptor는 스프링(spring-servlet.xml)에서 관리 합니다. <br>
- interceptor를 구현하는데 HandlerInterceptor, HandlerInterceptorAdapter 방법으로 구현이 가능 합니다.

