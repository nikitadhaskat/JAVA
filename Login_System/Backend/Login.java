package com.jbk;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/loginuser")
public class Login extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter out = resp.getWriter();

		String username = req.getParameter("username");
		String password = req.getParameter("password");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/loginsystem", "root",
					"Nikita@2002");
			PreparedStatement ps = c.prepareStatement("select * from users where username=? AND password=?");
			ps.setString(1, username);
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				req.setAttribute("fullname", rs.getString(2));
				req.setAttribute("username", rs.getString(3));
				req.setAttribute("email", rs.getString(4));
				req.setAttribute("gender", rs.getString(5));

				out.print("<h1>" + "Login Succcesfully!" + "</h1>");
				RequestDispatcher rd = req.getRequestDispatcher("/profile.jsp");
				rd.include(req, resp);

			} else {
				System.out.println("Invalid Credentials!");
				out.print("Invalid Credentials!");
				RequestDispatcher rd = req.getRequestDispatcher("/register.html");
				rd.include(req, resp);
			}

		} catch (Exception e) {

		}

	}

}
