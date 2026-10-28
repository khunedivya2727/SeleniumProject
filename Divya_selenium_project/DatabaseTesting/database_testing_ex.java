package DatabaseTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class database_testing_ex {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		
		String URL="JDBC:mysql://localhost:3306/MockTest2";
		String Username="root";
		String Password="password";
		String ins="insert into StudentDetails27 values(6,\"Tejas\",53.5,2008,56,\"Thane\",\"hgv\",123456);";
		
		Connection con=DriverManager.getConnection(URL,Username,Password);
		
		Statement stmt=con.createStatement();
		
		int create=stmt.executeUpdate(ins);
		
		ResultSet res=stmt.executeQuery("select * from StudentDetails27;");
		
		while(res.next()) {
			int id=res.getInt(1);
			
			String name=res.getString("studentname");
			
			System.out.println(id+"||"+name);
		}
		

	}

}
