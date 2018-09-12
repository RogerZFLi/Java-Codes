package servlet.practice;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet.practice.domain.User;

/**
 * Servlet implementation class RegUserServlet
 */
public class RegUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user = this.getUser(request);
		boolean flag= this.validateUser(user);
		if (!flag) {
			request.setAttribute("user", user);
			request.setAttribute("msg", "数据不合法，请重新输入");
			request.getRequestDispatcher("reg.jsp").forward(request, response);
		}else {
			System.out.println("Insert........"+user.getUsername());
			//request.getRequestDispatcher("ok.jsp").forward(request, response);
			response.sendRedirect("ok.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	private User getUser(HttpServletRequest request) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String usergender = request.getParameter("usergender");
		String userage = request.getParameter("userage");
		
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setUsergender(usergender);
		user.setUserage(userage);
		return user;
	}
	
	private boolean validateUser(User user) {
		if (user.getUsername()==null ||user.getUsername().length()<=0) {
			return false;
		}else
			return true;
		
	}

}
