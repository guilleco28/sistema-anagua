package prueba;

import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Properties;

import org.apache.poi.hssf.usermodel.HSSFPalette;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HeaderFooter;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.ClientAnchor;
import org.apache.poi.ss.usermodel.ClientAnchor.AnchorType;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Drawing;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.Picture;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.util.IOUtils;
import org.apache.poi.xssf.usermodel.XSSFClientAnchor;
import org.apache.poi.xssf.usermodel.XSSFDrawing;
import org.apache.poi.xssf.usermodel.XSSFPicture;

public class ExcelBarros {
	
	static SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yy", new Locale("ES"));
	static Date fechaDate = new Date();
	static String fechaActual = formateador.format(fechaDate);
	static String rutaExcel;
	static String rutaLogo;
	static String rutaFirma;
	static Properties p = new Properties();
	private static ConexionBarros conexion = new ConexionBarros();
	static int[] rgbColumnas = {216, 219, 252};
	static int[] rgbFilas = {213, 233, 247};
	static int[] blanco = {255, 255, 255};
	
	public static void realizarInforme() {
		try {
			System.out.println("entre");
			//p.load(new FileReader("\\\\192.168.1.7\\datos2\\ANAGUA\\sistema-anagua\\config.properties")); //para RED
			p.load(new FileReader("C:\\Users\\Guillermo\\Documents\\sistema-anagua\\config.properties"));
			rutaExcel = p.getProperty("ruta_excel_informe");
			rutaLogo = p.getProperty("ruta_logo");
			rutaFirma = p.getProperty("ruta_firma");
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		
		Workbook workbook = new HSSFWorkbook();
		Sheet sheet = workbook.createSheet();
		try {
			agregarLogo(workbook);
			agregarFirma(workbook);
		} catch (IOException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
		formatoExcel(workbook, sheet);
		try {
			formatoEstaticoExcel(workbook, sheet);
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		llenarDatosEmpresa(workbook, sheet.getRow(6), sheet.getRow(7), sheet.getRow(8), sheet.getRow(9));
		try {
			String nombreEmpresa = conexion.traerAnalisis().get(0).get(1).replace(" ", "_");
			rutaExcel = rutaExcel+nombreEmpresa+"_BARROS_"+fechaActual+".xls";
			llenarDeterminaciones(workbook, conexion);
			llenarDatosDeterminaciones(workbook);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}		
		
		try {
			FileOutputStream output = new FileOutputStream(rutaExcel);
			workbook.write(output);
			output.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		openExcelFile(rutaExcel);	
		
	}
	
	
	
	public static void openExcelFile (String filePath) {
		try {
			Runtime.getRuntime().exec("cmd /c start " + filePath);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void formatoExcel(Workbook workbook, Sheet sheet) {
		sheet.setMargin(Sheet.TopMargin, 0.05D);
		sheet.setMargin(Sheet.LeftMargin, 0.25D);
		sheet.setMargin(Sheet.RightMargin, 0.25D);
		//sheet.setMargin(Sheet.BottomMargin, 0.05D);
		sheet.addMergedRegion(CellRangeAddress.valueOf("A1:B5"));
		sheet.addMergedRegion(CellRangeAddress.valueOf("C1:J5"));
		Row lineaDivisoriaTitulo = sheet.createRow(4);
		lineaDivisoriaTitulo.setHeightInPoints((float) 35.0);
		CellStyle style = workbook.createCellStyle();
		style.setBorderBottom(BorderStyle.MEDIUM);		
		
		Row separacionDatosIndustria1 = sheet.createRow(5);
		separacionDatosIndustria1.setHeightInPoints((float) 7.0);
		//linea divisoria de titulo
		for (int i=0; i<10; i++) {
			lineaDivisoriaTitulo.createCell(i);
			lineaDivisoriaTitulo.getCell(i).setCellStyle(style);
		}
		
		sheet.getFooter().setRight("Página "+HeaderFooter.page()+" de "+HeaderFooter.numPages());
		
		sheet.setColumnWidth(2, 1077); //ancho columna C
		sheet.setColumnWidth(3, 2423); //ancho columna D
		
		//ancho de columnas de resultados (E, F, G, H)
		for(int i=4; i<8; i++) {
			sheet.setColumnWidth(i, 3268);
		}
		
		sheet.setColumnWidth(8, 2385); //ancho columna I
		sheet.setColumnWidth(9, 2385); //ancho columna J
	}
	
	private static CellStyle setStyle (Workbook workbook, HorizontalAlignment horizontalAlignment, VerticalAlignment verticalAlignment, String fontName, int size, 
			boolean bold, int[] backgroundColor, BorderStyle topBorder, BorderStyle bottomBorder, BorderStyle rightBorder, BorderStyle leftBorder) {
		CellStyle style = workbook.createCellStyle();
		style.setAlignment(horizontalAlignment);
		style.setVerticalAlignment(verticalAlignment);
		if (backgroundColor != null) {
			HSSFPalette palette = ((HSSFWorkbook) workbook).getCustomPalette();
			HSSFColor myColor = palette.findSimilarColor(backgroundColor[0], backgroundColor[1], backgroundColor[2]);
			short index = myColor.getIndex();
			style.setFillForegroundColor(index);
			style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		}
		//style.setBorderBottom(BorderStyle.THICK);
		Font font = workbook.createFont();
		font.setBold(bold);
		font.setFontName(fontName);
		font.setFontHeightInPoints((short) size);
		style.setFont(font);
		if (topBorder !=null) {
			style.setBorderTop(topBorder);
		}
		if (bottomBorder != null) {
			style.setBorderBottom(bottomBorder);
		}
		if (rightBorder != null) {
			style.setBorderRight(rightBorder);
		}
		if (leftBorder != null) {
			style.setBorderLeft(leftBorder);
		}
		style.setWrapText(true);
		return style;
	}
	
	private static void formatoEstaticoExcel (Workbook workbook, Sheet sheet) throws IOException {

		Row row0 = sheet.createRow(0);
		Cell titulo = row0.createCell(2);
		Cell logo = row0.createCell(0);		


		titulo.setCellValue("ANÁLISIS DE BARROS");
		titulo.setCellStyle(setStyle(workbook, HorizontalAlignment.CENTER, VerticalAlignment.CENTER, "Arial", 14, true, null, null, null, null, null));
		
		sheet.addMergedRegion(CellRangeAddress.valueOf("C7:E7"));
		sheet.addMergedRegion(CellRangeAddress.valueOf("C8:E8"));
		sheet.addMergedRegion(CellRangeAddress.valueOf("C9:E9"));
		sheet.addMergedRegion(CellRangeAddress.valueOf("C10:E10"));
		sheet.addMergedRegion(CellRangeAddress.valueOf("F7:H7"));
		sheet.addMergedRegion(CellRangeAddress.valueOf("F8:H8"));
		sheet.addMergedRegion(CellRangeAddress.valueOf("F9:H9"));
		sheet.addMergedRegion(CellRangeAddress.valueOf("F10:H10"));
		
		ArrayList <Cell> titulosDatosEmpresa = new ArrayList <Cell>();
		Row industria = sheet.createRow(6);
		Cell stringIndustria = industria.createCell(2);
		stringIndustria.setCellValue("INDUSTRIA:");
		titulosDatosEmpresa.add(stringIndustria);
		Row departamento = sheet.createRow(7);
		Cell stringDepartamento = departamento.createCell(2);
		stringDepartamento.setCellValue("DEPARTAMENTO:");
		titulosDatosEmpresa.add(stringDepartamento);
		Row localidad = sheet.createRow(8);
		Cell stringLocalidad = localidad.createCell(2);
		stringLocalidad.setCellValue("LOCALIDAD:");
		titulosDatosEmpresa.add(stringLocalidad);
		Row descargaEn = sheet.createRow(9);
		Cell stringDescargaEn = descargaEn.createCell(2);
		stringDescargaEn.setCellValue("DESCARGA EN:");
		titulosDatosEmpresa.add(stringDescargaEn);
		
		//estilo de INDUSTRIA:, DEPARTAMENTO:, LOCALIDAD: y DESCARGA EN:
		for (int i=0; i<titulosDatosEmpresa.size(); i++) {
			titulosDatosEmpresa.get(i).setCellStyle(setStyle(workbook, HorizontalAlignment.CENTER, VerticalAlignment.CENTER, "Arial", 12, true, rgbColumnas, BorderStyle.THIN, null, null, BorderStyle.THIN));
		}
				
		CellStyle styleBordesSuperioresDatos = workbook.createCellStyle();
		ArrayList <Cell> cellsBordesSuperioresDatos = new ArrayList <Cell> ();
		styleBordesSuperioresDatos.setBorderTop(BorderStyle.THIN);
		Cell cellG7 = industria.createCell(6);
		Cell cellH7 = industria.createCell(7);
		Cell C11 = sheet.createRow(10).createCell(2);
		Cell D11 = sheet.getRow(10).createCell(3);
		Cell E11 = sheet.getRow(10).createCell(4);
		Cell F11 = sheet.getRow(10).createCell(5);
		Cell G11 = sheet.getRow(10).createCell(6);
		Cell G12 = sheet.getRow(10).createCell(7);
		Cell D10 = descargaEn.createCell(3);
		Cell E10 = descargaEn.createCell(4);
		Cell D9 = localidad.createCell(3);
		Cell E9 = localidad.createCell(4);
		Cell D8 = departamento.createCell(3);
		Cell E8 = departamento.createCell(4);
		Cell D7 = industria.createCell(3);
		Cell E7 = industria.createCell(4);
		cellsBordesSuperioresDatos.add(cellG7);
		cellsBordesSuperioresDatos.add(cellH7);
		cellsBordesSuperioresDatos.add(C11);
		cellsBordesSuperioresDatos.add(D11);
		cellsBordesSuperioresDatos.add(E11);
		cellsBordesSuperioresDatos.add(F11);
		cellsBordesSuperioresDatos.add(G11);
		cellsBordesSuperioresDatos.add(G12);
		cellsBordesSuperioresDatos.add(D10);
		cellsBordesSuperioresDatos.add(E10);
		cellsBordesSuperioresDatos.add(D9);
		cellsBordesSuperioresDatos.add(E9);
		cellsBordesSuperioresDatos.add(D8);
		cellsBordesSuperioresDatos.add(E8);
		cellsBordesSuperioresDatos.add(D7);
		cellsBordesSuperioresDatos.add(E7);
		
		for (int i=0; i<cellsBordesSuperioresDatos.size(); i++) {
			cellsBordesSuperioresDatos.get(i).setCellStyle(styleBordesSuperioresDatos);
		}
		
		CellStyle styleBordesIzquierdosDatos = workbook.createCellStyle();
		styleBordesIzquierdosDatos.setBorderLeft(BorderStyle.THIN);
		ArrayList <Cell> cellsBordesIzquierdosDatos = new ArrayList <Cell> ();
		Cell I7 = industria.createCell(8);
		Cell I8 = departamento.createCell(8);
		Cell I9 = localidad.createCell(8);
		Cell I10 = descargaEn.createCell(8);
		cellsBordesIzquierdosDatos.add(I7);
		cellsBordesIzquierdosDatos.add(I8);
		cellsBordesIzquierdosDatos.add(I9);
		cellsBordesIzquierdosDatos.add(I10);
		
		for (int i=0; i<cellsBordesIzquierdosDatos.size(); i++) {
			cellsBordesIzquierdosDatos.get(i).setCellStyle(styleBordesIzquierdosDatos);
		}
		
		sheet.addMergedRegion(CellRangeAddress.valueOf("A12:C13"));
		sheet.addMergedRegion(CellRangeAddress.valueOf("D12:D13"));
		sheet.addMergedRegion(CellRangeAddress.valueOf("E12:H13"));
		sheet.addMergedRegion(CellRangeAddress.valueOf("I12:I13"));
		sheet.addMergedRegion(CellRangeAddress.valueOf("J12:J13"));
		
		Row titulosColumnas = sheet.createRow(11);
		ArrayList <Cell> titulosColumnasArray = new ArrayList <Cell>();
		Cell determinaciones = titulosColumnas.createCell(0);
		determinaciones.setCellValue("DETERMINACIONES");
		Cell unidad = titulosColumnas.createCell(3);
		unidad.setCellValue("UNIDAD");
		Cell resultados = titulosColumnas.createCell(4);
		resultados.setCellValue("R E S U L T A D O S");
		Cell norma = titulosColumnas.createCell(8);
		norma.setCellValue("NORMA");
		Cell metodo = titulosColumnas.createCell(9);
		metodo.setCellValue("MÉTODO");
		titulosColumnasArray.add(determinaciones);
		titulosColumnasArray.add(unidad);
		titulosColumnasArray.add(resultados);
		titulosColumnasArray.add(metodo);
		titulosColumnasArray.add(norma);
		for(int i=0; i<titulosColumnasArray.size(); i++) {
			titulosColumnasArray.get(i).setCellStyle(setStyle(workbook, HorizontalAlignment.CENTER, VerticalAlignment.CENTER, "Arial Narrow", 12, true, rgbColumnas, BorderStyle.THIN, null, BorderStyle.THIN, BorderStyle.THIN));
		}
		
		Row row13 = sheet.createRow(12);
		CellStyle bordesBajosYDerechos = workbook.createCellStyle();
		CellStyle bordesAltos = workbook.createCellStyle();
		CellStyle bordesBajosDerechosIzquierdos = workbook.createCellStyle();
		bordesBajosYDerechos.setBorderBottom(BorderStyle.THIN);
		bordesBajosYDerechos.setBorderRight(BorderStyle.THIN);
		bordesAltos.setBorderTop(BorderStyle.THIN);
		bordesBajosDerechosIzquierdos.setBorderBottom(BorderStyle.THIN);
		bordesBajosDerechosIzquierdos.setBorderRight(BorderStyle.THIN);
		bordesBajosDerechosIzquierdos.setBorderLeft(BorderStyle.THIN);
		
		for(int i=0; i<10; i++) {
			
			if (titulosColumnas.getCell(i) == null){
				titulosColumnas.createCell(i);
				titulosColumnas.getCell(i).setCellStyle(bordesAltos);
			}
			if (row13.getCell(i) == null) {
				if (i == 0) {
					row13.createCell(i);
					row13.getCell(i).setCellStyle(bordesBajosDerechosIzquierdos);
				} else {
				row13.createCell(i);
				row13.getCell(i).setCellStyle(bordesBajosYDerechos);
				}
			}
			
		}
		
	}
	
	private static void llenarDatosEmpresa(Workbook workbook, Row industria, Row departamento, Row localidad, Row descargaEn) {
		
		ArrayList <Cell> datosEmpresa = new ArrayList <Cell>();
		Cell nombreIndustria = industria.createCell(5);
		Cell departamentoIndustria = departamento.createCell(5);
		Cell localidadIndustria = localidad.createCell(5);
		Cell descargaEnIndustria = descargaEn.createCell(5);
		float altoFilas = (float) 20.0;
		
		industria.setHeightInPoints((float) altoFilas);
		departamento.setHeightInPoints((float) altoFilas);
		localidad.setHeightInPoints((float) altoFilas);
		descargaEn.setHeightInPoints((float) altoFilas);
		
		
		try {
			nombreIndustria.setCellValue(conexion.traerAnalisis().get(0).get(1));
			departamentoIndustria.setCellValue(conexion.traerAnalisis().get(0).get(2));
			localidadIndustria.setCellValue(conexion.traerAnalisis().get(0).get(3));
			descargaEnIndustria.setCellValue(conexion.traerAnalisis().get(0).get(4));
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		datosEmpresa.add(nombreIndustria);
		datosEmpresa.add(departamentoIndustria);
		datosEmpresa.add(localidadIndustria);
		datosEmpresa.add(descargaEnIndustria);
		
		for (int i=0; i<datosEmpresa.size(); i++) {
			if (i==0) {
				datosEmpresa.get(i).setCellStyle(setStyle(workbook, HorizontalAlignment.CENTER, VerticalAlignment.CENTER, "Arial", 10, true, null, BorderStyle.THIN, null, null, BorderStyle.THIN));
			} else {
				datosEmpresa.get(i).setCellStyle(setStyle(workbook, HorizontalAlignment.CENTER, VerticalAlignment.CENTER, "Arial", 10, false, null, null, null, null, BorderStyle.THIN));				
			}
		}
		
		
	}
	
	private static void llenarDeterminaciones(Workbook workbook, ConexionBarros conexion) throws SQLException {
		ArrayList<String> determinaciones = conexion.traerDeterminaciones();
		ArrayList<ArrayList<String>> analisis = conexion.traerAnalisis();
		ArrayList<String> determinacionesSinFijos = new ArrayList<String>();
		ArrayList<ArrayList<String>> analisisSinFijos = new ArrayList<ArrayList<String>>();
		CellStyle titulosDeterminaciones = setStyle(workbook, HorizontalAlignment.LEFT, VerticalAlignment.CENTER, "Arial Narrow", 10, true, rgbFilas, BorderStyle.THIN, BorderStyle.THIN, BorderStyle.THIN, BorderStyle.THIN);
		CellStyle styleDatos = setStyle(workbook, HorizontalAlignment.CENTER, VerticalAlignment.CENTER, "Arial Narrow", 9, false, blanco, BorderStyle.THIN, BorderStyle.THIN, BorderStyle.THIN, BorderStyle.THIN);
		CellStyle styleTexto = setStyle(workbook, HorizontalAlignment.CENTER, VerticalAlignment.CENTER, "Arial", 10, false, blanco, null, null, null, null);
		
		
		for (int i=0; i<determinaciones.size(); i++) {
			if (i == 1 || i == 2 || i == 3 || i == 4) {
			} else {
				determinacionesSinFijos.add(determinaciones.get(i));
			}
		}

		for (int i=0; i<analisis.size(); i++) {
			ArrayList <String> analisisSFijos = new ArrayList <String>();
			for (int j=0; j<analisis.get(i).size(); j++) {
				if (j == 1 || j == 2 || j == 3 || j == 4) {
				} else {
					analisisSFijos.add(analisis.get(i).get(j));
				}
			}
			analisisSinFijos.add(analisisSFijos);
		}
		
		for (int i=13; i<determinacionesSinFijos.size()+13; i++) { //industria, depto, localidad y descarga en ya se escribieron. Hay que empezar de Row 13
			
			Row row = workbook.getSheet("Sheet0").createRow(i);
			row.setHeightInPoints((float) 22.0);
			workbook.getSheet("Sheet0").addMergedRegion(new CellRangeAddress(i,i,0,2));
			Cell cell = workbook.getSheet("Sheet0").getRow(i).createCell(0);
			cell.setCellValue(determinacionesSinFijos.get(i-13));
			cell.setCellStyle(titulosDeterminaciones);
			Cell cell2 = workbook.getSheet("Sheet0").getRow(i).createCell(1); //para bordes de la region merge titulos determinaciones
			Cell cell3 = workbook.getSheet("Sheet0").getRow(i).createCell(2); //para bordes de la region merge titulos determinaciones
			cell2.setCellStyle(titulosDeterminaciones);
			cell3.setCellStyle(titulosDeterminaciones);
			
			workbook.getSheet("Sheet0").getRow(i).createCell(3).setCellStyle(setStyle(workbook, HorizontalAlignment.CENTER, VerticalAlignment.CENTER, "Arial", 10, false, blanco, BorderStyle.THIN, BorderStyle.THIN, BorderStyle.THIN, BorderStyle.THIN));
			workbook.getSheet("Sheet0").getRow(i).createCell(8).setCellStyle(setStyle(workbook, HorizontalAlignment.CENTER, VerticalAlignment.CENTER, "Arial", 10, false, blanco, BorderStyle.THIN, BorderStyle.THIN, BorderStyle.THIN, BorderStyle.THIN));
			workbook.getSheet("Sheet0").getRow(i).createCell(9).setCellStyle(setStyle(workbook, HorizontalAlignment.CENTER, VerticalAlignment.CENTER, "Arial", 10, false, blanco, BorderStyle.THIN, BorderStyle.THIN, BorderStyle.THIN, BorderStyle.THIN));
			
		}
		
		for (int j=4; j<8; j++) {
			for (int i=13; i<analisisSinFijos.get(0).size()+13; i++) {
				
				workbook.getSheet("Sheet0").getRow(i).createCell(j).setCellValue(analisisSinFijos.get(j-4).get(i-13));
				workbook.getSheet("Sheet0").getRow(i).getCell(j).setCellStyle(styleDatos);				
			}
		}
		
		Row separacion = workbook.getSheet("Sheet0").createRow(determinacionesSinFijos.size()+13);
		separacion.setHeightInPoints((float) 8.0);
		
		CellStyle styleMetodos = setStyle(workbook, HorizontalAlignment.LEFT, VerticalAlignment.CENTER, "Arial", 9 , false, blanco, BorderStyle.THIN, BorderStyle.THIN, BorderStyle.THIN, BorderStyle.THIN);
		
		Row metodos1 = workbook.getSheet("Sheet0").createRow(determinacionesSinFijos.size()+14);
		metodos1.setHeightInPoints((float) 15.0);
		metodos1.createCell(0).setCellValue("   (1)    Métodos extraídos del 'STANDARD METHODS FOR THE EXAMINATION OF WATER AND WASTEWATER' 22th edición 2012 ");
		metodos1.getCell(0).setCellStyle(styleMetodos);
		workbook.getSheet("Sheet0").addMergedRegion(new CellRangeAddress(determinacionesSinFijos.size()+14, determinacionesSinFijos.size()+14, 0, 9));
		Row metodos2 = workbook.getSheet("Sheet0").createRow(determinacionesSinFijos.size()+15);
		metodos2.setHeightInPoints((float) 15.0);
		metodos2.createCell(0).setCellValue("   (2)    Métodos extraídos de - Asociación Brasilera de Normas Técnicas");
		workbook.getSheet("Sheet0").addMergedRegion(new CellRangeAddress(determinacionesSinFijos.size()+15, determinacionesSinFijos.size()+15, 0, 9));
		metodos2.getCell(0).setCellStyle(styleMetodos);
		Row metodos3 = workbook.getSheet("Sheet0").createRow(determinacionesSinFijos.size()+16);
		metodos3.setHeightInPoints((float) 15.0);
		metodos3.createCell(0).setCellValue("   (3)    Métodos extraídos de - Normas Mexicanas");
		workbook.getSheet("Sheet0").addMergedRegion(new CellRangeAddress(determinacionesSinFijos.size()+16, determinacionesSinFijos.size()+16, 0, 9));
		metodos3.getCell(0).setCellStyle(styleMetodos);
		Row metodos4 = workbook.getSheet("Sheet0").createRow(determinacionesSinFijos.size()+17);
		metodos4.setHeightInPoints((float) 15.0);
		metodos4.createCell(0).setCellValue("   (4)    Métodos extraídos de - ENVIRONMENTAL PROTECTION AGENCY");
		workbook.getSheet("Sheet0").addMergedRegion(new CellRangeAddress(determinacionesSinFijos.size()+17, determinacionesSinFijos.size()+17, 0, 9));
		metodos4.getCell(0).setCellStyle(styleMetodos);
		Row metodos5 = workbook.getSheet("Sheet0").createRow(determinacionesSinFijos.size()+18);
		metodos5.setHeightInPoints((float) 15.0);
		metodos5.createCell(0).setCellValue("   (5)    Métodos extraídos de - 'Manual de procedimientos analíticos para muestras ambientales'-DINAMA");
		workbook.getSheet("Sheet0").addMergedRegion(new CellRangeAddress(determinacionesSinFijos.size()+18, determinacionesSinFijos.size()+18, 0, 9));
		metodos5.getCell(0).setCellStyle(styleMetodos);
		
		
		for (int i=1; i<10; i++) {
			for (int j=determinacionesSinFijos.size()+14; j<=determinacionesSinFijos.size()+18; j++) {
				Row row1 = workbook.getSheet("Sheet0").getRow(j);
				row1.createCell(i).setCellStyle(styleMetodos);
			}
		}
		
		Row separacion2 = workbook.getSheet("Sheet0").createRow(determinacionesSinFijos.size()+19);
		separacion2.setHeightInPoints((float) 6.0);
		
		Row observaciones = workbook.getSheet("Sheet0").createRow(determinacionesSinFijos.size()+20);
		workbook.getSheet("Sheet0").addMergedRegion(new CellRangeAddress(determinacionesSinFijos.size()+20, determinacionesSinFijos.size()+20, 0, 2));
		observaciones.createCell(0).setCellValue("   OBSERVACIONES:");
		observaciones.getCell(0).setCellStyle(setStyle(workbook, HorizontalAlignment.LEFT, VerticalAlignment.CENTER, "Arial Narrow", 10, true, blanco, null, null, null, null));
		
		Row fecha = workbook.getSheet("Sheet0").createRow(determinacionesSinFijos.size()+23);
		
		workbook.getSheet("Sheet0").addMergedRegion(new CellRangeAddress(determinacionesSinFijos.size()+23, determinacionesSinFijos.size()+23, 1, 2));
		fecha.createCell(1).setCellValue("Montevideo,");
		fecha.getCell(1).setCellStyle(setStyle(workbook, HorizontalAlignment.RIGHT, VerticalAlignment.CENTER, "Arial", 10, false, blanco, null, null, null, null));
		
		//formato fecha
		SimpleDateFormat formateador = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy", new Locale("ES"));
		Date fechaDate = new Date();
		String fechaActual = formateador.format(fechaDate);		
		workbook.getSheet("Sheet0").addMergedRegion(new CellRangeAddress(determinacionesSinFijos.size()+23, determinacionesSinFijos.size()+23, 3, 4));
		fecha.createCell(3).setCellValue(fechaActual);
		// necesario para que el color sea azul, setStyle no lo tiene
		CellStyle styleFecha = workbook.createCellStyle();		
		Font fontFecha = workbook.createFont();
		fontFecha.setBold(true);
		fontFecha.setFontName("Arial");
		fontFecha.setFontHeightInPoints((short) 10);
		fontFecha.setColor(HSSFColor.BLUE.index);
		styleFecha.setFont(fontFecha);
		styleFecha.setAlignment(HorizontalAlignment.LEFT);
		fecha.getCell(3).setCellStyle(styleFecha);
		// termina el style
		
		CellStyle styleBordesBajos = workbook.createCellStyle();
		styleBordesBajos.setBorderBottom(BorderStyle.THIN);
		
		for (int i=6; i<9; i++) {
			fecha.createCell(i).setCellStyle(styleBordesBajos);
		}
		
		Row fchEmision = workbook.getSheet("Sheet0").createRow(determinacionesSinFijos.size()+24);
		workbook.getSheet("Sheet0").addMergedRegion(new CellRangeAddress(determinacionesSinFijos.size()+24, determinacionesSinFijos.size()+24, 1, 4));
		fchEmision.createCell(1).setCellValue("Fecha de emisión del resultado");
		fchEmision.getCell(1).setCellStyle(setStyle(workbook, HorizontalAlignment.CENTER, VerticalAlignment.TOP, "Arial", 7, false, blanco, null, null, null, null));
		
		workbook.getSheet("Sheet0").addMergedRegion(new CellRangeAddress(determinacionesSinFijos.size()+24, determinacionesSinFijos.size()+24, 6, 8));
		fchEmision.createCell(6).setCellValue("Por ANAGUA S.R.L.");
		fchEmision.getCell(6).setCellStyle(styleTexto);
		
		Row nombreQuimico = workbook.getSheet("Sheet0").createRow(determinacionesSinFijos.size()+25);
		workbook.getSheet("Sheet0").addMergedRegion(new CellRangeAddress(determinacionesSinFijos.size()+25, determinacionesSinFijos.size()+25, 6, 8));
		nombreQuimico.createCell(6).setCellValue("Qco. Alejandro Caamaño");
		CellStyle styleNombreQuimico = workbook.createCellStyle();		
		Font fontNombreQuimico = workbook.createFont();
		fontNombreQuimico.setBold(true);
		fontNombreQuimico.setFontName("Arial");
		fontNombreQuimico.setFontHeightInPoints((short) 10);
		fontNombreQuimico.setColor(HSSFColor.BLUE.index);
		fontNombreQuimico.setItalic(true);
		styleNombreQuimico.setFont(fontNombreQuimico);
		styleNombreQuimico.setAlignment(HorizontalAlignment.CENTER);
		nombreQuimico.getCell(6).setCellStyle(styleNombreQuimico);
		
		Row bordeBajoGrueso = workbook.getSheet("Sheet0").createRow(determinacionesSinFijos.size()+25);
		CellStyle styleBordeBajoGrueso = workbook.createCellStyle();
		styleBordeBajoGrueso.setBorderBottom(BorderStyle.THICK);
		for (int i=0; i<=9; i++) {
			bordeBajoGrueso.createCell(i).setCellStyle(styleBordeBajoGrueso);
		}
		
		Row separacion3 = workbook.getSheet("Sheet0").createRow(determinacionesSinFijos.size()+26);
		separacion3.setHeightInPoints((short) 3.0);
		
		Row datosEmpresa = workbook.getSheet("Sheet0").createRow(determinacionesSinFijos.size()+27);
		workbook.getSheet("Sheet0").addMergedRegion(new CellRangeAddress(determinacionesSinFijos.size()+27, determinacionesSinFijos.size()+27, 0, 3));
		workbook.getSheet("Sheet0").addMergedRegion(new CellRangeAddress(determinacionesSinFijos.size()+27, determinacionesSinFijos.size()+27, 4, 6));
		workbook.getSheet("Sheet0").addMergedRegion(new CellRangeAddress(determinacionesSinFijos.size()+27, determinacionesSinFijos.size()+27, 7, 9));
		datosEmpresa.createCell(0).setCellValue("Juan Parra del Riego 1027");
		datosEmpresa.getCell(0).setCellStyle(styleTexto);
		datosEmpresa.createCell(4).setCellValue("Tel: 27055200 int. 130");
		datosEmpresa.getCell(4).setCellStyle(styleTexto);
		datosEmpresa.createCell(7).setCellValue("EMAIL: anagua@pittamiglio.com.uy");
		datosEmpresa.getCell(7).setCellStyle(styleTexto);
	
	}
	
	public static void llenarDatosDeterminaciones (Workbook workbook) throws SQLException {
		Sheet sheet = workbook.getSheet("Sheet0");
		int cantidadDeterminaciones = conexion.traerDeterminaciones().size()-10;
		ArrayList <ArrayList<String>> datosDeDeterminaciones = conexion.traerDatosDeDeterminaciones();
		int[] blanco = {255, 255, 255};
		//System.out.println(datosDeDeterminaciones);
		for (int i=19; i<cantidadDeterminaciones+19; i++) {
			//System.out.println("EN HOJA: "+sheet.getRow(i).getCell(0).getStringCellValue());
			for (int j=0; j<datosDeDeterminaciones.size(); j++) {
				//System.out.println("EN ARRAY: "+datosDeDeterminaciones.get(j).get(0));
				if (sheet.getRow(i).getCell(0).getStringCellValue().equals(datosDeDeterminaciones.get(j).get(0))) {
					//System.out.println("ENTRÉ AL IF");
					sheet.getRow(i).createCell(3).setCellValue(datosDeDeterminaciones.get(j).get(1));
					sheet.getRow(i).getCell(3).setCellStyle(setStyle(workbook, HorizontalAlignment.CENTER, VerticalAlignment.CENTER, "Arial", 10, false, blanco, BorderStyle.THIN, BorderStyle.THIN, BorderStyle.THIN, BorderStyle.THIN));;
					sheet.getRow(i).createCell(8).setCellValue(datosDeDeterminaciones.get(j).get(2));
					sheet.getRow(i).getCell(8).setCellStyle(setStyle(workbook, HorizontalAlignment.CENTER, VerticalAlignment.CENTER, "Arial", 8, false, blanco, BorderStyle.THIN, BorderStyle.THIN, BorderStyle.THIN, BorderStyle.THIN));;
					sheet.getRow(i).createCell(9).setCellValue(datosDeDeterminaciones.get(j).get(3));
					sheet.getRow(i).getCell(9).setCellStyle(setStyle(workbook, HorizontalAlignment.CENTER, VerticalAlignment.CENTER, "Arial", 7, false, blanco, BorderStyle.THIN, BorderStyle.THIN, BorderStyle.THIN, BorderStyle.THIN));;
					//datosDeDeterminaciones.remove(j);
					break;
					
				}
			}
			
		}
		
	}
	
	static void agregarLogo(Workbook workbook) throws IOException {
		final FileInputStream stream =
		        new FileInputStream(rutaLogo);
		final CreationHelper helper = workbook.getCreationHelper();
		final Drawing drawing = workbook.getSheet("Sheet0").createDrawingPatriarch();
		final ClientAnchor anchor = helper.createClientAnchor();
		final int pictureIndex =
		        workbook.addPicture(IOUtils.toByteArray(stream), Workbook.PICTURE_TYPE_PNG);
		anchor.setCol1(0);
		anchor.setCol2(0);
		final Picture pict = drawing.createPicture( anchor, pictureIndex );
		pict.resize((double) 4, (double) 4.75);		
	}
	
	static void agregarFirma(Workbook workbook) throws IOException {
		final FileInputStream stream =
		        new FileInputStream(rutaFirma);
		final CreationHelper helper = workbook.getCreationHelper();
		final Drawing drawing = workbook.getSheet("Sheet0").createDrawingPatriarch();
		final ClientAnchor anchor = helper.createClientAnchor();
		final int pictureIndex =
		        workbook.addPicture(IOUtils.toByteArray(stream), Workbook.PICTURE_TYPE_PNG);
		anchor.setCol1(7);
		anchor.setRow1(37);
		final Picture pict = drawing.createPicture( anchor, pictureIndex );
		pict.resize((double) 1, (double) 3);	
	}
	
}
