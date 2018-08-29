package barros;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

import bd.BaseDeDatos;
import industrias.Industria;

public class DatosDAO {
	
	public void agregarBarro(AnalisisBarro analisisBarro) throws MySQLIntegrityConstraintViolationException, SQLException {
		PreparedStatement preparedStmt;
		BaseDeDatos baseDeDatos = new BaseDeDatos();
		Connection oConnection = null;
		try {
			
			oConnection = baseDeDatos.abrirConexion();

			String query = "INSERT INTO datos (numero_analisis, industria, departamento, localidad, descarga_en, lugar_extraccion, extraido_por, fecha_extraccion, hora_extraccion, "
					+ "aspecto, ph_barros, temperatura, solidos_totales_barros, humedad, solidos_totales_volatiles, liquidos_libres, sulfuro, cromo_en_lixiviado, plomo_en_lixiviado, "
					+ "materia_organica, hidrocarburos_totales, conductividad_barros, relacion_CN, otros, estado)" + " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			
			preparedStmt = (PreparedStatement) oConnection.prepareStatement(query);
			preparedStmt.setString(1, analisisBarro.getNroAnalisis());
			preparedStmt.setString(2, analisisBarro.getIndustria());
			preparedStmt.setString(3, analisisBarro.getDepartamento());
			preparedStmt.setString(4, analisisBarro.getLocalidad());
			preparedStmt.setString(5, analisisBarro.getDescargaEn());
			preparedStmt.setString(6, analisisBarro.getLugarExtraccion());
			preparedStmt.setString(7, analisisBarro.getExtraidoPor());
			Timestamp fechaExtraccionSQL = new java.sql.Timestamp(analisisBarro.getFechaExtraccion().getTime());
			preparedStmt.setTimestamp(8, fechaExtraccionSQL);			
			preparedStmt.setString(9, analisisBarro.getHoraExtraccion());
			preparedStmt.setString(10, analisisBarro.getAspecto());
			preparedStmt.setString(11, analisisBarro.getpH());
			preparedStmt.setString(12, analisisBarro.getTemperatura());
			preparedStmt.setString(13, analisisBarro.getSolidosTotales());
			preparedStmt.setString(14, analisisBarro.getHumedad());
			preparedStmt.setString(15, analisisBarro.getSolidosTotalesVolatiles());
			preparedStmt.setString(16, analisisBarro.getLiquidosLibres());
			preparedStmt.setString(17, analisisBarro.getSulfuro());
			preparedStmt.setString(18, analisisBarro.getCromoEnLixiviado());
			preparedStmt.setString(19, analisisBarro.getPlomoEnLixiviado());
			preparedStmt.setString(20, analisisBarro.getMateriaOrganica());
			preparedStmt.setString(21, analisisBarro.getHidrocarburosTotales());
			preparedStmt.setString(22, analisisBarro.getConductividad());
			preparedStmt.setString(23, analisisBarro.getRelacionCN());
			preparedStmt.setString(24, analisisBarro.getOtros());
			preparedStmt.setString(25, analisisBarro.getEstado());
			preparedStmt.execute();
			preparedStmt.close();
			
		} finally {
			try {
				baseDeDatos.cerrarConexion(oConnection);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void modificarBarro (AnalisisBarro analisisBarro) throws MySQLIntegrityConstraintViolationException, SQLException {
		PreparedStatement preparedStmt;
		BaseDeDatos baseDeDatos = new BaseDeDatos();
		Connection oConnection = null;
		try {
			
			oConnection = baseDeDatos.abrirConexion();

			String query = "UPDATE datos SET industria = ?, departamento = ?, localidad = ?, descarga_en = ?, lugar_extraccion = ?, extraido_por = ?, fecha_extraccion = ?, hora_extraccion = ?, "
					+ "aspecto = ?, ph_barros = ?, temperatura = ?, solidos_totales_barros = ?, humedad = ?, solidos_totales_volatiles = ?, liquidos_libres = ?, sulfuro = ?, cromo_en_lixiviado = ?, plomo_en_lixiviado = ?, "
					+ "materia_organica = ?, hidrocarburos_totales = ?, conductividad_barros = ?, relacion_CN = ?, otros = ?, estado = ? WHERE numero_analisis = ?";
			
			preparedStmt = (PreparedStatement) oConnection.prepareStatement(query);
			
			preparedStmt.setString(1, analisisBarro.getIndustria());
			preparedStmt.setString(2, analisisBarro.getDepartamento());
			preparedStmt.setString(3, analisisBarro.getLocalidad());
			preparedStmt.setString(4, analisisBarro.getDescargaEn());
			preparedStmt.setString(5, analisisBarro.getLugarExtraccion());
			preparedStmt.setString(6, analisisBarro.getExtraidoPor());
			if (analisisBarro.getFechaExtraccion() != null) {
				Timestamp fechaExtraccionSQL = new java.sql.Timestamp(analisisBarro.getFechaExtraccion().getTime());
				preparedStmt.setTimestamp(7, fechaExtraccionSQL);
			} else {
				preparedStmt.setTimestamp(7, new java.sql.Timestamp(obtenerAnalisisBarroPorNumero(analisisBarro.getNroAnalisis()).getFechaExtraccion().getTime()));
			}
			preparedStmt.setString(8, analisisBarro.getHoraExtraccion());
			preparedStmt.setString(9, analisisBarro.getAspecto());
			preparedStmt.setString(10, analisisBarro.getpH());
			preparedStmt.setString(11, analisisBarro.getTemperatura());
			preparedStmt.setString(12, analisisBarro.getSolidosTotales());
			preparedStmt.setString(13, analisisBarro.getHumedad());
			preparedStmt.setString(14, analisisBarro.getSolidosTotalesVolatiles());
			preparedStmt.setString(15, analisisBarro.getLiquidosLibres());
			preparedStmt.setString(16, analisisBarro.getSulfuro());
			preparedStmt.setString(17, analisisBarro.getCromoEnLixiviado());
			preparedStmt.setString(18, analisisBarro.getPlomoEnLixiviado());
			preparedStmt.setString(19, analisisBarro.getMateriaOrganica());
			preparedStmt.setString(20, analisisBarro.getHidrocarburosTotales());
			preparedStmt.setString(21, analisisBarro.getConductividad());
			preparedStmt.setString(22, analisisBarro.getRelacionCN());
			preparedStmt.setString(23, analisisBarro.getOtros());
			preparedStmt.setString(25, analisisBarro.getNroAnalisis());
			preparedStmt.setString(24, analisisBarro.getEstado());
			preparedStmt.execute();
			preparedStmt.close();
			
		} finally {
			try {
				baseDeDatos.cerrarConexion(oConnection);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public boolean existeAnalisisBarro (String nro_analisis) {
		boolean existe = false;
		PreparedStatement preparedStmt;
		BaseDeDatos baseDeDatos = new BaseDeDatos();
		Connection oConnection = null;
		ResultSet oResultSet = null;
		try {
			
			oConnection = baseDeDatos.abrirConexion();

			String query = "SELECT * FROM datos WHERE nro_analisis = ?";
			preparedStmt = (PreparedStatement) oConnection.prepareStatement(query);
			preparedStmt.setString(1, nro_analisis);
			
			oResultSet = preparedStmt.executeQuery();
			
			if(oResultSet.next()){
				existe = true;
			}
			
			preparedStmt.close();	
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			try {
				baseDeDatos.cerrarConexion(oConnection);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		return existe;
	}

	public ArrayList <AnalisisBarro> obtenerTodosLosAnalisisBarros() {
		ArrayList <AnalisisBarro> analisissBarros = new ArrayList <AnalisisBarro>();		
		PreparedStatement preparedStmt;
		BaseDeDatos baseDeDatos = new BaseDeDatos();
		Connection oConnection = null;
		ResultSet oResultSet = null;
		try {
			
			oConnection = baseDeDatos.abrirConexion();			
			String query = "SELECT industria, departamento, localidad, descarga_en, numero_analisis, "
					+ "lugar_extraccion, extraido_por, fecha_extraccion, "
					+ "hora_extraccion, aspecto, ph_barros, temperatura, solidos_totales_barros, humedad, solidos_totales_volatiles, "
					+ "liquidos_libres, sulfuro, cromo_en_lixiviado, plomo_en_lixiviado, materia_organica, hidrocarburos_totales, "
					+ "conductividad_barros, relacion_CN, otros, estado FROM datos";			
			preparedStmt = (PreparedStatement) oConnection.prepareStatement(query);
			oResultSet = preparedStmt.executeQuery();

			while (oResultSet.next()){
				AnalisisBarro analisisBarro = new AnalisisBarro (oResultSet.getString(1), oResultSet.getString(2), oResultSet.getString(3), oResultSet.getString(4),
						oResultSet.getString(5), oResultSet.getString(6), oResultSet.getString(7), oResultSet.getDate(8), oResultSet.getString(9),
						oResultSet.getString(10), oResultSet.getString(11), oResultSet.getString(12), oResultSet.getString(13), oResultSet.getString(14),
						oResultSet.getString(15), oResultSet.getString(16), oResultSet.getString(17), oResultSet.getString(18), oResultSet.getString(19), 
						oResultSet.getString(20), oResultSet.getString(21), oResultSet.getString(22), oResultSet.getString(23), oResultSet.getString(24), oResultSet.getString(25));

				analisissBarros.add(analisisBarro);

				//System.out.println(analisisBarro.getNroAnalisis()+" "+analisisBarro.getSolidosTotales());
			}			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		
		return analisissBarros;
		
	}
	
	public AnalisisBarro obtenerAnalisisBarroPorNumero (String nroAnalisis){
		AnalisisBarro analisisBarro = null;		
		PreparedStatement preparedStmt;
		BaseDeDatos baseDeDatos = new BaseDeDatos();
		Connection oConnection = null;
		ResultSet oResultSet = null;
		try {
			
			oConnection = baseDeDatos.abrirConexion();			
			String query = "SELECT industria, departamento, localidad, descarga_en, numero_analisis, "
					+ "lugar_extraccion, extraido_por, fecha_extraccion, "
					+ "hora_extraccion, aspecto, ph_barros, temperatura, solidos_totales_barros, humedad, solidos_totales_volatiles, "
					+ "liquidos_libres, sulfuro, cromo_en_lixiviado, plomo_en_lixiviado, materia_organica, hidrocarburos_totales, "
					+ "conductividad_barros, relacion_CN, otros, estado FROM datos WHERE numero_analisis = ?";			
			preparedStmt = (PreparedStatement) oConnection.prepareStatement(query);
			preparedStmt.setString(1, nroAnalisis);
			oResultSet = preparedStmt.executeQuery();
			
			while (oResultSet.next()){
				analisisBarro = new AnalisisBarro (oResultSet.getString(1), oResultSet.getString(2), oResultSet.getString(3), oResultSet.getString(4),
						oResultSet.getString(5), oResultSet.getString(6), oResultSet.getString(7), oResultSet.getTimestamp(8), oResultSet.getString(9),
						oResultSet.getString(10), oResultSet.getString(11), oResultSet.getString(12), oResultSet.getString(13), oResultSet.getString(14),
						oResultSet.getString(15), oResultSet.getString(16), oResultSet.getString(17), oResultSet.getString(18), oResultSet.getString(19), 
						oResultSet.getString(20), oResultSet.getString(21), oResultSet.getString(22), oResultSet.getString(23), oResultSet.getString(24), oResultSet.getString(25));

				
			}			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return analisisBarro;
		
	}
	
	public void validarAnalisis (String nroAnalisis) {	
		PreparedStatement preparedStmt;
		BaseDeDatos baseDeDatos = new BaseDeDatos();
		Connection oConnection = null;
		try {
			
			oConnection = baseDeDatos.abrirConexion();			
			String query = "UPDATE datos SET estado = ? WHERE numero_analisis = ?";			
			preparedStmt = (PreparedStatement) oConnection.prepareStatement(query);
			preparedStmt.setString(1, "Validado");
			preparedStmt.setString(2, nroAnalisis);
			preparedStmt.execute();
			preparedStmt.close();					
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
	
	public void desvalidarAnalisis (String nroAnalisis) {	
		PreparedStatement preparedStmt;
		BaseDeDatos baseDeDatos = new BaseDeDatos();
		Connection oConnection = null;
		try {
			
			oConnection = baseDeDatos.abrirConexion();			
			String query = "UPDATE datos SET estado = ? WHERE numero_analisis = ?";			
			preparedStmt = (PreparedStatement) oConnection.prepareStatement(query);
			preparedStmt.setString(1, "En proceso");
			preparedStmt.setString(2, nroAnalisis);
			preparedStmt.execute();
			preparedStmt.close();					
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
	
	public void generarTablaParaInformeBarros(ArrayList<AnalisisBarro> analisisParaInforme) {
		
		PreparedStatement preparedStmt;
		BaseDeDatos baseDeDatos = new BaseDeDatos();
		Connection oConnection = null;
		try {			
			oConnection = baseDeDatos.abrirConexion();			
			String query = "DROP TABLE IF EXISTS informe_barros";			
			preparedStmt = (PreparedStatement) oConnection.prepareStatement(query);
			preparedStmt.execute();
			query = "CREATE TABLE informe_barros (nro_analisis VARCHAR(255), industria VARCHAR(255), departamento VARCHAR(255), "
					+ "localidad VARCHAR(255), descarga_en VARCHAR(255), lugar_extraccion VARCHAR(255), extraido_por VARCHAR(255), "
					+ "fecha_extraccion DATE, hora_extraccion VARCHAR(255), aspecto VARCHAR(255), ph VARCHAR(255), temperatura VARCHAR(255),"
					+ " solidos_totales VARCHAR(255), humedad VARCHAR(255), stv VARCHAR(255), liquidos_libres VARCHAR(255), "
					+ "sulfuro VARCHAR(255), cromo_en_lixiviado VARCHAR(255), plomo_en_lixiviado VARCHAR(255), materia_organica VARCHAR(255), "
					+ "hidrocarburos_totales VARCHAR(255), conductividad VARCHAR(255), relacion_CN VARCHAR(255), otros VARCHAR(255));";		
			preparedStmt = (PreparedStatement) oConnection.prepareStatement(query);
			preparedStmt.execute();

			for (int i=0; i<analisisParaInforme.size(); i++) {
				AnalisisBarro analisisAAgregar = analisisParaInforme.get(i);
				query = "INSERT INTO informe_barros VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
				preparedStmt = (PreparedStatement) oConnection.prepareStatement(query);
				preparedStmt.setString(1, analisisAAgregar.getNroAnalisis());
				preparedStmt.setString(2, analisisAAgregar.getIndustria());
				preparedStmt.setString(3, analisisAAgregar.getDepartamento());
				preparedStmt.setString(4, analisisAAgregar.getLocalidad());
				preparedStmt.setString(5, analisisAAgregar.getDescargaEn());
				preparedStmt.setString(6, analisisAAgregar.getLugarExtraccion());
				preparedStmt.setString(7, analisisAAgregar.getExtraidoPor());
				preparedStmt.setDate(8, null);
				preparedStmt.setString(9, analisisAAgregar.getHoraExtraccion());
				preparedStmt.setString(10, analisisAAgregar.getAspecto());
				preparedStmt.setString(11, analisisAAgregar.getpH());
				preparedStmt.setString(12, analisisAAgregar.getTemperatura());
				preparedStmt.setString(13, analisisAAgregar.getSolidosTotales());
				preparedStmt.setString(14, analisisAAgregar.getHumedad());
				preparedStmt.setString(15, analisisAAgregar.getSolidosTotalesVolatiles());
				preparedStmt.setString(16, analisisAAgregar.getLiquidosLibres());
				preparedStmt.setString(17, analisisAAgregar.getSulfuro());
				preparedStmt.setString(18, analisisAAgregar.getCromoEnLixiviado());
				preparedStmt.setString(19, analisisAAgregar.getPlomoEnLixiviado());
				preparedStmt.setString(20, analisisAAgregar.getMateriaOrganica());
				preparedStmt.setString(21, analisisAAgregar.getHidrocarburosTotales());
				preparedStmt.setString(22, analisisAAgregar.getConductividad());
				preparedStmt.setString(23, analisisAAgregar.getRelacionCN());
				preparedStmt.setString(24, analisisAAgregar.getOtros());
				preparedStmt.execute();
			}
			
			preparedStmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}


