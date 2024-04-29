package myjdbcpackage;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
import java.util.Scanner;

	public class Updaterecord {
		
		public static void main(String[]args) {

			//this is the path to create connection with , types line 8 and used suggestion to implement try catch
			try

					{

			 

				Class.forName("com.mysql.jdbc.Driver"); //step-1

				

				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","Rupeshd"); //step-2

				System.out.println("connection set");

				

				String sql="update student set address=?,phone=? where rollno=?";

				Scanner sc=new Scanner(System.in);

				System.out.println("enter rollno");

				int r=sc.nextInt();

				

				System.out.println("enter phone no");

			double m=sc.nextDouble();

			System.out.println("enter new address");

			String a=sc.next();

				

				PreparedStatement ps=conn.prepareStatement(sql);

				ps.setString(1,a );

				ps.setDouble(2,m);

				ps.setInt(3, r);

				

				ps.executeUpdate();

				System.out.println("record updated ");

				conn.close();


				} catch (Exception e) {

					// TODO Auto-generated catch block

					e.printStackTrace();
					
				}
		}
	}

