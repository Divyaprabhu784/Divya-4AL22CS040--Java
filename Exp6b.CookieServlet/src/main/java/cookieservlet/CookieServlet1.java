/*6b. Build a servlet program to create a cookie to get your name through text box and press submit
button( through HTML) to display the message by greeting Welcome back your name ! , you have
visited this page n times ( n = number of your visit ) and demonstrate the expiry of cookie also.*/
package cookieservlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/CookieServlet")
public class CookieServlet1 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String userName = request.getParameter("userName");
        String existingUser = null;
        int visitCount = 0;

        Cookie[] cookies = request.getCookies();

        // Read existing cookies
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("user")) {
                    existingUser = cookie.getValue();
                }
                if (cookie.getName().equals("visitCount")) {
                    try {
                        visitCount = Integer.parseInt(cookie.getValue());
                    } catch (NumberFormatException e) {
                        visitCount = 0;
                    }
                }
            }
        }

        // If new user entered via form
        if (userName != null && !userName.isEmpty()) {
            existingUser = userName;
            visitCount = 1;

            Cookie userCookie = new Cookie("user", userName);
            Cookie countCookie = new Cookie("visitCount", String.valueOf(visitCount));

            userCookie.setMaxAge(60);      // expires in 60 seconds
            countCookie.setMaxAge(60);

            response.addCookie(userCookie);
            response.addCookie(countCookie);
        } else if (existingUser != null) {
            visitCount++;
            Cookie countCookie = new Cookie("visitCount", String.valueOf(visitCount));
            countCookie.setMaxAge(60);
            response.addCookie(countCookie);
        }

        // HTML response
        out.println("<html><head><title>Cookie Demo</title></head><body>");
        if (existingUser != null) {
            out.println("<h2 style='color:blue;'>Welcome back, " + existingUser + "!</h2>");
            out.println("<h2 style='color:magenta;'>You have visited this page " + visitCount + " times!</h2>");
            out.println("<form method='post' action='CookieServlet'><input type='submit' value='Logout'></form>");
        } else {
            out.println("<h2>Welcome Guest!</h2>");
            out.println("<form method='get' action='CookieServlet'>");
            out.println("Enter your name: <input type='text' name='userName'>");
            out.println("<input type='submit' value='Submit'></form>");
        }
        out.println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        
        // Clear cookies
        Cookie userCookie = new Cookie("user", "");
        Cookie countCookie = new Cookie("visitCount", "");

        userCookie.setMaxAge(0);  // delete immediately
        countCookie.setMaxAge(0);

        response.addCookie(userCookie);
        response.addCookie(countCookie);

        response.sendRedirect("CookieServlet");
    }
}
