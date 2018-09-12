package servlet.practice;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReadInitConfig
 */
public class ReadInitConfig extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReadInitConfig() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void init() {
		Config c = new Config();
		c.setDbName("Roger");
		c.setDbPwd("oracle");
		c.setFileUploadPath("/fileupload");
		ServletContext sc = this.getServletContext();
		sc.setAttribute("config", c);
		
		String value =sc.getInitParameter("key");
		sc.setAttribute("key", value);
		
		System.out.println("ReadInitConfig......Init....");
	}
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
