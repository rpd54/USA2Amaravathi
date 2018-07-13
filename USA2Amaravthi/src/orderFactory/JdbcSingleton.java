package orderFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class JdbcSingleton {
	private static JdbcSingleton x1=new JdbcSingleton();

    Properties x = new Properties();

    private JdbcSingleton()  {
    try {
        FileInputStream f = new FileInputStream("/Users/rakeshreddypallepati/eclipse-workspace/USA2Amaravthi/input.txt");
        x.load(f);
    }
    catch (IOException e) {
    	System.out.println(" Connection Failed ");
    }
 }
   
    public String getProperty(String name)  {

        return x.getProperty(name);

    }
	public static JdbcSingleton getInstacnce() {
		// TODO Auto-generated method stub
		return x1;
	}

}
