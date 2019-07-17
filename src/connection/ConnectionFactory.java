package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

	public class ConnectionFactory {
	public static Connection getConnectionFactory() throws SQLException
	{
	    try{
	  Class.forName("org.postgresql.Driver");
	  return DriverManager.getConnection("jdbc:postgresql://localhost:5432/SistemaUFU", "postgres", "admin");
	    }
	    catch(ClassNotFoundException e)
	    {
	    throw new SQLException(e.getMessage());
	    }
	}
}
