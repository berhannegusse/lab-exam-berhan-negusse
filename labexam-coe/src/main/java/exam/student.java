package exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class student {

	public static void main(String[] args) throws Exception
	{
	
		String name1 = "bezaw";
		String email1 ="bez@gmail.com";
		String password1 ="mina23";
		String gender1 ="male";
		String id1 = "addis";
		
       Class.forName("com.mysql.cj.jdbc.Driver");
       Connection Con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root", "12345");
       
      PreparedStatement ps= Con.prepareStatement("insert into base values(?,?,?,?,?)");
      ps.setString(1,name1);
      ps.setString(2,email1);
      ps.setString(3,password1);
      ps.setString(4,gender1);
      ps.setString(5,id1);
      
      
      int i = ps.executeUpdate();
      
      if(i >0 )
      {
    	  System.out.println("true");
      }
      else
      {
    	  System.out.println("false");
      }
	}

}
