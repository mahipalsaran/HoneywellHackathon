package resourceManager.dto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.stereotype.Component;

@Component
public class ConnectionFactory {

	private String className = "org.apache.derby.jdbc.EmbeddedDriver";
	private String connectionName = "jdbc:derby:/Users/mahipal/Documents/DerbyDB/newDB;create=true";

	public Connection createConnection() throws ClassNotFoundException, SQLException{
		Class.forName(className);
		return DriverManager.getConnection(connectionName);
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getConnectionName() {
		return connectionName;
	}
	public void setConnectionName(String connectionName) {
		this.connectionName = connectionName;
	}
	
}
