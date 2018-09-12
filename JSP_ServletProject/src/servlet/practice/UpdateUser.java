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
 * Servlet implementation class UpdateUser
 */
public class UpdateUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateUser() {
        super();
        // TODO Auto-generated constructor stub
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

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user = this.getUser(request);
		ServletContext sc = this.getServletContext();
		List<User> list = (List<User>)sc.getAttribute("list");
		User u = null;
		for(User temp:list) {
			if (temp.getUsername().equals(user.getUsername())) {
				u=temp;
				break;
			}
		}
		list.remove(u);
		list.add(user);
		response.sendRedirect("ok.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
