package login.rudi.registration;

import java.sql.Connection;
import java.sql.DriverManager;
public class MyConnectionProvider implements MyProvider 
{	
	static Connection con=null;
	public static Connection getCon()
	{
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			    con=DriverManager.getConnection(connUrl,username,pwd);
			
		}catch(Exception e) {
			System.out.print(e);
		}
		return con;
	}	
}
