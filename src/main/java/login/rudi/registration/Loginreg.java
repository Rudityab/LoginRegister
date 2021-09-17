package login.rudi.registration;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class Loginreg extends HttpServlet {
	private static final long serialVersionUID = 1L;

 
    public Loginreg() {
            }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		UserDao cd=new UserDaoImpl();
		  String userName=request.getParameter("Username");
		  String passWord=request.getParameter("Password");
		  String submitType=request.getParameter("submit");
			
			User u=cd.getUser(userName, passWord);
			
			if(submitType.equals("Login") && u!=null && u.getUsername()!=null)
			{
				request.setAttribute("message", u.getUsername());
				request.getRequestDispatcher("welcome.jsp").forward(request, response);
			}
			else if(submitType.equals("Register"))
			{
				u.setUsername(userName);
				u.setEmail(request.getParameter("Email"));
				u.setPassword(passWord);
				u.setConfirmPassword(request.getParameter("Password")); 
				cd.insertUser(u);
				request.setAttribute("successMessage", "Registeration Done,Please LogIn");
				request.getRequestDispatcher("Login.jsp").forward(request, response);
			}
			else
			{
				request.setAttribute("message", "Data not found,click on SIGN UP");
				 request.getRequestDispatcher("Login.jsp").forward(request, response); 
			}
			
		}
		
	}

