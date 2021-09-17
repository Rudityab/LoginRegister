package login.rudi.registration;

public interface UserDao 
{
	public int insertUser(User u);
	public User getUser(String Username,String Password);
}
