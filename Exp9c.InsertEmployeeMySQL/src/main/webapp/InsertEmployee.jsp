<%9c. Develop a JDBC project using MySQL to append the fields empno, empname and basicsalary
into the table Emp of the database Employee by getting the fields through keyboard and Generate
the report as follows for the table Emp (Emp_NO , Emp_Name, Basicsalary ) using HTML and JSP
to get the field and display the results respectively%>

<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Employee Entry And Salary Report</title>
</head>
<body>

<!-- Form to insert employee details -->
<h2>Enter Employee Details</h2>
<form method="post">
    Emp No: <input type="text" name="empno" required/><br/>
    Emp Name: <input type="text" name="empname" required/><br/>
    Basic Salary: <input type="text" name="salary" required/><br/>
    <input type="submit" name="insertBtn" value="Insert Employee"/>
</form>

<%
    if (request.getParameter("insertBtn") != null) {
        try {
            int empno = Integer.parseInt(request.getParameter("empno"));
            String empname = request.getParameter("empname");
            int salary = Integer.parseInt(request.getParameter("salary"));

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "password");

            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO Emp (Emp_NO, Emp_Name, Basicsalary) VALUES (?, ?, ?)"
            );
            ps.setInt(1, empno);
            ps.setString(2, empname);
            ps.setInt(3, salary);

            int i = ps.executeUpdate();
            if (i > 0) {
                out.println("<p style='color:green;'>✅ Employee inserted successfully.</p>");
            }

            ps.close();
            con.close();
        } catch (Exception e) {
            out.println("<p style='color:red;'>❌ Error: " + e.getMessage() + "</p>");
        }
    }
%>

<hr>

<!-- Button to generate the salary report -->
<h2>Salary Report: Employees with Name Starting with 'R'</h2>
<form method="get">
    <input type="submit" name="reportBtn" value="Generate Report"/>
</form>

<%
    if (request.getParameter("reportBtn") != null) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "password");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Emp WHERE Emp_Name LIKE 'R%'");

            int grandSalary = 0;

            while (rs.next()) {
                int empno = rs.getInt("Emp_NO");
                String empname = rs.getString("Emp_Name");
                int salary = rs.getInt("Basicsalary");

                out.println("<div style='margin-bottom:10px;'>");
                out.println("Emp_No: " + empno + "<br>");
                out.println("Emp_Name: " + empname + "<br>");
                out.println("Basic Salary: " + salary + "<br>");
                out.println("<hr>");
                out.println("</div>");

                grandSalary += salary;
            }

            out.println("<h3>Grand Salary: " + grandSalary + "</h3>");

            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            out.println("<p style='color:red;'>❌ Error: " + e.getMessage() + "</p>");
        }
    }
%>

</body>
</html>
