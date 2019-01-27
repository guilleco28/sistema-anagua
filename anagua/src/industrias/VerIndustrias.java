package industrias;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.usermodel.Workbook;

import bd.BaseDeDatos;

public class VerIndustrias {
	private static Properties p = new Properties ();
	
	public void verIndustrias() throws FileNotFoundException, IOException, SQLException {
	
		//p.load(new FileReader("\\\\192.168.1.7\\datos2\\ANAGUA\\sistema-anagua\\config.properties"));
		//p.load(new FileReader("W:\\ANAGUA\\sistema-anagua\\config.properties"));
		p.load(new FileReader("C:\\Users\\Guillermo\\Dropbox\\PROYECTO_ANAGUA\\config.properties"));
		BaseDeDatos baseDeDatos = new BaseDeDatos();
		Connection con = baseDeDatos.abrirConexion();
	    String rutaExcel = p.getProperty("ruta_excel_industrias");
	    String nombreExcel = p.getProperty("nombre_excel_industrias");
	    Statement stmt = con.createStatement();
	    ResultSet resultSet = stmt.executeQuery("SELECT * FROM industrias");
	    HSSFWorkbook workbook = new HSSFWorkbook();
	    HSSFSheet spreadsheet = workbook.createSheet("industrias");
	    spreadsheet.createFreezePane(0, 1);
        HSSFRow row = spreadsheet.createRow(0);
        HSSFCell cell;
        
        //cellStyle
        CellStyle cellStyle = workbook.createCellStyle();
        cellStyle.setVerticalAlignment(VerticalAlignment.CENTER); 
        cellStyle.setAlignment(HorizontalAlignment.CENTER);
        Font font = workbook.createFont();
        font.setFontName("Arial Narrow");
        font.setFontHeightInPoints((short) 10);
        cellStyle.setFont(font);
        cellStyle.setWrapText(true);
        
        cell = row.createCell(0);
        cell.setCellValue("id");            
        cell.setCellStyle(setStyleParaTitulos(workbook, false));
        cell = row.createCell(1);
        cell.setCellValue("Cliente");
        cell.setCellStyle(setStyleParaTitulos(workbook, true));
        cell = row.createCell(2);
        cell.setCellValue("Responsable");
        cell.setCellStyle(setStyleParaTitulos(workbook, false));
        cell = row.createCell(3);
        cell.setCellValue("Departamento");
        cell.setCellStyle(setStyleParaTitulos(workbook, true));
        cell = row.createCell(4);
        cell.setCellValue("Localidad");
        cell.setCellStyle(setStyleParaTitulos(workbook, false));
        cell = row.createCell(5);
        cell.setCellValue("Dirección");
        cell.setCellStyle(setStyleParaTitulos(workbook, true));
        cell = row.createCell(6);
        cell.setCellValue("Teléfono");
        cell.setCellStyle(setStyleParaTitulos(workbook, false));
        cell = row.createCell(7);
        cell.setCellValue("Clave de acceso web");
        cell.setCellStyle(setStyleParaTitulos(workbook, true));
        cell = row.createCell(8);
        cell.setCellValue("Contacto");
        cell.setCellStyle(setStyleParaTitulos(workbook, false));
        cell = row.createCell(9);
        cell.setCellValue("Rubro");
        cell.setCellStyle(setStyleParaTitulos(workbook, true));
        cell = row.createCell(10);
        cell.setCellValue("Descarga abreviada");
        cell.setCellStyle(setStyleParaTitulos(workbook, false));
        cell = row.createCell(11);
        cell.setCellValue("Descarga");
        cell.setCellStyle(setStyleParaTitulos(workbook, true));
        
        resultSet.next(); //para que no se muestre "-- Sin especificar --"
        
        int i=1;
        while (resultSet.next()) {
        	row = spreadsheet.createRow(i);
            row.setHeightInPoints((float) 26.0);
            cell = row.createCell(0);
            cell.setCellValue(resultSet.getString("id"));
            cell.setCellStyle(cellStyle);
            cell = row.createCell(1);
            cell.setCellValue(resultSet.getString("cliente"));
            cell.setCellStyle(cellStyle);
            cell = row.createCell(2);
            cell.setCellValue(resultSet.getString("responsable"));
            cell.setCellStyle(cellStyle);
            cell = row.createCell(3);
            cell.setCellValue(resultSet.getString("departamento"));
            cell.setCellStyle(cellStyle);
            cell = row.createCell(4);
            cell.setCellValue(resultSet.getString("localidad"));
            cell.setCellStyle(cellStyle);
            cell = row.createCell(5);
            cell.setCellValue(resultSet.getString("direccion"));
            cell.setCellStyle(cellStyle);
            cell = row.createCell(6);
            cell.setCellValue(resultSet.getString("telefono"));
            cell.setCellStyle(cellStyle);
            cell = row.createCell(7);
            cell.setCellValue(resultSet.getString("clave_de_acceso_web"));
            cell.setCellStyle(cellStyle);
            cell = row.createCell(8);
            cell.setCellValue(resultSet.getString("contacto"));
            cell.setCellStyle(cellStyle);
            cell = row.createCell(9);
            cell.setCellValue(resultSet.getString("rubro"));
            cell.setCellStyle(cellStyle);
            cell = row.createCell(10);
            cell.setCellValue(resultSet.getString("descarga_abreviada"));
            cell.setCellStyle(cellStyle);
            cell = row.createCell(11);
            cell.setCellValue(resultSet.getString("descarga"));
            cell.setCellStyle(cellStyle);
        
        
        FileOutputStream out = new FileOutputStream(rutaExcel+"\\"+nombreExcel);
        workbook.write(out);
        out.close();
        System.out.println("File Successfully created");
        //con.close();
        openExcelFile(rutaExcel+"\\"+nombreExcel);
        }
        
	}
	
	private static CellStyle setStyleParaTitulos(Workbook workbook, boolean par) {
    	CellStyle cellStyle = workbook.createCellStyle();
        cellStyle.setRotation((short) 90);
        cellStyle.setVerticalAlignment(VerticalAlignment.CENTER); 
        cellStyle.setAlignment(HorizontalAlignment.CENTER);
        cellStyle.setBorderRight(BorderStyle.THIN);
        cellStyle.setBorderBottom(BorderStyle.THIN);
        Font font = workbook.createFont();
        font.setBold(true);
        font.setFontName("Arial");
        font.setFontHeightInPoints((short) 10);
        if (par){
	        cellStyle.setFillForegroundColor(IndexedColors.LIGHT_GREEN.getIndex());
	        cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        } else {
        	cellStyle.setFillForegroundColor(IndexedColors.LIGHT_GREEN.getIndex());
	        cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        }
        cellStyle.setFont(font);
    	return cellStyle;
    }
	
    private static void openExcelFile (String filePath) {
		try {
			Runtime.getRuntime().exec("cmd /c start " + filePath);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
