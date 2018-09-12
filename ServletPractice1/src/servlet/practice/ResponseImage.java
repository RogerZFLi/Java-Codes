package servlet.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Respond images to explorer
 */
public class ResponseImage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResponseImage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		InputStream is = new FileInputStream(new File("C:\\Users\\amusu\\Desktop\\0.jpg"));
		byte[] buff = new byte[is.available()];
		is.read(buff);
		
		response.setContentType("image/jpeg");
		//response.setContentType("application/pdf");
		OutputStream os = response.getOutputStream();
		
		//To read a .PDF file
/*		int flag=is.read(buff);
		while(flag!=-1) {
			os.write(buff,0,flag);
		}*/
		os.write(buff);
		os.flush();
		is.close();
		os.close();
	}

}
