/*6a. Build a servlet program to find the factorial of a number using HTML with step by step
procedure.*/
package factorial;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/factorial")
public class FactorialServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            int number = Integer.parseInt(request.getParameter("number"));

            if (number < 0) {
                throw new IllegalArgumentException("Number cannot be negative");
            }
            if (number > 20) {
                throw new IllegalArgumentException("Maximum number allowed is 20");
            }

            long factorial = 1;
            String calculation = number + "! = ";

            for (int i = number; i > 0; i--) {
                factorial *= i;
                calculation += (i == 1) ? i : i + " × ";
            }

            out.println("<html><body>");
            out.println("<h2>Factorial Result</h2>");
            out.println("<p>Number: " + number + "</p>");
            out.println("<p>" + calculation + " = " + factorial + "</p>");
            out.println("<a href='index.html'>Try Another</a>");
            out.println("</body></html>");
        } catch (Exception e) {
            out.println("<html><body><h3>Error: " + e.getMessage() + "</h3>");
            out.println("<a href='index.html'>Go Back</a></body></html>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("index.html");
    }
}
