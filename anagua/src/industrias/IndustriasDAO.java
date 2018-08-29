package industrias;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
	
	/*public void agregarIndustria (Industria industria) {
		PreparedStatement preparedStmt;
		BaseDeDatos baseDeDatos = new BaseDeDatos();
		Connection oConnection = null;
		try{
			oConnection = baseDeDatos.abrirConexion();
			String query = "INSERT INTO industrias VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
			preparedStmt = (PreparedStatement) oConnection.prepareStatement(query);
			preparedStmt.setInt(1, 2);
			preparedStmt.setString(2, "PEDRO BERRO");
			preparedStmt.setString(3, "ABORGAMA");
			preparedStmt.setString(4, "Montevideo");
			preparedStmt.setString(5, "Punta Carretas");
			preparedStmt.setString(6, "ABORGAMA");
			preparedStmt.setString(7, "ABORGAMA");
			preparedStmt.setString(8, "ABORGAMA");
			preparedStmt.setString(9, "ABORGAMA");
			preparedStmt.setString(10, "ABORGAMA");
			preparedStmt.setString(11, "ABORGAMA");
			preparedStmt.setString(12, "Cañada");
			
			preparedStmt.execute();
			
		} catch (SQLException e){
			e.printStackTrace();
		}
	}
	*/
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

}
