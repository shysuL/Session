package session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/session/create")
public class SessionCreateServlet extends HttpServlet {
   private static final long serialVersionUID = 1L;
   
   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      
      // 세션 객체 얻기
      HttpSession session = null;
      session = req.getSession();
      
      // 세션 정보 추가하기(세션 컨텍스트 영역에 추가됨)
      session.setAttribute("test", "Apple"); // setAttribute(String name, Object value);
      
      // 세션 유지시간 변경하기 (0초 : 무제한)
      session.setMaxInactiveInterval(3); // 세션 유지시간 3초
      
      // VIEW 지정하기
      req.getRequestDispatcher("/WEB-INF/views/session/create.jsp").forward(req, resp);;
   }
}