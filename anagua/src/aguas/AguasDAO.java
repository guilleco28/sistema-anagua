package aguas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

import barros.AnalisisBarro;
import bd.BaseDeDatos;

public class AguasDAO {
	
	public void agregarAgua (AnalisisAgua analisisAgua) throws MySQLIntegrityConstraintViolationException, SQLException {
		PreparedStatement preparedStmt;
		BaseDeDatos baseDeDatos = new BaseDeDatos();
		Connection oConnection = null;
		
		oConnection = baseDeDatos.abrirConexion();
		
		String query = "INSERT INTO datos (numero_analisis, industria, departamento, localidad, descarga_en, lugar_extraccion, extraido_por, fecha_extraccion, hora_extraccion, "
				+ "aspecto, pH_in_situ, pH, temperatura, caudal_instantaneo, OD_in_situ, oxigeno_disuelto, dbo5, dbo5_filtrada, dqo, aceites_y_grasas, solidos_totales, "
				+ "solidos_totales_volatiles, sst, ssv, solidos_sedimentables_10_min, solidos_sedimentables_30_min, solidos_sedimentables_60_min, amonio, nitrato, "
				+ "nitrogeno_total, fosforo_total, cromo, plomo, zinc, aluminio, manganeso, potasio, alcalinidad_total, acidez_volatil, alfa, alfa_prima, bicarbonato, "
				+ "salinidad, turbiedad, conductividad, sulfuro, sulfato, fenoles, tensoactivos_anionicos, cloro_residual, cloro_total, cloruro, dureza, color, hidrocarburos, "
				+ "coliformes_fecales, clase_curso_agua, otros, estado, otros2, otros3, otros4) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		try {
			preparedStmt = (PreparedStatement) oConnection.prepareStatement(query);			
			preparedStmt.setString(1, analisisAgua.getNroAnalisis());
			preparedStmt.setString(2, analisisAgua.getIndustria());
			preparedStmt.setString(3, analisisAgua.getDepartamento());
			preparedStmt.setString(4, analisisAgua.getLocalidad());
			preparedStmt.setString(5, analisisAgua.getDescargaEn());
			preparedStmt.setString(6, analisisAgua.getLugarExtraccion());
			preparedStmt.setString(7, analisisAgua.getExtraidoPor());
			//preparedStmt.setNull(8, java.sql.Types.TIMESTAMP);
			Timestamp fechaExtraccionSQL = new java.sql.Timestamp(analisisAgua.getFechaExtraccion().getTime());
			preparedStmt.setTimestamp(8, fechaExtraccionSQL);
			preparedStmt.setString(9, analisisAgua.getHoraExtraccion());
			preparedStmt.setString(10, analisisAgua.getAspecto());
			preparedStmt.setString(11, analisisAgua.getpHInSitu());
			preparedStmt.setString(12, analisisAgua.getpH());
			preparedStmt.setString(13, analisisAgua.getTemperatura());
			preparedStmt.setString(14, analisisAgua.getCaudalInstantaneo());
			preparedStmt.setString(15, analisisAgua.getODInSitu());
			preparedStmt.setString(16, analisisAgua.getOD());
			preparedStmt.setString(17, analisisAgua.getDBO5());
			preparedStmt.setString(18, analisisAgua.getDBO5Filtrada());
			preparedStmt.setString(19, analisisAgua.getDQO());
			preparedStmt.setString(20, analisisAgua.getAceitesYGrasas());
			preparedStmt.setString(21, analisisAgua.getSolidosTotales());
			preparedStmt.setString(22, analisisAgua.getSolidosTotalesVolatiles());
			preparedStmt.setString(23, analisisAgua.getSst());
			preparedStmt.setString(24, analisisAgua.getSsv());
			preparedStmt.setString(25, analisisAgua.getSs10());
			preparedStmt.setString(26, analisisAgua.getSs30());
			preparedStmt.setString(27, analisisAgua.getSs60());
			preparedStmt.setString(28, analisisAgua.getAmoniaco());
			preparedStmt.setString(29, analisisAgua.getNitrato());
			preparedStmt.setString(30, analisisAgua.getNitrogenoTotal());
			preparedStmt.setString(31, analisisAgua.getFosforoTotal());
			preparedStmt.setString(32, analisisAgua.getCromo());
			preparedStmt.setString(33, analisisAgua.getPlomo());
			preparedStmt.setString(34, analisisAgua.getZinc());
			preparedStmt.setString(35, analisisAgua.getAluminio());
			preparedStmt.setString(36, analisisAgua.getManganeso());
			preparedStmt.setString(37, analisisAgua.getPotasio());
			preparedStmt.setString(38, analisisAgua.getAlcalinidadTotal());
			preparedStmt.setString(39, analisisAgua.getAcidezVolatil());
			preparedStmt.setString(40, analisisAgua.getAlfa());
			preparedStmt.setString(41, analisisAgua.getAlfaPrima());
			preparedStmt.setString(42, analisisAgua.getBicarbonato());
			preparedStmt.setString(43, analisisAgua.getSalinidad());
			preparedStmt.setString(44, analisisAgua.getTurbiedad());
			preparedStmt.setString(45, analisisAgua.getConductividad());
			preparedStmt.setString(46, analisisAgua.getSulfuro());
			preparedStmt.setString(47, analisisAgua.getSulfato());
			preparedStmt.setString(48, analisisAgua.getFenoles());
			preparedStmt.setString(49, analisisAgua.getTensoactivosAnionicos());
			preparedStmt.setString(50, analisisAgua.getCloroResidual());
			preparedStmt.setString(51, analisisAgua.getCloroTotal());
			preparedStmt.setString(52, analisisAgua.getCloruro());
			preparedStmt.setString(53, analisisAgua.getDureza());
			preparedStmt.setString(54, analisisAgua.getColor());
			preparedStmt.setString(55, analisisAgua.getHidrocarburos());
			preparedStmt.setString(56, analisisAgua.getColiformesFecales());
			preparedStmt.setString(57, analisisAgua.getCursoDeAguaTipo());
			preparedStmt.setString(58, analisisAgua.getOtros());
			preparedStmt.setString(59, analisisAgua.getEstado());
			preparedStmt.setString(60, analisisAgua.getOtros2());
			preparedStmt.setString(61, analisisAgua.getOtros3());
			preparedStmt.setString(62, analisisAgua.getOtros3());
			preparedStmt.execute();
			preparedStmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				baseDeDatos.cerrarConexion(oConnection);
			} catch (SQLException e) {
			e.printStackTrace();
			}
		
		}
		
	}
	
	public void modificarAgua (AnalisisAgua analisisAgua) throws MySQLIntegrityConstraintViolationException, SQLException{
		PreparedStatement preparedStmt;
		BaseDeDatos baseDeDatos = new BaseDeDatos();
		Connection oConnection = null;
try {
			
			oConnection = baseDeDatos.abrirConexion();

			String query = "UPDATE datos SET industria = ?, departamento = ?, localidad = ?, descarga_en = ?, lugar_extraccion = ?, extraido_por = ?, fecha_extraccion = ?, hora_extraccion = ?, "
					+ "aspecto = ?, pH_in_situ = ?, ph = ?, temperatura = ?, caudal_instantaneo = ?, OD_in_situ = ?, oxigeno_disuelto = ?, dbo5 = ?, dbo5_filtrada = ?, dqo = ?, "
					+ "aceites_y_grasas = ?, solidos_totales = ?, solidos_totales_volatiles = ?, sst = ?, ssv = ?, solidos_sedimentables_10_min = ?, solidos_sedimentables_30_min = ?, "
					+ "solidos_sedimentables_60_min = ?, amonio = ?, nitrato = ?, nitrogeno_total = ?, fosforo_total = ?, cromo = ?, plomo = ?, zinc = ?, aluminio = ?, "
					+ "manganeso = ?, potasio = ?, alcalinidad_total = ?, acidez_volatil = ?, alfa = ?, alfa_prima = ?, bicarbonato = ?, salinidad = ?, turbiedad = ?, conductividad = ?, sulfuro = ?, "
					+ "sulfato = ?, fenoles = ?, tensoactivos_anionicos = ?, cloro_residual = ?, cloro_total = ?, cloruro = ?, dureza = ?, color = ?, hidrocarburos = ?, coliformes_fecales = ?, "
					+ "clase_curso_agua = ?, otros = ?, estado = ?, otros2 = ?, otros3 = ?, otros4 = ? WHERE numero_analisis = ?";
			 
			preparedStmt = (PreparedStatement) oConnection.prepareStatement(query);
			preparedStmt.setString(1, analisisAgua.getIndustria());
			preparedStmt.setString(2, analisisAgua.getDepartamento());
			preparedStmt.setString(3, analisisAgua.getLocalidad());
			preparedStmt.setString(4, analisisAgua.getDescargaEn());
			preparedStmt.setString(5, analisisAgua.getLugarExtraccion());
			preparedStmt.setString(6, analisisAgua.getExtraidoPor());
			//preparedStmt.setNull(7, java.sql.Types.TIMESTAMP);
			if (analisisAgua.getFechaExtraccion() != null) {
				Timestamp fechaExtraccionSQL = new java.sql.Timestamp(analisisAgua.getFechaExtraccion().getTime());
				preparedStmt.setTimestamp(7, fechaExtraccionSQL);
			} else {
				preparedStmt.setTimestamp(7, new java.sql.Timestamp(obtenerAnalisisAguaPorNumero(analisisAgua.getNroAnalisis()).getFechaExtraccion().getTime()));
			}
			preparedStmt.setString(8, analisisAgua.getHoraExtraccion());
			preparedStmt.setString(9, analisisAgua.getAspecto());
			preparedStmt.setString(10, analisisAgua.getpHInSitu());
			preparedStmt.setString(11, analisisAgua.getpH());
			preparedStmt.setString(12, analisisAgua.getTemperatura());
			preparedStmt.setString(13, analisisAgua.getCaudalInstantaneo());
			preparedStmt.setString(14, analisisAgua.getODInSitu());
			preparedStmt.setString(15, analisisAgua.getOD());
			preparedStmt.setString(16, analisisAgua.getDBO5());
			preparedStmt.setString(17, analisisAgua.getDBO5Filtrada());
			preparedStmt.setString(18, analisisAgua.getDQO());
			preparedStmt.setString(19, analisisAgua.getAceitesYGrasas());
			preparedStmt.setString(20, analisisAgua.getSolidosTotales());
			preparedStmt.setString(21, analisisAgua.getSolidosTotalesVolatiles());
			preparedStmt.setString(22, analisisAgua.getSst());
			preparedStmt.setString(23, analisisAgua.getSsv());
			preparedStmt.setString(24, analisisAgua.getSs10());
			preparedStmt.setString(25, analisisAgua.getSs30());
			preparedStmt.setString(26, analisisAgua.getSs60());
			preparedStmt.setString(27, analisisAgua.getAmoniaco());
			preparedStmt.setString(28, analisisAgua.getNitrato());
			preparedStmt.setString(29, analisisAgua.getNitrogenoTotal());
			preparedStmt.setString(30, analisisAgua.getFosforoTotal());
			preparedStmt.setString(31, analisisAgua.getCromo());
			preparedStmt.setString(32, analisisAgua.getPlomo());
			preparedStmt.setString(33, analisisAgua.getZinc());
			preparedStmt.setString(34, analisisAgua.getAluminio());
			preparedStmt.setString(35, analisisAgua.getManganeso());
			preparedStmt.setString(36, analisisAgua.getPotasio());
			preparedStmt.setString(37, analisisAgua.getAlcalinidadTotal());
			preparedStmt.setString(38, analisisAgua.getAcidezVolatil());
			preparedStmt.setString(39, analisisAgua.getAlfa());
			preparedStmt.setString(40, analisisAgua.getAlfaPrima());
			preparedStmt.setString(41, analisisAgua.getBicarbonato());
			preparedStmt.setString(42, analisisAgua.getSalinidad());
			preparedStmt.setString(43, analisisAgua.getTurbiedad());
			preparedStmt.setString(44, analisisAgua.getConductividad());
			preparedStmt.setString(45, analisisAgua.getSulfuro());
			preparedStmt.setString(46, analisisAgua.getSulfato());
			preparedStmt.setString(47, analisisAgua.getFenoles());
			preparedStmt.setString(48, analisisAgua.getTensoactivosAnionicos());
			preparedStmt.setString(49, analisisAgua.getCloroResidual());
			preparedStmt.setString(50, analisisAgua.getCloroTotal());
			preparedStmt.setString(51, analisisAgua.getCloruro());
			preparedStmt.setString(52, analisisAgua.getDureza());
			preparedStmt.setString(53, analisisAgua.getColor());
			preparedStmt.setString(54, analisisAgua.getHidrocarburos());
			preparedStmt.setString(55, analisisAgua.getColiformesFecales());
			preparedStmt.setString(56, analisisAgua.getCursoDeAguaTipo());
			preparedStmt.setString(57, analisisAgua.getOtros());
			preparedStmt.setString(59, analisisAgua.getOtros2());
			preparedStmt.setString(60, analisisAgua.getOtros3());
			preparedStmt.setString(61, analisisAgua.getOtros4());			
			preparedStmt.setString(58, analisisAgua.getEstado());
			preparedStmt.setString(62, analisisAgua.getNroAnalisis());
			preparedStmt.execute();
			preparedStmt.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				baseDeDatos.cerrarConexion(oConnection);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public boolean existeAnalisisAgua (String nro_analisis) {
		boolean existe = false;
		PreparedStatement preparedStmt;
		BaseDeDatos baseDeDatos = new BaseDeDatos();
		Connection oConnection = null;
		ResultSet oResultSet = null;
		try {
			
			oConnection = baseDeDatos.abrirConexion();

			String query = "SELECT * FROM datos WHERE numero_analisis = ?";
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
	
	public ArrayList <AnalisisAgua> obtenerTodosLosAnalisisAguas() {
		AnalisisAgua analisisAgua = null;
		ArrayList <AnalisisAgua> analisissAguas = new ArrayList <AnalisisAgua>();		
		PreparedStatement preparedStmt;
		BaseDeDatos baseDeDatos = new BaseDeDatos();
		Connection oConnection = null;
		ResultSet oResultSet = null;
		
		try {
			
			oConnection = baseDeDatos.abrirConexion();			
			String query = "SELECT industria, departamento, localidad, descarga_en, numero_analisis, "
					+ "lugar_extraccion, extraido_por, fecha_extraccion, "
					+ "hora_extraccion, aspecto, pH_in_situ, ph, temperatura, caudal_instantaneo, OD_in_situ, oxigeno_disuelto, "
					+ "dbo5, dbo5_filtrada, dqo, aceites_y_grasas, solidos_totales, solidos_totales_volatiles, sst, ssv, solidos_sedimentables_10_min, solidos_sedimentables_30_min, solidos_sedimentables_60_min, amonio, nitrato, "
					+ "nitrogeno_total, fosforo_total, cromo, plomo, zinc, aluminio, manganeso, potasio, alcalinidad_total, acidez_volatil, alfa, alfa_prima, bicarbonato, "
					+ "salinidad, turbiedad, conductividad, sulfuro, sulfato, fenoles, tensoactivos_anionicos, cloro_residual, cloro_total, cloruro, dureza, color, hidrocarburos, "
					+ "coliformes_fecales, clase_curso_agua, estado, otros, otros2, otros3, otros4 FROM datos";			
			preparedStmt = (PreparedStatement) oConnection.prepareStatement(query);
			oResultSet = preparedStmt.executeQuery();

			while (oResultSet.next()){
				analisisAgua = new AnalisisAgua (oResultSet.getString(5), oResultSet.getString(1), oResultSet.getString(2), oResultSet.getString(3),
						oResultSet.getString(4), oResultSet.getString(6), oResultSet.getString(7), oResultSet.getTimestamp(8), oResultSet.getString(9),
						oResultSet.getString(10), oResultSet.getString(11), oResultSet.getString(12), oResultSet.getString(13), oResultSet.getString(14),
						oResultSet.getString(15), oResultSet.getString(16), oResultSet.getString(17), oResultSet.getString(18), oResultSet.getString(19), 
						oResultSet.getString(20), oResultSet.getString(21), oResultSet.getString(22), oResultSet.getString(23), oResultSet.getString(24), 
						oResultSet.getString(25), oResultSet.getString(26), oResultSet.getString(27), oResultSet.getString(28), oResultSet.getString(29),
						oResultSet.getString(30), oResultSet.getString(31), oResultSet.getString(32), oResultSet.getString(33), oResultSet.getString(34),
						oResultSet.getString(35), oResultSet.getString(36), oResultSet.getString(37), oResultSet.getString(38), oResultSet.getString(39),
						oResultSet.getString(40), oResultSet.getString(41), oResultSet.getString(42), oResultSet.getString(43), oResultSet.getString(44),
						oResultSet.getString(45), oResultSet.getString(46), oResultSet.getString(47), oResultSet.getString(48), oResultSet.getString(49),
						oResultSet.getString(50), oResultSet.getString(51), oResultSet.getString(52), oResultSet.getString(53), oResultSet.getString(54),
						oResultSet.getString(55), oResultSet.getString(56), oResultSet.getString(57), oResultSet.getString(58), oResultSet.getString(59),
						oResultSet.getString(60), oResultSet.getString(61), oResultSet.getString(62));	
				analisissAguas.add(analisisAgua);
			}			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}	

		return analisissAguas;
	}

	public AnalisisAgua obtenerAnalisisAguaPorNumero(String nroAnalisis) {
		AnalisisAgua analisisAgua = null;		
		PreparedStatement preparedStmt;
		BaseDeDatos baseDeDatos = new BaseDeDatos();
		Connection oConnection = null;
		ResultSet oResultSet = null;
		try {
			
			oConnection = baseDeDatos.abrirConexion();			
			String query = "SELECT industria, departamento, localidad, descarga_en, numero_analisis, "
					+ "lugar_extraccion, extraido_por, fecha_extraccion, "
					+ "hora_extraccion, aspecto, pH_in_situ, ph, temperatura, caudal_instantaneo, OD_in_situ, oxigeno_disuelto, "
					+ "dbo5, dbo5_filtrada, dqo, aceites_y_grasas, solidos_totales, solidos_totales_volatiles, sst, ssv, solidos_sedimentables_10_min, solidos_sedimentables_30_min, solidos_sedimentables_60_min, amonio, nitrato, "
					+ "nitrogeno_total, fosforo_total, cromo, plomo, zinc, aluminio, manganeso, potasio, alcalinidad_total, acidez_volatil, alfa, alfa_prima, bicarbonato, "
					+ "salinidad, turbiedad, conductividad, sulfuro, sulfato, fenoles, tensoactivos_anionicos, cloro_residual, cloro_total, cloruro, dureza, color, hidrocarburos, "
					+ "coliformes_fecales, clase_curso_agua, estado, otros, otros2, otros3, otros4 FROM datos WHERE numero_analisis = ?";			

			preparedStmt = (PreparedStatement) oConnection.prepareStatement(query);
			preparedStmt.setString(1, nroAnalisis);
			oResultSet = preparedStmt.executeQuery();
			
			
			while (oResultSet.next()){
				analisisAgua = new AnalisisAgua (oResultSet.getString(5), oResultSet.getString(1), oResultSet.getString(2), oResultSet.getString(3),
						oResultSet.getString(4), oResultSet.getString(6), oResultSet.getString(7), oResultSet.getTimestamp(8), oResultSet.getString(9),
						oResultSet.getString(10), oResultSet.getString(11), oResultSet.getString(12), oResultSet.getString(13), oResultSet.getString(14),
						oResultSet.getString(15), oResultSet.getString(16), oResultSet.getString(17), oResultSet.getString(18), oResultSet.getString(19), 
						oResultSet.getString(20), oResultSet.getString(21), oResultSet.getString(22), oResultSet.getString(23), oResultSet.getString(24), 
						oResultSet.getString(25), oResultSet.getString(26), oResultSet.getString(27), oResultSet.getString(28), oResultSet.getString(29),
						oResultSet.getString(30), oResultSet.getString(31), oResultSet.getString(32), oResultSet.getString(33), oResultSet.getString(34),
						oResultSet.getString(35), oResultSet.getString(36), oResultSet.getString(37), oResultSet.getString(38), oResultSet.getString(39),
						oResultSet.getString(40), oResultSet.getString(41), oResultSet.getString(42), oResultSet.getString(43), oResultSet.getString(44),
						oResultSet.getString(45), oResultSet.getString(46), oResultSet.getString(47), oResultSet.getString(48), oResultSet.getString(49),
						oResultSet.getString(50), oResultSet.getString(51), oResultSet.getString(52), oResultSet.getString(53), oResultSet.getString(54),
						oResultSet.getString(55), oResultSet.getString(56), oResultSet.getString(57), oResultSet.getString(58), oResultSet.getString(59),
						oResultSet.getString(60), oResultSet.getString(61), oResultSet.getString(62));				
			}			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(analisisAgua.getNroAnalisis()+" - "+analisisAgua.getpH()+" - "+analisisAgua.getAspecto());
		return analisisAgua;
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
	
	public void generarTablaParaInformeAguas (ArrayList<AnalisisAgua> analisisParaInforme) throws SQLException {
		PreparedStatement preparedStmt;
		BaseDeDatos baseDeDatos = new BaseDeDatos();
		Connection oConnection = null;
		oConnection = baseDeDatos.abrirConexion();			
		String query = "DROP TABLE IF EXISTS informe_aguas";			
		preparedStmt = (PreparedStatement) oConnection.prepareStatement(query);
		preparedStmt.execute();
		query = "CREATE TABLE informe_aguas (nro_analisis VARCHAR(255), industria VARCHAR(255), departamento VARCHAR(255), localidad VARCHAR(255), descarga_en VARCHAR(255), lugar_extraccion VARCHAR(255), extraido_por VARCHAR(255), fecha_extraccion TIMESTAMP, "
				+ "hora_extraccion VARCHAR(255), aspecto VARCHAR(255), pH_in_situ VARCHAR(255), ph VARCHAR(255), temperatura VARCHAR(255), caudal_instantaneo VARCHAR(255), OD_in_situ VARCHAR(255), oxigeno_disuelto VARCHAR(255), dbo5 VARCHAR(255), dbo5_filtrada VARCHAR(255), dqo VARCHAR(255), aceites_y_grasas VARCHAR(255), "
				+ "solidos_totales VARCHAR(255), solidos_totales_volatiles VARCHAR(255), sst VARCHAR(255), ssv VARCHAR(255), solidos_sedimentables_10_min VARCHAR(255), solidos_sedimentables_30_min VARCHAR(255), solidos_sedimentables_60_min VARCHAR(255), "
				+ "amonio VARCHAR(255), nitrato VARCHAR(255), nitrogeno_total VARCHAR(255), fosforo_total VARCHAR(255), cromo VARCHAR(255), plomo VARCHAR(255), zinc VARCHAR(255), aluminio VARCHAR(255), manganeso VARCHAR(255), potasio VARCHAR(255), alcalinidad_total VARCHAR(255), acidez_volatil VARCHAR(255), "
				+ "alfa VARCHAR(255), alfa_prima VARCHAR(255), bicarbonato VARCHAR(255), salinidad VARCHAR(255), turbiedad VARCHAR(255), conductividad VARCHAR(255), sulfuro VARCHAR(255), sulfato VARCHAR(255), fenoles VARCHAR(255), tensoactivos_anionicos VARCHAR(255), cloro_residual VARCHAR(255), cloro_total VARCHAR(255), "
				+ "cloruro VARCHAR(255), dureza VARCHAR(255), color VARCHAR(255), hidrocarburos VARCHAR(255), coliformes_fecales VARCHAR(255), clase_curso_agua VARCHAR(255), otros VARCHAR(255), otros2 VARCHAR(255), otros3 VARCHAR(255), otros4 VARCHAR(255))";
		preparedStmt = (PreparedStatement) oConnection.prepareStatement(query);
		preparedStmt.execute();
		for (int i=0; i<analisisParaInforme.size(); i++) {
			AnalisisAgua analisisAAgregar = analisisParaInforme.get(i);
			query = "INSERT INTO informe_aguas VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			preparedStmt = (PreparedStatement) oConnection.prepareStatement(query);
			preparedStmt.setString(1, analisisAAgregar.getNroAnalisis());
			preparedStmt.setString(2, analisisAAgregar.getIndustria());
			preparedStmt.setString(3, analisisAAgregar.getDepartamento());
			preparedStmt.setString(4, analisisAAgregar.getLocalidad());
			preparedStmt.setString(5, analisisAAgregar.getDescargaEn());
			preparedStmt.setString(6, analisisAAgregar.getLugarExtraccion());
			preparedStmt.setString(7, analisisAAgregar.getExtraidoPor());
			preparedStmt.setNull(8, java.sql.Types.TIMESTAMP);
			/*Timestamp fechaExtraccionSQL = new java.sql.Timestamp(analisisAAgregar.getFechaExtraccion().getTime());
			preparedStmt.setTimestamp(8, fechaExtraccionSQL);*/
			preparedStmt.setString(9, analisisAAgregar.getHoraExtraccion());
			preparedStmt.setString(10, analisisAAgregar.getAspecto());
			preparedStmt.setString(11, analisisAAgregar.getpHInSitu());
			preparedStmt.setString(12, analisisAAgregar.getpH());
			preparedStmt.setString(13, analisisAAgregar.getTemperatura());
			preparedStmt.setString(14, analisisAAgregar.getCaudalInstantaneo());
			preparedStmt.setString(15, analisisAAgregar.getODInSitu());
			preparedStmt.setString(16, analisisAAgregar.getOD());
			preparedStmt.setString(17, analisisAAgregar.getDBO5());
			preparedStmt.setString(18, analisisAAgregar.getDBO5Filtrada());
			preparedStmt.setString(19, analisisAAgregar.getDQO());
			preparedStmt.setString(20, analisisAAgregar.getAceitesYGrasas());
			preparedStmt.setString(21, analisisAAgregar.getSolidosTotales());
			preparedStmt.setString(22, analisisAAgregar.getSolidosTotalesVolatiles());
			preparedStmt.setString(23, analisisAAgregar.getSst());
			preparedStmt.setString(24, analisisAAgregar.getSsv());
			preparedStmt.setString(25, analisisAAgregar.getSs10());
			preparedStmt.setString(26, analisisAAgregar.getSs30());
			preparedStmt.setString(27, analisisAAgregar.getSs60());
			preparedStmt.setString(28, analisisAAgregar.getAmoniaco());
			preparedStmt.setString(29, analisisAAgregar.getNitrato());
			preparedStmt.setString(30, analisisAAgregar.getNitrogenoTotal());
			preparedStmt.setString(31, analisisAAgregar.getFosforoTotal());
			preparedStmt.setString(32, analisisAAgregar.getCromo());
			preparedStmt.setString(33, analisisAAgregar.getPlomo());
			preparedStmt.setString(34, analisisAAgregar.getZinc());
			preparedStmt.setString(35, analisisAAgregar.getAluminio());
			preparedStmt.setString(36, analisisAAgregar.getManganeso());
			preparedStmt.setString(37, analisisAAgregar.getPotasio());
			preparedStmt.setString(38, analisisAAgregar.getAlcalinidadTotal());
			preparedStmt.setString(39, analisisAAgregar.getAcidezVolatil());
			preparedStmt.setString(40, analisisAAgregar.getAlfa());
			preparedStmt.setString(41, analisisAAgregar.getAlfaPrima());
			preparedStmt.setString(42, analisisAAgregar.getBicarbonato());
			preparedStmt.setString(43, analisisAAgregar.getSalinidad());
			preparedStmt.setString(44, analisisAAgregar.getTurbiedad());
			preparedStmt.setString(45, analisisAAgregar.getConductividad());
			preparedStmt.setString(46, analisisAAgregar.getSulfuro());
			preparedStmt.setString(47, analisisAAgregar.getSulfato());
			preparedStmt.setString(48, analisisAAgregar.getFenoles());
			preparedStmt.setString(49, analisisAAgregar.getTensoactivosAnionicos());
			preparedStmt.setString(50, analisisAAgregar.getCloroResidual());
			preparedStmt.setString(51, analisisAAgregar.getCloroTotal());
			preparedStmt.setString(52, analisisAAgregar.getCloruro());
			preparedStmt.setString(53, analisisAAgregar.getDureza());
			preparedStmt.setString(54, analisisAAgregar.getColor());
			preparedStmt.setString(55, analisisAAgregar.getHidrocarburos());
			preparedStmt.setString(56, analisisAAgregar.getColiformesFecales());
			preparedStmt.setString(57, analisisAAgregar.getCursoDeAguaTipo());
			preparedStmt.setString(58, analisisAAgregar.getOtros());
			preparedStmt.setString(59, analisisAAgregar.getOtros2());
			preparedStmt.setString(60, analisisAAgregar.getOtros3());
			preparedStmt.setString(61, analisisAAgregar.getOtros4());
			preparedStmt.execute();
		}
		preparedStmt.close();
		query = "SELECT * FROM informe_aguas";
		preparedStmt = (PreparedStatement) oConnection.prepareStatement(query);
		ResultSet oResultSet = preparedStmt.executeQuery();
		int rowcount = 0;
		if (oResultSet.last()) {
			rowcount = oResultSet.getRow();
			oResultSet.beforeFirst();
		}
		
		//int cantidadColumnasABorrar = 0;
		ArrayList <String> columnasABorrar = new ArrayList <String> ();
		for (int i=4; i<oResultSet.getMetaData().getColumnCount(); i++) {
			oResultSet.first();
			int cantidadNulos = 0;
			for (int j=0; j<rowcount; j++) {
				if (oResultSet.getObject(i+1).equals("") || oResultSet.getObject(i+1).equals(null)) {
					cantidadNulos +=1;
					if (cantidadNulos == rowcount) {
						String columnaABorrar = oResultSet.getMetaData().getColumnName(i+1);
						columnasABorrar.add(columnaABorrar);					
					}
				}
				oResultSet.next();
			}
		}
		
		
		
		for (int i=0; i<columnasABorrar.size(); i++) {
			query = "ALTER TABLE informe_aguas DROP COLUMN "+columnasABorrar.get(i);
			preparedStmt = (PreparedStatement) oConnection.prepareStatement(query);
			preparedStmt.execute();
		}
	}
	
	

}
