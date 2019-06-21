package industrias;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

import barros.AnalisisBarro;
import bd.BaseDeDatos;

public class IndustriasDAO {
	
	public ArrayList <Industria> obtenerIndustrias (){
		ArrayList <Industria> industrias = new ArrayList <Industria>();		
		PreparedStatement preparedStmt;
		BaseDeDatos baseDeDatos = new BaseDeDatos();
		Connection oConnection = null;
		ResultSet oResultSet = null;
		try {
			
			oConnection = baseDeDatos.abrirConexion();			
			String query = "SELECT * FROM industrias";			
			preparedStmt = (PreparedStatement) oConnection.prepareStatement(query);
			oResultSet = preparedStmt.executeQuery();
			
			while (oResultSet.next()){
				Industria industria = new Industria (oResultSet.getInt(1), oResultSet.getString(2), oResultSet.getString(3), oResultSet.getString(4), 
						oResultSet.getString(5), oResultSet.getString(6), oResultSet.getString(7), oResultSet.getString(8), oResultSet.getString(9), 
						oResultSet.getString(10), oResultSet.getString(11), oResultSet.getString(12));
				industrias.add(industria);
			}			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return industrias;
	}
	
	public void agregarIndustria (Industria industria) {
		PreparedStatement preparedStmt;
		BaseDeDatos baseDeDatos = new BaseDeDatos();
		Connection oConnection = null;
		try{
			oConnection = baseDeDatos.abrirConexion();
			String query = "INSERT INTO industrias VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
			preparedStmt = (PreparedStatement) oConnection.prepareStatement(query);
			preparedStmt.setInt(1, industria.getId());
			preparedStmt.setString(2, industria.getCliente());
			preparedStmt.setString(3, industria.getResponsable());
			preparedStmt.setString(4, industria.getDepartamento());
			preparedStmt.setString(5, industria.getLocalidad());
			preparedStmt.setString(6, industria.getDireccion());
			preparedStmt.setString(7, industria.getTelefono());
			preparedStmt.setString(8, industria.getClaveDeAccesoWeb());
			preparedStmt.setString(9, industria.getContacto());
			preparedStmt.setString(10, industria.getRubro());
			preparedStmt.setString(11, industria.getDescargaAbreviada());
			preparedStmt.setString(12, industria.getDescarga());			
			preparedStmt.execute();
			
		} catch (SQLException e){
			e.printStackTrace();
		}
	}
	
	public Industria obtenerIndustriaPorNombre (String nombreIndustria){
		Industria industria = null;		
		PreparedStatement preparedStmt;
		BaseDeDatos baseDeDatos = new BaseDeDatos();
		Connection oConnection = null;
		ResultSet oResultSet = null;
		try {
			
			oConnection = baseDeDatos.abrirConexion();			
			String query = "SELECT * FROM industrias WHERE cliente = ?";			
			preparedStmt = (PreparedStatement) oConnection.prepareStatement(query);
			preparedStmt.setString(1, nombreIndustria);
			oResultSet = preparedStmt.executeQuery();
			
			while (oResultSet.next()){
				industria = new Industria (oResultSet.getInt(1), oResultSet.getString(2), oResultSet.getString(3), oResultSet.getString(4), 
						oResultSet.getString(5), oResultSet.getString(6), oResultSet.getString(7), oResultSet.getString(8), oResultSet.getString(9), 
						oResultSet.getString(10), oResultSet.getString(11), oResultSet.getString(12));
			}			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return industria;
	}

	public int obtenerUltimoID () {
		int id = 0;
		PreparedStatement preparedStmt;
		BaseDeDatos baseDeDatos = new BaseDeDatos();
		Connection oConnection = null;
		ResultSet oResultSet = null;
		try {
			
			oConnection = baseDeDatos.abrirConexion();			
			String query = "SELECT * FROM industrias";			
			preparedStmt = (PreparedStatement) oConnection.prepareStatement(query);
			oResultSet = preparedStmt.executeQuery();
			oResultSet.last();
			id = oResultSet.getInt("id");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		
		return id;
	}
	
	public void modificarIndustria (Industria industria) throws MySQLIntegrityConstraintViolationException, SQLException {
		PreparedStatement preparedStmt;
		BaseDeDatos baseDeDatos = new BaseDeDatos();
		Connection oConnection = null;
		try {
			
			oConnection = baseDeDatos.abrirConexion();

			String query = "UPDATE industrias SET responsable = ?, departamento = ?, localidad = ?, direccion = ?, telefono = ?,"
					+ "clave_de_acceso_web = ?, contacto = ?, rubro = ?, descarga_abreviada = ?, descarga = ? WHERE cliente = ?";
			
			preparedStmt = (PreparedStatement) oConnection.prepareStatement(query);
			
			preparedStmt.setString(1, industria.getResponsable());
			preparedStmt.setString(2, industria.getDepartamento());
			preparedStmt.setString(3, industria.getLocalidad());
			preparedStmt.setString(4, industria.getDireccion());
			preparedStmt.setString(5, industria.getTelefono());
			preparedStmt.setString(6, industria.getClaveDeAccesoWeb());
			preparedStmt.setString(7, industria.getContacto());
			preparedStmt.setString(8, industria.getRubro());
			preparedStmt.setString(9, industria.getDescargaAbreviada());
			preparedStmt.setString(10, industria.getDescarga());
			preparedStmt.setString(11, industria.getCliente());
			
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
}
