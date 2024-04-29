package myjdbcpackage;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Showallrecords {

public static void main(String[]args) {

//this is the path to create connection with , types line 8 and used suggestion to implement try catch

try

		{

	Class.forName("com.mysql.cj.jdbc.Driver"); //step-1

	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","Rupeshd"); //step-2

	System.out.println("connection set");

	String sql="select * from student";

	PreparedStatement ps=conn.prepareStatement(sql);

ResultSet rs=	ps.executeQuery();

while(rs.next())

{

	System.out.println("rollno="+rs.getInt(1)+"name="+rs.getString(2)+"address="+rs.getString(3)+"mobile no="+rs.getDouble(4)+"Email="+rs.getString(5));

	

}

conn.close();

 

 

	

	

	

	

	

	

	}

		catch(Exception e)

		{

			e.printStackTrace();

		}

 

}

}