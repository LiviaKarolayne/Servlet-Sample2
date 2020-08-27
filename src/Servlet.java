import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Servlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		CalendarClass calendar = new CalendarClass();

		PrintWriter writer = response.getWriter();
		String option = request.getParameter("option");
		int Numberoption = Integer.parseInt(option);

		String previousPage = "<a href='http://localhost:8080/TestePresencialServletLivia/index.html'>Voltar</a>";

		if (Numberoption == 1) {
			writer.println("Hora Atual:" + " " + calendar.getHour() + ":" + calendar.getMinute() + "<br>");
			writer.print(previousPage);
		} else if (Numberoption == 2) {
			writer.println("Data Atual:" + " " + calendar.getData() + "<br>");
			writer.print(previousPage);
		} else if (Numberoption == 3) {
			writer.println("Hora Atual:" + " " + calendar.getHour() + ":" + calendar.getMinute() + "<br>"
					+ "Data Atual:" + " " + calendar.getData() + "<br>");
			writer.print(previousPage);
		}
	}

}
