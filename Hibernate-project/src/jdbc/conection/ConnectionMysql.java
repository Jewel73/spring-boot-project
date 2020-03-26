package jdbc.conection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionMysql {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String jdbcUrl= "jdbc:mysql://localhost:3306/hb_student_tracker? useSSL=flase&serverTimezone=UTC";
		String user="hbstudent";
		String pass="hbstudent";
		
		try {
			System.out.println("Connection To : "+jdbcUrl);
			Connection mycon= DriverManager.getConnection(jdbcUrl,user,pass);
			System.out.println("Connected Succesfully...........");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
