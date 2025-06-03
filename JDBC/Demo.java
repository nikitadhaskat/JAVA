package com.jbk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Demo {
	
			public static void main(String[] args) throws Exception {
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				String url = "jdbc:mysql://localhost:3306/batch215?useSSL=false";
				String username = "root";
				String password = "Nikita@2002";
				Connection c = DriverManager.getConnection(url, username, password);
				if(c!=null) {
					
					String query="select * from student";
					
					PreparedStatement stmt=c.prepareStatement(query);
					ResultSet rs=stmt.executeQuery();
					while(rs.next()) 
					{
                    System.out.println(rs.getInt("rollNo")+" "+rs.getString("name")+" "+rs.getString("city")); 
                    }
				}
				if(c != null)
				{
					Scanner sc = new Scanner(System.in);
					
					System.out.println("Enter RollNo : ");
					int rollNo = sc.nextInt();
					
					System.out.println("Enter name: ");
					String name = sc.next();
					
					System.out.println("Enter city :");
					String city = sc.next();
					
					System.out.println("Database connected!");
				
					String query = "insert into student values(?, ?, ?);";
					PreparedStatement stmt = c.prepareStatement(query);
					
					stmt.setInt(1, rollNo);
					stmt.setString(2, name);
					stmt.setString(3, city);
					
					int num = stmt.executeUpdate();
					
					System.out.println(num);
					System.out.println("Student added!");
					
				}
				else
					System.out.println("Database NOT connected!");
							
			}
		}









