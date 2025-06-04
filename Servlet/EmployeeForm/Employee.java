package com.jbk;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/employeeform")
public class Employee extends HttpServlet {
	
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    String empId1 = request.getParameter("empId");
    String firstName1 = request.getParameter("firstName");
    String lastName1 = request.getParameter("lastName");
    String dob1 = request.getParameter("dob");
    String email1 = request.getParameter("email");
    String phone1 = request.getParameter("phone");
    String gender1 = request.getParameter("gender");
    String address1 = request.getParameter("address");
    String city1 = request.getParameter("city");
    String state1 = request.getParameter("state");
    String zipcode1 = request.getParameter("zipcode");
    String department1 = request.getParameter("department");
    String position1 = request.getParameter("position");
    String joinDate1 = request.getParameter("joinDate");
    String salary1 = request.getParameter("salary");
    
    System.out.println(empId1);
    System.out.println(firstName1);
    System.out.println(lastName1);
    System.out.println(dob1);
    System.out.println(email1);
    System.out.println(phone1);
    System.out.println(gender1);
    System.out.println(address1);
    System.out.println(city1);
    System.out.println(state1);
    System.out.println(zipcode1);
    System.out.println(department1);
    System.out.println(position1);
    System.out.println(joinDate1);
    System.out.println(salary1);
    
    PrintWriter out = response.getWriter();
    out.print("<h1>"+ firstName1 +"</h1>");
    out.print("<h1>"+ lastName1 +"</h1>");
    out.print("<h1>"+ dob1 +"</h1>");
    out.print("<h1>"+ dob1 +"</h1>");
    out.print("<h1>"+ email1 +"</h1>");
    out.print("<h1>"+ phone1 +"</h1>");
    out.print("<h1>"+ gender1 +"</h1>");
    out.print("<h1>"+ address1 +"</h1>");
    out.print("<h1>"+ city1 +"</h1>");
    out.print("<h1>"+ state1 +"</h1>");
    out.print("<h1>"+ zipcode1 +"</h1>");
    out.print("<h1>"+ department1 +"</h1>");
    out.print("<h1>"+ position1 +"</h1>");
    out.print("<h1>"+ joinDate1 +"</h1>");
    out.print("<h1>"+ salary1 +"</h1>");
   }

}
