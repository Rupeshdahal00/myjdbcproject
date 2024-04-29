package myjdbcpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertRecord {
	
	public static void main(String[]args) {

		//this is the path to create connection with , types line 8 and used suggestion to implement try catch
		try

		{

	Class.forName("com.mysql.jdbc.Driver"); //step-1

	

	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","Rupeshd"); //step-2

	System.out.println("connection set");


	String sql="insert into student values(?,?,?,?,?)";

	PreparedStatement ps=conn.prepareStatement(sql);

	ps.setInt(1, 77);

	ps.setString(2, "neha");

	ps.setString(3, "pune");

	ps.setDouble(4, 5567);

	ps.setString(5, "neha@gmail.com");

	ps.executeUpdate();

	System.out.println("record inserted ");

	

	conn.close();

	

	} catch (Exception e) {

		// TODO Auto-generated catch block

		e.printStackTrace();

		}
	}
	
}