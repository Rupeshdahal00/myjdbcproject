
	package myjdbcpackage;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
import java.util.Scanner;

	public class Deleterecord {
		
		public static void main(String[]args) {

			//this is the path to create connection with , types line 8 and used suggestion to implement try catch
			try

			{

		Class.forName("com.mysql.jdbc.Driver"); //step-1

		

		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","Rupeshd"); //step-2

		System.out.println("connection set");

		

		String sql="delete from student  where rollno=?";

		Scanner sc=new Scanner(System.in);

		System.out.println("enter rollno");

		int r=sc.nextInt();	

		PreparedStatement ps=conn.prepareStatement(sql);

		

		ps.setInt(1, r);

		

		ps.executeUpdate();

		System.out.println("record deleted ");

		

		conn.close();

		

		} catch (Exception e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

			}

		}

			}