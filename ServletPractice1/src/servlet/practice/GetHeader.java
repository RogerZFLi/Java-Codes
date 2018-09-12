package servlet.practice;
/**
 * get information of current explorer
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetHeader
 */
public class GetHeader extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetHeader() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Enumeration<String> enu = request.getHeaderNames();
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//TDT HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("   <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("   <BODY>");
		out.println("我是你爸爸");
		out.println("		<table border='1' align='center' width='80%'>");
			while(enu.hasMoreElements()) {
				String key = enu.nextElement();
				out.println("<tr><td>"+key+"</td><td>"+request.getHeader(key)+"</td></tr>");
			}
		out.println("</table");
		out.print(this.getClass());
		out.println(", using the GET method");
		out.println("   </BODY>");
		out.println("</HTML>");
		out.flush();
	}

}
