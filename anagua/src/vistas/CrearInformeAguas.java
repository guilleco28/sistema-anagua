package vistas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import aguas.AguasDAO;
import aguas.AnalisisAgua;
import barros.AnalisisBarro;
import industrias.Industria;
import informeAguas.ExcelAguas;
import prueba.ExcelBarros;

public class CrearInformeAguas {

	private JFrame frame;
	private JPanel miPanel;
	private JScrollPane scrollPane;
	private JTextField industria;
	private JTextField departamento1;
	private JTextField localidad1;
	private JTextField descargaEn1;
	private JComboBox nroAnalisis1;
	private JComboBox nroAnalisis3;
	private JComboBox nroAnalisis4;
	private JTextField aspecto1;
	private JTextField fechaExtraccion1;
	private JTextField horaExtraccion1;
	private JTextField extraidoPor1;
	private JTextField pHIS1;
	private JTextField pH1;
	private JTextField temperatura1;
	private JTextField caudal1;
	private JTextField ODIS1;
	private JTextField OD1;
	private JTextField DBO51;
	private JTextField DBO5F1;
	private JTextField DQO1;
	private JTextField AceitesYGrasas1;
	private JTextField SolidosTotales1;
	private JTextField STV1;
	private JTextField SST1;
	private JTextField SSV1;
	private JTextField SS101;
	private JTextField SS301;
	private JTextField SS601;
	private JTextField amoniaco1;
	private JTextField nitrato1;
	private JTextField nitrogenoTotal1;
	private JTextField fosforoTotal1;
	private JTextField cromo1;
	private JTextField plomo1;
	private JTextField zinc1;
	private JTextField aluminio1;
	private JTextField manganeso1;
	private JTextField potasio1;
	private JTextField alcalinidadTotal1;
	private JTextField acidezVolatil1;
	private JTextField alfa1;
	private JTextField alfaPrima1;
	private JTextField bicarbonato1;
	private JTextField salinidad1;
	private JTextField turbiedad1;
	private JTextField conductividad1;
	private JTextField sulfuro1;
	private JTextField sulfato1;
	private JTextField fenoles1;
	private JTextField tensoactivos1;
	private JTextField cloroResidual1;
	private JTextField cloroTotal1;
	private JTextField cloruro1;
	private JTextField dureza1;
	private JTextField color1;
	private JTextField hidrocarburos1;
	private JTextField coliformes1;
	private JTextField cursoAguaTipo1;
	private JTextField otros11;
	private JTextField otros21;
	private JTextField otros31;
	private JTextField otros41;
	private JTextField lugarExtraccion1;
	private Color destacado = Color.blue;
	private JComboBox nroAnalisis2;
	private JTextField aspecto2;
	private JTextField fechaExtraccion2;
	private JTextField horaExtraccion2;
	private JTextField extraidoPor2;
	private JTextField pHIS2;
	private JTextField pH2;
	private JTextField temperatura2;
	private JTextField caudal2;
	private JTextField ODIS2;
	private JTextField OD2;
	private JTextField DBO52;
	private JTextField DBO5F2;
	private JTextField DQO2;
	private JTextField AceitesYGrasas2;
	private JTextField SolidosTotales2;
	private JTextField STV2;
	private JTextField SST2;
	private JTextField SSV2;
	private JTextField SS102;
	private JTextField SS302;
	private JTextField SS602;
	private JTextField amoniaco2;
	private JTextField nitrato2;
	private JTextField nitrogenoTotal2;
	private JTextField fosforoTotal2;
	private JTextField cromo2;
	private JTextField plomo2;
	private JTextField zinc2;
	private JTextField aluminio2;
	private JTextField manganeso2;
	private JTextField potasio2;
	private JTextField alcalinidadTotal2;
	private JTextField acidezVolatil2;
	private JTextField alfa2;
	private JTextField alfaPrima2;
	private JTextField bicarbonato2;
	private JTextField salinidad2;
	private JTextField turbiedad2;
	private JTextField conductividad2;
	private JTextField sulfuro2;
	private JTextField sulfato2;
	private JTextField fenoles2;
	private JTextField tensoactivos2;
	private JTextField cloroResidual2;
	private JTextField cloroTotal2;
	private JTextField cloruro2;
	private JTextField dureza2;
	private JTextField color2;
	private JTextField hidrocarburos2;
	private JTextField coliformes2;
	private JTextField cursoAguaTipo2;
	private JTextField otros12;
	private JTextField otros22;
	private JTextField otros32;
	private JTextField otros42;
	private JTextField lugarExtraccion2;
	private JTextField aspecto3;
	private JTextField fechaExtraccion3;
	private JTextField horaExtraccion3;
	private JTextField extraidoPor3;
	private JTextField pHIS3;
	private JTextField pH3;
	private JTextField temperatura3;
	private JTextField caudal3;
	private JTextField ODIS3;
	private JTextField OD3;
	private JTextField DBO53;
	private JTextField DBO5F3;
	private JTextField DQO3;
	private JTextField AceitesYGrasas3;
	private JTextField SolidosTotales3;
	private JTextField STV3;
	private JTextField SST3;
	private JTextField SSV3;
	private JTextField SS103;
	private JTextField SS303;
	private JTextField SS603;
	private JTextField amoniaco3;
	private JTextField nitrato3;
	private JTextField nitrogenoTotal3;
	private JTextField fosforoTotal3;
	private JTextField cromo3;
	private JTextField plomo3;
	private JTextField zinc3;
	private JTextField aluminio3;
	private JTextField manganeso3;
	private JTextField potasio3;
	private JTextField alcalinidadTotal3;
	private JTextField acidezVolatil3;
	private JTextField alfa3;
	private JTextField alfaPrima3;
	private JTextField bicarbonato3;
	private JTextField salinidad3;
	private JTextField turbiedad3;
	private JTextField conductividad3;
	private JTextField sulfuro3;
	private JTextField sulfato3;
	private JTextField fenoles3;
	private JTextField tensoactivos3;
	private JTextField cloroResidual3;
	private JTextField cloroTotal3;
	private JTextField cloruro3;
	private JTextField dureza3;
	private JTextField color3;
	private JTextField hidrocarburos3;
	private JTextField coliformes3;
	private JTextField cursoAguaTipo3;
	private JTextField otros13;
	private JTextField otros23;
	private JTextField otros33;
	private JTextField otros43;
	private JTextField lugarExtraccion3;
	private JTextField aspecto4;
	private JTextField fechaExtraccion4;
	private JTextField horaExtraccion4;
	private JTextField extraidoPor4;
	private JTextField pHIS4;
	private JTextField pH4;
	private JTextField temperatura4;
	private JTextField caudal4;
	private JTextField ODIS4;
	private JTextField OD4;
	private JTextField DBO54;
	private JTextField DBO5F4;
	private JTextField DQO4;
	private JTextField AceitesYGrasas4;
	private JTextField SolidosTotales4;
	private JTextField STV4;
	private JTextField SST4;
	private JTextField SSV4;
	private JTextField SS104;
	private JTextField SS304;
	private JTextField SS604;
	private JTextField amoniaco4;
	private JTextField nitrato4;
	private JTextField nitrogenoTotal4;
	private JTextField fosforoTotal4;
	private JTextField cromo4;
	private JTextField plomo4;
	private JTextField zinc4;
	private JTextField aluminio4;
	private JTextField manganeso4;
	private JTextField potasio4;
	private JTextField alcalinidadTotal4;
	private JTextField acidezVolatil4;
	private JTextField alfa4;
	private JTextField alfaPrima4;
	private JTextField bicarbonato4;
	private JTextField salinidad4;
	private JTextField turbiedad4;
	private JTextField conductividad4;
	private JTextField sulfuro4;
	private JTextField sulfato4;
	private JTextField fenoles4;
	private JTextField tensoactivos4;
	private JTextField cloroResidual4;
	private JTextField cloroTotal4;
	private JTextField cloruro4;
	private JTextField dureza4;
	private JTextField color4;
	private JTextField hidrocarburos4;
	private JTextField coliformes4;
	private JTextField cursoAguaTipo4;
	private JTextField otros14;
	private JTextField otros24;
	private JTextField otros34;
	private JTextField otros44;
	private JTextField lugarExtraccion4;
	Color colorPorDefecto = new Color (238, 238, 238);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrearInformeAguas window = new CrearInformeAguas();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CrearInformeAguas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1200, 849);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Formulario de creación de informes de aguas - ANAGUA");
		frame.setVisible(true);
		frame.setResizable(false);
		
		AguasDAO aguasDAO = new AguasDAO();
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(5, 10, 3200, 1000);
		scrollPane.getVerticalScrollBar().setUnitIncrement(16);
		
		miPanel = new JPanel();
		miPanel.setLayout(null);			
		
		JLabel lblIndustria = new JLabel("INDUSTRIA");
		lblIndustria.setBounds(37, 20, 75, 16);
		miPanel.add(lblIndustria);
		
		JLabel lblDepartamento = new JLabel("DEPARTAMENTO");
		lblDepartamento.setBounds(37, 50, 109, 16);
		miPanel.add(lblDepartamento);
		
		JLabel lblLocalidad = new JLabel("LOCALIDAD");
		lblLocalidad.setBounds(37, 80, 109, 16);
		miPanel.add(lblLocalidad);
		
		JLabel lblDescargaEn = new JLabel("DESCARGA EN");
		lblDescargaEn.setBounds(325, 50, 109, 16);
		miPanel.add(lblDescargaEn);
		
		industria = new JTextField();
		industria.setBounds(158, 15, 436, 27);
		miPanel.add(industria);
		industria.setColumns(10);
		industria.setEditable(false);
		
		departamento1 = new JTextField();
		departamento1.setBounds(158, 45, 163, 26);
		miPanel.add(departamento1);
		departamento1.setColumns(10);
		
		localidad1 = new JTextField();
		localidad1.setColumns(10);
		localidad1.setBounds(158, 75, 163, 26);
		miPanel.add(localidad1);
		
		descargaEn1 = new JTextField();
		descargaEn1.setColumns(10);
		descargaEn1.setBounds(431, 45, 163, 26);
		miPanel.add(descargaEn1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(37, 112, 823, 24);
		miPanel.add(separator);
		
		JLabel lblNroAnalisis = new JLabel("Número de análisis");
		lblNroAnalisis.setBounds(37, 130, 150, 16);
		miPanel.add(lblNroAnalisis);
		lblNroAnalisis.setForeground(Color.BLACK);
		
		JLabel lblLugarExtraccion = new JLabel("Lugar de extracción");
		lblLugarExtraccion.setBounds(37, 160, 150, 16);
		miPanel.add(lblLugarExtraccion);
		lblLugarExtraccion.setForeground(Color.BLACK);
		
		JLabel lblExtraidoPor = new JLabel("Extraído por");
		lblExtraidoPor.setBounds(37, 190, 150, 16);
		miPanel.add(lblExtraidoPor);
		lblExtraidoPor.setForeground(Color.BLACK);
		
		JLabel lblFechaExtraccion = new JLabel("Fecha de extracción");
		lblFechaExtraccion.setBounds(37, 220, 150, 16);
		miPanel.add(lblFechaExtraccion);
		lblFechaExtraccion.setForeground(Color.BLACK);
		
		JLabel lblHoraExtraccion = new JLabel("Hora de extracción");
		lblHoraExtraccion.setBounds(37, 250, 150, 16);
		miPanel.add(lblHoraExtraccion);
		lblHoraExtraccion.setForeground(Color.BLACK);
		
		JLabel lblAspecto = new JLabel("Aspecto");
		lblAspecto.setBounds(37, 280, 150, 16);
		miPanel.add(lblAspecto);
		lblAspecto.setForeground(Color.BLACK);
		
		JLabel lblpHinSitu = new JLabel("pH in situ");
		lblpHinSitu.setBounds(37, 310, 179, 20);
		miPanel.add(lblpHinSitu);
		lblpHinSitu.setForeground(Color.BLACK);
		
		JLabel lblpH = new JLabel("pH");
		lblpH.setBounds(37, 340, 179, 20);
		miPanel.add(lblpH);
		lblpH.setForeground(Color.BLACK);
		
		JLabel lblTemperatura = new JLabel("Temperatura");
		lblTemperatura.setBounds(37, 370, 179, 20);
		miPanel.add(lblTemperatura);
		lblTemperatura.setForeground(Color.BLACK);
		
		JLabel lblCaudal = new JLabel("Caudal instantáneo");
		lblCaudal.setBounds(37, 400, 179, 20);
		miPanel.add(lblCaudal);
		lblCaudal.setForeground(Color.BLACK);
		
		JLabel lblODInSitu = new JLabel("OD in situ");
		lblODInSitu.setBounds(37, 430, 179, 20);
		miPanel.add(lblODInSitu);
		lblODInSitu.setForeground(Color.BLACK);
		
		JLabel lblOD = new JLabel("OD (Oxígeno disuelto)");
		lblOD.setBounds(37, 460, 179, 20);
		miPanel.add(lblOD);
		lblOD.setForeground(Color.BLACK);
		
		JLabel lblDBO5 = new JLabel("DBO5");
		lblDBO5.setBounds(37, 490, 179, 20);
		miPanel.add(lblDBO5);
		lblDBO5.setForeground(Color.BLACK);
		
		JLabel lblDBO5F = new JLabel("DBO5 filtrada");
		lblDBO5F.setBounds(37, 520, 179, 20);
		miPanel.add(lblDBO5F);
		lblDBO5F.setForeground(Color.BLACK);
		
		JLabel lblDQO = new JLabel("DQO");
		lblDQO.setBounds(37, 550, 179, 20);
		miPanel.add(lblDQO);
		lblDQO.setForeground(Color.BLACK);
		
		JLabel lblAceitesYGrasas = new JLabel("Aceites y grasas");
		lblAceitesYGrasas.setBounds(37, 580, 179, 20);
		miPanel.add(lblAceitesYGrasas);
		lblAceitesYGrasas.setForeground(Color.BLACK);
		
		JLabel lblSolidosTotales = new JLabel("Sólidos totales");
		lblSolidosTotales.setBounds(37, 610, 179, 20);
		miPanel.add(lblSolidosTotales);
		lblSolidosTotales.setForeground(Color.BLACK);
		
		JLabel lblSolidosTotalesVolatiles = new JLabel("Sólidos totales volátiles");
		lblSolidosTotalesVolatiles.setBounds(37, 640, 179, 20);
		miPanel.add(lblSolidosTotalesVolatiles);
		lblSolidosTotalesVolatiles.setForeground(Color.BLACK);
		
		JLabel lblSolidosSuspendidosTotales = new JLabel("Sól. suspendidos totales");
		lblSolidosSuspendidosTotales.setBounds(37, 670, 179, 20);
		miPanel.add(lblSolidosSuspendidosTotales);
		lblSolidosSuspendidosTotales.setForeground(Color.BLACK);
		
		JLabel lblSSV = new JLabel("Sól. suspendidos volátiles");
		lblSSV.setBounds(37, 700, 179, 20);
		miPanel.add(lblSSV);
		lblSSV.setForeground(Color.BLACK);
		
		JLabel lblSS10 = new JLabel("Sól. sedimentables 10 min");
		lblSS10.setBounds(37, 730, 179, 20);
		miPanel.add(lblSS10);
		lblSS10.setForeground(Color.BLACK);
		
		JLabel lblSS30 = new JLabel("Sól. sedimentables 30 min");
		lblSS30.setBounds(37, 760, 179, 20);
		miPanel.add(lblSS30);
		lblSS30.setForeground(Color.BLACK);
		
		JLabel lblSS60 = new JLabel("Sól. sedimentables 1 hora");
		lblSS60.setBounds(37, 790, 179, 20);
		miPanel.add(lblSS60);
		lblSS60.setForeground(Color.BLACK);
		
		JLabel lblAmoniaco = new JLabel("Amoníaco");
		lblAmoniaco.setBounds(37, 820, 179, 20);
		miPanel.add(lblAmoniaco);
		lblAmoniaco.setForeground(Color.BLACK);
		
		JLabel lblNitrato = new JLabel("Nitrato");
		lblNitrato.setBounds(37, 850, 179, 20);
		miPanel.add(lblNitrato);
		lblNitrato.setForeground(Color.BLACK);
		
		JLabel lblNitrogenoTotal = new JLabel("Nitrógeno total");
		lblNitrogenoTotal.setBounds(37, 880, 179, 20);
		miPanel.add(lblNitrogenoTotal);
		lblNitrogenoTotal.setForeground(Color.BLACK);
		
		JLabel lblFosforoTotal = new JLabel("Fósforo total");
		lblFosforoTotal.setBounds(37, 910, 179, 20);
		miPanel.add(lblFosforoTotal);
		lblFosforoTotal.setForeground(Color.BLACK);
		
		JLabel lblCromo = new JLabel("Cromo");
		lblCromo.setBounds(37, 940, 179, 20);
		miPanel.add(lblCromo);
		lblCromo.setForeground(Color.BLACK);
		
		JLabel lblPlomo = new JLabel("Plomo");
		lblPlomo.setBounds(37, 970, 179, 20);
		miPanel.add(lblPlomo);
		lblPlomo.setForeground(Color.BLACK);
		
		JLabel lblZinc = new JLabel("Zinc");
		lblZinc.setBounds(37, 1000, 179, 20);
		miPanel.add(lblZinc);
		lblZinc.setForeground(Color.BLACK);
		
		JLabel lblAluminio = new JLabel("Aluminio");
		lblAluminio.setBounds(37, 1030, 179, 20);
		miPanel.add(lblAluminio);
		lblAluminio.setForeground(Color.BLACK);
		
		JLabel lblManganeso = new JLabel("Manganeso");
		lblManganeso.setBounds(37, 1060, 179, 20);
		miPanel.add(lblManganeso);
		lblManganeso.setForeground(Color.BLACK);
		
		JLabel lblPotasio = new JLabel("Potasio");
		lblPotasio.setBounds(37, 1090, 179, 20);
		miPanel.add(lblPotasio);
		lblPotasio.setForeground(Color.BLACK);
		
		JLabel lblAlcalinidadTotal = new JLabel("Alcalinidad total");
		lblAlcalinidadTotal.setBounds(37, 1120, 179, 20);
		miPanel.add(lblAlcalinidadTotal);
		lblAlcalinidadTotal.setForeground(Color.BLACK);
		
		JLabel lblAcidezVolatil = new JLabel("Acidez volátil");
		lblAcidezVolatil.setBounds(37, 1150, 179, 20);
		miPanel.add(lblAcidezVolatil);
		lblAcidezVolatil.setForeground(Color.BLACK);
		
		JLabel lblAlfa = new JLabel("Alfa");
		lblAlfa.setBounds(37, 1180, 179, 20);
		miPanel.add(lblAlfa);
		lblAlfa.setForeground(Color.BLACK);
		
		JLabel lblAlfaPrima = new JLabel("Alfa prima");
		lblAlfaPrima.setBounds(37, 1210, 179, 20);
		miPanel.add(lblAlfaPrima);
		lblAlfaPrima.setForeground(Color.BLACK);
		
		JLabel lblBicarbonato = new JLabel("Bicarbonato");
		lblBicarbonato.setBounds(37, 1240, 179, 20);
		miPanel.add(lblBicarbonato);
		lblBicarbonato.setForeground(Color.BLACK);
		
		JLabel lblSalinidad = new JLabel("Salinidad");
		lblSalinidad.setBounds(37, 1270, 179, 20);
		miPanel.add(lblSalinidad);
		lblSalinidad.setForeground(Color.BLACK);
		
		JLabel lblTurbiedad = new JLabel("Turbiedad");
		lblTurbiedad.setBounds(37, 1300, 179, 20);
		miPanel.add(lblTurbiedad);
		lblTurbiedad.setForeground(Color.BLACK);
		
		JLabel lblConductividad = new JLabel("Conductividad");
		lblConductividad.setBounds(37, 1330, 179, 20);
		miPanel.add(lblConductividad);
		lblConductividad.setForeground(Color.BLACK);
		
		JLabel lblSulfuro = new JLabel("Sulfuro");
		lblSulfuro.setBounds(37, 1360, 179, 20);
		miPanel.add(lblSulfuro);
		lblSulfuro.setForeground(Color.BLACK);
		
		JLabel lblSulfato = new JLabel("Sulfato");
		lblSulfato.setBounds(37, 1390, 179, 20);
		miPanel.add(lblSulfato);
		lblSulfato.setForeground(Color.BLACK);
		
		JLabel lblFenoles = new JLabel("Fenoles");
		lblFenoles.setBounds(37, 1420, 179, 20);
		miPanel.add(lblFenoles);
		lblFenoles.setForeground(Color.BLACK);
		
		JLabel lblTensoactivosAnionicos = new JLabel("Tensoactivos aniónicos");
		lblTensoactivosAnionicos.setBounds(37, 1450, 179, 20);
		miPanel.add(lblTensoactivosAnionicos);
		lblTensoactivosAnionicos.setForeground(Color.BLACK);
		
		JLabel lblCloroResidual = new JLabel("Cloro residual");
		lblCloroResidual.setBounds(37, 1480, 179, 20);
		miPanel.add(lblCloroResidual);
		lblCloroResidual.setForeground(Color.BLACK);
		
		JLabel lblCloroTotal = new JLabel("Cloro total");
		lblCloroTotal.setBounds(37, 1510, 179, 20);
		miPanel.add(lblCloroTotal);
		lblCloroTotal.setForeground(Color.BLACK);
		
		JLabel lblCloruro = new JLabel("Cloruro");
		lblCloruro.setBounds(37, 1540, 179, 20);
		miPanel.add(lblCloruro);
		lblCloruro.setForeground(Color.BLACK);
		
		JLabel lblDureza = new JLabel("Dureza");
		lblDureza.setBounds(37, 1570, 179, 20);
		miPanel.add(lblDureza);
		lblDureza.setForeground(Color.BLACK);
		
		JLabel lblColor = new JLabel("Color");
		lblColor.setBounds(37, 1600, 179, 20);
		miPanel.add(lblColor);
		lblColor.setForeground(Color.BLACK);
		
		JLabel lblHidrocarburos = new JLabel("Hidrocarburos");
		lblHidrocarburos.setBounds(37, 1630, 179, 20);
		miPanel.add(lblHidrocarburos);
		lblHidrocarburos.setForeground(Color.BLACK);
		
		JLabel lblColiformes = new JLabel("Coliformes fecales");
		lblColiformes.setBounds(37, 1660, 179, 20);
		miPanel.add(lblColiformes);
		lblColiformes.setForeground(Color.BLACK);
		
		JLabel lblCursoDeAgua = new JLabel("Curso de agua tipo");
		lblCursoDeAgua.setBounds(37, 1690, 179, 20);
		miPanel.add(lblCursoDeAgua);
		lblCursoDeAgua.setForeground(Color.BLACK);
		
		JLabel lblOtros = new JLabel("Otros");
		lblOtros.setBounds(37, 1720, 179, 20);
		miPanel.add(lblOtros);
		lblOtros.setForeground(Color.BLACK);
		
		JLabel lblOtros2 = new JLabel("Otros 2");
		lblOtros2.setBounds(37, 1750, 179, 20);
		miPanel.add(lblOtros2);
		lblOtros2.setForeground(Color.BLACK);
		
		JLabel lblOtros3 = new JLabel("Otros 3");
		lblOtros3.setBounds(37, 1780, 179, 20);
		miPanel.add(lblOtros3);
		lblOtros3.setForeground(Color.BLACK);
		
		JLabel lblOtros4 = new JLabel("Otros 4");
		lblOtros4.setBounds(37, 1810, 179, 20);
		miPanel.add(lblOtros4);
		lblOtros4.setForeground(Color.BLACK);
		
		nroAnalisis1 = new JComboBox();
		nroAnalisis1.setBounds(190, 125, 130, 26);
		miPanel.add(nroAnalisis1);
		nroAnalisis2 = new JComboBox();
		nroAnalisis2.setBounds(370, 126, 130, 26);
		miPanel.add(nroAnalisis2);
		nroAnalisis3 = new JComboBox();
		nroAnalisis3.setBounds(550, 126, 130, 26);
		miPanel.add(nroAnalisis3);
		nroAnalisis4 = new JComboBox();
		nroAnalisis4.setBounds(730, 126, 130, 26);
		miPanel.add(nroAnalisis4);
		for (AnalisisAgua analisisAgua : aguasDAO.obtenerTodosLosAnalisisAguas()){
			if(analisisAgua.getNroAnalisis().equals("-- Sin especificar --") || (analisisAgua.getpH() != null && analisisAgua.getpH() != "")) {
				nroAnalisis1.addItem(analisisAgua.getNroAnalisis());
				nroAnalisis2.addItem(analisisAgua.getNroAnalisis());
				nroAnalisis3.addItem(analisisAgua.getNroAnalisis());
				nroAnalisis4.addItem(analisisAgua.getNroAnalisis());
			}
		}
		
		nroAnalisis1.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent arg0){
				AnalisisAgua analisisAguaSeleccionado = aguasDAO.obtenerAnalisisAguaPorNumero(String.valueOf(nroAnalisis1.getSelectedItem()));	
				industria.setText(analisisAguaSeleccionado.getIndustria());
				departamento1.setText(analisisAguaSeleccionado.getDepartamento());
				localidad1.setText(analisisAguaSeleccionado.getLocalidad());
				descargaEn1.setText(analisisAguaSeleccionado.getDescargaEn());
				lugarExtraccion1.setText(analisisAguaSeleccionado.getLugarExtraccion());
				if(analisisAguaSeleccionado.getLugarExtraccion().equals("*")) {
					lugarExtraccion1.setBackground(Color.YELLOW);
				} else {
					lugarExtraccion1.setBackground(colorPorDefecto);
				}
				extraidoPor1.setText(analisisAguaSeleccionado.getExtraidoPor());
				if(analisisAguaSeleccionado.getExtraidoPor().equals("*")) {
					extraidoPor1.setBackground(Color.YELLOW);
				} else {
					extraidoPor1.setBackground(colorPorDefecto);
				}
				if(analisisAguaSeleccionado.getFechaExtraccion() == null) {
					fechaExtraccion1.setText("");
				} else {
					DateFormat df = new SimpleDateFormat("dd/MM/YYYY");
				    fechaExtraccion1.setText(df.format(analisisAguaSeleccionado.getFechaExtraccion()));
				}
				horaExtraccion1.setText(analisisAguaSeleccionado.getHoraExtraccion());
				if(analisisAguaSeleccionado.getHoraExtraccion().equals("*")) {
					horaExtraccion1.setBackground(Color.YELLOW);
				} else {
					horaExtraccion1.setBackground(colorPorDefecto);
				}
				if(analisisAguaSeleccionado.getAspecto().equals("*")) {
					aspecto1.setBackground(Color.YELLOW);
				} else {
					aspecto1.setBackground(colorPorDefecto);
				}
				aspecto1.setText(analisisAguaSeleccionado.getAspecto());
				if(analisisAguaSeleccionado.getpH().equals("*")) {
					pH1.setBackground(Color.YELLOW);
				} else {
					pH1.setBackground(colorPorDefecto);
				}
				pH1.setText(analisisAguaSeleccionado.getpH());				
				if(analisisAguaSeleccionado.getSolidosTotales().equals("*")) {
					SolidosTotales1.setBackground(Color.YELLOW);
				} else {
					SolidosTotales1.setBackground(colorPorDefecto);
				}
				SolidosTotales1.setText(analisisAguaSeleccionado.getSolidosTotales());
				if(analisisAguaSeleccionado.getpHInSitu().equals("*")) {
					pHIS1.setBackground(Color.YELLOW);
				} else {
					pHIS1.setBackground(colorPorDefecto);
				}
				pHIS1.setText(analisisAguaSeleccionado.getpHInSitu());
				if(analisisAguaSeleccionado.getTemperatura().equals("*")) {
					temperatura1.setBackground(Color.YELLOW);
				} else {
					temperatura1.setBackground(colorPorDefecto);
				}
				temperatura1.setText(analisisAguaSeleccionado.getTemperatura());
				if(analisisAguaSeleccionado.getCaudalInstantaneo().equals("*")) {
					caudal1.setBackground(Color.YELLOW);
				} else {
					caudal1.setBackground(colorPorDefecto);
				}
				caudal1.setText(analisisAguaSeleccionado.getCaudalInstantaneo());
				if(analisisAguaSeleccionado.getODInSitu().equals("*")) {
					ODIS1.setBackground(Color.YELLOW);
				} else {
					ODIS1.setBackground(colorPorDefecto);
				}
				ODIS1.setText(analisisAguaSeleccionado.getODInSitu());
				if(analisisAguaSeleccionado.getOD().equals("*")) {
					OD1.setBackground(Color.YELLOW);
				} else {
					OD1.setBackground(colorPorDefecto);
				}
				OD1.setText(analisisAguaSeleccionado.getOD());
				if(analisisAguaSeleccionado.getDBO5().equals("*")) {
					DBO51.setBackground(Color.YELLOW);
				} else {
					DBO51.setBackground(colorPorDefecto);
				}
				DBO51.setText(analisisAguaSeleccionado.getDBO5());
				if(analisisAguaSeleccionado.getDBO5Filtrada().equals("*")) {
					DBO5F1.setBackground(Color.YELLOW);
				} else {
					DBO5F1.setBackground(colorPorDefecto);
				}
				DBO5F1.setText(analisisAguaSeleccionado.getDBO5Filtrada());
				if(analisisAguaSeleccionado.getDQO().equals("*")) {
					DQO1.setBackground(Color.YELLOW);
				} else {
					DQO1.setBackground(colorPorDefecto);
				}
				DQO1.setText(analisisAguaSeleccionado.getDQO());
				if(analisisAguaSeleccionado.getAceitesYGrasas().equals("*")) {
					AceitesYGrasas1.setBackground(Color.YELLOW);
				} else {
					AceitesYGrasas1.setBackground(colorPorDefecto);
				}
				AceitesYGrasas1.setText(analisisAguaSeleccionado.getAceitesYGrasas());
				if(analisisAguaSeleccionado.getSolidosTotalesVolatiles().equals("*")) {
					STV1.setBackground(Color.YELLOW);
				} else {
					STV1.setBackground(colorPorDefecto);
				}
				STV1.setText(analisisAguaSeleccionado.getSolidosTotalesVolatiles());

				SST1.setText(analisisAguaSeleccionado.getSst());
				if(analisisAguaSeleccionado.getSst().equals("*")) {
					SST1.setBackground(Color.YELLOW);
				} else {
					SST1.setBackground(colorPorDefecto);
				}
				SSV1.setText(analisisAguaSeleccionado.getSsv());
				if(analisisAguaSeleccionado.getSsv().equals("*")) {
					SSV1.setBackground(Color.YELLOW);
				} else {
					SSV1.setBackground(colorPorDefecto);
				}
				SS101.setText(analisisAguaSeleccionado.getSs10());
				if(analisisAguaSeleccionado.getSs10().equals("*")) {
					SS101.setBackground(Color.YELLOW);
				} else {
					SS101.setBackground(colorPorDefecto);
				}
				SS301.setText(analisisAguaSeleccionado.getSs30());
				if(analisisAguaSeleccionado.getSs30().equals("*")) {
					SS301.setBackground(Color.YELLOW);
				} else {
					SS301.setBackground(colorPorDefecto);
				}
				SS601.setText(analisisAguaSeleccionado.getSs60());
				if(analisisAguaSeleccionado.getSs10().equals("*")) {
					SS601.setBackground(Color.YELLOW);
				} else {
					SS601.setBackground(colorPorDefecto);
				}
				amoniaco1.setText(analisisAguaSeleccionado.getAmoniaco());
				if(analisisAguaSeleccionado.getOtros4().equals("*")) {
					amoniaco1.setBackground(Color.YELLOW);
				} else {
					amoniaco1.setBackground(colorPorDefecto);
				}
				nitrato1.setText(analisisAguaSeleccionado.getNitrato());
				if(analisisAguaSeleccionado.getNitrato().equals("*")) {
					nitrato1.setBackground(Color.YELLOW);
				} else {
					nitrato1.setBackground(colorPorDefecto);
				}
				nitrogenoTotal1.setText(analisisAguaSeleccionado.getNitrogenoTotal());
				if(analisisAguaSeleccionado.getNitrogenoTotal().equals("*")) {
					nitrogenoTotal1.setBackground(Color.YELLOW);
				} else {
					nitrogenoTotal1.setBackground(colorPorDefecto);
				}
				fosforoTotal1.setText(analisisAguaSeleccionado.getFosforoTotal());
				if(analisisAguaSeleccionado.getFosforoTotal().equals("*")) {
					fosforoTotal1.setBackground(Color.YELLOW);
				} else {
					fosforoTotal1.setBackground(colorPorDefecto);
				}
				cromo1.setText(analisisAguaSeleccionado.getCromo());
				if(analisisAguaSeleccionado.getCromo().equals("*")) {
					cromo1.setBackground(Color.YELLOW);
				} else {
					cromo1.setBackground(colorPorDefecto);
				}
				plomo1.setText(analisisAguaSeleccionado.getPlomo());
				if(analisisAguaSeleccionado.getPlomo().equals("*")) {
					plomo1.setBackground(Color.YELLOW);
				} else {
					plomo1.setBackground(colorPorDefecto);
				}
				zinc1.setText(analisisAguaSeleccionado.getZinc());
				if(analisisAguaSeleccionado.getZinc().equals("*")) {
					zinc1.setBackground(Color.YELLOW);
				} else {
					zinc1.setBackground(colorPorDefecto);
				}
				aluminio1.setText(analisisAguaSeleccionado.getAluminio());
				if(analisisAguaSeleccionado.getAluminio().equals("*")) {
					aluminio1.setBackground(Color.YELLOW);
				} else {
					aluminio1.setBackground(colorPorDefecto);
				}
				manganeso1.setText(analisisAguaSeleccionado.getManganeso());
				if(analisisAguaSeleccionado.getManganeso().equals("*")) {
					manganeso1.setBackground(Color.YELLOW);
				} else {
					manganeso1.setBackground(colorPorDefecto);
				}
				potasio1.setText(analisisAguaSeleccionado.getPotasio());
				if(analisisAguaSeleccionado.getPotasio().equals("*")) {
					potasio1.setBackground(Color.YELLOW);
				} else {
					potasio1.setBackground(colorPorDefecto);
				}
				alcalinidadTotal1.setText(analisisAguaSeleccionado.getAlcalinidadTotal());
				if(analisisAguaSeleccionado.getAlcalinidadTotal().equals("*")) {
					alcalinidadTotal1.setBackground(Color.YELLOW);
				} else {
					alcalinidadTotal1.setBackground(colorPorDefecto);
				}
				acidezVolatil1.setText(analisisAguaSeleccionado.getAcidezVolatil());
				if(analisisAguaSeleccionado.getAcidezVolatil().equals("*")) {
					acidezVolatil1.setBackground(Color.YELLOW);
				} else {
					acidezVolatil1.setBackground(colorPorDefecto);
				}
				alfa1.setText(analisisAguaSeleccionado.getAlfa());
				if(analisisAguaSeleccionado.getAlfa().equals("*")) {
					alfa1.setBackground(Color.YELLOW);
				} else {
					alfa1.setBackground(colorPorDefecto);
				}
				alfaPrima1.setText(analisisAguaSeleccionado.getAlfaPrima());
				if(analisisAguaSeleccionado.getAlfaPrima().equals("*")) {
					alfaPrima1.setBackground(Color.YELLOW);
				} else {
					alfaPrima1.setBackground(colorPorDefecto);
				}				
				bicarbonato1.setText(analisisAguaSeleccionado.getBicarbonato());
				if(analisisAguaSeleccionado.getBicarbonato().equals("*")) {
					bicarbonato1.setBackground(Color.YELLOW);
				} else {
					bicarbonato1.setBackground(colorPorDefecto);
				}
				salinidad1.setText(analisisAguaSeleccionado.getSalinidad());
				if(analisisAguaSeleccionado.getSalinidad().equals("*")) {
					salinidad1.setBackground(Color.YELLOW);
				} else {
					salinidad1.setBackground(colorPorDefecto);
				}
				turbiedad1.setText(analisisAguaSeleccionado.getTurbiedad());
				if(analisisAguaSeleccionado.getTurbiedad().equals("*")) {
					turbiedad1.setBackground(Color.YELLOW);
				} else {
					turbiedad1.setBackground(colorPorDefecto);
				}
				conductividad1.setText(analisisAguaSeleccionado.getConductividad());
				if(analisisAguaSeleccionado.getConductividad().equals("*")) {
					conductividad1.setBackground(Color.YELLOW);
				} else {
					conductividad1.setBackground(colorPorDefecto);
				}
				sulfuro1.setText(analisisAguaSeleccionado.getSulfuro());
				if(analisisAguaSeleccionado.getSulfuro().equals("*")) {
					sulfuro1.setBackground(Color.YELLOW);
				} else {
					sulfuro1.setBackground(colorPorDefecto);
				}
				sulfato1.setText(analisisAguaSeleccionado.getSulfato());
				if(analisisAguaSeleccionado.getSulfato().equals("*")) {
					sulfato1.setBackground(Color.YELLOW);
				} else {
					sulfato1.setBackground(colorPorDefecto);
				}
				fenoles1.setText(analisisAguaSeleccionado.getFenoles());
				if(analisisAguaSeleccionado.getFenoles().equals("*")) {
					fenoles1.setBackground(Color.YELLOW);
				} else {
					fenoles1.setBackground(colorPorDefecto);
				}
				tensoactivos1.setText(analisisAguaSeleccionado.getTensoactivosAnionicos());
				if(analisisAguaSeleccionado.getTensoactivosAnionicos().equals("*")) {
					tensoactivos1.setBackground(Color.YELLOW);
				} else {
					tensoactivos1.setBackground(colorPorDefecto);
				}
				cloroResidual1.setText(analisisAguaSeleccionado.getCloroResidual());
				if(analisisAguaSeleccionado.getCloroResidual().equals("*")) {
					cloroResidual1.setBackground(Color.YELLOW);
				} else {
					cloroResidual1.setBackground(colorPorDefecto);
				}
				cloroTotal1.setText(analisisAguaSeleccionado.getCloroTotal());
				if(analisisAguaSeleccionado.getCloroTotal().equals("*")) {
					cloroTotal1.setBackground(Color.YELLOW);
				} else {
					cloroTotal1.setBackground(colorPorDefecto);
				}
				cloruro1.setText(analisisAguaSeleccionado.getCloruro());
				if(analisisAguaSeleccionado.getCloruro().equals("*")) {
					cloruro1.setBackground(Color.YELLOW);
				} else {
					cloruro1.setBackground(colorPorDefecto);
				}
				dureza1.setText(analisisAguaSeleccionado.getDureza());
				if(analisisAguaSeleccionado.getDureza().equals("*")) {
					dureza1.setBackground(Color.YELLOW);
				} else {
					dureza1.setBackground(colorPorDefecto);
				}
				color1.setText(analisisAguaSeleccionado.getColor());
				if(analisisAguaSeleccionado.getColor().equals("*")) {
					color1.setBackground(Color.YELLOW);
				} else {
					color1.setBackground(colorPorDefecto);
				}
				hidrocarburos1.setText(analisisAguaSeleccionado.getHidrocarburos());
				if(analisisAguaSeleccionado.getHidrocarburos().equals("*")) {
					hidrocarburos1.setBackground(Color.YELLOW);
				} else {
					hidrocarburos1.setBackground(colorPorDefecto);
				}
				coliformes1.setText(analisisAguaSeleccionado.getColiformesFecales());
				if(analisisAguaSeleccionado.getColiformesFecales().equals("*")) {
					coliformes1.setBackground(Color.YELLOW);
				} else {
					coliformes1.setBackground(colorPorDefecto);
				}
				cursoAguaTipo1.setText(analisisAguaSeleccionado.getCursoDeAguaTipo());
				if(analisisAguaSeleccionado.getCursoDeAguaTipo().equals("*")) {
					cursoAguaTipo1.setBackground(Color.YELLOW);
				} else {
					cursoAguaTipo1.setBackground(colorPorDefecto);
				}
				otros11.setText(analisisAguaSeleccionado.getOtros());
				if(analisisAguaSeleccionado.getOtros().equals("*")) {
					otros11.setBackground(Color.YELLOW);
				} else {
					otros11.setBackground(colorPorDefecto);
				}
				otros21.setText(analisisAguaSeleccionado.getOtros2());
				if(analisisAguaSeleccionado.getOtros().equals("*")) {
					otros21.setBackground(Color.YELLOW);
				} else {
					otros21.setBackground(colorPorDefecto);
				}
				otros31.setText(analisisAguaSeleccionado.getOtros3());
				if(analisisAguaSeleccionado.getOtros3().equals("*")) {
					otros31.setBackground(Color.YELLOW);
				} else {
					otros31.setBackground(colorPorDefecto);
				}
				otros41.setText(analisisAguaSeleccionado.getOtros4());
				if(analisisAguaSeleccionado.getOtros4().equals("*")) {
					otros41.setBackground(Color.YELLOW);
				} else {
					otros41.setBackground(colorPorDefecto);
				}
				
				
			}
		});
		
		lugarExtraccion1 = new JTextField();
		lugarExtraccion1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblLugarExtraccion.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblLugarExtraccion.setForeground(Color.BLACK);
				if (lugarExtraccion1.getText().equals("*")) {
					lugarExtraccion1.setBackground(Color.YELLOW);
				} else {
					lugarExtraccion1.setBackground(colorPorDefecto);
				}
			}
		});
		lugarExtraccion1.setBounds(191, 155, 130, 26);
		miPanel.add(lugarExtraccion1);
		lugarExtraccion1.setColumns(10);
		lugarExtraccion1.setHorizontalAlignment(JTextField.CENTER);
		
		extraidoPor1 = new JTextField();
		extraidoPor1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblExtraidoPor.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblExtraidoPor.setForeground(Color.BLACK);
				if (extraidoPor1.getText().equals("*")) {
					extraidoPor1.setBackground(Color.YELLOW);
				} else {
					extraidoPor1.setBackground(colorPorDefecto);
				}
			}
		});
		extraidoPor1.setBounds(191, 185, 130, 26);
		miPanel.add(extraidoPor1);
		extraidoPor1.setColumns(10);
		extraidoPor1.setHorizontalAlignment(JTextField.CENTER);
		
		fechaExtraccion1 = new JTextField();
		fechaExtraccion1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (fechaExtraccion1.getText().equals("*")) {
					fechaExtraccion1.setBackground(Color.YELLOW);
				} else {
					fechaExtraccion1.setBackground(colorPorDefecto);
				}
			}
		});
		fechaExtraccion1.setBounds(191, 215, 130, 26);
		miPanel.add(fechaExtraccion1); 
		fechaExtraccion1.setColumns(10);
		fechaExtraccion1.setHorizontalAlignment(JTextField.CENTER);
		fechaExtraccion1.setEditable(false);
		
		horaExtraccion1 = new JTextField();
		horaExtraccion1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblHoraExtraccion.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblHoraExtraccion.setForeground(Color.BLACK);
				if (horaExtraccion1.getText().equals("*")) {
					horaExtraccion1.setBackground(Color.YELLOW);
				} else {
					horaExtraccion1.setBackground(colorPorDefecto);
				}
			}
		});
		horaExtraccion1.setBounds(191, 245, 130, 26);
		miPanel.add(horaExtraccion1);
		horaExtraccion1.setColumns(10);
		horaExtraccion1.setHorizontalAlignment(JTextField.CENTER);
		
		aspecto1 = new JTextField();
		aspecto1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblAspecto.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblAspecto.setForeground(Color.BLACK);
				if (aspecto1.getText().equals("*")) {
					aspecto1.setBackground(Color.YELLOW);
				} else {
					aspecto1.setBackground(colorPorDefecto);
				}
			}
		});
		aspecto1.setBounds(191, 275, 130, 26);
		miPanel.add(aspecto1);
		aspecto1.setColumns(10);
		aspecto1.setHorizontalAlignment(JTextField.CENTER);		
		
		pHIS1 = new JTextField();
		pHIS1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblpHinSitu.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblpHinSitu.setForeground(Color.BLACK);
				if (pHIS1.getText().equals("*")) {
					pHIS1.setBackground(Color.YELLOW);
				} else {
					pHIS1.setBackground(colorPorDefecto);
				}
			}
		});
		pHIS1.setHorizontalAlignment(SwingConstants.CENTER);
		pHIS1.setColumns(10);
		pHIS1.setBounds(191, 307, 130, 26);
		miPanel.add(pHIS1);
		
		pH1 = new JTextField();
		pH1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblpH.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblpH.setForeground(Color.BLACK);
				if (pH1.getText().equals("*")) {
					pH1.setBackground(Color.YELLOW);
				} else {
					pH1.setBackground(colorPorDefecto);
				}
			}
		});
		pH1.setHorizontalAlignment(SwingConstants.CENTER);
		pH1.setColumns(10);
		pH1.setBounds(191, 337, 130, 26);
		miPanel.add(pH1);
		
		temperatura1 = new JTextField();
		temperatura1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblTemperatura.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblTemperatura.setForeground(Color.BLACK);
				if (temperatura1.getText().equals("*")) {
					temperatura1.setBackground(Color.YELLOW);
				} else {
					temperatura1.setBackground(colorPorDefecto);
				}
			}
		});
		temperatura1.setHorizontalAlignment(SwingConstants.CENTER);
		temperatura1.setColumns(10);
		temperatura1.setBounds(191, 367, 130, 26);
		miPanel.add(temperatura1);
		
		caudal1 = new JTextField();
		caudal1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblCaudal.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblCaudal.setForeground(Color.BLACK);
				if (caudal1.getText().equals("*")) {
					caudal1.setBackground(Color.YELLOW);
				} else {
					caudal1.setBackground(colorPorDefecto);
				}
			}
		});
		caudal1.setHorizontalAlignment(SwingConstants.CENTER);
		caudal1.setColumns(10);
		caudal1.setBounds(191, 397, 130, 26);
		miPanel.add(caudal1);
		
		ODIS1 = new JTextField();
		ODIS1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblODInSitu.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblODInSitu.setForeground(Color.BLACK);
				if (ODIS1.getText().equals("*")) {
					ODIS1.setBackground(Color.YELLOW);
				} else {
					ODIS1.setBackground(colorPorDefecto);
				}
			}
		});
		ODIS1.setHorizontalAlignment(SwingConstants.CENTER);
		ODIS1.setColumns(10);
		ODIS1.setBounds(191, 427, 130, 26);
		miPanel.add(ODIS1);
		
		OD1 = new JTextField();
		OD1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblOD.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblOD.setForeground(Color.BLACK);
				if (OD1.getText().equals("*")) {
					OD1.setBackground(Color.YELLOW);
				} else {
					OD1.setBackground(colorPorDefecto);
				}
			}
		});
		OD1.setHorizontalAlignment(SwingConstants.CENTER);
		OD1.setColumns(10);
		OD1.setBounds(191, 457, 130, 26);
		miPanel.add(OD1);
		
		DBO51 = new JTextField();
		DBO51.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblDBO5.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblDBO5.setForeground(Color.BLACK);
				if (DBO51.getText().equals("*")) {
					DBO51.setBackground(Color.YELLOW);
				} else {
					DBO51.setBackground(colorPorDefecto);
				}
			}
		});
		DBO51.setHorizontalAlignment(SwingConstants.CENTER);
		DBO51.setColumns(10);
		DBO51.setBounds(191, 487, 130, 26);
		miPanel.add(DBO51);
		
		DBO5F1 = new JTextField();
		DBO5F1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblDBO5F.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblDBO5F.setForeground(Color.BLACK);
				if (DBO5F1.getText().equals("*")) {
					DBO5F1.setBackground(Color.YELLOW);
				} else {
					DBO5F1.setBackground(colorPorDefecto);
				}
			}
		});
		DBO5F1.setHorizontalAlignment(SwingConstants.CENTER);
		DBO5F1.setColumns(10);
		DBO5F1.setBounds(191, 517, 130, 26);
		miPanel.add(DBO5F1);
		
		DQO1 = new JTextField();
		DQO1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblDQO.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblDQO.setForeground(Color.BLACK);
				if (DQO1.getText().equals("*")) {
					DQO1.setBackground(Color.YELLOW);
				} else {
					DQO1.setBackground(colorPorDefecto);
				}
			}
		});
		DQO1.setHorizontalAlignment(SwingConstants.CENTER);
		DQO1.setColumns(10);
		DQO1.setBounds(191, 547, 130, 26);
		miPanel.add(DQO1);
		
		AceitesYGrasas1 = new JTextField();
		AceitesYGrasas1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblAceitesYGrasas.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblAceitesYGrasas.setForeground(Color.BLACK);
				if (AceitesYGrasas1.getText().equals("*")) {
					AceitesYGrasas1.setBackground(Color.YELLOW);
				} else {
					AceitesYGrasas1.setBackground(colorPorDefecto);
				}
			}
		});
		AceitesYGrasas1.setHorizontalAlignment(SwingConstants.CENTER);
		AceitesYGrasas1.setColumns(10);
		AceitesYGrasas1.setBounds(191, 577, 130, 26);
		miPanel.add(AceitesYGrasas1);
		
		SolidosTotales1 = new JTextField();
		SolidosTotales1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblSolidosTotales.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblSolidosTotales.setForeground(Color.BLACK);
				if (SolidosTotales1.getText().equals("*")) {
					SolidosTotales1.setBackground(Color.YELLOW);
				} else {
					SolidosTotales1.setBackground(colorPorDefecto);
				}
			}
		});
		SolidosTotales1.setHorizontalAlignment(SwingConstants.CENTER);
		SolidosTotales1.setColumns(10);
		SolidosTotales1.setBounds(191, 607, 130, 26);
		miPanel.add(SolidosTotales1);
		
		STV1 = new JTextField();
		STV1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblSolidosTotalesVolatiles.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblSolidosTotalesVolatiles.setForeground(Color.BLACK);
				if (STV1.getText().equals("*")) {
					STV1.setBackground(Color.YELLOW);
				} else {
					STV1.setBackground(colorPorDefecto);
				}
			}
		});
		STV1.setHorizontalAlignment(SwingConstants.CENTER);
		STV1.setColumns(10);
		STV1.setBounds(191, 637, 130, 26);
		miPanel.add(STV1);
		
		SST1 = new JTextField();
		SST1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblSolidosSuspendidosTotales.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblSolidosSuspendidosTotales.setForeground(Color.BLACK);
				if (SST1.getText().equals("*")) {
					SST1.setBackground(Color.YELLOW);
				} else {
					SST1.setBackground(colorPorDefecto);
				}
			}
		});
		SST1.setHorizontalAlignment(SwingConstants.CENTER);
		SST1.setColumns(10);
		SST1.setBounds(191, 667, 130, 26);
		miPanel.add(SST1);
		
		SSV1 = new JTextField();
		SSV1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblSSV.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblSSV.setForeground(Color.BLACK);
				if (SSV1.getText().equals("*")) {
					SSV1.setBackground(Color.YELLOW);
				} else {
					SSV1.setBackground(colorPorDefecto);
				}
			}
		});
		SSV1.setHorizontalAlignment(SwingConstants.CENTER);
		SSV1.setColumns(10);
		SSV1.setBounds(191, 697, 130, 26);
		miPanel.add(SSV1);
		
		SS101 = new JTextField();
		SS101.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblSS10.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblSS10.setForeground(Color.BLACK);
				if (SS101.getText().equals("*")) {
					SS101.setBackground(Color.YELLOW);
				} else {
					SS101.setBackground(colorPorDefecto);
				}
			}
		});
		SS101.setHorizontalAlignment(SwingConstants.CENTER);
		SS101.setColumns(10);
		SS101.setBounds(191, 727, 130, 26);
		miPanel.add(SS101);
		
		SS301 = new JTextField();
		SS301.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblSS30.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblSS30.setForeground(Color.BLACK);
				if (SS301.getText().equals("*")) {
					SS301.setBackground(Color.YELLOW);
				} else {
					SS301.setBackground(colorPorDefecto);
				}
			}
		});
		SS301.setHorizontalAlignment(SwingConstants.CENTER);
		SS301.setColumns(10);
		SS301.setBounds(191, 757, 130, 26);
		miPanel.add(SS301);
		
		SS601 = new JTextField();
		SS601.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblSS60.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblSS60.setForeground(Color.BLACK);
				if (SS601.getText().equals("*")) {
					SS601.setBackground(Color.YELLOW);
				} else {
					SS601.setBackground(colorPorDefecto);
				}
			}
		});
		SS601.setHorizontalAlignment(SwingConstants.CENTER);
		SS601.setColumns(10);
		SS601.setBounds(191, 787, 130, 26);
		miPanel.add(SS601);	
		
		amoniaco1 = new JTextField();
		amoniaco1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblAmoniaco.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblAmoniaco.setForeground(Color.BLACK);
				if (amoniaco1.getText().equals("*")) {
					amoniaco1.setBackground(Color.YELLOW);
				} else {
					amoniaco1.setBackground(colorPorDefecto);
				}
			}
		});
		amoniaco1.setHorizontalAlignment(SwingConstants.CENTER);
		amoniaco1.setColumns(10);
		amoniaco1.setBounds(191, 817, 130, 26);
		miPanel.add(amoniaco1);
		
		nitrato1 = new JTextField();
		nitrato1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblNitrato.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblNitrato.setForeground(Color.BLACK);
				if (nitrato1.getText().equals("*")) {
					nitrato1.setBackground(Color.YELLOW);
				} else {
					nitrato1.setBackground(colorPorDefecto);
				}
			}
		});
		nitrato1.setHorizontalAlignment(SwingConstants.CENTER);
		nitrato1.setColumns(10);
		nitrato1.setBounds(191, 847, 130, 26);
		miPanel.add(nitrato1);
		
		nitrogenoTotal1 = new JTextField();
		nitrogenoTotal1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblNitrogenoTotal.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblNitrogenoTotal.setForeground(Color.BLACK);
				if (nitrogenoTotal1.getText().equals("*")) {
					nitrogenoTotal1.setBackground(Color.YELLOW);
				} else {
					nitrogenoTotal1.setBackground(colorPorDefecto);
				}
			}
		});
		nitrogenoTotal1.setHorizontalAlignment(SwingConstants.CENTER);
		nitrogenoTotal1.setColumns(10);
		nitrogenoTotal1.setBounds(191, 877, 130, 26);
		miPanel.add(nitrogenoTotal1);
		
		fosforoTotal1 = new JTextField();
		fosforoTotal1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblFosforoTotal.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblFosforoTotal.setForeground(Color.BLACK);
				if (fosforoTotal1.getText().equals("*")) {
					fosforoTotal1.setBackground(Color.YELLOW);
				} else {
					fosforoTotal1.setBackground(colorPorDefecto);
				}
			}
		});
		fosforoTotal1.setHorizontalAlignment(SwingConstants.CENTER);
		fosforoTotal1.setColumns(10);
		fosforoTotal1.setBounds(191, 907, 130, 26);
		miPanel.add(fosforoTotal1);
		
		cromo1 = new JTextField();
		cromo1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblCromo.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblCromo.setForeground(Color.BLACK);
				if (cromo1.getText().equals("*")) {
					cromo1.setBackground(Color.YELLOW);
				} else {
					cromo1.setBackground(colorPorDefecto);
				}
			}
		});
		cromo1.setHorizontalAlignment(SwingConstants.CENTER);
		cromo1.setColumns(10);
		cromo1.setBounds(191, 937, 130, 26);
		miPanel.add(cromo1);
		
		plomo1 = new JTextField();
		plomo1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblPlomo.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblPlomo.setForeground(Color.BLACK);
				if (plomo1.getText().equals("*")) {
					plomo1.setBackground(Color.YELLOW);
				} else {
					plomo1.setBackground(colorPorDefecto);
				}
			}
		});
		plomo1.setHorizontalAlignment(SwingConstants.CENTER);
		plomo1.setColumns(10);
		plomo1.setBounds(191, 967, 130, 26);
		miPanel.add(plomo1);
		
		zinc1 = new JTextField();
		zinc1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblZinc.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblZinc.setForeground(Color.BLACK);
				if (zinc1.getText().equals("*")) {
					zinc1.setBackground(Color.YELLOW);
				} else {
					zinc1.setBackground(colorPorDefecto);
				}
			}
		});
		zinc1.setHorizontalAlignment(SwingConstants.CENTER);
		zinc1.setColumns(10);
		zinc1.setBounds(191, 997, 130, 26);
		miPanel.add(zinc1);
		
		aluminio1 = new JTextField();
		aluminio1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblAluminio.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblAluminio.setForeground(Color.BLACK);
				if (aluminio1.getText().equals("*")) {
					aluminio1.setBackground(Color.YELLOW);
				} else {
					aluminio1.setBackground(colorPorDefecto);
				}
			}
		});
		aluminio1.setHorizontalAlignment(SwingConstants.CENTER);
		aluminio1.setColumns(10);
		aluminio1.setBounds(191, 1027, 130, 26);
		miPanel.add(aluminio1);
		
		manganeso1 = new JTextField();
		manganeso1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblManganeso.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblManganeso.setForeground(Color.BLACK);
				if (manganeso1.getText().equals("*")) {
					manganeso1.setBackground(Color.YELLOW);
				} else {
					manganeso1.setBackground(colorPorDefecto);
				}
			}
		});
		manganeso1.setHorizontalAlignment(SwingConstants.CENTER);
		manganeso1.setColumns(10);
		manganeso1.setBounds(191, 1057, 130, 26);
		miPanel.add(manganeso1);
		
		potasio1 = new JTextField();
		potasio1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblPotasio.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblPotasio.setForeground(Color.BLACK);
				if (potasio1.getText().equals("*")) {
					potasio1.setBackground(Color.YELLOW);
				} else {
					potasio1.setBackground(colorPorDefecto);
				}
			}
		});
		potasio1.setHorizontalAlignment(SwingConstants.CENTER);
		potasio1.setColumns(10);
		potasio1.setBounds(191, 1087, 130, 26);
		miPanel.add(potasio1);
		
		alcalinidadTotal1 = new JTextField();
		alcalinidadTotal1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblAlcalinidadTotal.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblAlcalinidadTotal.setForeground(Color.BLACK);
				if (alcalinidadTotal1.getText().equals("*")) {
					alcalinidadTotal1.setBackground(Color.YELLOW);
				} else {
					alcalinidadTotal1.setBackground(colorPorDefecto);
				}
			}
		});
		alcalinidadTotal1.setHorizontalAlignment(SwingConstants.CENTER);
		alcalinidadTotal1.setColumns(10);
		alcalinidadTotal1.setBounds(191, 1117, 130, 26);
		miPanel.add(alcalinidadTotal1);
		
		acidezVolatil1 = new JTextField();
		acidezVolatil1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblAcidezVolatil.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblAcidezVolatil.setForeground(Color.BLACK);
				if (acidezVolatil1.getText().equals("*")) {
					acidezVolatil1.setBackground(Color.YELLOW);
				} else {
					acidezVolatil1.setBackground(colorPorDefecto);
				}
			}
		});
		acidezVolatil1.setHorizontalAlignment(SwingConstants.CENTER);
		acidezVolatil1.setColumns(10);
		acidezVolatil1.setBounds(191, 1147, 130, 26);
		miPanel.add(acidezVolatil1);
		
		alfa1 = new JTextField();
		alfa1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblAlfa.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblAlfa.setForeground(Color.BLACK);
				if (alfa1.getText().equals("*")) {
					alfa1.setBackground(Color.YELLOW);
				} else {
					alfa1.setBackground(colorPorDefecto);
				}
			}
		});
		alfa1.setHorizontalAlignment(SwingConstants.CENTER);
		alfa1.setColumns(10);
		alfa1.setBounds(191, 1177, 130, 26);
		miPanel.add(alfa1);
		
		alfaPrima1 = new JTextField();
		alfaPrima1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblAlfaPrima.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblAlfaPrima.setForeground(Color.BLACK);
				if (alfaPrima1.getText().equals("*")) {
					alfaPrima1.setBackground(Color.YELLOW);
				} else {
					alfaPrima1.setBackground(colorPorDefecto);
				}
			}
		});
		alfaPrima1.setHorizontalAlignment(SwingConstants.CENTER);
		alfaPrima1.setColumns(10);
		alfaPrima1.setBounds(191, 1207, 130, 26);
		miPanel.add(alfaPrima1);
		
		bicarbonato1 = new JTextField();
		bicarbonato1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblBicarbonato.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblBicarbonato.setForeground(Color.BLACK);
				if (bicarbonato1.getText().equals("*")) {
					bicarbonato1.setBackground(Color.YELLOW);
				} else {
					bicarbonato1.setBackground(colorPorDefecto);
				}
			}
		});
		bicarbonato1.setHorizontalAlignment(SwingConstants.CENTER);
		bicarbonato1.setColumns(10);
		bicarbonato1.setBounds(191, 1237, 130, 26);
		miPanel.add(bicarbonato1);
		
		salinidad1 = new JTextField();
		salinidad1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblSalinidad.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblSalinidad.setForeground(Color.BLACK);
				if (salinidad1.getText().equals("*")) {
					salinidad1.setBackground(Color.YELLOW);
				} else {
					salinidad1.setBackground(colorPorDefecto);
				}
			}
		});
		salinidad1.setHorizontalAlignment(SwingConstants.CENTER);
		salinidad1.setColumns(10);
		salinidad1.setBounds(191, 1267, 130, 26);
		miPanel.add(salinidad1);
		
		turbiedad1 = new JTextField();
		turbiedad1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblTurbiedad.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblTurbiedad.setForeground(Color.BLACK);
				if (turbiedad1.getText().equals("*")) {
					turbiedad1.setBackground(Color.YELLOW);
				} else {
					turbiedad1.setBackground(colorPorDefecto);
				}
			}
		});
		turbiedad1.setHorizontalAlignment(SwingConstants.CENTER);
		turbiedad1.setColumns(10);
		turbiedad1.setBounds(191, 1297, 130, 26);
		miPanel.add(turbiedad1);
		
		conductividad1 = new JTextField();
		conductividad1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblConductividad.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblConductividad.setForeground(Color.BLACK);
				if (conductividad1.getText().equals("*")) {
					conductividad1.setBackground(Color.YELLOW);
				} else {
					conductividad1.setBackground(colorPorDefecto);
				}
			}
		});
		conductividad1.setHorizontalAlignment(SwingConstants.CENTER);
		conductividad1.setColumns(10);
		conductividad1.setBounds(191, 1327, 130, 26);
		miPanel.add(conductividad1);
		
		sulfuro1 = new JTextField();
		sulfuro1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblSulfuro.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblSulfuro.setForeground(Color.BLACK);
				if (sulfuro1.getText().equals("*")) {
					sulfuro1.setBackground(Color.YELLOW);
				} else {
					sulfuro1.setBackground(colorPorDefecto);
				}
			}
		});
		sulfuro1.setHorizontalAlignment(SwingConstants.CENTER);
		sulfuro1.setColumns(10);
		sulfuro1.setBounds(191, 1357, 130, 26);
		miPanel.add(sulfuro1);
		
		sulfato1 = new JTextField();
		sulfato1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblSulfato.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblSulfato.setForeground(Color.BLACK);
				if (sulfato1.getText().equals("*")) {
					sulfato1.setBackground(Color.YELLOW);
				} else {
					sulfato1.setBackground(colorPorDefecto);
				}
			}
		});
		sulfato1.setHorizontalAlignment(SwingConstants.CENTER);
		sulfato1.setColumns(10);
		sulfato1.setBounds(191, 1387, 130, 26);
		miPanel.add(sulfato1);
		
		fenoles1 = new JTextField();
		fenoles1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblFenoles.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblFenoles.setForeground(Color.BLACK);
				if (fenoles1.getText().equals("*")) {
					fenoles1.setBackground(Color.YELLOW);
				} else {
					fenoles1.setBackground(colorPorDefecto);
				}
			}
		});
		fenoles1.setHorizontalAlignment(SwingConstants.CENTER);
		fenoles1.setColumns(10);
		fenoles1.setBounds(191, 1417, 130, 26);
		miPanel.add(fenoles1);
		
		tensoactivos1 = new JTextField();
		tensoactivos1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblTensoactivosAnionicos.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblTensoactivosAnionicos.setForeground(Color.BLACK);
				if (tensoactivos1.getText().equals("*")) {
					tensoactivos1.setBackground(Color.YELLOW);
				} else {
					tensoactivos1.setBackground(colorPorDefecto);
				}
			}
		});
		tensoactivos1.setHorizontalAlignment(SwingConstants.CENTER);
		tensoactivos1.setColumns(10);
		tensoactivos1.setBounds(191, 1447, 130, 26);
		miPanel.add(tensoactivos1);
		
		cloroResidual1 = new JTextField();
		cloroResidual1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblCloroResidual.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblCloroResidual.setForeground(Color.BLACK);
				if (cloroResidual1.getText().equals("*")) {
					cloroResidual1.setBackground(Color.YELLOW);
				} else {
					cloroResidual1.setBackground(colorPorDefecto);
				}
			}
		});
		cloroResidual1.setHorizontalAlignment(SwingConstants.CENTER);
		cloroResidual1.setColumns(10);
		cloroResidual1.setBounds(191, 1477, 130, 26);
		miPanel.add(cloroResidual1);
		
		cloroTotal1 = new JTextField();
		cloroTotal1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblCloroTotal.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblCloroTotal.setForeground(Color.BLACK);
				if (cloroTotal1.getText().equals("*")) {
					cloroTotal1.setBackground(Color.YELLOW);
				} else {
					cloroTotal1.setBackground(colorPorDefecto);
				}
			}
		});
		cloroTotal1.setHorizontalAlignment(SwingConstants.CENTER);
		cloroTotal1.setColumns(10);
		cloroTotal1.setBounds(191, 1507, 130, 26);
		miPanel.add(cloroTotal1);
		
		cloruro1 = new JTextField();
		cloruro1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblCloruro.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblCloruro.setForeground(Color.BLACK);
				if (cloruro1.getText().equals("*")) {
					cloruro1.setBackground(Color.YELLOW);
				} else {
					cloruro1.setBackground(colorPorDefecto);
				}
			}
		});
		cloruro1.setHorizontalAlignment(SwingConstants.CENTER);
		cloruro1.setColumns(10);
		cloruro1.setBounds(191, 1537, 130, 26);
		miPanel.add(cloruro1);
		
		dureza1 = new JTextField();
		dureza1 = new JTextField();
		dureza1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblDureza.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblDureza.setForeground(Color.BLACK);
				if (dureza1.getText().equals("*")) {
					dureza1.setBackground(Color.YELLOW);
				} else {
					dureza1.setBackground(colorPorDefecto);
				}
			}
		});
		dureza1.setHorizontalAlignment(SwingConstants.CENTER);
		dureza1.setColumns(10);
		dureza1.setBounds(191, 1567, 130, 26);
		miPanel.add(dureza1);
		
		color1 = new JTextField();
		color1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblColor.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblColor.setForeground(Color.BLACK);
				if (color1.getText().equals("*")) {
					color1.setBackground(Color.YELLOW);
				} else {
					color1.setBackground(colorPorDefecto);
				}
			}
		});
		color1.setHorizontalAlignment(SwingConstants.CENTER);
		color1.setColumns(10);
		color1.setBounds(191, 1597, 130, 26);
		miPanel.add(color1);
		
		hidrocarburos1 = new JTextField();
		hidrocarburos1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblHidrocarburos.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblHidrocarburos.setForeground(Color.BLACK);
				if (hidrocarburos1.getText().equals("*")) {
					hidrocarburos1.setBackground(Color.YELLOW);
				} else {
					hidrocarburos1.setBackground(colorPorDefecto);
				}
			}
		});
		hidrocarburos1.setHorizontalAlignment(SwingConstants.CENTER);
		hidrocarburos1.setColumns(10);
		hidrocarburos1.setBounds(191, 1627, 130, 26);
		miPanel.add(hidrocarburos1);
		
		coliformes1 = new JTextField();
		coliformes1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblColiformes.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblColiformes.setForeground(Color.BLACK);
				if (coliformes1.getText().equals("*")) {
					coliformes1.setBackground(Color.YELLOW);
				} else {
					coliformes1.setBackground(colorPorDefecto);
				}
			}
		});
		coliformes1.setHorizontalAlignment(SwingConstants.CENTER);
		coliformes1.setColumns(10);
		coliformes1.setBounds(191, 1657, 130, 26);
		miPanel.add(coliformes1);
		
		cursoAguaTipo1 = new JTextField();
		cursoAguaTipo1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblCursoDeAgua.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblCursoDeAgua.setForeground(Color.BLACK);
				if (cursoAguaTipo1.getText().equals("*")) {
					cursoAguaTipo1.setBackground(Color.YELLOW);
				} else {
					cursoAguaTipo1.setBackground(colorPorDefecto);
				}
			}
		});
		cursoAguaTipo1.setHorizontalAlignment(SwingConstants.CENTER);
		cursoAguaTipo1.setColumns(10);
		cursoAguaTipo1.setBounds(191, 1687, 130, 26);
		miPanel.add(cursoAguaTipo1);
		
		otros11 = new JTextField();
		otros11.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblOtros.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblOtros.setForeground(Color.BLACK);
				if (otros11.getText().equals("*")) {
					otros11.setBackground(Color.YELLOW);
				} else {
					otros11.setBackground(colorPorDefecto);
				}
			}
		});
		otros11.setHorizontalAlignment(SwingConstants.CENTER);
		otros11.setColumns(10);
		otros11.setBounds(191, 1717, 130, 26);
		miPanel.add(otros11);
		
		otros21 = new JTextField();
		otros21.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblOtros2.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblOtros2.setForeground(Color.BLACK);
				if (otros21.getText().equals("*")) {
					otros21.setBackground(Color.YELLOW);
				} else {
					otros21.setBackground(colorPorDefecto);
				}
			}
		});
		otros21.setHorizontalAlignment(SwingConstants.CENTER);
		otros21.setColumns(10);
		otros21.setBounds(191, 1747, 130, 26);
		miPanel.add(otros21);
		
		otros31 = new JTextField();
		otros31.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblOtros3.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblOtros3.setForeground(Color.BLACK);
				if (otros31.getText().equals("*")) {
					otros31.setBackground(Color.YELLOW);
				} else {
					otros31.setBackground(colorPorDefecto);
				}
			}
		});
		otros31.setHorizontalAlignment(SwingConstants.CENTER);
		otros31.setColumns(10);
		otros31.setBounds(191, 1777, 130, 26);
		miPanel.add(otros31);
		
		otros41 = new JTextField();
		otros41.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblOtros4.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblOtros4.setForeground(Color.BLACK);
				if (otros41.getText().equals("*")) {
					otros41.setBackground(Color.YELLOW);
				} else {
					otros41.setBackground(colorPorDefecto);
				}
			}
		});
		otros41.setHorizontalAlignment(SwingConstants.CENTER);
		otros41.setColumns(10);
		otros41.setBounds(191, 1807, 130, 26);
		miPanel.add(otros41);
		
		nroAnalisis2.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent arg0){
				AnalisisAgua analisisAguaSeleccionado = aguasDAO.obtenerAnalisisAguaPorNumero(String.valueOf(nroAnalisis2.getSelectedItem()));	
				lugarExtraccion2.setText(analisisAguaSeleccionado.getLugarExtraccion());
				if(analisisAguaSeleccionado.getLugarExtraccion().equals("*")) {
					lugarExtraccion2.setBackground(Color.YELLOW);
				} else {
					lugarExtraccion2.setBackground(colorPorDefecto);
				}
				extraidoPor2.setText(analisisAguaSeleccionado.getExtraidoPor());
				if(analisisAguaSeleccionado.getExtraidoPor().equals("*")) {
					extraidoPor2.setBackground(Color.YELLOW);
				} else {
					extraidoPor2.setBackground(colorPorDefecto);
				}
				if(analisisAguaSeleccionado.getFechaExtraccion() == null) {
					fechaExtraccion2.setText("");
				} else {
					DateFormat df = new SimpleDateFormat("dd/MM/YYYY");
				    fechaExtraccion2.setText(df.format(analisisAguaSeleccionado.getFechaExtraccion()));
				}
				horaExtraccion2.setText(analisisAguaSeleccionado.getHoraExtraccion());
				if(analisisAguaSeleccionado.getHoraExtraccion().equals("*")) {
					horaExtraccion2.setBackground(Color.YELLOW);
				} else {
					horaExtraccion2.setBackground(colorPorDefecto);
				}
				if(analisisAguaSeleccionado.getAspecto().equals("*")) {
					aspecto2.setBackground(Color.YELLOW);
				} else {
					aspecto2.setBackground(colorPorDefecto);
				}
				aspecto2.setText(analisisAguaSeleccionado.getAspecto());
				if(analisisAguaSeleccionado.getpH().equals("*")) {
					pH2.setBackground(Color.YELLOW);
				} else {
					pH2.setBackground(colorPorDefecto);
				}
				pH2.setText(analisisAguaSeleccionado.getpH());				
				if(analisisAguaSeleccionado.getSolidosTotales().equals("*")) {
					SolidosTotales2.setBackground(Color.YELLOW);
				} else {
					SolidosTotales2.setBackground(colorPorDefecto);
				}
				SolidosTotales2.setText(analisisAguaSeleccionado.getSolidosTotales());
				if(analisisAguaSeleccionado.getpHInSitu().equals("*")) {
					pHIS2.setBackground(Color.YELLOW);
				} else {
					pHIS2.setBackground(colorPorDefecto);
				}
				pHIS2.setText(analisisAguaSeleccionado.getpHInSitu());
				if(analisisAguaSeleccionado.getTemperatura().equals("*")) {
					temperatura2.setBackground(Color.YELLOW);
				} else {
					temperatura2.setBackground(colorPorDefecto);
				}
				temperatura2.setText(analisisAguaSeleccionado.getTemperatura());
				if(analisisAguaSeleccionado.getCaudalInstantaneo().equals("*")) {
					caudal2.setBackground(Color.YELLOW);
				} else {
					caudal2.setBackground(colorPorDefecto);
				}
				caudal2.setText(analisisAguaSeleccionado.getCaudalInstantaneo());
				if(analisisAguaSeleccionado.getODInSitu().equals("*")) {
					ODIS2.setBackground(Color.YELLOW);
				} else {
					ODIS2.setBackground(colorPorDefecto);
				}
				ODIS2.setText(analisisAguaSeleccionado.getODInSitu());
				if(analisisAguaSeleccionado.getOD().equals("*")) {
					OD2.setBackground(Color.YELLOW);
				} else {
					OD2.setBackground(colorPorDefecto);
				}
				OD2.setText(analisisAguaSeleccionado.getOD());
				if(analisisAguaSeleccionado.getDBO5().equals("*")) {
					DBO52.setBackground(Color.YELLOW);
				} else {
					DBO52.setBackground(colorPorDefecto);
				}
				DBO52.setText(analisisAguaSeleccionado.getDBO5());
				if(analisisAguaSeleccionado.getDBO5Filtrada().equals("*")) {
					DBO5F2.setBackground(Color.YELLOW);
				} else {
					DBO5F2.setBackground(colorPorDefecto);
				}
				DBO5F2.setText(analisisAguaSeleccionado.getDBO5Filtrada());
				if(analisisAguaSeleccionado.getDQO().equals("*")) {
					DQO2.setBackground(Color.YELLOW);
				} else {
					DQO2.setBackground(colorPorDefecto);
				}
				DQO2.setText(analisisAguaSeleccionado.getDQO());
				if(analisisAguaSeleccionado.getAceitesYGrasas().equals("*")) {
					AceitesYGrasas2.setBackground(Color.YELLOW);
				} else {
					AceitesYGrasas2.setBackground(colorPorDefecto);
				}
				AceitesYGrasas2.setText(analisisAguaSeleccionado.getAceitesYGrasas());
				if(analisisAguaSeleccionado.getSolidosTotalesVolatiles().equals("*")) {
					STV2.setBackground(Color.YELLOW);
				} else {
					STV2.setBackground(colorPorDefecto);
				}
				STV2.setText(analisisAguaSeleccionado.getSolidosTotalesVolatiles());

				SST2.setText(analisisAguaSeleccionado.getSst());
				if(analisisAguaSeleccionado.getSst().equals("*")) {
					SST2.setBackground(Color.YELLOW);
				} else {
					SST2.setBackground(colorPorDefecto);
				}
				SSV2.setText(analisisAguaSeleccionado.getSsv());
				if(analisisAguaSeleccionado.getSsv().equals("*")) {
					SSV2.setBackground(Color.YELLOW);
				} else {
					SSV2.setBackground(colorPorDefecto);
				}
				SS102.setText(analisisAguaSeleccionado.getSs10());
				if(analisisAguaSeleccionado.getSs10().equals("*")) {
					SS102.setBackground(Color.YELLOW);
				} else {
					SS102.setBackground(colorPorDefecto);
				}
				SS302.setText(analisisAguaSeleccionado.getSs30());
				if(analisisAguaSeleccionado.getSs30().equals("*")) {
					SS302.setBackground(Color.YELLOW);
				} else {
					SS302.setBackground(colorPorDefecto);
				}
				SS602.setText(analisisAguaSeleccionado.getSs60());
				if(analisisAguaSeleccionado.getSs60().equals("*")) {
					SS602.setBackground(Color.YELLOW);
				} else {
					SS602.setBackground(colorPorDefecto);
				}
				amoniaco2.setText(analisisAguaSeleccionado.getAmoniaco());
				if(analisisAguaSeleccionado.getOtros4().equals("*")) {
					amoniaco2.setBackground(Color.YELLOW);
				} else {
					amoniaco2.setBackground(colorPorDefecto);
				}
				nitrato2.setText(analisisAguaSeleccionado.getNitrato());
				if(analisisAguaSeleccionado.getNitrato().equals("*")) {
					nitrato2.setBackground(Color.YELLOW);
				} else {
					nitrato2.setBackground(colorPorDefecto);
				}
				nitrogenoTotal2.setText(analisisAguaSeleccionado.getNitrogenoTotal());
				if(analisisAguaSeleccionado.getNitrogenoTotal().equals("*")) {
					nitrogenoTotal2.setBackground(Color.YELLOW);
				} else {
					nitrogenoTotal2.setBackground(colorPorDefecto);
				}
				fosforoTotal2.setText(analisisAguaSeleccionado.getFosforoTotal());
				if(analisisAguaSeleccionado.getFosforoTotal().equals("*")) {
					fosforoTotal2.setBackground(Color.YELLOW);
				} else {
					fosforoTotal2.setBackground(colorPorDefecto);
				}
				cromo2.setText(analisisAguaSeleccionado.getCromo());
				if(analisisAguaSeleccionado.getCromo().equals("*")) {
					cromo2.setBackground(Color.YELLOW);
				} else {
					cromo2.setBackground(colorPorDefecto);
				}
				plomo2.setText(analisisAguaSeleccionado.getPlomo());
				if(analisisAguaSeleccionado.getPlomo().equals("*")) {
					plomo2.setBackground(Color.YELLOW);
				} else {
					plomo2.setBackground(colorPorDefecto);
				}
				zinc2.setText(analisisAguaSeleccionado.getZinc());
				if(analisisAguaSeleccionado.getZinc().equals("*")) {
					zinc2.setBackground(Color.YELLOW);
				} else {
					zinc2.setBackground(colorPorDefecto);
				}
				aluminio2.setText(analisisAguaSeleccionado.getAluminio());
				if(analisisAguaSeleccionado.getAluminio().equals("*")) {
					aluminio2.setBackground(Color.YELLOW);
				} else {
					aluminio2.setBackground(colorPorDefecto);
				}
				manganeso2.setText(analisisAguaSeleccionado.getManganeso());
				if(analisisAguaSeleccionado.getManganeso().equals("*")) {
					manganeso2.setBackground(Color.YELLOW);
				} else {
					manganeso2.setBackground(colorPorDefecto);
				}
				potasio2.setText(analisisAguaSeleccionado.getPotasio());
				if(analisisAguaSeleccionado.getPotasio().equals("*")) {
					potasio2.setBackground(Color.YELLOW);
				} else {
					potasio2.setBackground(colorPorDefecto);
				}
				alcalinidadTotal2.setText(analisisAguaSeleccionado.getAlcalinidadTotal());
				if(analisisAguaSeleccionado.getAlcalinidadTotal().equals("*")) {
					alcalinidadTotal2.setBackground(Color.YELLOW);
				} else {
					alcalinidadTotal2.setBackground(colorPorDefecto);
				}
				acidezVolatil2.setText(analisisAguaSeleccionado.getAcidezVolatil());
				if(analisisAguaSeleccionado.getAcidezVolatil().equals("*")) {
					acidezVolatil2.setBackground(Color.YELLOW);
				} else {
					acidezVolatil2.setBackground(colorPorDefecto);
				}
				alfa2.setText(analisisAguaSeleccionado.getAlfa());
				if(analisisAguaSeleccionado.getAlfa().equals("*")) {
					alfa2.setBackground(Color.YELLOW);
				} else {
					alfa2.setBackground(colorPorDefecto);
				}
				alfaPrima2.setText(analisisAguaSeleccionado.getAlfaPrima());
				if(analisisAguaSeleccionado.getAlfaPrima().equals("*")) {
					alfaPrima2.setBackground(Color.YELLOW);
				} else {
					alfaPrima2.setBackground(colorPorDefecto);
				}				
				bicarbonato2.setText(analisisAguaSeleccionado.getBicarbonato());
				if(analisisAguaSeleccionado.getBicarbonato().equals("*")) {
					bicarbonato2.setBackground(Color.YELLOW);
				} else {
					bicarbonato2.setBackground(colorPorDefecto);
				}
				salinidad2.setText(analisisAguaSeleccionado.getSalinidad());
				if(analisisAguaSeleccionado.getSalinidad().equals("*")) {
					salinidad2.setBackground(Color.YELLOW);
				} else {
					salinidad2.setBackground(colorPorDefecto);
				}
				turbiedad2.setText(analisisAguaSeleccionado.getTurbiedad());
				if(analisisAguaSeleccionado.getTurbiedad().equals("*")) {
					turbiedad2.setBackground(Color.YELLOW);
				} else {
					turbiedad2.setBackground(colorPorDefecto);
				}
				conductividad2.setText(analisisAguaSeleccionado.getConductividad());
				if(analisisAguaSeleccionado.getConductividad().equals("*")) {
					conductividad2.setBackground(Color.YELLOW);
				} else {
					conductividad2.setBackground(colorPorDefecto);
				}
				sulfuro2.setText(analisisAguaSeleccionado.getSulfuro());
				if(analisisAguaSeleccionado.getSulfuro().equals("*")) {
					sulfuro2.setBackground(Color.YELLOW);
				} else {
					sulfuro2.setBackground(colorPorDefecto);
				}
				sulfato2.setText(analisisAguaSeleccionado.getSulfato());
				if(analisisAguaSeleccionado.getSulfato().equals("*")) {
					sulfato2.setBackground(Color.YELLOW);
				} else {
					sulfato2.setBackground(colorPorDefecto);
				}
				fenoles2.setText(analisisAguaSeleccionado.getFenoles());
				if(analisisAguaSeleccionado.getFenoles().equals("*")) {
					fenoles2.setBackground(Color.YELLOW);
				} else {
					fenoles2.setBackground(colorPorDefecto);
				}
				tensoactivos2.setText(analisisAguaSeleccionado.getTensoactivosAnionicos());
				if(analisisAguaSeleccionado.getTensoactivosAnionicos().equals("*")) {
					tensoactivos2.setBackground(Color.YELLOW);
				} else {
					tensoactivos2.setBackground(colorPorDefecto);
				}
				cloroResidual2.setText(analisisAguaSeleccionado.getCloroResidual());
				if(analisisAguaSeleccionado.getCloroResidual().equals("*")) {
					cloroResidual2.setBackground(Color.YELLOW);
				} else {
					cloroResidual2.setBackground(colorPorDefecto);
				}
				cloroTotal2.setText(analisisAguaSeleccionado.getCloroTotal());
				if(analisisAguaSeleccionado.getCloroTotal().equals("*")) {
					cloroTotal2.setBackground(Color.YELLOW);
				} else {
					cloroTotal2.setBackground(colorPorDefecto);
				}
				cloruro2.setText(analisisAguaSeleccionado.getCloruro());
				if(analisisAguaSeleccionado.getCloruro().equals("*")) {
					cloruro2.setBackground(Color.YELLOW);
				} else {
					cloruro2.setBackground(colorPorDefecto);
				}
				dureza2.setText(analisisAguaSeleccionado.getDureza());
				if(analisisAguaSeleccionado.getDureza().equals("*")) {
					dureza2.setBackground(Color.YELLOW);
				} else {
					dureza2.setBackground(colorPorDefecto);
				}
				color2.setText(analisisAguaSeleccionado.getColor());
				if(analisisAguaSeleccionado.getColor().equals("*")) {
					color2.setBackground(Color.YELLOW);
				} else {
					color2.setBackground(colorPorDefecto);
				}
				hidrocarburos2.setText(analisisAguaSeleccionado.getHidrocarburos());
				if(analisisAguaSeleccionado.getHidrocarburos().equals("*")) {
					hidrocarburos2.setBackground(Color.YELLOW);
				} else {
					hidrocarburos2.setBackground(colorPorDefecto);
				}
				coliformes2.setText(analisisAguaSeleccionado.getColiformesFecales());
				if(analisisAguaSeleccionado.getColiformesFecales().equals("*")) {
					coliformes2.setBackground(Color.YELLOW);
				} else {
					coliformes2.setBackground(colorPorDefecto);
				}
				cursoAguaTipo2.setText(analisisAguaSeleccionado.getCursoDeAguaTipo());
				if(analisisAguaSeleccionado.getCursoDeAguaTipo().equals("*")) {
					cursoAguaTipo2.setBackground(Color.YELLOW);
				} else {
					cursoAguaTipo2.setBackground(colorPorDefecto);
				}
				otros12.setText(analisisAguaSeleccionado.getOtros());
				if(analisisAguaSeleccionado.getOtros().equals("*")) {
					otros12.setBackground(Color.YELLOW);
				} else {
					otros12.setBackground(colorPorDefecto);
				}
				otros22.setText(analisisAguaSeleccionado.getOtros2());
				if(analisisAguaSeleccionado.getOtros().equals("*")) {
					otros22.setBackground(Color.YELLOW);
				} else {
					otros22.setBackground(colorPorDefecto);
				}
				otros32.setText(analisisAguaSeleccionado.getOtros3());
				if(analisisAguaSeleccionado.getOtros3().equals("*")) {
					otros32.setBackground(Color.YELLOW);
				} else {
					otros32.setBackground(colorPorDefecto);
				}
				otros42.setText(analisisAguaSeleccionado.getOtros4());
				if(analisisAguaSeleccionado.getOtros4().equals("*")) {
					otros42.setBackground(Color.YELLOW);
				} else {
					otros42.setBackground(colorPorDefecto);
				}
				
				
				
				
				
				
			}
		});
		
		lugarExtraccion2 = new JTextField();
		lugarExtraccion2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblLugarExtraccion.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblLugarExtraccion.setForeground(Color.BLACK);
				if (lugarExtraccion2.getText().equals("*")) {
					lugarExtraccion2.setBackground(Color.YELLOW);
				} else {
					lugarExtraccion2.setBackground(colorPorDefecto);
				}
			}
		});
		lugarExtraccion2.setBounds(370, 155, 130, 26);
		miPanel.add(lugarExtraccion2);
		lugarExtraccion2.setColumns(10);
		lugarExtraccion2.setHorizontalAlignment(JTextField.CENTER);
		
		extraidoPor2 = new JTextField();
		extraidoPor2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblExtraidoPor.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblExtraidoPor.setForeground(Color.BLACK);
				if (extraidoPor2.getText().equals("*")) {
					extraidoPor2.setBackground(Color.YELLOW);
				} else {
					extraidoPor2.setBackground(colorPorDefecto);
				}
			}
		});
		extraidoPor2.setBounds(370, 185, 130, 26);
		miPanel.add(extraidoPor2);
		extraidoPor2.setColumns(10);
		extraidoPor2.setHorizontalAlignment(JTextField.CENTER);
		
		fechaExtraccion2 = new JTextField();
		fechaExtraccion2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (fechaExtraccion2.getText().equals("*")) {
					fechaExtraccion2.setBackground(Color.YELLOW);
				} else {
					fechaExtraccion2.setBackground(colorPorDefecto);
				}
			}
		});
		fechaExtraccion2.setBounds(370, 215, 130, 26);
		miPanel.add(fechaExtraccion2); 
		fechaExtraccion2.setColumns(10);
		fechaExtraccion2.setHorizontalAlignment(JTextField.CENTER);
		fechaExtraccion2.setEditable(false);
		
		horaExtraccion2 = new JTextField();
		horaExtraccion2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblHoraExtraccion.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblHoraExtraccion.setForeground(Color.BLACK);
				if (horaExtraccion2.getText().equals("*")) {
					horaExtraccion2.setBackground(Color.YELLOW);
				} else {
					horaExtraccion2.setBackground(colorPorDefecto);
				}
			}
		});
		horaExtraccion2.setBounds(370, 245, 130, 26);
		miPanel.add(horaExtraccion2);
		horaExtraccion2.setColumns(10);
		horaExtraccion2.setHorizontalAlignment(JTextField.CENTER);
		
		aspecto2 = new JTextField();
		aspecto2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblAspecto.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblAspecto.setForeground(Color.BLACK);
				if (aspecto2.getText().equals("*")) {
					aspecto2.setBackground(Color.YELLOW);
				} else {
					aspecto2.setBackground(colorPorDefecto);
				}
			}
		});
		aspecto2.setBounds(370, 275, 130, 26);
		miPanel.add(aspecto2);
		aspecto2.setColumns(10);
		aspecto2.setHorizontalAlignment(JTextField.CENTER);		
		
		pHIS2 = new JTextField();
		pHIS2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblpHinSitu.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblpHinSitu.setForeground(Color.BLACK);
				if (pHIS2.getText().equals("*")) {
					pHIS2.setBackground(Color.YELLOW);
				} else {
					pHIS2.setBackground(colorPorDefecto);
				}
			}
		});
		pHIS2.setHorizontalAlignment(SwingConstants.CENTER);
		pHIS2.setColumns(10);
		pHIS2.setBounds(370, 307, 130, 26);
		miPanel.add(pHIS2);
		
		pH2 = new JTextField();
		pH2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblpH.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblpH.setForeground(Color.BLACK);
				if (pH2.getText().equals("*")) {
					pH2.setBackground(Color.YELLOW);
				} else {
					pH2.setBackground(colorPorDefecto);
				}
			}
		});
		pH2.setHorizontalAlignment(SwingConstants.CENTER);
		pH2.setColumns(10);
		pH2.setBounds(370, 337, 130, 26);
		miPanel.add(pH2);
		
		temperatura2 = new JTextField();
		temperatura2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblTemperatura.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblTemperatura.setForeground(Color.BLACK);
				if (temperatura2.getText().equals("*")) {
					temperatura2.setBackground(Color.YELLOW);
				} else {
					temperatura2.setBackground(colorPorDefecto);
				}
			}
		});
		temperatura2.setHorizontalAlignment(SwingConstants.CENTER);
		temperatura2.setColumns(10);
		temperatura2.setBounds(370, 367, 130, 26);
		miPanel.add(temperatura2);
		
		caudal2 = new JTextField();
		caudal2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblCaudal.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblCaudal.setForeground(Color.BLACK);
				if (caudal2.getText().equals("*")) {
					caudal2.setBackground(Color.YELLOW);
				} else {
					caudal2.setBackground(colorPorDefecto);
				}
			}
		});
		caudal2.setHorizontalAlignment(SwingConstants.CENTER);
		caudal2.setColumns(10);
		caudal2.setBounds(370, 397, 130, 26);
		miPanel.add(caudal2);
		
		ODIS2 = new JTextField();
		ODIS2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblODInSitu.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblODInSitu.setForeground(Color.BLACK);
				if (ODIS2.getText().equals("*")) {
					ODIS2.setBackground(Color.YELLOW);
				} else {
					ODIS2.setBackground(colorPorDefecto);
				}
			}
		});
		ODIS2.setHorizontalAlignment(SwingConstants.CENTER);
		ODIS2.setColumns(10);
		ODIS2.setBounds(370, 427, 130, 26);
		miPanel.add(ODIS2);
		
		OD2 = new JTextField();
		OD2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblOD.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblOD.setForeground(Color.BLACK);
				if (OD2.getText().equals("*")) {
					OD2.setBackground(Color.YELLOW);
				} else {
					OD2.setBackground(colorPorDefecto);
				}
			}
		});
		OD2.setHorizontalAlignment(SwingConstants.CENTER);
		OD2.setColumns(10);
		OD2.setBounds(370, 457, 130, 26);
		miPanel.add(OD2);
		
		DBO52 = new JTextField();
		DBO52.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblDBO5.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblDBO5.setForeground(Color.BLACK);
				if (DBO52.getText().equals("*")) {
					DBO52.setBackground(Color.YELLOW);
				} else {
					DBO52.setBackground(colorPorDefecto);
				}
			}
		});
		DBO52.setHorizontalAlignment(SwingConstants.CENTER);
		DBO52.setColumns(10);
		DBO52.setBounds(370, 487, 130, 26);
		miPanel.add(DBO52);
		
		DBO5F2 = new JTextField();
		DBO5F2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblDBO5F.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblDBO5F.setForeground(Color.BLACK);
				if (DBO5F2.getText().equals("*")) {
					DBO5F2.setBackground(Color.YELLOW);
				} else {
					DBO5F2.setBackground(colorPorDefecto);
				}
			}
		});
		DBO5F2.setHorizontalAlignment(SwingConstants.CENTER);
		DBO5F2.setColumns(10);
		DBO5F2.setBounds(370, 517, 130, 26);
		miPanel.add(DBO5F2);
		
		DQO2 = new JTextField();
		DQO2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblDQO.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblDQO.setForeground(Color.BLACK);
				if (DQO2.getText().equals("*")) {
					DQO2.setBackground(Color.YELLOW);
				} else {
					DQO2.setBackground(colorPorDefecto);
				}
			}
		});
		DQO2.setHorizontalAlignment(SwingConstants.CENTER);
		DQO2.setColumns(10);
		DQO2.setBounds(370, 547, 130, 26);
		miPanel.add(DQO2);
		
		AceitesYGrasas2 = new JTextField();
		AceitesYGrasas2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblAceitesYGrasas.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblAceitesYGrasas.setForeground(Color.BLACK);
				if (AceitesYGrasas2.getText().equals("*")) {
					AceitesYGrasas2.setBackground(Color.YELLOW);
				} else {
					AceitesYGrasas2.setBackground(colorPorDefecto);
				}
			}
		});
		AceitesYGrasas2.setHorizontalAlignment(SwingConstants.CENTER);
		AceitesYGrasas2.setColumns(10);
		AceitesYGrasas2.setBounds(370, 577, 130, 26);
		miPanel.add(AceitesYGrasas2);
		
		SolidosTotales2 = new JTextField();
		SolidosTotales2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblSolidosTotales.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblSolidosTotales.setForeground(Color.BLACK);
				if (SolidosTotales2.getText().equals("*")) {
					SolidosTotales2.setBackground(Color.YELLOW);
				} else {
					SolidosTotales2.setBackground(colorPorDefecto);
				}
			}
		});
		SolidosTotales2.setHorizontalAlignment(SwingConstants.CENTER);
		SolidosTotales2.setColumns(10);
		SolidosTotales2.setBounds(370, 607, 130, 26);
		miPanel.add(SolidosTotales2);
		
		STV2 = new JTextField();
		STV2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblSolidosTotalesVolatiles.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblSolidosTotalesVolatiles.setForeground(Color.BLACK);
				if (STV2.getText().equals("*")) {
					STV2.setBackground(Color.YELLOW);
				} else {
					STV2.setBackground(colorPorDefecto);
				}
			}
		});
		STV2.setHorizontalAlignment(SwingConstants.CENTER);
		STV2.setColumns(10);
		STV2.setBounds(370, 637, 130, 26);
		miPanel.add(STV2);
		
		SST2 = new JTextField();
		SST2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblSolidosSuspendidosTotales.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblSolidosSuspendidosTotales.setForeground(Color.BLACK);
				if (SST2.getText().equals("*")) {
					SST2.setBackground(Color.YELLOW);
				} else {
					SST2.setBackground(colorPorDefecto);
				}
			}
		});
		SST2.setHorizontalAlignment(SwingConstants.CENTER);
		SST2.setColumns(10);
		SST2.setBounds(370, 667, 130, 26);
		miPanel.add(SST2);
		
		SSV2 = new JTextField();
		SSV2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblSSV.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblSSV.setForeground(Color.BLACK);
				if (SSV2.getText().equals("*")) {
					SSV2.setBackground(Color.YELLOW);
				} else {
					SSV2.setBackground(colorPorDefecto);
				}
			}
		});
		SSV2.setHorizontalAlignment(SwingConstants.CENTER);
		SSV2.setColumns(10);
		SSV2.setBounds(370, 697, 130, 26);
		miPanel.add(SSV2);
		
		SS102 = new JTextField();
		SS102.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblSS10.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblSS10.setForeground(Color.BLACK);
				if (SS102.getText().equals("*")) {
					SS102.setBackground(Color.YELLOW);
				} else {
					SS102.setBackground(colorPorDefecto);
				}
			}
		});
		SS102.setHorizontalAlignment(SwingConstants.CENTER);
		SS102.setColumns(10);
		SS102.setBounds(370, 727, 130, 26);
		miPanel.add(SS102);
		
		SS302 = new JTextField();
		SS302.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblSS30.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblSS30.setForeground(Color.BLACK);
				if (SS302.getText().equals("*")) {
					SS302.setBackground(Color.YELLOW);
				} else {
					SS302.setBackground(colorPorDefecto);
				}
			}
		});
		SS302.setHorizontalAlignment(SwingConstants.CENTER);
		SS302.setColumns(10);
		SS302.setBounds(370, 757, 130, 26);
		miPanel.add(SS302);
		
		SS602 = new JTextField();
		SS602.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblSS60.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblSS60.setForeground(Color.BLACK);
				if (SS602.getText().equals("*")) {
					SS602.setBackground(Color.YELLOW);
				} else {
					SS602.setBackground(colorPorDefecto);
				}
			}
		});
		SS602.setHorizontalAlignment(SwingConstants.CENTER);
		SS602.setColumns(10);
		SS602.setBounds(370, 787, 130, 26);
		miPanel.add(SS602);	
		
		amoniaco2 = new JTextField();
		amoniaco2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblAmoniaco.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblAmoniaco.setForeground(Color.BLACK);
				if (amoniaco2.getText().equals("*")) {
					amoniaco2.setBackground(Color.YELLOW);
				} else {
					amoniaco2.setBackground(colorPorDefecto);
				}
			}
		});
		amoniaco2.setHorizontalAlignment(SwingConstants.CENTER);
		amoniaco2.setColumns(10);
		amoniaco2.setBounds(370, 817, 130, 26);
		miPanel.add(amoniaco2);
		
		nitrato2 = new JTextField();
		nitrato2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblNitrato.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblNitrato.setForeground(Color.BLACK);
				if (nitrato2.getText().equals("*")) {
					nitrato2.setBackground(Color.YELLOW);
				} else {
					nitrato2.setBackground(colorPorDefecto);
				}
			}
		});
		nitrato2.setHorizontalAlignment(SwingConstants.CENTER);
		nitrato2.setColumns(10);
		nitrato2.setBounds(370, 847, 130, 26);
		miPanel.add(nitrato2);
		
		nitrogenoTotal2 = new JTextField();
		nitrogenoTotal2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblNitrogenoTotal.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblNitrogenoTotal.setForeground(Color.BLACK);
				if (nitrogenoTotal2.getText().equals("*")) {
					nitrogenoTotal2.setBackground(Color.YELLOW);
				} else {
					nitrogenoTotal2.setBackground(colorPorDefecto);
				}
			}
		});
		nitrogenoTotal2.setHorizontalAlignment(SwingConstants.CENTER);
		nitrogenoTotal2.setColumns(10);
		nitrogenoTotal2.setBounds(370, 877, 130, 26);
		miPanel.add(nitrogenoTotal2);
		
		fosforoTotal2 = new JTextField();
		fosforoTotal2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblFosforoTotal.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblFosforoTotal.setForeground(Color.BLACK);
				if (fosforoTotal2.getText().equals("*")) {
					fosforoTotal2.setBackground(Color.YELLOW);
				} else {
					fosforoTotal2.setBackground(colorPorDefecto);
				}
			}
		});
		fosforoTotal2.setHorizontalAlignment(SwingConstants.CENTER);
		fosforoTotal2.setColumns(10);
		fosforoTotal2.setBounds(370, 907, 130, 26);
		miPanel.add(fosforoTotal2);
		
		cromo2 = new JTextField();
		cromo2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblCromo.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblCromo.setForeground(Color.BLACK);
				if (cromo2.getText().equals("*")) {
					cromo2.setBackground(Color.YELLOW);
				} else {
					cromo2.setBackground(colorPorDefecto);
				}
			}
		});
		cromo2.setHorizontalAlignment(SwingConstants.CENTER);
		cromo2.setColumns(10);
		cromo2.setBounds(370, 937, 130, 26);
		miPanel.add(cromo2);
		
		plomo2 = new JTextField();
		plomo2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblPlomo.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblPlomo.setForeground(Color.BLACK);
				if (plomo2.getText().equals("*")) {
					plomo2.setBackground(Color.YELLOW);
				} else {
					plomo2.setBackground(colorPorDefecto);
				}
			}
		});
		plomo2.setHorizontalAlignment(SwingConstants.CENTER);
		plomo2.setColumns(10);
		plomo2.setBounds(370, 967, 130, 26);
		miPanel.add(plomo2);
		
		zinc2 = new JTextField();
		zinc2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblZinc.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblZinc.setForeground(Color.BLACK);
				if (zinc2.getText().equals("*")) {
					zinc2.setBackground(Color.YELLOW);
				} else {
					zinc2.setBackground(colorPorDefecto);
				}
			}
		});
		zinc2.setHorizontalAlignment(SwingConstants.CENTER);
		zinc2.setColumns(10);
		zinc2.setBounds(370, 997, 130, 26);
		miPanel.add(zinc2);
		
		aluminio2 = new JTextField();
		aluminio2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblAluminio.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblAluminio.setForeground(Color.BLACK);
				if (aluminio2.getText().equals("*")) {
					aluminio2.setBackground(Color.YELLOW);
				} else {
					aluminio2.setBackground(colorPorDefecto);
				}
			}
		});
		aluminio2.setHorizontalAlignment(SwingConstants.CENTER);
		aluminio2.setColumns(10);
		aluminio2.setBounds(370, 1027, 130, 26);
		miPanel.add(aluminio2);
		
		manganeso2 = new JTextField();
		manganeso2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblManganeso.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblManganeso.setForeground(Color.BLACK);
				if (manganeso2.getText().equals("*")) {
					manganeso2.setBackground(Color.YELLOW);
				} else {
					manganeso2.setBackground(colorPorDefecto);
				}
			}
		});
		manganeso2.setHorizontalAlignment(SwingConstants.CENTER);
		manganeso2.setColumns(10);
		manganeso2.setBounds(370, 1057, 130, 26);
		miPanel.add(manganeso2);
		
		potasio2 = new JTextField();
		potasio2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblPotasio.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblPotasio.setForeground(Color.BLACK);
				if (potasio2.getText().equals("*")) {
					potasio2.setBackground(Color.YELLOW);
				} else {
					potasio2.setBackground(colorPorDefecto);
				}
			}
		});
		potasio2.setHorizontalAlignment(SwingConstants.CENTER);
		potasio2.setColumns(10);
		potasio2.setBounds(370, 1087, 130, 26);
		miPanel.add(potasio2);
		
		alcalinidadTotal2 = new JTextField();
		alcalinidadTotal2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblAlcalinidadTotal.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblAlcalinidadTotal.setForeground(Color.BLACK);
				if (alcalinidadTotal2.getText().equals("*")) {
					alcalinidadTotal2.setBackground(Color.YELLOW);
				} else {
					alcalinidadTotal2.setBackground(colorPorDefecto);
				}
			}
		});
		alcalinidadTotal2.setHorizontalAlignment(SwingConstants.CENTER);
		alcalinidadTotal2.setColumns(10);
		alcalinidadTotal2.setBounds(370, 1117, 130, 26);
		miPanel.add(alcalinidadTotal2);
		
		acidezVolatil2 = new JTextField();
		acidezVolatil2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblAcidezVolatil.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblAcidezVolatil.setForeground(Color.BLACK);
				if (acidezVolatil2.getText().equals("*")) {
					acidezVolatil2.setBackground(Color.YELLOW);
				} else {
					acidezVolatil2.setBackground(colorPorDefecto);
				}
			}
		});
		acidezVolatil2.setHorizontalAlignment(SwingConstants.CENTER);
		acidezVolatil2.setColumns(10);
		acidezVolatil2.setBounds(370, 1147, 130, 26);
		miPanel.add(acidezVolatil2);
		
		alfa2 = new JTextField();
		alfa2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblAlfa.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblAlfa.setForeground(Color.BLACK);
				if (alfa2.getText().equals("*")) {
					alfa2.setBackground(Color.YELLOW);
				} else {
					alfa2.setBackground(colorPorDefecto);
				}
			}
		});
		alfa2.setHorizontalAlignment(SwingConstants.CENTER);
		alfa2.setColumns(10);
		alfa2.setBounds(370, 1177, 130, 26);
		miPanel.add(alfa2);
		
		alfaPrima2 = new JTextField();
		alfaPrima2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblAlfaPrima.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblAlfaPrima.setForeground(Color.BLACK);
				if (alfaPrima2.getText().equals("*")) {
					alfaPrima2.setBackground(Color.YELLOW);
				} else {
					alfaPrima2.setBackground(colorPorDefecto);
				}
			}
		});
		alfaPrima2.setHorizontalAlignment(SwingConstants.CENTER);
		alfaPrima2.setColumns(10);
		alfaPrima2.setBounds(370, 1207, 130, 26);
		miPanel.add(alfaPrima2);
		
		bicarbonato2 = new JTextField();
		bicarbonato2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblBicarbonato.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblBicarbonato.setForeground(Color.BLACK);
				if (bicarbonato2.getText().equals("*")) {
					bicarbonato2.setBackground(Color.YELLOW);
				} else {
					bicarbonato2.setBackground(colorPorDefecto);
				}
			}
		});
		bicarbonato2.setHorizontalAlignment(SwingConstants.CENTER);
		bicarbonato2.setColumns(10);
		bicarbonato2.setBounds(370, 1237, 130, 26);
		miPanel.add(bicarbonato2);
		
		salinidad2 = new JTextField();
		salinidad2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblSalinidad.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblSalinidad.setForeground(Color.BLACK);
				if (salinidad2.getText().equals("*")) {
					salinidad2.setBackground(Color.YELLOW);
				} else {
					salinidad2.setBackground(colorPorDefecto);
				}
			}
		});
		salinidad2.setHorizontalAlignment(SwingConstants.CENTER);
		salinidad2.setColumns(10);
		salinidad2.setBounds(370, 1267, 130, 26);
		miPanel.add(salinidad2);
		
		turbiedad2 = new JTextField();
		turbiedad2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblTurbiedad.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblTurbiedad.setForeground(Color.BLACK);
				if (turbiedad2.getText().equals("*")) {
					turbiedad2.setBackground(Color.YELLOW);
				} else {
					turbiedad2.setBackground(colorPorDefecto);
				}
			}
		});
		turbiedad2.setHorizontalAlignment(SwingConstants.CENTER);
		turbiedad2.setColumns(10);
		turbiedad2.setBounds(370, 1297, 130, 26);
		miPanel.add(turbiedad2);
		
		conductividad2 = new JTextField();
		conductividad2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblConductividad.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblConductividad.setForeground(Color.BLACK);
				if (conductividad2.getText().equals("*")) {
					conductividad2.setBackground(Color.YELLOW);
				} else {
					conductividad2.setBackground(colorPorDefecto);
				}
			}
		});
		conductividad2.setHorizontalAlignment(SwingConstants.CENTER);
		conductividad2.setColumns(10);
		conductividad2.setBounds(370, 1327, 130, 26);
		miPanel.add(conductividad2);
		
		sulfuro2 = new JTextField();
		sulfuro2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblSulfuro.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblSulfuro.setForeground(Color.BLACK);
				if (sulfuro2.getText().equals("*")) {
					sulfuro2.setBackground(Color.YELLOW);
				} else {
					sulfuro2.setBackground(colorPorDefecto);
				}
			}
		});
		sulfuro2.setHorizontalAlignment(SwingConstants.CENTER);
		sulfuro2.setColumns(10);
		sulfuro2.setBounds(370, 1357, 130, 26);
		miPanel.add(sulfuro2);
		
		sulfato2 = new JTextField();
		sulfato2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblSulfato.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblSulfato.setForeground(Color.BLACK);
				if (sulfato2.getText().equals("*")) {
					sulfato2.setBackground(Color.YELLOW);
				} else {
					sulfato2.setBackground(colorPorDefecto);
				}
			}
		});
		sulfato2.setHorizontalAlignment(SwingConstants.CENTER);
		sulfato2.setColumns(10);
		sulfato2.setBounds(370, 1387, 130, 26);
		miPanel.add(sulfato2);
		
		fenoles2 = new JTextField();
		fenoles2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblFenoles.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblFenoles.setForeground(Color.BLACK);
				if (fenoles2.getText().equals("*")) {
					fenoles2.setBackground(Color.YELLOW);
				} else {
					fenoles2.setBackground(colorPorDefecto);
				}
			}
		});
		fenoles2.setHorizontalAlignment(SwingConstants.CENTER);
		fenoles2.setColumns(10);
		fenoles2.setBounds(370, 1417, 130, 26);
		miPanel.add(fenoles2);
		
		tensoactivos2 = new JTextField();
		tensoactivos2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblTensoactivosAnionicos.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblTensoactivosAnionicos.setForeground(Color.BLACK);
				if (tensoactivos2.getText().equals("*")) {
					tensoactivos2.setBackground(Color.YELLOW);
				} else {
					tensoactivos2.setBackground(colorPorDefecto);
				}
			}
		});
		tensoactivos2.setHorizontalAlignment(SwingConstants.CENTER);
		tensoactivos2.setColumns(10);
		tensoactivos2.setBounds(370, 1447, 130, 26);
		miPanel.add(tensoactivos2);
		
		cloroResidual2 = new JTextField();
		cloroResidual2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblCloroResidual.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblCloroResidual.setForeground(Color.BLACK);
				if (cloroResidual2.getText().equals("*")) {
					cloroResidual2.setBackground(Color.YELLOW);
				} else {
					cloroResidual2.setBackground(colorPorDefecto);
				}
			}
		});
		cloroResidual2.setHorizontalAlignment(SwingConstants.CENTER);
		cloroResidual2.setColumns(10);
		cloroResidual2.setBounds(370, 1477, 130, 26);
		miPanel.add(cloroResidual2);
		
		cloroTotal2 = new JTextField();
		cloroTotal2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblCloroTotal.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblCloroTotal.setForeground(Color.BLACK);
				if (cloroTotal2.getText().equals("*")) {
					cloroTotal2.setBackground(Color.YELLOW);
				} else {
					cloroTotal2.setBackground(colorPorDefecto);
				}
			}
		});
		cloroTotal2.setHorizontalAlignment(SwingConstants.CENTER);
		cloroTotal2.setColumns(10);
		cloroTotal2.setBounds(370, 1507, 130, 26);
		miPanel.add(cloroTotal2);
		
		cloruro2 = new JTextField();
		cloruro2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblCloruro.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblCloruro.setForeground(Color.BLACK);
				if (cloruro2.getText().equals("*")) {
					cloruro2.setBackground(Color.YELLOW);
				} else {
					cloruro2.setBackground(colorPorDefecto);
				}
			}
		});
		cloruro2.setHorizontalAlignment(SwingConstants.CENTER);
		cloruro2.setColumns(10);
		cloruro2.setBounds(370, 1537, 130, 26);
		miPanel.add(cloruro2);
		
		dureza2 = new JTextField();
		dureza2 = new JTextField();
		dureza2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblDureza.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblDureza.setForeground(Color.BLACK);
				if (dureza2.getText().equals("*")) {
					dureza2.setBackground(Color.YELLOW);
				} else {
					dureza2.setBackground(colorPorDefecto);
				}
			}
		});
		dureza2.setHorizontalAlignment(SwingConstants.CENTER);
		dureza2.setColumns(10);
		dureza2.setBounds(370, 1567, 130, 26);
		miPanel.add(dureza2);
		
		color2 = new JTextField();
		color2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblColor.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblColor.setForeground(Color.BLACK);
				if (color2.getText().equals("*")) {
					color2.setBackground(Color.YELLOW);
				} else {
					color2.setBackground(colorPorDefecto);
				}
			}
		});
		color2.setHorizontalAlignment(SwingConstants.CENTER);
		color2.setColumns(10);
		color2.setBounds(370, 1597, 130, 26);
		miPanel.add(color2);
		
		hidrocarburos2 = new JTextField();
		hidrocarburos2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblHidrocarburos.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblHidrocarburos.setForeground(Color.BLACK);
				if (hidrocarburos2.getText().equals("*")) {
					hidrocarburos2.setBackground(Color.YELLOW);
				} else {
					hidrocarburos2.setBackground(colorPorDefecto);
				}
			}
		});
		hidrocarburos2.setHorizontalAlignment(SwingConstants.CENTER);
		hidrocarburos2.setColumns(10);
		hidrocarburos2.setBounds(370, 1627, 130, 26);
		miPanel.add(hidrocarburos2);
		
		coliformes2 = new JTextField();
		coliformes2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblColiformes.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblColiformes.setForeground(Color.BLACK);
				if (coliformes2.getText().equals("*")) {
					coliformes2.setBackground(Color.YELLOW);
				} else {
					coliformes2.setBackground(colorPorDefecto);
				}
			}
		});
		coliformes2.setHorizontalAlignment(SwingConstants.CENTER);
		coliformes2.setColumns(10);
		coliformes2.setBounds(370, 1657, 130, 26);
		miPanel.add(coliformes2);
		
		cursoAguaTipo2 = new JTextField();
		cursoAguaTipo2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblCursoDeAgua.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblCursoDeAgua.setForeground(Color.BLACK);
				if (cursoAguaTipo2.getText().equals("*")) {
					cursoAguaTipo2.setBackground(Color.YELLOW);
				} else {
					cursoAguaTipo2.setBackground(colorPorDefecto);
				}
			}
		});
		cursoAguaTipo2.setHorizontalAlignment(SwingConstants.CENTER);
		cursoAguaTipo2.setColumns(10);
		cursoAguaTipo2.setBounds(370, 1687, 130, 26);
		miPanel.add(cursoAguaTipo2);
		
		otros12 = new JTextField();
		otros12.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblOtros.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblOtros.setForeground(Color.BLACK);
				if (otros12.getText().equals("*")) {
					otros12.setBackground(Color.YELLOW);
				} else {
					otros12.setBackground(colorPorDefecto);
				}
			}
		});
		otros12.setHorizontalAlignment(SwingConstants.CENTER);
		otros12.setColumns(10);
		otros12.setBounds(370, 1717, 130, 26);
		miPanel.add(otros12);
		
		otros22 = new JTextField();
		otros22.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblOtros2.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblOtros2.setForeground(Color.BLACK);
				if (otros22.getText().equals("*")) {
					otros22.setBackground(Color.YELLOW);
				} else {
					otros22.setBackground(colorPorDefecto);
				}
			}
		});
		otros22.setHorizontalAlignment(SwingConstants.CENTER);
		otros22.setColumns(10);
		otros22.setBounds(370, 1747, 130, 26);
		miPanel.add(otros22);
		
		otros32 = new JTextField();
		otros32.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblOtros3.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblOtros3.setForeground(Color.BLACK);
				if (otros32.getText().equals("*")) {
					otros32.setBackground(Color.YELLOW);
				} else {
					otros32.setBackground(colorPorDefecto);
				}
			}
		});
		otros32.setHorizontalAlignment(SwingConstants.CENTER);
		otros32.setColumns(10);
		otros32.setBounds(370, 1777, 130, 26);
		miPanel.add(otros32);
		
		otros42 = new JTextField();
		otros42.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblOtros4.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblOtros4.setForeground(Color.BLACK);
				if (otros42.getText().equals("*")) {
					otros42.setBackground(Color.YELLOW);
				} else {
					otros42.setBackground(colorPorDefecto);
				}
			}
		});
		otros42.setHorizontalAlignment(SwingConstants.CENTER);
		otros42.setColumns(10);
		otros42.setBounds(370, 1807, 130, 26);
		miPanel.add(otros42);
		
		nroAnalisis3.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent arg0){
				AnalisisAgua analisisAguaSeleccionado = aguasDAO.obtenerAnalisisAguaPorNumero(String.valueOf(nroAnalisis3.getSelectedItem()));	
				lugarExtraccion3.setText(analisisAguaSeleccionado.getLugarExtraccion());
				if(analisisAguaSeleccionado.getLugarExtraccion().equals("*")) {
					lugarExtraccion3.setBackground(Color.YELLOW);
				} else {
					lugarExtraccion3.setBackground(colorPorDefecto);
				}
				extraidoPor3.setText(analisisAguaSeleccionado.getExtraidoPor());
				if(analisisAguaSeleccionado.getExtraidoPor().equals("*")) {
					extraidoPor3.setBackground(Color.YELLOW);
				} else {
					extraidoPor3.setBackground(colorPorDefecto);
				}
				if(analisisAguaSeleccionado.getFechaExtraccion() == null) {
					fechaExtraccion3.setText("");
				} else {
					DateFormat df = new SimpleDateFormat("dd/MM/YYYY");
				    fechaExtraccion3.setText(df.format(analisisAguaSeleccionado.getFechaExtraccion()));
				}
				horaExtraccion3.setText(analisisAguaSeleccionado.getHoraExtraccion());
				if(analisisAguaSeleccionado.getHoraExtraccion().equals("*")) {
					horaExtraccion3.setBackground(Color.YELLOW);
				} else {
					horaExtraccion3.setBackground(colorPorDefecto);
				}
				if(analisisAguaSeleccionado.getAspecto().equals("*")) {
					aspecto3.setBackground(Color.YELLOW);
				} else {
					aspecto3.setBackground(colorPorDefecto);
				}
				aspecto3.setText(analisisAguaSeleccionado.getAspecto());
				if(analisisAguaSeleccionado.getpH().equals("*")) {
					pH3.setBackground(Color.YELLOW);
				} else {
					pH3.setBackground(colorPorDefecto);
				}
				pH3.setText(analisisAguaSeleccionado.getpH());				
				if(analisisAguaSeleccionado.getSolidosTotales().equals("*")) {
					SolidosTotales3.setBackground(Color.YELLOW);
				} else {
					SolidosTotales3.setBackground(colorPorDefecto);
				}
				SolidosTotales3.setText(analisisAguaSeleccionado.getSolidosTotales());
				if(analisisAguaSeleccionado.getpHInSitu().equals("*")) {
					pHIS3.setBackground(Color.YELLOW);
				} else {
					pHIS3.setBackground(colorPorDefecto);
				}
				pHIS3.setText(analisisAguaSeleccionado.getpHInSitu());
				if(analisisAguaSeleccionado.getTemperatura().equals("*")) {
					temperatura3.setBackground(Color.YELLOW);
				} else {
					temperatura3.setBackground(colorPorDefecto);
				}
				temperatura3.setText(analisisAguaSeleccionado.getTemperatura());
				if(analisisAguaSeleccionado.getCaudalInstantaneo().equals("*")) {
					caudal3.setBackground(Color.YELLOW);
				} else {
					caudal3.setBackground(colorPorDefecto);
				}
				caudal3.setText(analisisAguaSeleccionado.getCaudalInstantaneo());
				if(analisisAguaSeleccionado.getODInSitu().equals("*")) {
					ODIS3.setBackground(Color.YELLOW);
				} else {
					ODIS3.setBackground(colorPorDefecto);
				}
				ODIS3.setText(analisisAguaSeleccionado.getODInSitu());
				if(analisisAguaSeleccionado.getOD().equals("*")) {
					OD3.setBackground(Color.YELLOW);
				} else {
					OD3.setBackground(colorPorDefecto);
				}
				OD3.setText(analisisAguaSeleccionado.getOD());
				if(analisisAguaSeleccionado.getDBO5().equals("*")) {
					DBO53.setBackground(Color.YELLOW);
				} else {
					DBO53.setBackground(colorPorDefecto);
				}
				DBO53.setText(analisisAguaSeleccionado.getDBO5());
				if(analisisAguaSeleccionado.getDBO5Filtrada().equals("*")) {
					DBO5F3.setBackground(Color.YELLOW);
				} else {
					DBO5F3.setBackground(colorPorDefecto);
				}
				DBO5F3.setText(analisisAguaSeleccionado.getDBO5Filtrada());
				if(analisisAguaSeleccionado.getDQO().equals("*")) {
					DQO3.setBackground(Color.YELLOW);
				} else {
					DQO3.setBackground(colorPorDefecto);
				}
				DQO3.setText(analisisAguaSeleccionado.getDQO());
				if(analisisAguaSeleccionado.getAceitesYGrasas().equals("*")) {
					AceitesYGrasas3.setBackground(Color.YELLOW);
				} else {
					AceitesYGrasas3.setBackground(colorPorDefecto);
				}
				AceitesYGrasas3.setText(analisisAguaSeleccionado.getAceitesYGrasas());
				if(analisisAguaSeleccionado.getSolidosTotalesVolatiles().equals("*")) {
					STV3.setBackground(Color.YELLOW);
				} else {
					STV3.setBackground(colorPorDefecto);
				}
				STV3.setText(analisisAguaSeleccionado.getSolidosTotalesVolatiles());

				SST3.setText(analisisAguaSeleccionado.getSst());
				if(analisisAguaSeleccionado.getSst().equals("*")) {
					SST3.setBackground(Color.YELLOW);
				} else {
					SST3.setBackground(colorPorDefecto);
				}
				SSV3.setText(analisisAguaSeleccionado.getSsv());
				if(analisisAguaSeleccionado.getSsv().equals("*")) {
					SSV3.setBackground(Color.YELLOW);
				} else {
					SSV3.setBackground(colorPorDefecto);
				}
				SS103.setText(analisisAguaSeleccionado.getSs10());
				if(analisisAguaSeleccionado.getSs10().equals("*")) {
					SS103.setBackground(Color.YELLOW);
				} else {
					SS103.setBackground(colorPorDefecto);
				}
				SS303.setText(analisisAguaSeleccionado.getSs30());
				if(analisisAguaSeleccionado.getSs30().equals("*")) {
					SS303.setBackground(Color.YELLOW);
				} else {
					SS303.setBackground(colorPorDefecto);
				}
				SS603.setText(analisisAguaSeleccionado.getSs60());
				if(analisisAguaSeleccionado.getSs60().equals("*")) {
					SS603.setBackground(Color.YELLOW);
				} else {
					SS603.setBackground(colorPorDefecto);
				}
				amoniaco3.setText(analisisAguaSeleccionado.getAmoniaco());
				if(analisisAguaSeleccionado.getOtros4().equals("*")) {
					amoniaco3.setBackground(Color.YELLOW);
				} else {
					amoniaco3.setBackground(colorPorDefecto);
				}
				nitrato3.setText(analisisAguaSeleccionado.getNitrato());
				if(analisisAguaSeleccionado.getNitrato().equals("*")) {
					nitrato3.setBackground(Color.YELLOW);
				} else {
					nitrato3.setBackground(colorPorDefecto);
				}
				nitrogenoTotal3.setText(analisisAguaSeleccionado.getNitrogenoTotal());
				if(analisisAguaSeleccionado.getNitrogenoTotal().equals("*")) {
					nitrogenoTotal3.setBackground(Color.YELLOW);
				} else {
					nitrogenoTotal3.setBackground(colorPorDefecto);
				}
				fosforoTotal3.setText(analisisAguaSeleccionado.getFosforoTotal());
				if(analisisAguaSeleccionado.getFosforoTotal().equals("*")) {
					fosforoTotal3.setBackground(Color.YELLOW);
				} else {
					fosforoTotal3.setBackground(colorPorDefecto);
				}
				cromo3.setText(analisisAguaSeleccionado.getCromo());
				if(analisisAguaSeleccionado.getCromo().equals("*")) {
					cromo3.setBackground(Color.YELLOW);
				} else {
					cromo3.setBackground(colorPorDefecto);
				}
				plomo3.setText(analisisAguaSeleccionado.getPlomo());
				if(analisisAguaSeleccionado.getPlomo().equals("*")) {
					plomo3.setBackground(Color.YELLOW);
				} else {
					plomo3.setBackground(colorPorDefecto);
				}
				zinc3.setText(analisisAguaSeleccionado.getZinc());
				if(analisisAguaSeleccionado.getZinc().equals("*")) {
					zinc3.setBackground(Color.YELLOW);
				} else {
					zinc3.setBackground(colorPorDefecto);
				}
				aluminio3.setText(analisisAguaSeleccionado.getAluminio());
				if(analisisAguaSeleccionado.getAluminio().equals("*")) {
					aluminio3.setBackground(Color.YELLOW);
				} else {
					aluminio3.setBackground(colorPorDefecto);
				}
				manganeso3.setText(analisisAguaSeleccionado.getManganeso());
				if(analisisAguaSeleccionado.getManganeso().equals("*")) {
					manganeso3.setBackground(Color.YELLOW);
				} else {
					manganeso3.setBackground(colorPorDefecto);
				}
				potasio3.setText(analisisAguaSeleccionado.getPotasio());
				if(analisisAguaSeleccionado.getPotasio().equals("*")) {
					potasio3.setBackground(Color.YELLOW);
				} else {
					potasio3.setBackground(colorPorDefecto);
				}
				alcalinidadTotal3.setText(analisisAguaSeleccionado.getAlcalinidadTotal());
				if(analisisAguaSeleccionado.getAlcalinidadTotal().equals("*")) {
					alcalinidadTotal3.setBackground(Color.YELLOW);
				} else {
					alcalinidadTotal3.setBackground(colorPorDefecto);
				}
				acidezVolatil3.setText(analisisAguaSeleccionado.getAcidezVolatil());
				if(analisisAguaSeleccionado.getAcidezVolatil().equals("*")) {
					acidezVolatil3.setBackground(Color.YELLOW);
				} else {
					acidezVolatil3.setBackground(colorPorDefecto);
				}
				alfa3.setText(analisisAguaSeleccionado.getAlfa());
				if(analisisAguaSeleccionado.getAlfa().equals("*")) {
					alfa3.setBackground(Color.YELLOW);
				} else {
					alfa3.setBackground(colorPorDefecto);
				}
				alfaPrima3.setText(analisisAguaSeleccionado.getAlfaPrima());
				if(analisisAguaSeleccionado.getAlfaPrima().equals("*")) {
					alfaPrima3.setBackground(Color.YELLOW);
				} else {
					alfaPrima3.setBackground(colorPorDefecto);
				}				
				bicarbonato3.setText(analisisAguaSeleccionado.getBicarbonato());
				if(analisisAguaSeleccionado.getBicarbonato().equals("*")) {
					bicarbonato3.setBackground(Color.YELLOW);
				} else {
					bicarbonato3.setBackground(colorPorDefecto);
				}
				salinidad3.setText(analisisAguaSeleccionado.getSalinidad());
				if(analisisAguaSeleccionado.getSalinidad().equals("*")) {
					salinidad3.setBackground(Color.YELLOW);
				} else {
					salinidad3.setBackground(colorPorDefecto);
				}
				turbiedad3.setText(analisisAguaSeleccionado.getTurbiedad());
				if(analisisAguaSeleccionado.getTurbiedad().equals("*")) {
					turbiedad3.setBackground(Color.YELLOW);
				} else {
					turbiedad3.setBackground(colorPorDefecto);
				}
				conductividad3.setText(analisisAguaSeleccionado.getConductividad());
				if(analisisAguaSeleccionado.getConductividad().equals("*")) {
					conductividad3.setBackground(Color.YELLOW);
				} else {
					conductividad3.setBackground(colorPorDefecto);
				}
				sulfuro3.setText(analisisAguaSeleccionado.getSulfuro());
				if(analisisAguaSeleccionado.getSulfuro().equals("*")) {
					sulfuro3.setBackground(Color.YELLOW);
				} else {
					sulfuro3.setBackground(colorPorDefecto);
				}
				sulfato3.setText(analisisAguaSeleccionado.getSulfato());
				if(analisisAguaSeleccionado.getSulfato().equals("*")) {
					sulfato3.setBackground(Color.YELLOW);
				} else {
					sulfato3.setBackground(colorPorDefecto);
				}
				fenoles3.setText(analisisAguaSeleccionado.getFenoles());
				if(analisisAguaSeleccionado.getFenoles().equals("*")) {
					fenoles3.setBackground(Color.YELLOW);
				} else {
					fenoles3.setBackground(colorPorDefecto);
				}
				tensoactivos3.setText(analisisAguaSeleccionado.getTensoactivosAnionicos());
				if(analisisAguaSeleccionado.getTensoactivosAnionicos().equals("*")) {
					tensoactivos3.setBackground(Color.YELLOW);
				} else {
					tensoactivos3.setBackground(colorPorDefecto);
				}
				cloroResidual3.setText(analisisAguaSeleccionado.getCloroResidual());
				if(analisisAguaSeleccionado.getCloroResidual().equals("*")) {
					cloroResidual3.setBackground(Color.YELLOW);
				} else {
					cloroResidual3.setBackground(colorPorDefecto);
				}
				cloroTotal3.setText(analisisAguaSeleccionado.getCloroTotal());
				if(analisisAguaSeleccionado.getCloroTotal().equals("*")) {
					cloroTotal3.setBackground(Color.YELLOW);
				} else {
					cloroTotal3.setBackground(colorPorDefecto);
				}
				cloruro3.setText(analisisAguaSeleccionado.getCloruro());
				if(analisisAguaSeleccionado.getCloruro().equals("*")) {
					cloruro3.setBackground(Color.YELLOW);
				} else {
					cloruro3.setBackground(colorPorDefecto);
				}
				dureza3.setText(analisisAguaSeleccionado.getDureza());
				if(analisisAguaSeleccionado.getDureza().equals("*")) {
					dureza3.setBackground(Color.YELLOW);
				} else {
					dureza3.setBackground(colorPorDefecto);
				}
				color3.setText(analisisAguaSeleccionado.getColor());
				if(analisisAguaSeleccionado.getColor().equals("*")) {
					color3.setBackground(Color.YELLOW);
				} else {
					color3.setBackground(colorPorDefecto);
				}
				hidrocarburos3.setText(analisisAguaSeleccionado.getHidrocarburos());
				if(analisisAguaSeleccionado.getHidrocarburos().equals("*")) {
					hidrocarburos3.setBackground(Color.YELLOW);
				} else {
					hidrocarburos3.setBackground(colorPorDefecto);
				}
				coliformes3.setText(analisisAguaSeleccionado.getColiformesFecales());
				if(analisisAguaSeleccionado.getColiformesFecales().equals("*")) {
					coliformes3.setBackground(Color.YELLOW);
				} else {
					coliformes3.setBackground(colorPorDefecto);
				}
				cursoAguaTipo3.setText(analisisAguaSeleccionado.getCursoDeAguaTipo());
				if(analisisAguaSeleccionado.getCursoDeAguaTipo().equals("*")) {
					cursoAguaTipo3.setBackground(Color.YELLOW);
				} else {
					cursoAguaTipo3.setBackground(colorPorDefecto);
				}
				otros13.setText(analisisAguaSeleccionado.getOtros());
				if(analisisAguaSeleccionado.getOtros().equals("*")) {
					otros13.setBackground(Color.YELLOW);
				} else {
					otros13.setBackground(colorPorDefecto);
				}
				otros23.setText(analisisAguaSeleccionado.getOtros2());
				if(analisisAguaSeleccionado.getOtros().equals("*")) {
					otros23.setBackground(Color.YELLOW);
				} else {
					otros23.setBackground(colorPorDefecto);
				}
				otros33.setText(analisisAguaSeleccionado.getOtros3());
				if(analisisAguaSeleccionado.getOtros3().equals("*")) {
					otros33.setBackground(Color.YELLOW);
				} else {
					otros33.setBackground(colorPorDefecto);
				}
				otros43.setText(analisisAguaSeleccionado.getOtros4());
				if(analisisAguaSeleccionado.getOtros4().equals("*")) {
					otros43.setBackground(Color.YELLOW);
				} else {
					otros43.setBackground(colorPorDefecto);
				}
						
				
				
				
				
			}
		});
		
		lugarExtraccion3 = new JTextField();
		lugarExtraccion3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblLugarExtraccion.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblLugarExtraccion.setForeground(Color.BLACK);
				if (lugarExtraccion3.getText().equals("*")) {
					lugarExtraccion3.setBackground(Color.YELLOW);
				} else {
					lugarExtraccion3.setBackground(colorPorDefecto);
				}
			}
		});
		lugarExtraccion3.setBounds(550, 155, 130, 26);
		miPanel.add(lugarExtraccion3);
		lugarExtraccion3.setColumns(10);
		lugarExtraccion3.setHorizontalAlignment(JTextField.CENTER);
		
		extraidoPor3 = new JTextField();
		extraidoPor3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblExtraidoPor.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblExtraidoPor.setForeground(Color.BLACK);
				if (extraidoPor3.getText().equals("*")) {
					extraidoPor3.setBackground(Color.YELLOW);
				} else {
					extraidoPor3.setBackground(colorPorDefecto);
				}
			}
		});
		extraidoPor3.setBounds(550, 185, 130, 26);
		miPanel.add(extraidoPor3);
		extraidoPor3.setColumns(10);
		extraidoPor3.setHorizontalAlignment(JTextField.CENTER);
		
		fechaExtraccion3 = new JTextField();
		fechaExtraccion3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (fechaExtraccion3.getText().equals("*")) {
					fechaExtraccion3.setBackground(Color.YELLOW);
				} else {
					fechaExtraccion3.setBackground(colorPorDefecto);
				}
			}
		});
		fechaExtraccion3.setBounds(550, 215, 130, 26);
		miPanel.add(fechaExtraccion3); 
		fechaExtraccion3.setColumns(10);
		fechaExtraccion3.setHorizontalAlignment(JTextField.CENTER);
		fechaExtraccion3.setEditable(false);
		
		horaExtraccion3 = new JTextField();
		horaExtraccion3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblHoraExtraccion.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblHoraExtraccion.setForeground(Color.BLACK);
				if (horaExtraccion3.getText().equals("*")) {
					horaExtraccion3.setBackground(Color.YELLOW);
				} else {
					horaExtraccion3.setBackground(colorPorDefecto);
				}
			}
		});
		horaExtraccion3.setBounds(550, 245, 130, 26);
		miPanel.add(horaExtraccion3);
		horaExtraccion3.setColumns(10);
		horaExtraccion3.setHorizontalAlignment(JTextField.CENTER);
		
		aspecto3 = new JTextField();
		aspecto3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblAspecto.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblAspecto.setForeground(Color.BLACK);
				if (aspecto3.getText().equals("*")) {
					aspecto3.setBackground(Color.YELLOW);
				} else {
					aspecto3.setBackground(colorPorDefecto);
				}
			}
		});
		aspecto3.setBounds(550, 275, 130, 26);
		miPanel.add(aspecto3);
		aspecto3.setColumns(10);
		aspecto3.setHorizontalAlignment(JTextField.CENTER);		
		
		pHIS3 = new JTextField();
		pHIS3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblpHinSitu.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblpHinSitu.setForeground(Color.BLACK);
				if (pHIS3.getText().equals("*")) {
					pHIS3.setBackground(Color.YELLOW);
				} else {
					pHIS3.setBackground(colorPorDefecto);
				}
			}
		});
		pHIS3.setHorizontalAlignment(SwingConstants.CENTER);
		pHIS3.setColumns(10);
		pHIS3.setBounds(550, 307, 130, 26);
		miPanel.add(pHIS3);
		
		pH3 = new JTextField();
		pH3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblpH.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblpH.setForeground(Color.BLACK);
				if (pH3.getText().equals("*")) {
					pH3.setBackground(Color.YELLOW);
				} else {
					pH3.setBackground(colorPorDefecto);
				}
			}
		});
		pH3.setHorizontalAlignment(SwingConstants.CENTER);
		pH3.setColumns(10);
		pH3.setBounds(550, 337, 130, 26);
		miPanel.add(pH3);
		
		temperatura3 = new JTextField();
		temperatura3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblTemperatura.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblTemperatura.setForeground(Color.BLACK);
				if (temperatura3.getText().equals("*")) {
					temperatura3.setBackground(Color.YELLOW);
				} else {
					temperatura3.setBackground(colorPorDefecto);
				}
			}
		});
		temperatura3.setHorizontalAlignment(SwingConstants.CENTER);
		temperatura3.setColumns(10);
		temperatura3.setBounds(550, 367, 130, 26);
		miPanel.add(temperatura3);
		
		caudal3 = new JTextField();
		caudal3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblCaudal.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblCaudal.setForeground(Color.BLACK);
				if (caudal3.getText().equals("*")) {
					caudal3.setBackground(Color.YELLOW);
				} else {
					caudal3.setBackground(colorPorDefecto);
				}
			}
		});
		caudal3.setHorizontalAlignment(SwingConstants.CENTER);
		caudal3.setColumns(10);
		caudal3.setBounds(550, 397, 130, 26);
		miPanel.add(caudal3);
		
		ODIS3 = new JTextField();
		ODIS3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblODInSitu.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblODInSitu.setForeground(Color.BLACK);
				if (ODIS3.getText().equals("*")) {
					ODIS3.setBackground(Color.YELLOW);
				} else {
					ODIS3.setBackground(colorPorDefecto);
				}
			}
		});
		ODIS3.setHorizontalAlignment(SwingConstants.CENTER);
		ODIS3.setColumns(10);
		ODIS3.setBounds(550, 427, 130, 26);
		miPanel.add(ODIS3);
		
		OD3 = new JTextField();
		OD3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblOD.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblOD.setForeground(Color.BLACK);
				if (OD3.getText().equals("*")) {
					OD3.setBackground(Color.YELLOW);
				} else {
					OD3.setBackground(colorPorDefecto);
				}
			}
		});
		OD3.setHorizontalAlignment(SwingConstants.CENTER);
		OD3.setColumns(10);
		OD3.setBounds(550, 457, 130, 26);
		miPanel.add(OD3);
		
		DBO53 = new JTextField();
		DBO53.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblDBO5.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblDBO5.setForeground(Color.BLACK);
				if (DBO53.getText().equals("*")) {
					DBO53.setBackground(Color.YELLOW);
				} else {
					DBO53.setBackground(colorPorDefecto);
				}
			}
		});
		DBO53.setHorizontalAlignment(SwingConstants.CENTER);
		DBO53.setColumns(10);
		DBO53.setBounds(550, 487, 130, 26);
		miPanel.add(DBO53);
		
		DBO5F3 = new JTextField();
		DBO5F3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblDBO5F.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblDBO5F.setForeground(Color.BLACK);
				if (DBO5F3.getText().equals("*")) {
					DBO5F3.setBackground(Color.YELLOW);
				} else {
					DBO5F3.setBackground(colorPorDefecto);
				}
			}
		});
		DBO5F3.setHorizontalAlignment(SwingConstants.CENTER);
		DBO5F3.setColumns(10);
		DBO5F3.setBounds(550, 517, 130, 26);
		miPanel.add(DBO5F3);
		
		DQO3 = new JTextField();
		DQO3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblDQO.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblDQO.setForeground(Color.BLACK);
				if (DQO3.getText().equals("*")) {
					DQO3.setBackground(Color.YELLOW);
				} else {
					DQO3.setBackground(colorPorDefecto);
				}
			}
		});
		DQO3.setHorizontalAlignment(SwingConstants.CENTER);
		DQO3.setColumns(10);
		DQO3.setBounds(550, 547, 130, 26);
		miPanel.add(DQO3);
		
		AceitesYGrasas3 = new JTextField();
		AceitesYGrasas3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblAceitesYGrasas.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblAceitesYGrasas.setForeground(Color.BLACK);
				if (AceitesYGrasas3.getText().equals("*")) {
					AceitesYGrasas3.setBackground(Color.YELLOW);
				} else {
					AceitesYGrasas3.setBackground(colorPorDefecto);
				}
			}
		});
		AceitesYGrasas3.setHorizontalAlignment(SwingConstants.CENTER);
		AceitesYGrasas3.setColumns(10);
		AceitesYGrasas3.setBounds(550, 577, 130, 26);
		miPanel.add(AceitesYGrasas3);
		
		SolidosTotales3 = new JTextField();
		SolidosTotales3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblSolidosTotales.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblSolidosTotales.setForeground(Color.BLACK);
				if (SolidosTotales3.getText().equals("*")) {
					SolidosTotales3.setBackground(Color.YELLOW);
				} else {
					SolidosTotales3.setBackground(colorPorDefecto);
				}
			}
		});
		SolidosTotales3.setHorizontalAlignment(SwingConstants.CENTER);
		SolidosTotales3.setColumns(10);
		SolidosTotales3.setBounds(550, 607, 130, 26);
		miPanel.add(SolidosTotales3);
		
		STV3 = new JTextField();
		STV3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblSolidosTotalesVolatiles.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblSolidosTotalesVolatiles.setForeground(Color.BLACK);
				if (STV3.getText().equals("*")) {
					STV3.setBackground(Color.YELLOW);
				} else {
					STV3.setBackground(colorPorDefecto);
				}
			}
		});
		STV3.setHorizontalAlignment(SwingConstants.CENTER);
		STV3.setColumns(10);
		STV3.setBounds(550, 637, 130, 26);
		miPanel.add(STV3);
		
		SST3 = new JTextField();
		SST3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblSolidosSuspendidosTotales.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblSolidosSuspendidosTotales.setForeground(Color.BLACK);
				if (SST3.getText().equals("*")) {
					SST3.setBackground(Color.YELLOW);
				} else {
					SST3.setBackground(colorPorDefecto);
				}
			}
		});
		SST3.setHorizontalAlignment(SwingConstants.CENTER);
		SST3.setColumns(10);
		SST3.setBounds(550, 667, 130, 26);
		miPanel.add(SST3);
		
		SSV3 = new JTextField();
		SSV3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblSSV.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblSSV.setForeground(Color.BLACK);
				if (SSV3.getText().equals("*")) {
					SSV3.setBackground(Color.YELLOW);
				} else {
					SSV3.setBackground(colorPorDefecto);
				}
			}
		});
		SSV3.setHorizontalAlignment(SwingConstants.CENTER);
		SSV3.setColumns(10);
		SSV3.setBounds(550, 697, 130, 26);
		miPanel.add(SSV3);
		
		SS103 = new JTextField();
		SS103.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblSS10.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblSS10.setForeground(Color.BLACK);
				if (SS103.getText().equals("*")) {
					SS103.setBackground(Color.YELLOW);
				} else {
					SS103.setBackground(colorPorDefecto);
				}
			}
		});
		SS103.setHorizontalAlignment(SwingConstants.CENTER);
		SS103.setColumns(10);
		SS103.setBounds(550, 727, 130, 26);
		miPanel.add(SS103);
		
		SS303 = new JTextField();
		SS303.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblSS30.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblSS30.setForeground(Color.BLACK);
				if (SS303.getText().equals("*")) {
					SS303.setBackground(Color.YELLOW);
				} else {
					SS303.setBackground(colorPorDefecto);
				}
			}
		});
		SS303.setHorizontalAlignment(SwingConstants.CENTER);
		SS303.setColumns(10);
		SS303.setBounds(550, 757, 130, 26);
		miPanel.add(SS303);
		
		SS603 = new JTextField();
		SS603.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblSS60.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblSS60.setForeground(Color.BLACK);
				if (SS603.getText().equals("*")) {
					SS603.setBackground(Color.YELLOW);
				} else {
					SS603.setBackground(colorPorDefecto);
				}
			}
		});
		SS603.setHorizontalAlignment(SwingConstants.CENTER);
		SS603.setColumns(10);
		SS603.setBounds(550, 787, 130, 26);
		miPanel.add(SS603);	
		
		amoniaco3 = new JTextField();
		amoniaco3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblAmoniaco.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblAmoniaco.setForeground(Color.BLACK);
				if (amoniaco3.getText().equals("*")) {
					amoniaco3.setBackground(Color.YELLOW);
				} else {
					amoniaco3.setBackground(colorPorDefecto);
				}
			}
		});
		amoniaco3.setHorizontalAlignment(SwingConstants.CENTER);
		amoniaco3.setColumns(10);
		amoniaco3.setBounds(550, 817, 130, 26);
		miPanel.add(amoniaco3);
		
		nitrato3 = new JTextField();
		nitrato3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblNitrato.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblNitrato.setForeground(Color.BLACK);
				if (nitrato3.getText().equals("*")) {
					nitrato3.setBackground(Color.YELLOW);
				} else {
					nitrato3.setBackground(colorPorDefecto);
				}
			}
		});
		nitrato3.setHorizontalAlignment(SwingConstants.CENTER);
		nitrato3.setColumns(10);
		nitrato3.setBounds(550, 847, 130, 26);
		miPanel.add(nitrato3);
		
		nitrogenoTotal3 = new JTextField();
		nitrogenoTotal3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblNitrogenoTotal.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblNitrogenoTotal.setForeground(Color.BLACK);
				if (nitrogenoTotal3.getText().equals("*")) {
					nitrogenoTotal3.setBackground(Color.YELLOW);
				} else {
					nitrogenoTotal3.setBackground(colorPorDefecto);
				}
			}
		});
		nitrogenoTotal3.setHorizontalAlignment(SwingConstants.CENTER);
		nitrogenoTotal3.setColumns(10);
		nitrogenoTotal3.setBounds(550, 877, 130, 26);
		miPanel.add(nitrogenoTotal3);
		
		fosforoTotal3 = new JTextField();
		fosforoTotal3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblFosforoTotal.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblFosforoTotal.setForeground(Color.BLACK);
				if (fosforoTotal3.getText().equals("*")) {
					fosforoTotal3.setBackground(Color.YELLOW);
				} else {
					fosforoTotal3.setBackground(colorPorDefecto);
				}
			}
		});
		fosforoTotal3.setHorizontalAlignment(SwingConstants.CENTER);
		fosforoTotal3.setColumns(10);
		fosforoTotal3.setBounds(550, 907, 130, 26);
		miPanel.add(fosforoTotal3);
		
		cromo3 = new JTextField();
		cromo3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblCromo.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblCromo.setForeground(Color.BLACK);
				if (cromo3.getText().equals("*")) {
					cromo3.setBackground(Color.YELLOW);
				} else {
					cromo3.setBackground(colorPorDefecto);
				}
			}
		});
		cromo3.setHorizontalAlignment(SwingConstants.CENTER);
		cromo3.setColumns(10);
		cromo3.setBounds(550, 937, 130, 26);
		miPanel.add(cromo3);
		
		plomo3 = new JTextField();
		plomo3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblPlomo.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblPlomo.setForeground(Color.BLACK);
				if (plomo3.getText().equals("*")) {
					plomo3.setBackground(Color.YELLOW);
				} else {
					plomo3.setBackground(colorPorDefecto);
				}
			}
		});
		plomo3.setHorizontalAlignment(SwingConstants.CENTER);
		plomo3.setColumns(10);
		plomo3.setBounds(550, 967, 130, 26);
		miPanel.add(plomo3);
		
		zinc3 = new JTextField();
		zinc3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblZinc.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblZinc.setForeground(Color.BLACK);
				if (zinc3.getText().equals("*")) {
					zinc3.setBackground(Color.YELLOW);
				} else {
					zinc3.setBackground(colorPorDefecto);
				}
			}
		});
		zinc3.setHorizontalAlignment(SwingConstants.CENTER);
		zinc3.setColumns(10);
		zinc3.setBounds(550, 997, 130, 26);
		miPanel.add(zinc3);
		
		aluminio3 = new JTextField();
		aluminio3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblAluminio.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblAluminio.setForeground(Color.BLACK);
				if (aluminio3.getText().equals("*")) {
					aluminio3.setBackground(Color.YELLOW);
				} else {
					aluminio3.setBackground(colorPorDefecto);
				}
			}
		});
		aluminio3.setHorizontalAlignment(SwingConstants.CENTER);
		aluminio3.setColumns(10);
		aluminio3.setBounds(550, 1027, 130, 26);
		miPanel.add(aluminio3);
		
		manganeso3 = new JTextField();
		manganeso3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblManganeso.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblManganeso.setForeground(Color.BLACK);
				if (manganeso3.getText().equals("*")) {
					manganeso3.setBackground(Color.YELLOW);
				} else {
					manganeso3.setBackground(colorPorDefecto);
				}
			}
		});
		manganeso3.setHorizontalAlignment(SwingConstants.CENTER);
		manganeso3.setColumns(10);
		manganeso3.setBounds(550, 1057, 130, 26);
		miPanel.add(manganeso3);
		
		potasio3 = new JTextField();
		potasio3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblPotasio.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblPotasio.setForeground(Color.BLACK);
				if (potasio3.getText().equals("*")) {
					potasio3.setBackground(Color.YELLOW);
				} else {
					potasio3.setBackground(colorPorDefecto);
				}
			}
		});
		potasio3.setHorizontalAlignment(SwingConstants.CENTER);
		potasio3.setColumns(10);
		potasio3.setBounds(550, 1087, 130, 26);
		miPanel.add(potasio3);
		
		alcalinidadTotal3 = new JTextField();
		alcalinidadTotal3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblAlcalinidadTotal.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblAlcalinidadTotal.setForeground(Color.BLACK);
				if (alcalinidadTotal3.getText().equals("*")) {
					alcalinidadTotal3.setBackground(Color.YELLOW);
				} else {
					alcalinidadTotal3.setBackground(colorPorDefecto);
				}
			}
		});
		alcalinidadTotal3.setHorizontalAlignment(SwingConstants.CENTER);
		alcalinidadTotal3.setColumns(10);
		alcalinidadTotal3.setBounds(550, 1117, 130, 26);
		miPanel.add(alcalinidadTotal3);
		
		acidezVolatil3 = new JTextField();
		acidezVolatil3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblAcidezVolatil.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblAcidezVolatil.setForeground(Color.BLACK);
				if (acidezVolatil3.getText().equals("*")) {
					acidezVolatil3.setBackground(Color.YELLOW);
				} else {
					acidezVolatil3.setBackground(colorPorDefecto);
				}
			}
		});
		acidezVolatil3.setHorizontalAlignment(SwingConstants.CENTER);
		acidezVolatil3.setColumns(10);
		acidezVolatil3.setBounds(550, 1147, 130, 26);
		miPanel.add(acidezVolatil3);
		
		alfa3 = new JTextField();
		alfa3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblAlfa.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblAlfa.setForeground(Color.BLACK);
				if (alfa3.getText().equals("*")) {
					alfa3.setBackground(Color.YELLOW);
				} else {
					alfa3.setBackground(colorPorDefecto);
				}
			}
		});
		alfa3.setHorizontalAlignment(SwingConstants.CENTER);
		alfa3.setColumns(10);
		alfa3.setBounds(550, 1177, 130, 26);
		miPanel.add(alfa3);
		
		alfaPrima3 = new JTextField();
		alfaPrima3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblAlfaPrima.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblAlfaPrima.setForeground(Color.BLACK);
				if (alfaPrima3.getText().equals("*")) {
					alfaPrima3.setBackground(Color.YELLOW);
				} else {
					alfaPrima3.setBackground(colorPorDefecto);
				}
			}
		});
		alfaPrima3.setHorizontalAlignment(SwingConstants.CENTER);
		alfaPrima3.setColumns(10);
		alfaPrima3.setBounds(550, 1207, 130, 26);
		miPanel.add(alfaPrima3);
		
		bicarbonato3 = new JTextField();
		bicarbonato3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblBicarbonato.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblBicarbonato.setForeground(Color.BLACK);
				if (bicarbonato3.getText().equals("*")) {
					bicarbonato3.setBackground(Color.YELLOW);
				} else {
					bicarbonato3.setBackground(colorPorDefecto);
				}
			}
		});
		bicarbonato3.setHorizontalAlignment(SwingConstants.CENTER);
		bicarbonato3.setColumns(10);
		bicarbonato3.setBounds(550, 1237, 130, 26);
		miPanel.add(bicarbonato3);
		
		salinidad3 = new JTextField();
		salinidad3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblSalinidad.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblSalinidad.setForeground(Color.BLACK);
				if (salinidad3.getText().equals("*")) {
					salinidad3.setBackground(Color.YELLOW);
				} else {
					salinidad3.setBackground(colorPorDefecto);
				}
			}
		});
		salinidad3.setHorizontalAlignment(SwingConstants.CENTER);
		salinidad3.setColumns(10);
		salinidad3.setBounds(550, 1267, 130, 26);
		miPanel.add(salinidad3);
		
		turbiedad3 = new JTextField();
		turbiedad3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblTurbiedad.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblTurbiedad.setForeground(Color.BLACK);
				if (turbiedad3.getText().equals("*")) {
					turbiedad3.setBackground(Color.YELLOW);
				} else {
					turbiedad3.setBackground(colorPorDefecto);
				}
			}
		});
		turbiedad3.setHorizontalAlignment(SwingConstants.CENTER);
		turbiedad3.setColumns(10);
		turbiedad3.setBounds(550, 1297, 130, 26);
		miPanel.add(turbiedad3);
		
		conductividad3 = new JTextField();
		conductividad3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblConductividad.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblConductividad.setForeground(Color.BLACK);
				if (conductividad3.getText().equals("*")) {
					conductividad3.setBackground(Color.YELLOW);
				} else {
					conductividad3.setBackground(colorPorDefecto);
				}
			}
		});
		conductividad3.setHorizontalAlignment(SwingConstants.CENTER);
		conductividad3.setColumns(10);
		conductividad3.setBounds(550, 1327, 130, 26);
		miPanel.add(conductividad3);
		
		sulfuro3 = new JTextField();
		sulfuro3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblSulfuro.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblSulfuro.setForeground(Color.BLACK);
				if (sulfuro3.getText().equals("*")) {
					sulfuro3.setBackground(Color.YELLOW);
				} else {
					sulfuro3.setBackground(colorPorDefecto);
				}
			}
		});
		sulfuro3.setHorizontalAlignment(SwingConstants.CENTER);
		sulfuro3.setColumns(10);
		sulfuro3.setBounds(550, 1357, 130, 26);
		miPanel.add(sulfuro3);
		
		sulfato3 = new JTextField();
		sulfato3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblSulfato.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblSulfato.setForeground(Color.BLACK);
				if (sulfato3.getText().equals("*")) {
					sulfato3.setBackground(Color.YELLOW);
				} else {
					sulfato3.setBackground(colorPorDefecto);
				}
			}
		});
		sulfato3.setHorizontalAlignment(SwingConstants.CENTER);
		sulfato3.setColumns(10);
		sulfato3.setBounds(550, 1387, 130, 26);
		miPanel.add(sulfato3);
		
		fenoles3 = new JTextField();
		fenoles3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblFenoles.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblFenoles.setForeground(Color.BLACK);
				if (fenoles3.getText().equals("*")) {
					fenoles3.setBackground(Color.YELLOW);
				} else {
					fenoles3.setBackground(colorPorDefecto);
				}
			}
		});
		fenoles3.setHorizontalAlignment(SwingConstants.CENTER);
		fenoles3.setColumns(10);
		fenoles3.setBounds(550, 1417, 130, 26);
		miPanel.add(fenoles3);
		
		tensoactivos3 = new JTextField();
		tensoactivos3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblTensoactivosAnionicos.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblTensoactivosAnionicos.setForeground(Color.BLACK);
				if (tensoactivos3.getText().equals("*")) {
					tensoactivos3.setBackground(Color.YELLOW);
				} else {
					tensoactivos3.setBackground(colorPorDefecto);
				}
			}
		});
		tensoactivos3.setHorizontalAlignment(SwingConstants.CENTER);
		tensoactivos3.setColumns(10);
		tensoactivos3.setBounds(550, 1447, 130, 26);
		miPanel.add(tensoactivos3);
		
		cloroResidual3 = new JTextField();
		cloroResidual3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblCloroResidual.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblCloroResidual.setForeground(Color.BLACK);
				if (cloroResidual3.getText().equals("*")) {
					cloroResidual3.setBackground(Color.YELLOW);
				} else {
					cloroResidual3.setBackground(colorPorDefecto);
				}
			}
		});
		cloroResidual3.setHorizontalAlignment(SwingConstants.CENTER);
		cloroResidual3.setColumns(10);
		cloroResidual3.setBounds(550, 1477, 130, 26);
		miPanel.add(cloroResidual3);
		
		cloroTotal3 = new JTextField();
		cloroTotal3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblCloroTotal.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblCloroTotal.setForeground(Color.BLACK);
				if (cloroTotal3.getText().equals("*")) {
					cloroTotal3.setBackground(Color.YELLOW);
				} else {
					cloroTotal3.setBackground(colorPorDefecto);
				}
			}
		});
		cloroTotal3.setHorizontalAlignment(SwingConstants.CENTER);
		cloroTotal3.setColumns(10);
		cloroTotal3.setBounds(550, 1507, 130, 26);
		miPanel.add(cloroTotal3);
		
		cloruro3 = new JTextField();
		cloruro3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblCloruro.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblCloruro.setForeground(Color.BLACK);
				if (cloruro3.getText().equals("*")) {
					cloruro3.setBackground(Color.YELLOW);
				} else {
					cloruro3.setBackground(colorPorDefecto);
				}
			}
		});
		cloruro3.setHorizontalAlignment(SwingConstants.CENTER);
		cloruro3.setColumns(10);
		cloruro3.setBounds(550, 1537, 130, 26);
		miPanel.add(cloruro3);
		
		dureza3 = new JTextField();
		dureza3 = new JTextField();
		dureza3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblDureza.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblDureza.setForeground(Color.BLACK);
				if (dureza3.getText().equals("*")) {
					dureza3.setBackground(Color.YELLOW);
				} else {
					dureza3.setBackground(colorPorDefecto);
				}
			}
		});
		dureza3.setHorizontalAlignment(SwingConstants.CENTER);
		dureza3.setColumns(10);
		dureza3.setBounds(550, 1567, 130, 26);
		miPanel.add(dureza3);
		
		color3 = new JTextField();
		color3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblColor.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblColor.setForeground(Color.BLACK);
				if (color3.getText().equals("*")) {
					color3.setBackground(Color.YELLOW);
				} else {
					color3.setBackground(colorPorDefecto);
				}
			}
		});
		color3.setHorizontalAlignment(SwingConstants.CENTER);
		color3.setColumns(10);
		color3.setBounds(550, 1597, 130, 26);
		miPanel.add(color3);
		
		hidrocarburos3 = new JTextField();
		hidrocarburos3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblHidrocarburos.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblHidrocarburos.setForeground(Color.BLACK);
				if (hidrocarburos3.getText().equals("*")) {
					hidrocarburos3.setBackground(Color.YELLOW);
				} else {
					hidrocarburos3.setBackground(colorPorDefecto);
				}
			}
		});
		hidrocarburos3.setHorizontalAlignment(SwingConstants.CENTER);
		hidrocarburos3.setColumns(10);
		hidrocarburos3.setBounds(550, 1627, 130, 26);
		miPanel.add(hidrocarburos3);
		
		coliformes3 = new JTextField();
		coliformes3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblColiformes.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblColiformes.setForeground(Color.BLACK);
				if (coliformes3.getText().equals("*")) {
					coliformes3.setBackground(Color.YELLOW);
				} else {
					coliformes3.setBackground(colorPorDefecto);
				}
			}
		});
		coliformes3.setHorizontalAlignment(SwingConstants.CENTER);
		coliformes3.setColumns(10);
		coliformes3.setBounds(550, 1657, 130, 26);
		miPanel.add(coliformes3);
		
		cursoAguaTipo3 = new JTextField();
		cursoAguaTipo3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblCursoDeAgua.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblCursoDeAgua.setForeground(Color.BLACK);
				if (cursoAguaTipo3.getText().equals("*")) {
					cursoAguaTipo3.setBackground(Color.YELLOW);
				} else {
					cursoAguaTipo3.setBackground(colorPorDefecto);
				}
			}
		});
		cursoAguaTipo3.setHorizontalAlignment(SwingConstants.CENTER);
		cursoAguaTipo3.setColumns(10);
		cursoAguaTipo3.setBounds(550, 1687, 130, 26);
		miPanel.add(cursoAguaTipo3);
		
		otros13 = new JTextField();
		otros13.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblOtros.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblOtros.setForeground(Color.BLACK);
				if (otros13.getText().equals("*")) {
					otros13.setBackground(Color.YELLOW);
				} else {
					otros13.setBackground(colorPorDefecto);
				}
			}
		});
		otros13.setHorizontalAlignment(SwingConstants.CENTER);
		otros13.setColumns(10);
		otros13.setBounds(550, 1717, 130, 26);
		miPanel.add(otros13);
		
		otros23 = new JTextField();
		otros23.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblOtros2.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblOtros2.setForeground(Color.BLACK);
				if (otros23.getText().equals("*")) {
					otros23.setBackground(Color.YELLOW);
				} else {
					otros23.setBackground(colorPorDefecto);
				}
			}
		});
		otros23.setHorizontalAlignment(SwingConstants.CENTER);
		otros23.setColumns(10);
		otros23.setBounds(550, 1747, 130, 26);
		miPanel.add(otros23);
		
		otros33 = new JTextField();
		otros33.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblOtros3.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblOtros3.setForeground(Color.BLACK);
				if (otros33.getText().equals("*")) {
					otros33.setBackground(Color.YELLOW);
				} else {
					otros33.setBackground(colorPorDefecto);
				}
			}
		});
		otros33.setHorizontalAlignment(SwingConstants.CENTER);
		otros33.setColumns(10);
		otros33.setBounds(550, 1777, 130, 26);
		miPanel.add(otros33);
		
		otros43 = new JTextField();
		otros43.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblOtros4.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblOtros4.setForeground(Color.BLACK);
				if (otros43.getText().equals("*")) {
					otros43.setBackground(Color.YELLOW);
				} else {
					otros43.setBackground(colorPorDefecto);
				}
			}
		});
		otros43.setHorizontalAlignment(SwingConstants.CENTER);
		otros43.setColumns(10);
		otros43.setBounds(550, 1807, 130, 26);
		miPanel.add(otros43);
		
		nroAnalisis4.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent arg0){
				AnalisisAgua analisisAguaSeleccionado = aguasDAO.obtenerAnalisisAguaPorNumero(String.valueOf(nroAnalisis4.getSelectedItem()));	
				lugarExtraccion4.setText(analisisAguaSeleccionado.getLugarExtraccion());
				if(analisisAguaSeleccionado.getLugarExtraccion().equals("*")) {
					lugarExtraccion4.setBackground(Color.YELLOW);
				} else {
					lugarExtraccion4.setBackground(colorPorDefecto);
				}
				extraidoPor4.setText(analisisAguaSeleccionado.getExtraidoPor());
				if(analisisAguaSeleccionado.getExtraidoPor().equals("*")) {
					extraidoPor4.setBackground(Color.YELLOW);
				} else {
					extraidoPor4.setBackground(colorPorDefecto);
				}
				if(analisisAguaSeleccionado.getFechaExtraccion() == null) {
					fechaExtraccion4.setText("");
				} else {
					DateFormat df = new SimpleDateFormat("dd/MM/YYYY");
				    fechaExtraccion4.setText(df.format(analisisAguaSeleccionado.getFechaExtraccion()));
				}
				horaExtraccion4.setText(analisisAguaSeleccionado.getHoraExtraccion());
				if(analisisAguaSeleccionado.getHoraExtraccion().equals("*")) {
					horaExtraccion4.setBackground(Color.YELLOW);
				} else {
					horaExtraccion4.setBackground(colorPorDefecto);
				}
				if(analisisAguaSeleccionado.getAspecto().equals("*")) {
					aspecto4.setBackground(Color.YELLOW);
				} else {
					aspecto4.setBackground(colorPorDefecto);
				}
				aspecto4.setText(analisisAguaSeleccionado.getAspecto());
				if(analisisAguaSeleccionado.getpH().equals("*")) {
					pH4.setBackground(Color.YELLOW);
				} else {
					pH4.setBackground(colorPorDefecto);
				}
				pH4.setText(analisisAguaSeleccionado.getpH());				
				if(analisisAguaSeleccionado.getSolidosTotales().equals("*")) {
					SolidosTotales4.setBackground(Color.YELLOW);
				} else {
					SolidosTotales4.setBackground(colorPorDefecto);
				}
				SolidosTotales4.setText(analisisAguaSeleccionado.getSolidosTotales());
				if(analisisAguaSeleccionado.getpHInSitu().equals("*")) {
					pHIS4.setBackground(Color.YELLOW);
				} else {
					pHIS4.setBackground(colorPorDefecto);
				}
				pHIS4.setText(analisisAguaSeleccionado.getpHInSitu());
				if(analisisAguaSeleccionado.getTemperatura().equals("*")) {
					temperatura4.setBackground(Color.YELLOW);
				} else {
					temperatura4.setBackground(colorPorDefecto);
				}
				temperatura4.setText(analisisAguaSeleccionado.getTemperatura());
				if(analisisAguaSeleccionado.getCaudalInstantaneo().equals("*")) {
					caudal4.setBackground(Color.YELLOW);
				} else {
					caudal4.setBackground(colorPorDefecto);
				}
				caudal4.setText(analisisAguaSeleccionado.getCaudalInstantaneo());
				if(analisisAguaSeleccionado.getODInSitu().equals("*")) {
					ODIS4.setBackground(Color.YELLOW);
				} else {
					ODIS4.setBackground(colorPorDefecto);
				}
				ODIS4.setText(analisisAguaSeleccionado.getODInSitu());
				if(analisisAguaSeleccionado.getOD().equals("*")) {
					OD4.setBackground(Color.YELLOW);
				} else {
					OD4.setBackground(colorPorDefecto);
				}
				OD4.setText(analisisAguaSeleccionado.getOD());
				if(analisisAguaSeleccionado.getDBO5().equals("*")) {
					DBO54.setBackground(Color.YELLOW);
				} else {
					DBO54.setBackground(colorPorDefecto);
				}
				DBO54.setText(analisisAguaSeleccionado.getDBO5());
				if(analisisAguaSeleccionado.getDBO5Filtrada().equals("*")) {
					DBO5F4.setBackground(Color.YELLOW);
				} else {
					DBO5F4.setBackground(colorPorDefecto);
				}
				DBO5F4.setText(analisisAguaSeleccionado.getDBO5Filtrada());
				if(analisisAguaSeleccionado.getDQO().equals("*")) {
					DQO4.setBackground(Color.YELLOW);
				} else {
					DQO4.setBackground(colorPorDefecto);
				}
				DQO4.setText(analisisAguaSeleccionado.getDQO());
				if(analisisAguaSeleccionado.getAceitesYGrasas().equals("*")) {
					AceitesYGrasas4.setBackground(Color.YELLOW);
				} else {
					AceitesYGrasas4.setBackground(colorPorDefecto);
				}
				AceitesYGrasas4.setText(analisisAguaSeleccionado.getAceitesYGrasas());
				if(analisisAguaSeleccionado.getSolidosTotalesVolatiles().equals("*")) {
					STV4.setBackground(Color.YELLOW);
				} else {
					STV4.setBackground(colorPorDefecto);
				}
				STV4.setText(analisisAguaSeleccionado.getSolidosTotalesVolatiles());

				SST4.setText(analisisAguaSeleccionado.getSst());
				if(analisisAguaSeleccionado.getSst().equals("*")) {
					SST4.setBackground(Color.YELLOW);
				} else {
					SST4.setBackground(colorPorDefecto);
				}
				SSV4.setText(analisisAguaSeleccionado.getSsv());
				if(analisisAguaSeleccionado.getSsv().equals("*")) {
					SSV4.setBackground(Color.YELLOW);
				} else {
					SSV4.setBackground(colorPorDefecto);
				}
				SS104.setText(analisisAguaSeleccionado.getSs10());
				if(analisisAguaSeleccionado.getSs10().equals("*")) {
					SS104.setBackground(Color.YELLOW);
				} else {
					SS104.setBackground(colorPorDefecto);
				}
				SS304.setText(analisisAguaSeleccionado.getSs30());
				if(analisisAguaSeleccionado.getSs30().equals("*")) {
					SS304.setBackground(Color.YELLOW);
				} else {
					SS304.setBackground(colorPorDefecto);
				}
				SS604.setText(analisisAguaSeleccionado.getSs60());
				if(analisisAguaSeleccionado.getSs60().equals("*")) {
					SS604.setBackground(Color.YELLOW);
				} else {
					SS604.setBackground(colorPorDefecto);
				}
				amoniaco4.setText(analisisAguaSeleccionado.getAmoniaco());
				if(analisisAguaSeleccionado.getOtros4().equals("*")) {
					amoniaco4.setBackground(Color.YELLOW);
				} else {
					amoniaco4.setBackground(colorPorDefecto);
				}
				nitrato4.setText(analisisAguaSeleccionado.getNitrato());
				if(analisisAguaSeleccionado.getNitrato().equals("*")) {
					nitrato4.setBackground(Color.YELLOW);
				} else {
					nitrato4.setBackground(colorPorDefecto);
				}
				nitrogenoTotal4.setText(analisisAguaSeleccionado.getNitrogenoTotal());
				if(analisisAguaSeleccionado.getNitrogenoTotal().equals("*")) {
					nitrogenoTotal4.setBackground(Color.YELLOW);
				} else {
					nitrogenoTotal4.setBackground(colorPorDefecto);
				}
				fosforoTotal4.setText(analisisAguaSeleccionado.getFosforoTotal());
				if(analisisAguaSeleccionado.getFosforoTotal().equals("*")) {
					fosforoTotal4.setBackground(Color.YELLOW);
				} else {
					fosforoTotal4.setBackground(colorPorDefecto);
				}
				cromo4.setText(analisisAguaSeleccionado.getCromo());
				if(analisisAguaSeleccionado.getCromo().equals("*")) {
					cromo4.setBackground(Color.YELLOW);
				} else {
					cromo4.setBackground(colorPorDefecto);
				}
				plomo4.setText(analisisAguaSeleccionado.getPlomo());
				if(analisisAguaSeleccionado.getPlomo().equals("*")) {
					plomo4.setBackground(Color.YELLOW);
				} else {
					plomo4.setBackground(colorPorDefecto);
				}
				zinc4.setText(analisisAguaSeleccionado.getZinc());
				if(analisisAguaSeleccionado.getZinc().equals("*")) {
					zinc4.setBackground(Color.YELLOW);
				} else {
					zinc4.setBackground(colorPorDefecto);
				}
				aluminio4.setText(analisisAguaSeleccionado.getAluminio());
				if(analisisAguaSeleccionado.getAluminio().equals("*")) {
					aluminio4.setBackground(Color.YELLOW);
				} else {
					aluminio4.setBackground(colorPorDefecto);
				}
				manganeso4.setText(analisisAguaSeleccionado.getManganeso());
				if(analisisAguaSeleccionado.getManganeso().equals("*")) {
					manganeso4.setBackground(Color.YELLOW);
				} else {
					manganeso4.setBackground(colorPorDefecto);
				}
				potasio4.setText(analisisAguaSeleccionado.getPotasio());
				if(analisisAguaSeleccionado.getPotasio().equals("*")) {
					potasio4.setBackground(Color.YELLOW);
				} else {
					potasio4.setBackground(colorPorDefecto);
				}
				alcalinidadTotal4.setText(analisisAguaSeleccionado.getAlcalinidadTotal());
				if(analisisAguaSeleccionado.getAlcalinidadTotal().equals("*")) {
					alcalinidadTotal4.setBackground(Color.YELLOW);
				} else {
					alcalinidadTotal4.setBackground(colorPorDefecto);
				}
				acidezVolatil4.setText(analisisAguaSeleccionado.getAcidezVolatil());
				if(analisisAguaSeleccionado.getAcidezVolatil().equals("*")) {
					acidezVolatil4.setBackground(Color.YELLOW);
				} else {
					acidezVolatil4.setBackground(colorPorDefecto);
				}
				alfa4.setText(analisisAguaSeleccionado.getAlfa());
				if(analisisAguaSeleccionado.getAlfa().equals("*")) {
					alfa4.setBackground(Color.YELLOW);
				} else {
					alfa4.setBackground(colorPorDefecto);
				}
				alfaPrima4.setText(analisisAguaSeleccionado.getAlfaPrima());
				if(analisisAguaSeleccionado.getAlfaPrima().equals("*")) {
					alfaPrima4.setBackground(Color.YELLOW);
				} else {
					alfaPrima4.setBackground(colorPorDefecto);
				}				
				bicarbonato4.setText(analisisAguaSeleccionado.getBicarbonato());
				if(analisisAguaSeleccionado.getBicarbonato().equals("*")) {
					bicarbonato4.setBackground(Color.YELLOW);
				} else {
					bicarbonato4.setBackground(colorPorDefecto);
				}
				salinidad4.setText(analisisAguaSeleccionado.getSalinidad());
				if(analisisAguaSeleccionado.getSalinidad().equals("*")) {
					salinidad4.setBackground(Color.YELLOW);
				} else {
					salinidad4.setBackground(colorPorDefecto);
				}
				turbiedad4.setText(analisisAguaSeleccionado.getTurbiedad());
				if(analisisAguaSeleccionado.getTurbiedad().equals("*")) {
					turbiedad4.setBackground(Color.YELLOW);
				} else {
					turbiedad4.setBackground(colorPorDefecto);
				}
				conductividad4.setText(analisisAguaSeleccionado.getConductividad());
				if(analisisAguaSeleccionado.getConductividad().equals("*")) {
					conductividad4.setBackground(Color.YELLOW);
				} else {
					conductividad4.setBackground(colorPorDefecto);
				}
				sulfuro4.setText(analisisAguaSeleccionado.getSulfuro());
				if(analisisAguaSeleccionado.getSulfuro().equals("*")) {
					sulfuro4.setBackground(Color.YELLOW);
				} else {
					sulfuro4.setBackground(colorPorDefecto);
				}
				sulfato4.setText(analisisAguaSeleccionado.getSulfato());
				if(analisisAguaSeleccionado.getSulfato().equals("*")) {
					sulfato4.setBackground(Color.YELLOW);
				} else {
					sulfato4.setBackground(colorPorDefecto);
				}
				fenoles4.setText(analisisAguaSeleccionado.getFenoles());
				if(analisisAguaSeleccionado.getFenoles().equals("*")) {
					fenoles4.setBackground(Color.YELLOW);
				} else {
					fenoles4.setBackground(colorPorDefecto);
				}
				tensoactivos4.setText(analisisAguaSeleccionado.getTensoactivosAnionicos());
				if(analisisAguaSeleccionado.getTensoactivosAnionicos().equals("*")) {
					tensoactivos4.setBackground(Color.YELLOW);
				} else {
					tensoactivos4.setBackground(colorPorDefecto);
				}
				cloroResidual4.setText(analisisAguaSeleccionado.getCloroResidual());
				if(analisisAguaSeleccionado.getCloroResidual().equals("*")) {
					cloroResidual4.setBackground(Color.YELLOW);
				} else {
					cloroResidual4.setBackground(colorPorDefecto);
				}
				cloroTotal4.setText(analisisAguaSeleccionado.getCloroTotal());
				if(analisisAguaSeleccionado.getCloroTotal().equals("*")) {
					cloroTotal4.setBackground(Color.YELLOW);
				} else {
					cloroTotal4.setBackground(colorPorDefecto);
				}
				cloruro4.setText(analisisAguaSeleccionado.getCloruro());
				if(analisisAguaSeleccionado.getCloruro().equals("*")) {
					cloruro4.setBackground(Color.YELLOW);
				} else {
					cloruro4.setBackground(colorPorDefecto);
				}
				dureza4.setText(analisisAguaSeleccionado.getDureza());
				if(analisisAguaSeleccionado.getDureza().equals("*")) {
					dureza4.setBackground(Color.YELLOW);
				} else {
					dureza4.setBackground(colorPorDefecto);
				}
				color4.setText(analisisAguaSeleccionado.getColor());
				if(analisisAguaSeleccionado.getColor().equals("*")) {
					color4.setBackground(Color.YELLOW);
				} else {
					color4.setBackground(colorPorDefecto);
				}
				hidrocarburos4.setText(analisisAguaSeleccionado.getHidrocarburos());
				if(analisisAguaSeleccionado.getHidrocarburos().equals("*")) {
					hidrocarburos4.setBackground(Color.YELLOW);
				} else {
					hidrocarburos4.setBackground(colorPorDefecto);
				}
				coliformes4.setText(analisisAguaSeleccionado.getColiformesFecales());
				if(analisisAguaSeleccionado.getColiformesFecales().equals("*")) {
					coliformes4.setBackground(Color.YELLOW);
				} else {
					coliformes4.setBackground(colorPorDefecto);
				}
				cursoAguaTipo4.setText(analisisAguaSeleccionado.getCursoDeAguaTipo());
				if(analisisAguaSeleccionado.getCursoDeAguaTipo().equals("*")) {
					cursoAguaTipo4.setBackground(Color.YELLOW);
				} else {
					cursoAguaTipo4.setBackground(colorPorDefecto);
				}
				otros14.setText(analisisAguaSeleccionado.getOtros());
				if(analisisAguaSeleccionado.getOtros().equals("*")) {
					otros14.setBackground(Color.YELLOW);
				} else {
					otros14.setBackground(colorPorDefecto);
				}
				otros24.setText(analisisAguaSeleccionado.getOtros2());
				if(analisisAguaSeleccionado.getOtros().equals("*")) {
					otros24.setBackground(Color.YELLOW);
				} else {
					otros24.setBackground(colorPorDefecto);
				}
				otros34.setText(analisisAguaSeleccionado.getOtros3());
				if(analisisAguaSeleccionado.getOtros3().equals("*")) {
					otros34.setBackground(Color.YELLOW);
				} else {
					otros34.setBackground(colorPorDefecto);
				}
				otros44.setText(analisisAguaSeleccionado.getOtros4());
				if(analisisAguaSeleccionado.getOtros4().equals("*")) {
					otros44.setBackground(Color.YELLOW);
				} else {
					otros44.setBackground(colorPorDefecto);
				}
						
				
				
				
				
			}
		});
		
		lugarExtraccion4 = new JTextField();
		lugarExtraccion4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblLugarExtraccion.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblLugarExtraccion.setForeground(Color.BLACK);
				if (lugarExtraccion4.getText().equals("*")) {
					lugarExtraccion4.setBackground(Color.YELLOW);
				} else {
					lugarExtraccion4.setBackground(colorPorDefecto);
				}
			}
		});
		lugarExtraccion4.setBounds(730, 155, 130, 26);
		miPanel.add(lugarExtraccion4);
		lugarExtraccion4.setColumns(10);
		lugarExtraccion4.setHorizontalAlignment(JTextField.CENTER);
		
		extraidoPor4 = new JTextField();
		extraidoPor4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblExtraidoPor.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblExtraidoPor.setForeground(Color.BLACK);
				if (extraidoPor4.getText().equals("*")) {
					extraidoPor4.setBackground(Color.YELLOW);
				} else {
					extraidoPor4.setBackground(colorPorDefecto);
				}
			}
		});
		extraidoPor4.setBounds(730, 185, 130, 26);
		miPanel.add(extraidoPor4);
		extraidoPor4.setColumns(10);
		extraidoPor4.setHorizontalAlignment(JTextField.CENTER);
		
		fechaExtraccion4 = new JTextField();
		fechaExtraccion4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (fechaExtraccion4.getText().equals("*")) {
					fechaExtraccion4.setBackground(Color.YELLOW);
				} else {
					fechaExtraccion4.setBackground(colorPorDefecto);
				}
			}
		});
		fechaExtraccion4.setBounds(730, 215, 130, 26);
		miPanel.add(fechaExtraccion4); 
		fechaExtraccion4.setColumns(10);
		fechaExtraccion4.setHorizontalAlignment(JTextField.CENTER);
		fechaExtraccion4.setEditable(false);
		
		horaExtraccion4 = new JTextField();
		horaExtraccion4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblHoraExtraccion.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblHoraExtraccion.setForeground(Color.BLACK);
				if (horaExtraccion4.getText().equals("*")) {
					horaExtraccion4.setBackground(Color.YELLOW);
				} else {
					horaExtraccion4.setBackground(colorPorDefecto);
				}
			}
		});
		horaExtraccion4.setBounds(730, 245, 130, 26);
		miPanel.add(horaExtraccion4);
		horaExtraccion4.setColumns(10);
		horaExtraccion4.setHorizontalAlignment(JTextField.CENTER);
		
		aspecto4 = new JTextField();
		aspecto4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblAspecto.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblAspecto.setForeground(Color.BLACK);
				if (aspecto4.getText().equals("*")) {
					aspecto4.setBackground(Color.YELLOW);
				} else {
					aspecto4.setBackground(colorPorDefecto);
				}
			}
		});
		aspecto4.setBounds(730, 275, 130, 26);
		miPanel.add(aspecto4);
		aspecto4.setColumns(10);
		aspecto4.setHorizontalAlignment(JTextField.CENTER);		
		
		pHIS4 = new JTextField();
		pHIS4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblpHinSitu.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblpHinSitu.setForeground(Color.BLACK);
				if (pHIS4.getText().equals("*")) {
					pHIS4.setBackground(Color.YELLOW);
				} else {
					pHIS4.setBackground(colorPorDefecto);
				}
			}
		});
		pHIS4.setHorizontalAlignment(SwingConstants.CENTER);
		pHIS4.setColumns(10);
		pHIS4.setBounds(730, 307, 130, 26);
		miPanel.add(pHIS4);
		
		pH4 = new JTextField();
		pH4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblpH.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblpH.setForeground(Color.BLACK);
				if (pH4.getText().equals("*")) {
					pH4.setBackground(Color.YELLOW);
				} else {
					pH4.setBackground(colorPorDefecto);
				}
			}
		});
		pH4.setHorizontalAlignment(SwingConstants.CENTER);
		pH4.setColumns(10);
		pH4.setBounds(730, 337, 130, 26);
		miPanel.add(pH4);
		
		temperatura4 = new JTextField();
		temperatura4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblTemperatura.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblTemperatura.setForeground(Color.BLACK);
				if (temperatura4.getText().equals("*")) {
					temperatura4.setBackground(Color.YELLOW);
				} else {
					temperatura4.setBackground(colorPorDefecto);
				}
			}
		});
		temperatura4.setHorizontalAlignment(SwingConstants.CENTER);
		temperatura4.setColumns(10);
		temperatura4.setBounds(730, 367, 130, 26);
		miPanel.add(temperatura4);
		
		caudal4 = new JTextField();
		caudal4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblCaudal.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblCaudal.setForeground(Color.BLACK);
				if (caudal4.getText().equals("*")) {
					caudal4.setBackground(Color.YELLOW);
				} else {
					caudal4.setBackground(colorPorDefecto);
				}
			}
		});
		caudal4.setHorizontalAlignment(SwingConstants.CENTER);
		caudal4.setColumns(10);
		caudal4.setBounds(730, 397, 130, 26);
		miPanel.add(caudal4);
		
		ODIS4 = new JTextField();
		ODIS4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblODInSitu.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblODInSitu.setForeground(Color.BLACK);
				if (ODIS4.getText().equals("*")) {
					ODIS4.setBackground(Color.YELLOW);
				} else {
					ODIS4.setBackground(colorPorDefecto);
				}
			}
		});
		ODIS4.setHorizontalAlignment(SwingConstants.CENTER);
		ODIS4.setColumns(10);
		ODIS4.setBounds(730, 427, 130, 26);
		miPanel.add(ODIS4);
		
		OD4 = new JTextField();
		OD4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblOD.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblOD.setForeground(Color.BLACK);
				if (OD4.getText().equals("*")) {
					OD4.setBackground(Color.YELLOW);
				} else {
					OD4.setBackground(colorPorDefecto);
				}
			}
		});
		OD4.setHorizontalAlignment(SwingConstants.CENTER);
		OD4.setColumns(10);
		OD4.setBounds(730, 457, 130, 26);
		miPanel.add(OD4);
		
		DBO54 = new JTextField();
		DBO54.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblDBO5.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblDBO5.setForeground(Color.BLACK);
				if (DBO54.getText().equals("*")) {
					DBO54.setBackground(Color.YELLOW);
				} else {
					DBO54.setBackground(colorPorDefecto);
				}
			}
		});
		DBO54.setHorizontalAlignment(SwingConstants.CENTER);
		DBO54.setColumns(10);
		DBO54.setBounds(730, 487, 130, 26);
		miPanel.add(DBO54);
		
		DBO5F4 = new JTextField();
		DBO5F4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblDBO5F.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblDBO5F.setForeground(Color.BLACK);
				if (DBO5F4.getText().equals("*")) {
					DBO5F4.setBackground(Color.YELLOW);
				} else {
					DBO5F4.setBackground(colorPorDefecto);
				}
			}
		});
		DBO5F4.setHorizontalAlignment(SwingConstants.CENTER);
		DBO5F4.setColumns(10);
		DBO5F4.setBounds(730, 517, 130, 26);
		miPanel.add(DBO5F4);
		
		DQO4 = new JTextField();
		DQO4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblDQO.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblDQO.setForeground(Color.BLACK);
				if (DQO4.getText().equals("*")) {
					DQO4.setBackground(Color.YELLOW);
				} else {
					DQO4.setBackground(colorPorDefecto);
				}
			}
		});
		DQO4.setHorizontalAlignment(SwingConstants.CENTER);
		DQO4.setColumns(10);
		DQO4.setBounds(730, 547, 130, 26);
		miPanel.add(DQO4);
		
		AceitesYGrasas4 = new JTextField();
		AceitesYGrasas4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblAceitesYGrasas.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblAceitesYGrasas.setForeground(Color.BLACK);
				if (AceitesYGrasas4.getText().equals("*")) {
					AceitesYGrasas4.setBackground(Color.YELLOW);
				} else {
					AceitesYGrasas4.setBackground(colorPorDefecto);
				}
			}
		});
		AceitesYGrasas4.setHorizontalAlignment(SwingConstants.CENTER);
		AceitesYGrasas4.setColumns(10);
		AceitesYGrasas4.setBounds(730, 577, 130, 26);
		miPanel.add(AceitesYGrasas4);
		
		SolidosTotales4 = new JTextField();
		SolidosTotales4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblSolidosTotales.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblSolidosTotales.setForeground(Color.BLACK);
				if (SolidosTotales4.getText().equals("*")) {
					SolidosTotales4.setBackground(Color.YELLOW);
				} else {
					SolidosTotales4.setBackground(colorPorDefecto);
				}
			}
		});
		SolidosTotales4.setHorizontalAlignment(SwingConstants.CENTER);
		SolidosTotales4.setColumns(10);
		SolidosTotales4.setBounds(730, 607, 130, 26);
		miPanel.add(SolidosTotales4);
		
		STV4 = new JTextField();
		STV4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblSolidosTotalesVolatiles.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblSolidosTotalesVolatiles.setForeground(Color.BLACK);
				if (STV4.getText().equals("*")) {
					STV4.setBackground(Color.YELLOW);
				} else {
					STV4.setBackground(colorPorDefecto);
				}
			}
		});
		STV4.setHorizontalAlignment(SwingConstants.CENTER);
		STV4.setColumns(10);
		STV4.setBounds(730, 637, 130, 26);
		miPanel.add(STV4);
		
		SST4 = new JTextField();
		SST4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblSolidosSuspendidosTotales.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblSolidosSuspendidosTotales.setForeground(Color.BLACK);
				if (SST4.getText().equals("*")) {
					SST4.setBackground(Color.YELLOW);
				} else {
					SST4.setBackground(colorPorDefecto);
				}
			}
		});
		SST4.setHorizontalAlignment(SwingConstants.CENTER);
		SST4.setColumns(10);
		SST4.setBounds(730, 667, 130, 26);
		miPanel.add(SST4);
		
		SSV4 = new JTextField();
		SSV4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblSSV.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblSSV.setForeground(Color.BLACK);
				if (SSV4.getText().equals("*")) {
					SSV4.setBackground(Color.YELLOW);
				} else {
					SSV4.setBackground(colorPorDefecto);
				}
			}
		});
		SSV4.setHorizontalAlignment(SwingConstants.CENTER);
		SSV4.setColumns(10);
		SSV4.setBounds(730, 697, 130, 26);
		miPanel.add(SSV4);
		
		SS104 = new JTextField();
		SS104.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblSS10.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblSS10.setForeground(Color.BLACK);
				if (SS104.getText().equals("*")) {
					SS104.setBackground(Color.YELLOW);
				} else {
					SS104.setBackground(colorPorDefecto);
				}
			}
		});
		SS104.setHorizontalAlignment(SwingConstants.CENTER);
		SS104.setColumns(10);
		SS104.setBounds(730, 727, 130, 26);
		miPanel.add(SS104);
		
		SS304 = new JTextField();
		SS304.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblSS30.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblSS30.setForeground(Color.BLACK);
				if (SS304.getText().equals("*")) {
					SS304.setBackground(Color.YELLOW);
				} else {
					SS304.setBackground(colorPorDefecto);
				}
			}
		});
		SS304.setHorizontalAlignment(SwingConstants.CENTER);
		SS304.setColumns(10);
		SS304.setBounds(730, 757, 130, 26);
		miPanel.add(SS304);
		
		SS604 = new JTextField();
		SS604.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblSS60.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblSS60.setForeground(Color.BLACK);
				if (SS604.getText().equals("*")) {
					SS604.setBackground(Color.YELLOW);
				} else {
					SS604.setBackground(colorPorDefecto);
				}
			}
		});
		SS604.setHorizontalAlignment(SwingConstants.CENTER);
		SS604.setColumns(10);
		SS604.setBounds(730, 787, 130, 26);
		miPanel.add(SS604);	
		
		amoniaco4 = new JTextField();
		amoniaco4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblAmoniaco.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblAmoniaco.setForeground(Color.BLACK);
				if (amoniaco4.getText().equals("*")) {
					amoniaco4.setBackground(Color.YELLOW);
				} else {
					amoniaco4.setBackground(colorPorDefecto);
				}
			}
		});
		amoniaco4.setHorizontalAlignment(SwingConstants.CENTER);
		amoniaco4.setColumns(10);
		amoniaco4.setBounds(730, 817, 130, 26);
		miPanel.add(amoniaco4);
		
		nitrato4 = new JTextField();
		nitrato4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblNitrato.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblNitrato.setForeground(Color.BLACK);
				if (nitrato4.getText().equals("*")) {
					nitrato4.setBackground(Color.YELLOW);
				} else {
					nitrato4.setBackground(colorPorDefecto);
				}
			}
		});
		nitrato4.setHorizontalAlignment(SwingConstants.CENTER);
		nitrato4.setColumns(10);
		nitrato4.setBounds(730, 847, 130, 26);
		miPanel.add(nitrato4);
		
		nitrogenoTotal4 = new JTextField();
		nitrogenoTotal4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblNitrogenoTotal.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblNitrogenoTotal.setForeground(Color.BLACK);
				if (nitrogenoTotal4.getText().equals("*")) {
					nitrogenoTotal4.setBackground(Color.YELLOW);
				} else {
					nitrogenoTotal4.setBackground(colorPorDefecto);
				}
			}
		});
		nitrogenoTotal4.setHorizontalAlignment(SwingConstants.CENTER);
		nitrogenoTotal4.setColumns(10);
		nitrogenoTotal4.setBounds(730, 877, 130, 26);
		miPanel.add(nitrogenoTotal4);
		
		fosforoTotal4 = new JTextField();
		fosforoTotal4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblFosforoTotal.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblFosforoTotal.setForeground(Color.BLACK);
				if (fosforoTotal4.getText().equals("*")) {
					fosforoTotal4.setBackground(Color.YELLOW);
				} else {
					fosforoTotal4.setBackground(colorPorDefecto);
				}
			}
		});
		fosforoTotal4.setHorizontalAlignment(SwingConstants.CENTER);
		fosforoTotal4.setColumns(10);
		fosforoTotal4.setBounds(730, 907, 130, 26);
		miPanel.add(fosforoTotal4);
		
		cromo4 = new JTextField();
		cromo4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblCromo.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblCromo.setForeground(Color.BLACK);
				if (cromo4.getText().equals("*")) {
					cromo4.setBackground(Color.YELLOW);
				} else {
					cromo4.setBackground(colorPorDefecto);
				}
			}
		});
		cromo4.setHorizontalAlignment(SwingConstants.CENTER);
		cromo4.setColumns(10);
		cromo4.setBounds(730, 937, 130, 26);
		miPanel.add(cromo4);
		
		plomo4 = new JTextField();
		plomo4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblPlomo.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblPlomo.setForeground(Color.BLACK);
				if (plomo4.getText().equals("*")) {
					plomo4.setBackground(Color.YELLOW);
				} else {
					plomo4.setBackground(colorPorDefecto);
				}
			}
		});
		plomo4.setHorizontalAlignment(SwingConstants.CENTER);
		plomo4.setColumns(10);
		plomo4.setBounds(730, 967, 130, 26);
		miPanel.add(plomo4);
		
		zinc4 = new JTextField();
		zinc4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblZinc.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblZinc.setForeground(Color.BLACK);
				if (zinc4.getText().equals("*")) {
					zinc4.setBackground(Color.YELLOW);
				} else {
					zinc4.setBackground(colorPorDefecto);
				}
			}
		});
		zinc4.setHorizontalAlignment(SwingConstants.CENTER);
		zinc4.setColumns(10);
		zinc4.setBounds(730, 997, 130, 26);
		miPanel.add(zinc4);
		
		aluminio4 = new JTextField();
		aluminio4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblAluminio.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblAluminio.setForeground(Color.BLACK);
				if (aluminio4.getText().equals("*")) {
					aluminio4.setBackground(Color.YELLOW);
				} else {
					aluminio4.setBackground(colorPorDefecto);
				}
			}
		});
		aluminio4.setHorizontalAlignment(SwingConstants.CENTER);
		aluminio4.setColumns(10);
		aluminio4.setBounds(730, 1027, 130, 26);
		miPanel.add(aluminio4);
		
		manganeso4 = new JTextField();
		manganeso4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblManganeso.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblManganeso.setForeground(Color.BLACK);
				if (manganeso4.getText().equals("*")) {
					manganeso4.setBackground(Color.YELLOW);
				} else {
					manganeso4.setBackground(colorPorDefecto);
				}
			}
		});
		manganeso4.setHorizontalAlignment(SwingConstants.CENTER);
		manganeso4.setColumns(10);
		manganeso4.setBounds(730, 1057, 130, 26);
		miPanel.add(manganeso4);
		
		potasio4 = new JTextField();
		potasio4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblPotasio.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblPotasio.setForeground(Color.BLACK);
				if (potasio4.getText().equals("*")) {
					potasio4.setBackground(Color.YELLOW);
				} else {
					potasio4.setBackground(colorPorDefecto);
				}
			}
		});
		potasio4.setHorizontalAlignment(SwingConstants.CENTER);
		potasio4.setColumns(10);
		potasio4.setBounds(730, 1087, 130, 26);
		miPanel.add(potasio4);
		
		alcalinidadTotal4 = new JTextField();
		alcalinidadTotal4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblAlcalinidadTotal.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblAlcalinidadTotal.setForeground(Color.BLACK);
				if (alcalinidadTotal4.getText().equals("*")) {
					alcalinidadTotal4.setBackground(Color.YELLOW);
				} else {
					alcalinidadTotal4.setBackground(colorPorDefecto);
				}
			}
		});
		alcalinidadTotal4.setHorizontalAlignment(SwingConstants.CENTER);
		alcalinidadTotal4.setColumns(10);
		alcalinidadTotal4.setBounds(730, 1117, 130, 26);
		miPanel.add(alcalinidadTotal4);
		
		acidezVolatil4 = new JTextField();
		acidezVolatil4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblAcidezVolatil.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblAcidezVolatil.setForeground(Color.BLACK);
				if (acidezVolatil4.getText().equals("*")) {
					acidezVolatil4.setBackground(Color.YELLOW);
				} else {
					acidezVolatil4.setBackground(colorPorDefecto);
				}
			}
		});
		acidezVolatil4.setHorizontalAlignment(SwingConstants.CENTER);
		acidezVolatil4.setColumns(10);
		acidezVolatil4.setBounds(730, 1147, 130, 26);
		miPanel.add(acidezVolatil4);
		
		alfa4 = new JTextField();
		alfa4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblAlfa.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblAlfa.setForeground(Color.BLACK);
				if (alfa4.getText().equals("*")) {
					alfa4.setBackground(Color.YELLOW);
				} else {
					alfa4.setBackground(colorPorDefecto);
				}
			}
		});
		alfa4.setHorizontalAlignment(SwingConstants.CENTER);
		alfa4.setColumns(10);
		alfa4.setBounds(730, 1177, 130, 26);
		miPanel.add(alfa4);
		
		alfaPrima4 = new JTextField();
		alfaPrima4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblAlfaPrima.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblAlfaPrima.setForeground(Color.BLACK);
				if (alfaPrima4.getText().equals("*")) {
					alfaPrima4.setBackground(Color.YELLOW);
				} else {
					alfaPrima4.setBackground(colorPorDefecto);
				}
			}
		});
		alfaPrima4.setHorizontalAlignment(SwingConstants.CENTER);
		alfaPrima4.setColumns(10);
		alfaPrima4.setBounds(730, 1207, 130, 26);
		miPanel.add(alfaPrima4);
		
		bicarbonato4 = new JTextField();
		bicarbonato4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblBicarbonato.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblBicarbonato.setForeground(Color.BLACK);
				if (bicarbonato4.getText().equals("*")) {
					bicarbonato4.setBackground(Color.YELLOW);
				} else {
					bicarbonato4.setBackground(colorPorDefecto);
				}
			}
		});
		bicarbonato4.setHorizontalAlignment(SwingConstants.CENTER);
		bicarbonato4.setColumns(10);
		bicarbonato4.setBounds(730, 1237, 130, 26);
		miPanel.add(bicarbonato4);
		
		salinidad4 = new JTextField();
		salinidad4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblSalinidad.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblSalinidad.setForeground(Color.BLACK);
				if (salinidad4.getText().equals("*")) {
					salinidad4.setBackground(Color.YELLOW);
				} else {
					salinidad4.setBackground(colorPorDefecto);
				}
			}
		});
		salinidad4.setHorizontalAlignment(SwingConstants.CENTER);
		salinidad4.setColumns(10);
		salinidad4.setBounds(730, 1267, 130, 26);
		miPanel.add(salinidad4);
		
		turbiedad4 = new JTextField();
		turbiedad4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblTurbiedad.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblTurbiedad.setForeground(Color.BLACK);
				if (turbiedad4.getText().equals("*")) {
					turbiedad4.setBackground(Color.YELLOW);
				} else {
					turbiedad4.setBackground(colorPorDefecto);
				}
			}
		});
		turbiedad4.setHorizontalAlignment(SwingConstants.CENTER);
		turbiedad4.setColumns(10);
		turbiedad4.setBounds(730, 1297, 130, 26);
		miPanel.add(turbiedad4);
		
		conductividad4 = new JTextField();
		conductividad4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblConductividad.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblConductividad.setForeground(Color.BLACK);
				if (conductividad4.getText().equals("*")) {
					conductividad4.setBackground(Color.YELLOW);
				} else {
					conductividad4.setBackground(colorPorDefecto);
				}
			}
		});
		conductividad4.setHorizontalAlignment(SwingConstants.CENTER);
		conductividad4.setColumns(10);
		conductividad4.setBounds(730, 1327, 130, 26);
		miPanel.add(conductividad4);
		
		sulfuro4 = new JTextField();
		sulfuro4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblSulfuro.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblSulfuro.setForeground(Color.BLACK);
				if (sulfuro4.getText().equals("*")) {
					sulfuro4.setBackground(Color.YELLOW);
				} else {
					sulfuro4.setBackground(colorPorDefecto);
				}
			}
		});
		sulfuro4.setHorizontalAlignment(SwingConstants.CENTER);
		sulfuro4.setColumns(10);
		sulfuro4.setBounds(730, 1357, 130, 26);
		miPanel.add(sulfuro4);
		
		sulfato4 = new JTextField();
		sulfato4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblSulfato.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblSulfato.setForeground(Color.BLACK);
				if (sulfato4.getText().equals("*")) {
					sulfato4.setBackground(Color.YELLOW);
				} else {
					sulfato4.setBackground(colorPorDefecto);
				}
			}
		});
		sulfato4.setHorizontalAlignment(SwingConstants.CENTER);
		sulfato4.setColumns(10);
		sulfato4.setBounds(730, 1387, 130, 26);
		miPanel.add(sulfato4);
		
		fenoles4 = new JTextField();
		fenoles4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblFenoles.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblFenoles.setForeground(Color.BLACK);
				if (fenoles4.getText().equals("*")) {
					fenoles4.setBackground(Color.YELLOW);
				} else {
					fenoles4.setBackground(colorPorDefecto);
				}
			}
		});
		fenoles4.setHorizontalAlignment(SwingConstants.CENTER);
		fenoles4.setColumns(10);
		fenoles4.setBounds(730, 1417, 130, 26);
		miPanel.add(fenoles4);
		
		tensoactivos4 = new JTextField();
		tensoactivos4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblTensoactivosAnionicos.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblTensoactivosAnionicos.setForeground(Color.BLACK);
				if (tensoactivos4.getText().equals("*")) {
					tensoactivos4.setBackground(Color.YELLOW);
				} else {
					tensoactivos4.setBackground(colorPorDefecto);
				}
			}
		});
		tensoactivos4.setHorizontalAlignment(SwingConstants.CENTER);
		tensoactivos4.setColumns(10);
		tensoactivos4.setBounds(730, 1447, 130, 26);
		miPanel.add(tensoactivos4);
		
		cloroResidual4 = new JTextField();
		cloroResidual4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblCloroResidual.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblCloroResidual.setForeground(Color.BLACK);
				if (cloroResidual4.getText().equals("*")) {
					cloroResidual4.setBackground(Color.YELLOW);
				} else {
					cloroResidual4.setBackground(colorPorDefecto);
				}
			}
		});
		cloroResidual4.setHorizontalAlignment(SwingConstants.CENTER);
		cloroResidual4.setColumns(10);
		cloroResidual4.setBounds(730, 1477, 130, 26);
		miPanel.add(cloroResidual4);
		
		cloroTotal4 = new JTextField();
		cloroTotal4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblCloroTotal.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblCloroTotal.setForeground(Color.BLACK);
				if (cloroTotal4.getText().equals("*")) {
					cloroTotal4.setBackground(Color.YELLOW);
				} else {
					cloroTotal4.setBackground(colorPorDefecto);
				}
			}
		});
		cloroTotal4.setHorizontalAlignment(SwingConstants.CENTER);
		cloroTotal4.setColumns(10);
		cloroTotal4.setBounds(730, 1507, 130, 26);
		miPanel.add(cloroTotal4);
		
		cloruro4 = new JTextField();
		cloruro4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblCloruro.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblCloruro.setForeground(Color.BLACK);
				if (cloruro4.getText().equals("*")) {
					cloruro4.setBackground(Color.YELLOW);
				} else {
					cloruro4.setBackground(colorPorDefecto);
				}
			}
		});
		cloruro4.setHorizontalAlignment(SwingConstants.CENTER);
		cloruro4.setColumns(10);
		cloruro4.setBounds(730, 1537, 130, 26);
		miPanel.add(cloruro4);
		
		dureza4 = new JTextField();
		dureza4 = new JTextField();
		dureza4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblDureza.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblDureza.setForeground(Color.BLACK);
				if (dureza4.getText().equals("*")) {
					dureza4.setBackground(Color.YELLOW);
				} else {
					dureza4.setBackground(colorPorDefecto);
				}
			}
		});
		dureza4.setHorizontalAlignment(SwingConstants.CENTER);
		dureza4.setColumns(10);
		dureza4.setBounds(730, 1567, 130, 26);
		miPanel.add(dureza4);
		
		color4 = new JTextField();
		color4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblColor.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblColor.setForeground(Color.BLACK);
				if (color4.getText().equals("*")) {
					color4.setBackground(Color.YELLOW);
				} else {
					color4.setBackground(colorPorDefecto);
				}
			}
		});
		color4.setHorizontalAlignment(SwingConstants.CENTER);
		color4.setColumns(10);
		color4.setBounds(730, 1597, 130, 26);
		miPanel.add(color4);
		
		hidrocarburos4 = new JTextField();
		hidrocarburos4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblHidrocarburos.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblHidrocarburos.setForeground(Color.BLACK);
				if (hidrocarburos4.getText().equals("*")) {
					hidrocarburos4.setBackground(Color.YELLOW);
				} else {
					hidrocarburos4.setBackground(colorPorDefecto);
				}
			}
		});
		hidrocarburos4.setHorizontalAlignment(SwingConstants.CENTER);
		hidrocarburos4.setColumns(10);
		hidrocarburos4.setBounds(730, 1627, 130, 26);
		miPanel.add(hidrocarburos4);
		
		coliformes4 = new JTextField();
		coliformes4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblColiformes.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblColiformes.setForeground(Color.BLACK);
				if (coliformes4.getText().equals("*")) {
					coliformes4.setBackground(Color.YELLOW);
				} else {
					coliformes4.setBackground(colorPorDefecto);
				}
			}
		});
		coliformes4.setHorizontalAlignment(SwingConstants.CENTER);
		coliformes4.setColumns(10);
		coliformes4.setBounds(730, 1657, 130, 26);
		miPanel.add(coliformes4);
		
		cursoAguaTipo4 = new JTextField();
		cursoAguaTipo4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblCursoDeAgua.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblCursoDeAgua.setForeground(Color.BLACK);
				if (cursoAguaTipo4.getText().equals("*")) {
					cursoAguaTipo4.setBackground(Color.YELLOW);
				} else {
					cursoAguaTipo4.setBackground(colorPorDefecto);
				}
			}
		});
		cursoAguaTipo4.setHorizontalAlignment(SwingConstants.CENTER);
		cursoAguaTipo4.setColumns(10);
		cursoAguaTipo4.setBounds(730, 1687, 130, 26);
		miPanel.add(cursoAguaTipo4);
		
		otros14 = new JTextField();
		otros14.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblOtros.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblOtros.setForeground(Color.BLACK);
				if (otros14.getText().equals("*")) {
					otros14.setBackground(Color.YELLOW);
				} else {
					otros14.setBackground(colorPorDefecto);
				}
			}
		});
		otros14.setHorizontalAlignment(SwingConstants.CENTER);
		otros14.setColumns(10);
		otros14.setBounds(730, 1717, 130, 26);
		miPanel.add(otros14);
		
		otros24 = new JTextField();
		otros24.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblOtros2.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblOtros2.setForeground(Color.BLACK);
				if (otros24.getText().equals("*")) {
					otros24.setBackground(Color.YELLOW);
				} else {
					otros24.setBackground(colorPorDefecto);
				}
			}
		});
		otros24.setHorizontalAlignment(SwingConstants.CENTER);
		otros24.setColumns(10);
		otros24.setBounds(730, 1747, 130, 26);
		miPanel.add(otros24);
		
		otros34 = new JTextField();
		otros34.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblOtros3.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblOtros3.setForeground(Color.BLACK);
				if (otros34.getText().equals("*")) {
					otros34.setBackground(Color.YELLOW);
				} else {
					otros34.setBackground(colorPorDefecto);
				}
			}
		});
		otros34.setHorizontalAlignment(SwingConstants.CENTER);
		otros34.setColumns(10);
		otros34.setBounds(730, 1777, 130, 26);
		miPanel.add(otros34);
		
		otros44 = new JTextField();
		otros44.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblOtros4.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblOtros4.setForeground(Color.BLACK);
				if (otros44.getText().equals("*")) {
					otros44.setBackground(Color.YELLOW);
				} else {
					otros44.setBackground(colorPorDefecto);
				}
			}
		});
		otros44.setHorizontalAlignment(SwingConstants.CENTER);
		otros44.setColumns(10);
		otros44.setBounds(730, 1807, 130, 26);
		miPanel.add(otros44);		
		
		JButton btnNewButton = new JButton("Crear informe");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(902, 334, 232, 82);
		miPanel.add(btnNewButton);
		
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				final String pattern = "dd/MM/yyyy";				
				
				ArrayList <AnalisisAgua> analisisParaInforme = new ArrayList <AnalisisAgua>();
				if (!String.valueOf(nroAnalisis1.getSelectedItem()).equals("-- Sin especificar --")){
					//System.out.println(fechaExtraccion1.getText());
					String dateString = fechaExtraccion1.getText();
					DateFormat df = new SimpleDateFormat(pattern);
					Date date = null;
					try {
						date = df.parse(dateString);
						System.out.println(date);
					} catch (ParseException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}			

					AnalisisBarro analisisAgua = null;
					AnalisisAgua analisisAgua1 = new AnalisisAgua(String.valueOf(nroAnalisis1.getSelectedItem()), industria.getText(), departamento1.getText(), localidad1.getText(), descargaEn1.getText(), lugarExtraccion1.getText(),
							extraidoPor1.getText(), date, horaExtraccion1.getText(), aspecto1.getText(), pHIS1.getText(), pH1.getText(), temperatura1.getText(), caudal1.getText(), ODIS1.getText(), OD1.getText(),
							DBO51.getText(), DBO5F1.getText(), DQO1.getText(), AceitesYGrasas1.getText(), SolidosTotales1.getText(), STV1.getText(), SST1.getText(), SSV1.getText(), SS101.getText(), SS301.getText(), SS601.getText(), amoniaco1.getText(), nitrato1.getText(), nitrogenoTotal1.getText(), fosforoTotal1.getText(),
							cromo1.getText(), plomo1.getText(), zinc1.getText(), aluminio1.getText(), manganeso1.getText(), potasio1.getText(), alcalinidadTotal1.getText(), acidezVolatil1.getText(), alfa1.getText(), alfaPrima1.getText(),
							bicarbonato1.getText(), salinidad1.getText(), turbiedad1.getText(), conductividad1.getText(), sulfuro1.getText(), sulfato1.getText(), fenoles1.getText(), tensoactivos1.getText(), cloroResidual1.getText(),
							cloroTotal1.getText(), cloruro1.getText(), dureza1.getText(), color1.getText(), hidrocarburos1.getText(), coliformes1.getText(), cursoAguaTipo1.getText(), "En proceso", otros11.getText(), otros21.getText(),
							otros31.getText(), otros41.getText());
					analisisParaInforme.add(analisisAgua1);
				}


				
				if (!String.valueOf(nroAnalisis2.getSelectedItem()).equals("-- Sin especificar --")){
					String dateString2 = fechaExtraccion2.getText();
					DateFormat df = new SimpleDateFormat(pattern);
					Date date2 = null;
					try {
						date2 = df.parse(dateString2);
					} catch (ParseException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}			
					AnalisisAgua analisisAgua2 = new AnalisisAgua(String.valueOf(nroAnalisis2.getSelectedItem()), industria.getText(), departamento1.getText(), localidad1.getText(), descargaEn1.getText(), lugarExtraccion2.getText(),
							extraidoPor2.getText(), date2, horaExtraccion2.getText(), aspecto2.getText(), pHIS2.getText(), pH2.getText(), temperatura2.getText(), caudal2.getText(), ODIS2.getText(), OD2.getText(),
							DBO52.getText(), DBO5F2.getText(), DQO2.getText(), AceitesYGrasas2.getText(), SolidosTotales2.getText(), STV2.getText(), SST2.getText(), SSV2.getText(), SS102.getText(), SS302.getText(), SS602.getText(), amoniaco2.getText(), nitrato2.getText(), nitrogenoTotal2.getText(), fosforoTotal2.getText(),
							cromo2.getText(), plomo2.getText(), zinc2.getText(), aluminio2.getText(), manganeso2.getText(), potasio2.getText(), alcalinidadTotal2.getText(), acidezVolatil2.getText(), alfa2.getText(), alfaPrima2.getText(),
							bicarbonato2.getText(), salinidad2.getText(), turbiedad2.getText(), conductividad2.getText(), sulfuro2.getText(), sulfato2.getText(), fenoles2.getText(), tensoactivos2.getText(), cloroResidual2.getText(),
							cloroTotal2.getText(), cloruro2.getText(), dureza2.getText(), color2.getText(), hidrocarburos2.getText(), coliformes2.getText(), cursoAguaTipo2.getText(), "En proceso", otros12.getText(), otros22.getText(),
							otros32.getText(), otros42.getText());
					analisisParaInforme.add(analisisAgua2);					
				}
				
				if (!String.valueOf(nroAnalisis3.getSelectedItem()).equals("-- Sin especificar --")){
					String dateString3 = fechaExtraccion3.getText();
					DateFormat df = new SimpleDateFormat(pattern);
					Date date3 = null;
					try {
						date3 = df.parse(dateString3);
					} catch (ParseException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}			
					AnalisisAgua analisisAgua3 = new AnalisisAgua(String.valueOf(nroAnalisis3.getSelectedItem()), industria.getText(), departamento1.getText(), localidad1.getText(), descargaEn1.getText(), lugarExtraccion3.getText(),
							extraidoPor3.getText(), date3, horaExtraccion3.getText(), aspecto3.getText(), pHIS3.getText(), pH3.getText(), temperatura3.getText(), caudal3.getText(), ODIS3.getText(), OD3.getText(),
							DBO53.getText(), DBO5F3.getText(), DQO3.getText(), AceitesYGrasas3.getText(), SolidosTotales3.getText(), STV3.getText(), SST3.getText(), SSV3.getText(), SS303.getText(), SS303.getText(), SS603.getText(), amoniaco3.getText(), nitrato3.getText(), nitrogenoTotal3.getText(), fosforoTotal3.getText(),
							cromo3.getText(), plomo3.getText(), zinc3.getText(), aluminio3.getText(), manganeso3.getText(), potasio3.getText(), alcalinidadTotal3.getText(), acidezVolatil3.getText(), alfa3.getText(), alfaPrima3.getText(),
							bicarbonato3.getText(), salinidad3.getText(), turbiedad3.getText(), conductividad3.getText(), sulfuro3.getText(), sulfato3.getText(), fenoles3.getText(), tensoactivos3.getText(), cloroResidual3.getText(),
							cloroTotal3.getText(), cloruro3.getText(), dureza3.getText(), color3.getText(), hidrocarburos3.getText(), coliformes3.getText(), cursoAguaTipo3.getText(), "En proceso", otros13.getText(), otros23.getText(),
							otros33.getText(), otros43.getText());
					analisisParaInforme.add(analisisAgua3);					
				}
				
				if (!String.valueOf(nroAnalisis4.getSelectedItem()).equals("-- Sin especificar --")){
					String dateString4 = fechaExtraccion4.getText();
					DateFormat df = new SimpleDateFormat(pattern);
					Date date4 = null;
					try {
						date4 = df.parse(dateString4);
					} catch (ParseException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}			
					AnalisisAgua analisisAgua4 = new AnalisisAgua(String.valueOf(nroAnalisis4.getSelectedItem()), industria.getText(), departamento1.getText(), localidad1.getText(), descargaEn1.getText(), lugarExtraccion4.getText(),
							extraidoPor4.getText(), date4, horaExtraccion4.getText(), aspecto4.getText(), pHIS4.getText(), pH4.getText(), temperatura4.getText(), caudal4.getText(), ODIS4.getText(), OD4.getText(),
							DBO54.getText(), DBO5F4.getText(), DQO4.getText(), AceitesYGrasas4.getText(), SolidosTotales4.getText(), STV4.getText(), SST4.getText(), SSV4.getText(), SS104.getText(), SS304.getText(), SS604.getText(), amoniaco4.getText(), nitrato4.getText(), nitrogenoTotal4.getText(), fosforoTotal4.getText(),
							cromo4.getText(), plomo4.getText(), zinc4.getText(), aluminio4.getText(), manganeso4.getText(), potasio4.getText(), alcalinidadTotal4.getText(), acidezVolatil4.getText(), alfa4.getText(), alfaPrima4.getText(),
							bicarbonato4.getText(), salinidad4.getText(), turbiedad4.getText(), conductividad4.getText(), sulfuro4.getText(), sulfato4.getText(), fenoles4.getText(), tensoactivos4.getText(), cloroResidual4.getText(),
							cloroTotal4.getText(), cloruro4.getText(), dureza4.getText(), color4.getText(), hidrocarburos4.getText(), coliformes4.getText(), cursoAguaTipo4.getText(), "En proceso", otros14.getText(), otros24.getText(),
							otros34.getText(), otros44.getText());
					analisisParaInforme.add(analisisAgua4);					
				}
				
				try {
					aguasDAO.generarTablaParaInformeAguas(analisisParaInforme);
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				//Process p = pb.start();
				ExcelAguas excelAguas = new ExcelAguas();
				try {
					ExcelAguas.realizarInforme();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MenuAguasANAGUA menuAguasANAGUA = new MenuAguasANAGUA();
				frame.dispose();
			}
		});
		btnVolver.setBounds(959, 34, 175, 51);
		miPanel.add(btnVolver);
		
		frame.getContentPane().add(scrollPane);
		miPanel.setPreferredSize(new Dimension(1000, 1850));		
		scrollPane.setViewportView(miPanel);
		
		aspecto1.setEditable(false);
		fechaExtraccion1.setEditable(false);
		horaExtraccion1.setEditable(false);
		lugarExtraccion1.setEditable(false);
		extraidoPor1.setEditable(false);
		pHIS1.setEditable(false);
		pH1.setEditable(false);
		temperatura1.setEditable(false);
		caudal1.setEditable(false);
		ODIS1.setEditable(false);
		OD1.setEditable(false);
		DBO51.setEditable(false);
		DBO5F1.setEditable(false);
		DQO1.setEditable(false);
		AceitesYGrasas1.setEditable(false);
		SolidosTotales1.setEditable(false);
		STV1.setEditable(false);
		SST1.setEditable(false);
		SSV1.setEditable(false);
		SS101.setEditable(false);
		SS301.setEditable(false);
		SS601.setEditable(false);
		amoniaco1.setEditable(false);
		nitrato1.setEditable(false);
		nitrogenoTotal1.setEditable(false);
		fosforoTotal1.setEditable(false);
		cromo1.setEditable(false);
		plomo1.setEditable(false);
		zinc1.setEditable(false);
		aluminio1.setEditable(false);
		manganeso1.setEditable(false);
		potasio1.setEditable(false);
		alcalinidadTotal1.setEditable(false);
		acidezVolatil1.setEditable(false);
		alfa1.setEditable(false);
		alfaPrima1.setEditable(false);
		bicarbonato1.setEditable(false);
		salinidad1.setEditable(false);
		turbiedad1.setEditable(false);
		conductividad1.setEditable(false);
		sulfuro1.setEditable(false);
		sulfato1.setEditable(false);
		fenoles1.setEditable(false);
		tensoactivos1.setEditable(false);
		cloroResidual1.setEditable(false);
		cloroTotal1.setEditable(false);
		cloruro1.setEditable(false);
		dureza1.setEditable(false);
		color1.setEditable(false);
		hidrocarburos1.setEditable(false);
		coliformes1.setEditable(false);
		cursoAguaTipo1.setEditable(false);
		otros11.setEditable(false);
		otros21.setEditable(false);
		otros31.setEditable(false);
		otros41.setEditable(false);
		
		aspecto2.setEditable(false);
		fechaExtraccion2.setEditable(false);
		horaExtraccion2.setEditable(false);
		lugarExtraccion2.setEditable(false);
		extraidoPor2.setEditable(false);
		pHIS2.setEditable(false);
		pH2.setEditable(false);
		temperatura2.setEditable(false);
		caudal2.setEditable(false);
		ODIS2.setEditable(false);
		OD2.setEditable(false);
		DBO52.setEditable(false);
		DBO5F2.setEditable(false);
		DQO2.setEditable(false);
		AceitesYGrasas2.setEditable(false);
		SolidosTotales2.setEditable(false);
		STV2.setEditable(false);
		SST2.setEditable(false);
		SSV2.setEditable(false);
		SS102.setEditable(false);
		SS302.setEditable(false);
		SS602.setEditable(false);
		amoniaco2.setEditable(false);
		nitrato2.setEditable(false);
		nitrogenoTotal2.setEditable(false);
		fosforoTotal2.setEditable(false);
		cromo2.setEditable(false);
		plomo2.setEditable(false);
		zinc2.setEditable(false);
		aluminio2.setEditable(false);
		manganeso2.setEditable(false);
		potasio2.setEditable(false);
		alcalinidadTotal2.setEditable(false);
		acidezVolatil2.setEditable(false);
		alfa2.setEditable(false);
		alfaPrima2.setEditable(false);
		bicarbonato2.setEditable(false);
		salinidad2.setEditable(false);
		turbiedad2.setEditable(false);
		conductividad2.setEditable(false);
		sulfuro2.setEditable(false);
		sulfato2.setEditable(false);
		fenoles2.setEditable(false);
		tensoactivos2.setEditable(false);
		cloroResidual2.setEditable(false);
		cloroTotal2.setEditable(false);
		cloruro2.setEditable(false);
		dureza2.setEditable(false);
		color2.setEditable(false);
		hidrocarburos2.setEditable(false);
		coliformes2.setEditable(false);
		cursoAguaTipo2.setEditable(false);
		otros12.setEditable(false);
		otros22.setEditable(false);
		otros32.setEditable(false);
		otros42.setEditable(false);
		
		aspecto3.setEditable(false);
		fechaExtraccion3.setEditable(false);
		horaExtraccion3.setEditable(false);
		lugarExtraccion3.setEditable(false);
		extraidoPor3.setEditable(false);
		pHIS3.setEditable(false);
		pH3.setEditable(false);
		temperatura3.setEditable(false);
		caudal3.setEditable(false);
		ODIS3.setEditable(false);
		OD3.setEditable(false);
		DBO53.setEditable(false);
		DBO5F3.setEditable(false);
		DQO3.setEditable(false);
		AceitesYGrasas3.setEditable(false);
		SolidosTotales3.setEditable(false);
		STV3.setEditable(false);
		SST3.setEditable(false);
		SSV3.setEditable(false);
		SS103.setEditable(false);
		SS303.setEditable(false);
		SS603.setEditable(false);
		amoniaco3.setEditable(false);
		nitrato3.setEditable(false);
		nitrogenoTotal3.setEditable(false);
		fosforoTotal3.setEditable(false);
		cromo3.setEditable(false);
		plomo3.setEditable(false);
		zinc3.setEditable(false);
		aluminio3.setEditable(false);
		manganeso3.setEditable(false);
		potasio3.setEditable(false);
		alcalinidadTotal3.setEditable(false);
		acidezVolatil3.setEditable(false);
		alfa3.setEditable(false);
		alfaPrima3.setEditable(false);
		bicarbonato3.setEditable(false);
		salinidad3.setEditable(false);
		turbiedad3.setEditable(false);
		conductividad3.setEditable(false);
		sulfuro3.setEditable(false);
		sulfato3.setEditable(false);
		fenoles3.setEditable(false);
		tensoactivos3.setEditable(false);
		cloroResidual3.setEditable(false);
		cloroTotal3.setEditable(false);
		cloruro3.setEditable(false);
		dureza3.setEditable(false);
		color3.setEditable(false);
		hidrocarburos3.setEditable(false);
		coliformes3.setEditable(false);
		cursoAguaTipo3.setEditable(false);
		otros13.setEditable(false);
		otros23.setEditable(false);
		otros33.setEditable(false);
		otros43.setEditable(false);
		
		aspecto4.setEditable(false);
		fechaExtraccion4.setEditable(false);
		horaExtraccion4.setEditable(false);
		lugarExtraccion4.setEditable(false);
		extraidoPor4.setEditable(false);
		pHIS4.setEditable(false);
		pH4.setEditable(false);
		temperatura4.setEditable(false);
		caudal4.setEditable(false);
		ODIS4.setEditable(false);
		OD4.setEditable(false);
		DBO54.setEditable(false);
		DBO5F4.setEditable(false);
		DQO4.setEditable(false);
		AceitesYGrasas4.setEditable(false);
		SolidosTotales4.setEditable(false);
		STV4.setEditable(false);
		SST4.setEditable(false);
		SSV4.setEditable(false);
		SS104.setEditable(false);
		SS304.setEditable(false);
		SS604.setEditable(false);
		amoniaco4.setEditable(false);
		nitrato4.setEditable(false);
		nitrogenoTotal4.setEditable(false);
		fosforoTotal4.setEditable(false);
		cromo4.setEditable(false);
		plomo4.setEditable(false);
		zinc4.setEditable(false);
		aluminio4.setEditable(false);
		manganeso4.setEditable(false);
		potasio4.setEditable(false);
		alcalinidadTotal4.setEditable(false);
		acidezVolatil4.setEditable(false);
		alfa4.setEditable(false);
		alfaPrima4.setEditable(false);
		bicarbonato4.setEditable(false);
		salinidad4.setEditable(false);
		turbiedad4.setEditable(false);
		conductividad4.setEditable(false);
		sulfuro4.setEditable(false);
		sulfato4.setEditable(false);
		fenoles4.setEditable(false);
		tensoactivos4.setEditable(false);
		cloroResidual4.setEditable(false);
		cloroTotal4.setEditable(false);
		cloruro4.setEditable(false);
		dureza4.setEditable(false);
		color4.setEditable(false);
		hidrocarburos4.setEditable(false);
		coliformes4.setEditable(false);
		cursoAguaTipo4.setEditable(false);
		otros14.setEditable(false);
		otros24.setEditable(false);
		otros34.setEditable(false);
		otros44.setEditable(false);
		departamento1.setEditable(false);
		localidad1.setEditable(false);
		descargaEn1.setEditable(false);
		departamento1.setBackground(colorPorDefecto);
		localidad1.setBackground(colorPorDefecto);
		descargaEn1.setBackground(colorPorDefecto);
		
	}

}
