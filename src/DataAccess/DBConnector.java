package DataAccess;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnector
{
	private static Connection connection = null;
	
	public static Connection getConnection()
	{
		if (connection != null)
		{
			return connection;
		}
		else
		{
			try
			{
				Class.forName("org.postgresql.Driver");
				connection = DriverManager.getConnection(
						"jdbc:postgresql://127.0.0.1:5432/gclub", "gclubadmin",
						"123");
			}
			catch (Exception ee)
			{
				System.out.println("Err----");
				ee.printStackTrace();
			}
			return connection;
		}
	}
	
}