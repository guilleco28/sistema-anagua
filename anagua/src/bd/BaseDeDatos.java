package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseDeDatos {
	
	/*
	private Properties prop = Config.getInstance().getProp();
	private String usuario=prop.getProperty("dbuser");
	private String pwd=prop.getProperty("pwdbuser");
	private String bd= prop.getProperty("db");
	*/
	
	private String usuario="root";
	private String pwd="bingo123";
	private String bd="anagua";
	
	private String url="jdbc:mysql://localhost/"+bd;

	public Connection abrirConexion() {
		Connection oConnection = null;
		try{
			Class.forName("com.mysql.jdbc.Connection");
			oConnection = DriverManager.getConnection(url, usuario, pwd);
		}catch(SQLException ex){
			System.out.println("Hubo un problema al conectarse a la bd.");
		}catch(ClassNotFoundException ex){
			System.out.println(ex);
		}
		
		return oConnection;
	}
	
	public void cerrarConexion(Connection oConnection) throws SQLException {
		if (oConnection != null && !oConnection.isClosed()) {
			oConnection.close();
		}
	}
	
	public void cerrarResultSet(ResultSet oResult) throws SQLException {
		if (oResult != null && !oResult.isClosed()) {
			oResult.close();
		}
	}
}
