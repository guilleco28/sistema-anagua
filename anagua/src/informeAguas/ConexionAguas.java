package informeAguas;

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

public class ConexionAguas {
	
	static Connection con = null;
	/*static String driver = "net.ucanaccess.jdbc.UcanaccessDriver";
	static String url = "jdbc:ucanaccess://";*/
	private static String url="jdbc:mysql:";
	private static ArrayList <String> temporal;
	static Properties p = new Properties();
	static BaseDeDatos BD = new BaseDeDatos();
	
	public ConexionAguas() {
		try {
			//p.load(new FileReader("\\\\192.168.1.7\\datos2\\ANAGUA\\sistema-anagua\\config.properties"));
			//p.load(new FileReader("C:\\Users\\Guillermo\\Documents\\sistema-anagua\\config.properties"));
			String ruta_config_properties = "C:\\Users\\usuario\\Documents\\sistema-anagua\\config.properties";
			p.load(new FileReader(ruta_config_properties));
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
			//System.out.println("Hubo un problema al conectarse a la bd.");
			System.out.println(ex);
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
		determinaciones.put("pH_in_situ", "pH in situ");
		determinaciones.put("ph", "pH");
		determinaciones.put("temperatura", "Temperatura");
		determinaciones.put("caudal_instantaneo", "Caudal instantáneo");
		determinaciones.put("OD_in_situ", "OD (Oxígeno disuelto) in situ");
		determinaciones.put("oxigeno_disuelto", "OD (Oxígeno disuelto)");
		determinaciones.put("dbo5", "DBO5");
		determinaciones.put("dbo5_filtrada", "DBO5 filtrada");
		determinaciones.put("dqo", "DQO");
		determinaciones.put("aceites_y_grasas", "Aceites y grasas");
		determinaciones.put("solidos_totales", "Sólidos totales");
		determinaciones.put("solidos_totales_volatiles", "Sólidos totales volátiles");
		determinaciones.put("sst", "Sólidos suspendidos totales (SST)");
		determinaciones.put("ssv", "Sólidos suspendidos volátiles (SSV)");
		determinaciones.put("solidos_sedimentables_10_min", "Sólidos sedimentables (10 min)");
		determinaciones.put("solidos_sedimentables_30_min", "Sólidos sedimentables (30 min)");
		determinaciones.put("solidos_sedimentables_60_min", "Sólidos sedimentables (1 hora)");
		determinaciones.put("amonio", "Amonio");
		determinaciones.put("nitrato", "Nitrato");
		determinaciones.put("nitrito", "Nitrito");
		determinaciones.put("nitrogeno_total", "Nitrógeno total");
		determinaciones.put("fosforo_total", "Fósforo total");
		determinaciones.put("cromo", "Cromo");
		determinaciones.put("plomo", "Plomo");
		determinaciones.put("zinc", "Zinc");
		determinaciones.put("aluminio", "Aluminio");
		determinaciones.put("manganeso", "Manganeso");
		determinaciones.put("potasio", "Potasio");
		determinaciones.put("alcalinidad_total", "Alcalinidad total");
		determinaciones.put("acidez_volatil", "Acidez volátil");
		determinaciones.put("alfa", "ALFA1");
		determinaciones.put("alfa_prima", "Alfa prima");
		determinaciones.put("bicarbonato", "Bicarbonato");
		determinaciones.put("salinidad", "Salinidad");
		determinaciones.put("turbiedad", "Turbiedad");
		determinaciones.put("conductividad", "Conductividad");
		determinaciones.put("sulfuro", "Sulfuro");
		determinaciones.put("sulfato", "Sulfato");
		determinaciones.put("fenoles", "Fenoles");
		determinaciones.put("tensoactivos_anionicos", "Tensoactivos aniónicos");
		determinaciones.put("cloro_residual", "Cloro residual");
		determinaciones.put("cloro_total", "Cloro total");
		determinaciones.put("cloruro", "Cloruro");
		determinaciones.put("dureza", "Dureza");
		determinaciones.put("color", "Color");
		determinaciones.put("hidrocarburos", "Hidrocarburos");
		determinaciones.put("coliformes_fecales", "Coliformes fecales");
		determinaciones.put("clase_curso_agua", "Clasificación curso de agua");
		determinaciones.put("otros", "Otros");
		determinaciones.put("otros2", "Otros 2");	
		determinaciones.put("otros3", "Otros 3");	
		determinaciones.put("otros4", "Otros 4");	
		String query = "SELECT * FROM informe_aguas";
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
		String query = "SELECT * FROM informe_aguas";
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
		String query = "SELECT * FROM determinaciones_aguas";
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
	
	public String traerCursoDeAgua () throws SQLException {
		String cursoDeAgua = "noHayCurso";
		Connection conexion = obtenerConexion();
		String query = "SELECT * FROM informe_aguas";
		PreparedStatement preparedStmt = conexion.prepareStatement(query);
		ResultSet oResultSet = preparedStmt.executeQuery();
		ResultSetMetaData rsmd = oResultSet.getMetaData();
		oResultSet.next();
		for (int i=1; i<=rsmd.getColumnCount(); i++) {
			if (rsmd.getColumnName(i).equals("clase_curso_agua")) {
				cursoDeAgua = oResultSet.getString(i);
			}
		}
		BD.cerrarConexion(conexion);
		return cursoDeAgua;
	}

	public String getUrlBaseDeDatos() {
		return url;
	}
	
}