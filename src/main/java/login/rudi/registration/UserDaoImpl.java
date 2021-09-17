package login.rudi.registration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDaoImpl implements UserDao {

	static Connection con;
	static PreparedStatement ps;
	@Override
	public int insertUser(User u) {
		
		int status=0;
		
		try {
			con=MyConnectionProvider.getCon();
			ps=con.prepareStatement("insert into User values(?,?,?,?)");
			ps.setString(1, u.getUsername());
			ps.setString(2, u.getEmail());
			ps.setString(3, u.getPassword());
			ps.setString(4, u.getConfirmPassword());
			status=ps.executeUpdate();
			con.close();
			
		}catch(Exception e){
			
			System.out.print(e);
		
		}
		return status;
	}

	@Override
	public User getUser(String Username, String Password) {
		
		User u=new User();
		
		try {
			con=MyConnectionProvider.getCon();
			ps=con.prepareStatement("select * from User where Username=? and Password=?");
			ps.setString(1, Username);
			ps.setString(2, Password);
			
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				u.setUsername(rs.getString(1));
				u.setEmail(rs.getString(2));
				u.setPassword(rs.getString(3));
				u.setConfirmPassword(rs.getString(4));
			}
			
		}catch(Exception e){
			
			System.out.print(e);
		
		}
		return u;
	}

}
