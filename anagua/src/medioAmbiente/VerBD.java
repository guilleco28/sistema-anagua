package medioAmbiente;

import java.awt.Color;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.usermodel.Workbook;

import bd.BaseDeDatos;

public class VerBD {
	
	private int highestModifiedCol = -1;
	private static Properties p = new Properties();
	
    public static void verBD() {
        try {
        	//p.load(new FileReader("\\\\192.168.1.7\\datos2\\ANAGUA\\sistema-anagua\\config.properties"));
			//p.load(new FileReader("W:\\ANAGUA\\sistema-anagua\\config.properties"));
        	p.load(new FileReader("C:\\Users\\Guillermo\\Documents\\sistema-anagua\\config.properties"));
        	BaseDeDatos baseDeDatos = new BaseDeDatos();
        	Connection con = baseDeDatos.abrirConexion();
            String rutaExcel = p.getProperty("ruta_excel");
            String nombreExcel = p.getProperty("nombre_excel");
            Statement stmt = con.createStatement();
            ResultSet resultSet = stmt.executeQuery("SELECT * FROM datos");
            HSSFWorkbook workbook = new HSSFWorkbook();
            HSSFSheet spreadsheet = workbook.createSheet("datos");
            spreadsheet.createFreezePane(0, 1);
            HSSFRow row = spreadsheet.createRow(0);
            HSSFCell cell;
            //CELLSTYLE
            CellStyle cellStyle = workbook.createCellStyle();
            cellStyle.setVerticalAlignment(VerticalAlignment.CENTER); 
            cellStyle.setAlignment(HorizontalAlignment.CENTER);
            Font font = workbook.createFont();
            font.setFontName("Arial Narrow");
            font.setFontHeightInPoints((short) 10);
            cellStyle.setFont(font);
            cellStyle.setWrapText(true);
            
            
            cell = row.createCell(0);
            cell.setCellValue("N�mero de an�lisis");            
            cell.setCellStyle(setStyleParaTitulos(workbook, false));
            cell = row.createCell(1);
            cell.setCellValue("Estado");
            cell.setCellStyle(setStyleParaTitulos(workbook, true));
            cell = row.createCell(2);
            cell.setCellValue("Industria");
            cell.setCellStyle(setStyleParaTitulos(workbook, false));
            cell = row.createCell(3);
            cell.setCellValue("Departamento");
            cell.setCellStyle(setStyleParaTitulos(workbook, true));
            cell = row.createCell(4);
            cell.setCellValue("Localidad");
            cell.setCellStyle(setStyleParaTitulos(workbook, false));
            cell = row.createCell(5);
            cell.setCellValue("Descarga en");
            cell.setCellStyle(setStyleParaTitulos(workbook, true));
            cell = row.createCell(6);
            cell.setCellValue("Lugar de extracci�n");
            cell.setCellStyle(setStyleParaTitulos(workbook, false));
            cell = row.createCell(7);
            cell.setCellValue("Extra�do por");
            cell.setCellStyle(setStyleParaTitulos(workbook, true));
            cell = row.createCell(8);
            cell.setCellValue("Fecha de extracci�n");
            cell.setCellStyle(setStyleParaTitulos(workbook, false));
            cell = row.createCell(9);
            cell.setCellValue("Hora de extracci�n");
            cell.setCellStyle(setStyleParaTitulos(workbook, true));
            cell = row.createCell(10);
            cell.setCellValue("Aspecto");
            cell.setCellStyle(setStyleParaTitulos(workbook, false));
            cell = row.createCell(11);
            cell.setCellValue("pH barros");
            cell.setCellStyle(setStyleParaTitulos(workbook, true));
            cell = row.createCell(12);
            cell.setCellValue("pH");
            cell.setCellStyle(setStyleParaTitulos(workbook, false));
            cell = row.createCell(13);
            cell.setCellValue("Temperatura");
            cell.setCellStyle(setStyleParaTitulos(workbook, true));
            cell = row.createCell(14);
            cell.setCellValue("O.D. (Ox�geno disuelto)");
            cell.setCellStyle(setStyleParaTitulos(workbook, false));
            cell = row.createCell(15);
            cell.setCellValue("DBO5");
            cell.setCellStyle(setStyleParaTitulos(workbook, true));
            cell = row.createCell(16);
            cell.setCellValue("DBO5 filtrada");
            cell.setCellStyle(setStyleParaTitulos(workbook, false));
            cell = row.createCell(17);
            cell.setCellValue("DQO");
            cell.setCellStyle(setStyleParaTitulos(workbook, true));
            cell = row.createCell(18);
            cell.setCellValue("S�lidos totales");
            cell.setCellStyle(setStyleParaTitulos(workbook, false));
            cell = row.createCell(19);
            cell.setCellValue("S�lidos totales vol�tiles");
            cell.setCellStyle(setStyleParaTitulos(workbook, true));
            cell = row.createCell(20);
            cell.setCellValue("SST");
            cell.setCellStyle(setStyleParaTitulos(workbook, false));
            cell = row.createCell(21);
            cell.setCellValue("SSV");
            cell.setCellStyle(setStyleParaTitulos(workbook, true));
            cell = row.createCell(22);
            cell.setCellValue("S�lidos sedimentables (10 min)");
            cell.setCellStyle(setStyleParaTitulos(workbook, false));
            cell = row.createCell(23);
            cell.setCellValue("S�lidos sedimentables (30 min)");
            cell.setCellStyle(setStyleParaTitulos(workbook, true));
            cell = row.createCell(24);
            cell.setCellValue("S�lidos sedimentables (1 hora)");
            cell.setCellStyle(setStyleParaTitulos(workbook, false));
            cell = row.createCell(25);
            cell.setCellValue("Aceites y grasas");
            cell.setCellStyle(setStyleParaTitulos(workbook, true));
            cell = row.createCell(26);
            cell.setCellValue("Amonio");
            cell.setCellStyle(setStyleParaTitulos(workbook, false));
            cell = row.createCell(27);
            cell.setCellValue("Sulfuros");
            cell.setCellStyle(setStyleParaTitulos(workbook, true));
            cell = row.createCell(28);
            cell.setCellValue("Cromo");
            cell.setCellStyle(setStyleParaTitulos(workbook, false));
            cell = row.createCell(29);
            cell.setCellValue("Zinc");
            cell.setCellStyle(setStyleParaTitulos(workbook, true));
            cell = row.createCell(30);
            cell.setCellValue("Plomo");
            cell.setCellStyle(setStyleParaTitulos(workbook, false));
            cell = row.createCell(31);
            cell.setCellValue("Nitr�geno total");
            cell.setCellStyle(setStyleParaTitulos(workbook, true));
            cell = row.createCell(32);
            cell.setCellValue("Nitrato");
            cell.setCellStyle(setStyleParaTitulos(workbook, false));
            cell = row.createCell(33);
            cell.setCellValue("F�sforo total");
            cell.setCellStyle(setStyleParaTitulos(workbook, true));
            cell = row.createCell(34);
            cell.setCellValue("Caudal instant�neo");
            cell.setCellStyle(setStyleParaTitulos(workbook, false));
            cell = row.createCell(35);
            cell.setCellValue("Alcalinidad total");
            cell.setCellStyle(setStyleParaTitulos(workbook, true));
            cell = row.createCell(36);
            cell.setCellValue("Acidez vol�til");
            cell.setCellStyle(setStyleParaTitulos(workbook, false));
            cell = row.createCell(37);
            cell.setCellValue("Alfa");
            cell.setCellStyle(setStyleParaTitulos(workbook, true));
            cell = row.createCell(38);
            cell.setCellValue("Alfa'");
            cell.setCellStyle(setStyleParaTitulos(workbook, false));
            cell = row.createCell(39);
            cell.setCellValue("Conductividad");
            cell.setCellStyle(setStyleParaTitulos(workbook, true));
            cell = row.createCell(40);
            cell.setCellValue("Salinidad");
            cell.setCellStyle(setStyleParaTitulos(workbook, false));
            cell = row.createCell(41);
            cell.setCellValue("Turbiedad");
            cell.setCellStyle(setStyleParaTitulos(workbook, true));
            cell = row.createCell(42);
            cell.setCellValue("Fenoles");
            cell.setCellStyle(setStyleParaTitulos(workbook, false));
            cell = row.createCell(43);
            cell.setCellValue("Potasio");
            cell.setCellStyle(setStyleParaTitulos(workbook, true));
            cell = row.createCell(44);
            cell.setCellValue("Detergentes");
            cell.setCellStyle(setStyleParaTitulos(workbook, false));
            cell = row.createCell(45);
            cell.setCellValue("Cloro residual");
            cell.setCellStyle(setStyleParaTitulos(workbook, true));
            cell = row.createCell(46);
            cell.setCellValue("Coliformes fecales");
            cell.setCellStyle(setStyleParaTitulos(workbook, false));
            cell = row.createCell(47);
            cell.setCellValue("DQO / DBO5");
            cell.setCellStyle(setStyleParaTitulos(workbook, true));
            cell = row.createCell(48);
            cell.setCellValue("L�quidos libres");
            cell.setCellStyle(setStyleParaTitulos(workbook, false));
            cell = row.createCell(49);
            cell.setCellValue("Humedad");
            cell.setCellStyle(setStyleParaTitulos(workbook, true));
            cell = row.createCell(50);
            cell.setCellValue("Curso de agua clase");
            cell.setCellStyle(setStyleParaTitulos(workbook, false));
            cell = row.createCell(51);
            cell.setCellValue("S�lidos totales barros");
            cell.setCellStyle(setStyleParaTitulos(workbook, true));
            cell = row.createCell(52);
            cell.setCellValue("Observaciones");
            cell.setCellStyle(setStyleParaTitulos(workbook, false));
            cell = row.createCell(53);
            cell.setCellValue("Tensoactivos ani�nicos");
            cell.setCellStyle(setStyleParaTitulos(workbook, true));
            cell = row.createCell(54);
            cell.setCellValue("Color");
            cell.setCellStyle(setStyleParaTitulos(workbook, false));
            cell = row.createCell(55);
            cell.setCellValue("Nitrito");
            cell.setCellStyle(setStyleParaTitulos(workbook, true));
            cell = row.createCell(56);
            cell.setCellValue("Cloruro");
            cell.setCellStyle(setStyleParaTitulos(workbook, false));
            cell = row.createCell(57);
            cell.setCellValue("Fósforo filtrado");
            cell.setCellStyle(setStyleParaTitulos(workbook, true));
            cell = row.createCell(58);
            cell.setCellValue("Materia org�nica");
            cell.setCellStyle(setStyleParaTitulos(workbook, false));
            cell = row.createCell(59);
            cell.setCellValue("Hidrocarburos totales");
            cell.setCellStyle(setStyleParaTitulos(workbook, true));
            cell = row.createCell(60);
            cell.setCellValue("Conductividad barros");
            cell.setCellStyle(setStyleParaTitulos(workbook, false));
            cell = row.createCell(61);
            cell.setCellValue("Cromo en lixiviado");
            cell.setCellStyle(setStyleParaTitulos(workbook, true));
            cell = row.createCell(62);
            cell.setCellValue("Plomo en lixiviado");
            cell.setCellStyle(setStyleParaTitulos(workbook, false));
            cell = row.createCell(63);
            cell.setCellValue("Relaci�n C/N");
            cell.setCellStyle(setStyleParaTitulos(workbook, true));
            cell = row.createCell(64);
            cell.setCellValue("Aluminio");
            cell.setCellStyle(setStyleParaTitulos(workbook, false));
            cell = row.createCell(65);
            cell.setCellValue("Manganeso");
            cell.setCellStyle(setStyleParaTitulos(workbook, true));
            cell = row.createCell(66);
            cell.setCellValue("Dureza");
            cell.setCellStyle(setStyleParaTitulos(workbook, false));
            cell = row.createCell(67);
            cell.setCellValue("Hidrocarburos");
            cell.setCellStyle(setStyleParaTitulos(workbook, true));
            cell = row.createCell(68);
            cell.setCellValue("pH in situ");
            cell.setCellStyle(setStyleParaTitulos(workbook, false));
            cell = row.createCell(69);
            cell.setCellValue("OD in situ");
            cell.setCellStyle(setStyleParaTitulos(workbook, true));
            cell = row.createCell(70);
            cell.setCellValue("Sulfato");
            cell.setCellStyle(setStyleParaTitulos(workbook, false));
            cell = row.createCell(71);
            cell.setCellValue("Bicarbonato");
            cell.setCellStyle(setStyleParaTitulos(workbook, true));
            cell = row.createCell(72);
            cell.setCellValue("Sulfuro");
            cell.setCellStyle(setStyleParaTitulos(workbook, false));
            cell = row.createCell(73);
            cell.setCellValue("Cloro total");
            cell.setCellStyle(setStyleParaTitulos(workbook, true));
            cell = row.createCell(74);
            cell.setCellValue("Otros");
            cell.setCellStyle(setStyleParaTitulos(workbook, false));
            /*
            Date date = new Date();
            HSSFRow titulo = spreadsheet.createRow(0);
            cell = titulo.createCell(0);
            cell.setCellValue("Base de datos del Laboratorio ANAGUA actualizada el "+date.getDay()+"/"+date.getMonth()+" a las "+date.getHours()+":"+date.getMinutes());
            */
            
            int i = 1;
            resultSet.next(); //para que no se muestre "-- Sin especificar --"
            
            while (resultSet.next()) {
            	row = spreadsheet.createRow(i);
                row.setHeightInPoints((float) 26.0);
                cell = row.createCell(0);
                cell.setCellValue(resultSet.getString("numero_analisis"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(1);
                cell.setCellValue(resultSet.getString("estado"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(2);
                cell.setCellValue(resultSet.getString("industria"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(3);
                cell.setCellValue(resultSet.getString("departamento"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(4);
                cell.setCellValue(resultSet.getString("localidad"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(5);
                cell.setCellValue(resultSet.getString("descarga_en"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(6);
                cell.setCellValue(resultSet.getString("lugar_extraccion"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(7);
                cell.setCellValue(resultSet.getString("extraido_por"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(8);
                
                
                /*
				Date fechaExtraccion = new Date (resultSet.getTimestamp("fecha_extraccion").getTime());
                CellStyle cellStyle = workbook.createCellStyle();
                CreationHelper createHelper = workbook.getCreationHelper();
                cellStyle.setDataFormat(
                    createHelper.createDataFormat().getFormat("dd/mm/yyyy"));
                cellStyle.setAlignment(HorizontalAlignment.CENTER);
                cellStyle.setVerticalAlignment(VerticalAlignment.CENTER);
                Font font = workbook.createFont();
                font.setFontName("Arial Narrow");
                font.setFontHeightInPoints((short) 10);
                cellStyle.setFont(font);
                cell.setCellValue(fechaExtraccion);
                cell.setCellStyle(cellStyle);
                */
                cell.setCellValue(" ");
                
                
                
                cell = row.createCell(9);
                cell.setCellValue(resultSet.getString("hora_extraccion"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(10);
                cell.setCellValue(resultSet.getString("aspecto"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(11);
                
                
                //double ph = Double.parseDouble(resultSet.getString("ph_barros"));
                //cellStyle.setDataFormat(HSSFDataFormat.getBuiltinFormat("0.00"));    
                
                cell.setCellStyle(cellStyle);
                cell.setCellValue(resultSet.getString("ph_barros"));
                //cell.setCellValue(resultSet.getString("ph_barros"));
                //cell.setCellStyle(cellStyle);
                //cell.setCellType(CellType.NUMERIC);
                
                cell = row.createCell(12);
                cell.setCellValue(resultSet.getString("ph"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(13);
                cell.setCellValue(resultSet.getString("temperatura"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(14);
                cell.setCellValue(resultSet.getString("oxigeno_disuelto"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(15);
                cell.setCellValue(resultSet.getString("dbo5"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(16);
                cell.setCellValue(resultSet.getString("DBO5_filtrada"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(17);
                cell.setCellValue(resultSet.getString("DQO"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(18);
                cell.setCellValue(resultSet.getString("solidos_totales"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(19);
                cell.setCellValue(resultSet.getString("solidos_totales_volatiles"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(20);
                cell.setCellValue(resultSet.getString("sst"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(21);
                cell.setCellValue(resultSet.getString("ssv"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(22);
                cell.setCellValue(resultSet.getString("solidos_sedimentables_10_min"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(23);
                cell.setCellValue(resultSet.getString("solidos_sedimentables_30_min"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(24);
                cell.setCellValue(resultSet.getString("solidos_sedimentables_60_min"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(25);
                cell.setCellValue(resultSet.getString("aceites_y_grasas"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(26);
                cell.setCellValue(resultSet.getString("amonio"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(27);
                cell.setCellValue(resultSet.getString("sulfuros"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(28);
                cell.setCellValue(resultSet.getString("cromo"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(29);
                cell.setCellValue(resultSet.getString("zinc"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(30);
                cell.setCellValue(resultSet.getString("plomo"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(31);
                cell.setCellValue(resultSet.getString("nitrogeno_total"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(32);
                cell.setCellValue(resultSet.getString("nitrato"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(33);
                cell.setCellValue(resultSet.getString("fosforo_total"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(34);
                cell.setCellValue(resultSet.getString("caudal_instantaneo"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(35);
                cell.setCellValue(resultSet.getString("alcalinidad_total"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(36);
                cell.setCellValue(resultSet.getString("acidez_volatil"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(37);
                cell.setCellValue(resultSet.getString("alfa"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(38);
                cell.setCellValue(resultSet.getString("alfa_prima"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(39);
                cell.setCellValue(resultSet.getString("conductividad"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(40);
                cell.setCellValue(resultSet.getString("salinidad"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(41);
                cell.setCellValue(resultSet.getString("turbiedad"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(42);
                cell.setCellValue(resultSet.getString("fenoles"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(43);
                cell.setCellValue(resultSet.getString("potasio"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(44);
                cell.setCellValue(resultSet.getString("detergentes"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(45);
                cell.setCellValue(resultSet.getString("cloro_residual"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(46);
                cell.setCellValue(resultSet.getString("coliformes_fecales"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(47);
                cell.setCellValue(resultSet.getString("dqo_dbo5"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(48);
                cell.setCellValue(resultSet.getString("liquidos_libres"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(49);
                cell.setCellValue(resultSet.getString("humedad"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(50);
                cell.setCellValue(resultSet.getString("clase_curso_agua"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(51);
                cell.setCellValue(resultSet.getString("solidos_totales_barros"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(52);
                cell.setCellValue(resultSet.getString("observaciones"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(53);
                cell.setCellValue(resultSet.getString("tensoactivos_anionicos"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(54);
                cell.setCellValue(resultSet.getString("color"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(55);
                cell.setCellValue(resultSet.getString("nitrito"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(56);
                cell.setCellValue(resultSet.getString("cloruro"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(57);
                cell.setCellValue(resultSet.getString("fosforo_filtrado"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(58);
                cell.setCellValue(resultSet.getString("materia_organica"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(59);
                cell.setCellValue(resultSet.getString("hidrocarburos_totales"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(60);
                cell.setCellValue(resultSet.getString("conductividad_barros"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(61);
                cell.setCellValue(resultSet.getString("cromo_en_lixiviado"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(62);
                cell.setCellValue(resultSet.getString("plomo_en_lixiviado"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(63);
                cell.setCellValue(resultSet.getString("relacion_CN"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(64);
                cell.setCellValue(resultSet.getString("aluminio"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(65);
                cell.setCellValue(resultSet.getString("manganeso"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(66);
                cell.setCellValue(resultSet.getString("dureza"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(67);
                cell.setCellValue(resultSet.getString("hidrocarburos"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(68);
                cell.setCellValue(resultSet.getString("ph_in_situ"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(69);
                cell.setCellValue(resultSet.getString("OD_in_situ"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(70);
                cell.setCellValue(resultSet.getString("sulfato"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(71);
                cell.setCellValue(resultSet.getString("bicarbonato"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(72);
                cell.setCellValue(resultSet.getString("sulfuro"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(73);
                cell.setCellValue(resultSet.getString("cloro_total"));
                cell.setCellStyle(cellStyle);
                cell = row.createCell(74);
                cell.setCellValue(resultSet.getString("otros"));
                cell.setCellStyle(cellStyle);
                i++;
            }
            FileOutputStream out = new FileOutputStream(rutaExcel+"\\"+nombreExcel);
            workbook.write(out);
            out.close();
            System.out.println("File Successfully created");
            con.close();
            openExcelFile(rutaExcel+"\\"+nombreExcel);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    private static void openExcelFile (String filePath) {
		try {
			Runtime.getRuntime().exec("cmd /c start " + filePath);
		} catch (IOException e) {
			e.printStackTrace();
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
    
    private static CellStyle setStyleParaDatos(Workbook workbook) {
    	CellStyle cellStyle = workbook.createCellStyle();
        cellStyle.setVerticalAlignment(VerticalAlignment.CENTER); 
        cellStyle.setAlignment(HorizontalAlignment.CENTER);
        Font font = workbook.createFont();
        font.setFontName("Arial Narrow");
        font.setFontHeightInPoints((short) 10);
        cellStyle.setFont(font);
        cellStyle.setWrapText(true);
    	return cellStyle;
    }
    
}
