package prueba;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Properties;

import bd.BaseDeDatos;

public class ConexionBarros {
	
	static Connection con = null;
	static Properties p = new Properties();
	static BaseDeDatos BD = new BaseDeDatos();
	
	private static String url="jdbc:mysql:";
	
	public ConexionBarros() {
		try {
			p.load(new FileReader("\\\\192.168.1.7\\datos2\\ANAGUA\\sistema-anagua\\config.properties"));
			//p.load(new FileReader("C:\\Users\\Guillermo\\Documents\\sistema-anagua\\config.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		url = url+p.getProperty("bd");
	}

	public static Connection obtenerConexion() {
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

	
	public static ArrayList <String> traerDeterminaciones () throws SQLException {
		ArrayList <String> columnas = new ArrayList <String>();
		Connection conexion = obtenerConexion();
		Hashtable <String, String> determinaciones = new Hashtable <String, String>();
		determinaciones.put("nro_analisis", "Número de análisis");
		determinaciones.put("lugar_extraccion", "Lugar de extracción");
		determinaciones.put("extraido_por", "Extraído por");
		determinaciones.put("fecha_extraccion", "Fecha de extracción");
		determinaciones.put("hora_extraccion", "Hora de extracción");
		determinaciones.put("aspecto", "Aspecto");
		determinaciones.put("ph", "pH");
		determinaciones.put("temperatura", "Temperatura");
		determinaciones.put("solidos_totales", "Sólidos totales");
		determinaciones.put("humedad", "Humedad");
		determinaciones.put("stv", "Sólidos totales volátiles");
		determinaciones.put("liquidos_libres", "Líquidos libres");
		determinaciones.put("sulfuro", "Sulfuro");
		determinaciones.put("cromo_en_lixiviado", "Cromo en lixiviado");
		determinaciones.put("plomo_en_lixiviado", "Plomo en lixiviado");
		determinaciones.put("materia_organica", "Materia orgánica");
		determinaciones.put("hidrocarburos_totales", "Hidrocarburos totales");
		determinaciones.put("conductividad", "Conductividad");
		determinaciones.put("relacion_CN", "Relación C/N");
		determinaciones.put("otros", "Otros 1");
		determinaciones.put("otros2", "Otros 2");
		determinaciones.put("otros3", "Otros 3");
		determinaciones.put("otros4", "Otros 4");
		String query = "SELECT * FROM informe_barros";
		PreparedStatement preparedStmt = conexion.prepareStatement(query);
		ResultSet oResultSet = preparedStmt.executeQuery();
		ResultSetMetaData rsmd = oResultSet.getMetaData();
		for (int i=1; i<=rsmd.getColumnCount(); i++) {
			columnas.add(determinaciones.get(rsmd.getColumnName(i)));
		}
		BD.cerrarConexion(conexion);
		return columnas;
	}
	
	public static ArrayList <ArrayList <String>> traerAnalisis () throws SQLException {
		ArrayList <ArrayList<String>> analisis = new ArrayList<ArrayList<String>>();
		Connection conexion = obtenerConexion();
		String query = "SELECT * FROM informe_barros";
		PreparedStatement preparedStmt = conexion.prepareStatement(query);
		ResultSet oResultSet = preparedStmt.executeQuery();
		ResultSetMetaData rsmd = oResultSet.getMetaData();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		while (oResultSet.next()) {
			ArrayList <String> temporal = new ArrayList <String>();
			for (int i=1; i<=rsmd.getColumnCount(); i++) {
				if (i==8) { // formatear fecha
					String date = sdf.format(oResultSet.getDate(i));
					temporal.add(date.toString());					
				} else {				
					temporal.add(oResultSet.getString(i));
				}
			}
			analisis.add(temporal);
		}		
		
		while (analisis.size()<4) {
			ArrayList<String> paraRelleno = new ArrayList<String>();
			for (int i=0; i<rsmd.getColumnCount(); i++) {
				paraRelleno.add("");
			}
			analisis.add(paraRelleno);
		}
		BD.cerrarConexion(conexion);
		return analisis;
		
	}
	
	public ArrayList <ArrayList<String>> traerDatosDeDeterminaciones () throws SQLException {
		ArrayList<ArrayList<String>> datosDeEspecificaciones = new ArrayList<ArrayList<String>>();
		Connection conexion = obtenerConexion();
		String query = "SELECT * FROM determinaciones_barros";
		PreparedStatement preparedStmt = conexion.prepareStatement(query);
		ResultSet oResultSet = preparedStmt.executeQuery();
		ResultSetMetaData rsmd = oResultSet.getMetaData();
		
		while (oResultSet.next()) {
			ArrayList <String> temporal = new ArrayList <String>();
			for (int i=2; i<=rsmd.getColumnCount(); i++) {
					temporal.add(oResultSet.getString(i));
			}
			datosDeEspecificaciones.add(temporal);
		}
		BD.cerrarConexion(conexion);
		return datosDeEspecificaciones;
	}
	
}