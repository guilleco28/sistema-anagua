package bd;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

public class BaseDeDatos {
	
	private String url="jdbc:mysql:";
	
	static Connection con = null;
	Properties p = new Properties();
	
	public BaseDeDatos() {
		try {
			p.load(new FileReader("\\\\192.168.1.7\\datos2\\ANAGUA\\sistema-anagua\\config.properties"));
			//p.load(new FileReader("C:\\Users\\Guillermo\\Documents\\sistema-anagua\\config.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		url = url+p.getProperty("bd");
		
	}

	public Connection abrirConexion() {
		Connection oConnection = null;
		try{
			Class.forName("com.mysql.jdbc.Connection");
			oConnection = DriverManager.getConnection(url, p.getProperty("usuario"), p.getProperty("pwd"));
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
