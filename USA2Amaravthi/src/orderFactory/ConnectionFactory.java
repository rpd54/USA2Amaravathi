package orderFactory;
import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	 public static Connection getConnection(){
	        try {
	           JdbcSingleton a=JdbcSingleton.getInstacnce();
	           String URL=a.getProperty("URL");
	           String USER=a.getProperty("USER");
	           String PASS=a.getProperty("PASS");
	          
	           DriverManager.registerDriver(new Driver());
	          return DriverManager.getConnection(URL ,USER,PASS);
	            
	        } catch (SQLException ex) {
	        	//ex.printStackTrace();
	            //System.out.println("Exception");'
	        	throw new RuntimeException("Error connecing to database",ex);
	        }
	    }
	 public static void main(String[] args) {
		 Connection con = ConnectionFactory.getConnection();
		System.out.println(con);
	}
}
