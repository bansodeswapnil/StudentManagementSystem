package connectionpool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbcconnection {
	public static Connection CreateConnection() {
		Connection connection=null;
			try {
				Class.forName("org.postgresql.Driver");
				connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Test1?user=postgres&password=root");
				System.out.println("connection is created");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		return connection;
	}
}
