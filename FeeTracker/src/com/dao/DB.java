package com.dao;
import java.sql.*;
public class DB {
public static Connection getCon()
{
	Connection con=null;
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/recorddb","root","pass");
	}catch(Exception ex){System.out.println(ex);}
	return con;
	}
}
