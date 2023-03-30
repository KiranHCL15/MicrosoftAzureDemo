package BasicSelenium;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class dataBaseConnect {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//loading the driver
		Class.forName("oracle.jdbc.OracleDriver");
		
		//connect to database
		Connection con = DriverManager.getConnection("jdbc:oracle:thin@localhost:1521:xe", "scott", "Oracle1234");
		
		//creating statement
		Statement st = con.createStatement();
		
		String sql="select *from emp;";
		
		ResultSet rs = st.executeQuery(sql);
		while(rs.next())
		{
			System.out.println(rs.getString("ENAME"));
		}
		rs.close();
		st.close();
		con.close();
		

	}

}
