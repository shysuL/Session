package session;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/session/view")
public class SessionViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// 세션 객체 얻기
		HttpSession session = req.getSession();
		
		// 세션 정보 출력하기
		System.out.println("test key : " + session.getAttribute("test"));
		
		System.out.println("-------------------------------------------");
		// 세션 관련 정보
		System.out.println("Session ID : " + session.getId());
		System.out.println("CreationTime : " + new Date(session.getCreationTime()));
		System.out.println("LastAccesedTime : " + new Date(session.getLastAccessedTime()));
		System.out.println("MaxInactiveInterval : " + session.getMaxInactiveInterval());
		System.out.println("isNew : " + session.isNew());
		
		 
		req.getRequestDispatcher("/WEB-INF/views/session/view.jsp")
		.forward(req, resp);
	}

}
