package servlet.practice;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet.practice.domain.User;



/**
 * Servlet implementation class FindUserAll
 */
public class FindUserAll extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindUserAll() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void init() {
    	User user1 = new User();
		user1.setUsername("zhangsan");
		user1.setUserage("20");
		user1.setPassword("zhangsan");
		user1.setUsergender("1");
    	User user2 = new User();
		user2.setUsername("lisi");
		user2.setUserage("30");
		user2.setPassword("lisi");
		user2.setUsergender("0");
    	User user3 = new User();
		user3.setUsername("wangwu");
		user3.setUserage("40");
		user3.setPassword("wangwu");
		user3.setUsergender("1");
    	User user4 = new User();
		user4.setUsername("zhaoliu");
		user4.setUserage("50");
		user4.setPassword("zhaoliu");
		user4.setUsergender("0");
    	User user5 = new User();
		user5.setUsername("liuermazi");
		user5.setUserage("60");
		user5.setPassword("liuermazi");
		user5.setUsergender("1");
		
		List<User> list =new ArrayList<>();
		list.add(user1);
		list.add(user2);
		list.add(user3);
		list.add(user4);
		list.add(user5);
		
		ServletContext sc = this.getServletContext();
		sc.setAttribute("list",list);
		
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext sc = this.getServletContext();
		
		List<User> list = (List<User>)sc.getAttribute("list");
		request.setAttribute("list", list);
		request.getRequestDispatcher("showUser.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
