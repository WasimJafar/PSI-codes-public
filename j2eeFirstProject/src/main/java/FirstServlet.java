
import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FirstServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter printWriter = response.getWriter();

		response.setContentType("text/html");
		try {
			printWriter.print("<center><form action = 'FirstServlet' method = 'post' >");
			printWriter.print("<br> <h1> Addition of two numbers <h1> ");
			printWriter.print("<br> Enter first number <input type= 'text' name='a1' value='0' >");
			printWriter.print("<br> Enter second number <input type= 'text' name='a2' value='0' >");
			printWriter.print("<br> Result <input type= 'text' name='a3' value='0' >");
			printWriter.print("<br> <input type= 'submit' value='add' >");

			printWriter.print("</form>");

		} catch (Exception e) {

		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter printWriter = response.getWriter();
		response.setContentType("text/html");

		try {
			int a = Integer.parseInt(request.getParameter("a1"));
			int b = Integer.parseInt(request.getParameter("a2"));
			int c = a + b;

			printWriter.print("<center><form action = 'FirstServlet' method = 'post' >");
			printWriter.print("<br> <h1> Addition of two numbers <h1> ");
			printWriter.print("<br> Enter first number <input type= 'text' name='a1' value= '" + a + "' >");
			printWriter.print("<br> Enter second number <input type= 'text' name='a2' value= '" + b + "' >");
			printWriter.print("<br> Result <input type= 'text' name='a3' value= '" + c + "' >");
			printWriter.print("<br> <input type= 'submit' value='add' >");

			printWriter.print("</form>");

		} catch (Exception e) {

		}

	}

}
