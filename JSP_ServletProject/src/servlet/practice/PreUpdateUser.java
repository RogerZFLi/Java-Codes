package servlet.practice;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet.practice.domain.User;


/**
 * Servlet implementation class PreUpdateUser
 */
public class PreUpdateUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PreUpdateUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		ServletContext sc = this.getServletContext();
		List<User> list = (List<User>)sc.getAttribute("list");
		User u = null;
		for (User user:list) {
			if (user.getUsername().equals(username)) {
				u=user;
				break;
				
			}
		}
		request.setAttribute("user", u);
		request.getRequestDispatcher("updateUser.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
