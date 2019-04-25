package vistas;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import com.toedter.calendar.JDateChooser;

import aguas.*;
import barros.AnalisisBarro;
import industrias.Industria;
import industrias.IndustriasDAO;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class FormularioIngresoAguas {

	private JFrame frame;
	private JPanel miPanel;
	private JScrollPane scrollPane;
	private JTextField departamento;
	private JTextField localidad;
	private JTextField descargaEn;
	private JComboBox industria;
	private Color destacado = Color.blue;
	private JTextField nroAnalisis1;
	private JTextField lugarExtraccion1;
	private JTextField aspecto1;
	private JDateChooser fechaExtraccion1;
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
	private JTextField nroAnalisis2;
	private JTextField lugarExtraccion2;
	private JTextField aspecto2;
	private JDateChooser fechaExtraccion2;
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
	private JTextField nroAnalisis3;
	private JTextField lugarExtraccion3;
	private JTextField aspecto3;
	private JDateChooser fechaExtraccion3;
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
	private JTextField nroAnalisis4;
	private JTextField lugarExtraccion4;
	private JTextField aspecto4;
	private JDateChooser fechaExtraccion4;
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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioIngresoAguas window = new FormularioIngresoAguas();
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
	public FormularioIngresoAguas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {


		IndustriasDAO industriasDAO = new IndustriasDAO();
		AguasDAO aguasDAO = new AguasDAO();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 1200, 850);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Formulario de ingreso de análisis de barros - ANAGUA");
		frame.setVisible(true);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(5, 10, 3200, 1000);
		scrollPane.getVerticalScrollBar().setUnitIncrement(16);
		
		miPanel = new JPanel();
		miPanel.setLayout(null);
		
		JLabel lblIndustria = new JLabel("INDUSTRIA");
		lblIndustria.setBounds(300, 20, 75, 16);
		miPanel.add(lblIndustria);
		lblIndustria.setForeground(Color.BLACK);
		
		JLabel lblDepartamento = new JLabel("DEPARTAMENTO");
		lblDepartamento.setBounds(300, 50, 109, 16);
		miPanel.add(lblDepartamento);
		lblDepartamento.setForeground(Color.BLACK);
		
		JLabel lblLocalidad = new JLabel("LOCALIDAD");
		lblLocalidad.setBounds(300, 80, 109, 16);
		miPanel.add(lblLocalidad);
		lblLocalidad.setForeground(Color.BLACK);
		
		JLabel lblDescargaEn = new JLabel("DESCARGA EN");
		lblDescargaEn.setBounds(600, 50, 109, 16);
		miPanel.add(lblDescargaEn);
		lblDescargaEn.setForeground(Color.BLACK);
		
		industria = new JComboBox();
		industria.setBounds(421, 15, 272, 27);
		miPanel.add(industria);
		for (Industria i : industriasDAO.obtenerIndustrias()){
			industria.addItem(i.getCliente());
		}
		industria.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent arg0){
				Industria industriaSeleccionada = industriasDAO.obtenerIndustriaPorNombre(String.valueOf(industria.getSelectedItem()));
				departamento.setText(industriaSeleccionada.getDepartamento());
				localidad.setText(industriaSeleccionada.getLocalidad());
				descargaEn.setText(industriaSeleccionada.getDescarga());
			}
		});
		
		departamento = new JTextField();
		departamento.setBounds(421, 45, 169, 26);
		miPanel.add(departamento);
		departamento.setColumns(10);
		departamento.setEditable(false);
		
		localidad = new JTextField();
		localidad.setColumns(10);
		localidad.setBounds(421, 75, 169, 26);
		miPanel.add(localidad);
		localidad.setEditable(false);
		
		descargaEn = new JTextField();
		descargaEn.setColumns(10);
		descargaEn.setBounds(703, 45, 169, 26);
		miPanel.add(descargaEn);
		descargaEn.setEditable(false);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(26, 106, 1155, 12);
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
		
		nroAnalisis1 = new JTextField();
		nroAnalisis1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblNroAnalisis.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblNroAnalisis.setForeground(Color.BLACK);
			}
		});
		nroAnalisis1.setBounds(191, 125, 130, 26);
		miPanel.add(nroAnalisis1);
		nroAnalisis1.setColumns(10);
		nroAnalisis1.setHorizontalAlignment(JTextField.CENTER);
		
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
					lugarExtraccion1.setBackground(Color.WHITE);
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
					extraidoPor1.setBackground(Color.WHITE);
				}
			}
		});
		extraidoPor1.setBounds(191, 185, 130, 26);
		miPanel.add(extraidoPor1);
		extraidoPor1.setColumns(10);
		extraidoPor1.setHorizontalAlignment(JTextField.CENTER);
		
		fechaExtraccion1 = new JDateChooser();		
		fechaExtraccion1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblFechaExtraccion.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblFechaExtraccion.setForeground(Color.BLACK);
			}
		});
		fechaExtraccion1.setBounds(191, 215, 130, 26);
		miPanel.add(fechaExtraccion1);
		
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
					horaExtraccion1.setBackground(Color.WHITE);
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
					aspecto1.setBackground(Color.WHITE);
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
					pHIS1.setBackground(Color.WHITE);
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
					pH1.setBackground(Color.WHITE);
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
					temperatura1.setBackground(Color.WHITE);
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
					caudal1.setBackground(Color.WHITE);
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
					ODIS1.setBackground(Color.WHITE);
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
					OD1.setBackground(Color.WHITE);
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
					DBO51.setBackground(Color.WHITE);
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
					DBO5F1.setBackground(Color.WHITE);
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
					DQO1.setBackground(Color.WHITE);
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
					AceitesYGrasas1.setBackground(Color.WHITE);
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
					SolidosTotales1.setBackground(Color.WHITE);
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
					STV1.setBackground(Color.WHITE);
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
					SST1.setBackground(Color.WHITE);
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
					SSV1.setBackground(Color.WHITE);
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
					SS101.setBackground(Color.WHITE);
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
					SS301.setBackground(Color.WHITE);
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
					SS601.setBackground(Color.WHITE);
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
					amoniaco1.setBackground(Color.WHITE);
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
					nitrato1.setBackground(Color.WHITE);
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
					nitrogenoTotal1.setBackground(Color.WHITE);
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
					fosforoTotal1.setBackground(Color.WHITE);
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
					cromo1.setBackground(Color.WHITE);
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
					plomo1.setBackground(Color.WHITE);
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
					zinc1.setBackground(Color.WHITE);
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
					aluminio1.setBackground(Color.WHITE);
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
					manganeso1.setBackground(Color.WHITE);
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
					potasio1.setBackground(Color.WHITE);
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
					alcalinidadTotal1.setBackground(Color.WHITE);
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
					acidezVolatil1.setBackground(Color.WHITE);
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
					alfa1.setBackground(Color.WHITE);
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
					alfaPrima1.setBackground(Color.WHITE);
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
					bicarbonato1.setBackground(Color.WHITE);
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
					salinidad1.setBackground(Color.WHITE);
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
					turbiedad1.setBackground(Color.WHITE);
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
					conductividad1.setBackground(Color.WHITE);
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
					sulfuro1.setBackground(Color.WHITE);
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
					sulfato1.setBackground(Color.WHITE);
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
					fenoles1.setBackground(Color.WHITE);
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
					tensoactivos1.setBackground(Color.WHITE);
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
					cloroResidual1.setBackground(Color.WHITE);
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
					cloroTotal1.setBackground(Color.WHITE);
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
					cloruro1.setBackground(Color.WHITE);
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
					dureza1.setBackground(Color.WHITE);
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
					color1.setBackground(Color.WHITE);
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
					hidrocarburos1.setBackground(Color.WHITE);
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
					coliformes1.setBackground(Color.WHITE);
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
					cursoAguaTipo1.setBackground(Color.WHITE);
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
					otros11.setBackground(Color.WHITE);
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
					otros21.setBackground(Color.WHITE);
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
					otros31.setBackground(Color.WHITE);
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
					otros41.setBackground(Color.WHITE);
				}
			}
		});
		otros41.setHorizontalAlignment(SwingConstants.CENTER);
		otros41.setColumns(10);
		otros41.setBounds(191, 1807, 130, 26);
		miPanel.add(otros41);
		
		// comienza segunda columna
		
		nroAnalisis2 = new JTextField();
		nroAnalisis2.setBounds(370, 125, 130, 26);
		miPanel.add(nroAnalisis2);
		nroAnalisis2.setColumns(10);
		nroAnalisis2.setHorizontalAlignment(JTextField.CENTER);
		
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
					lugarExtraccion2.setBackground(Color.WHITE);
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
					extraidoPor2.setBackground(Color.WHITE);
				}
			}
		});
		extraidoPor2.setBounds(370, 185, 130, 26);
		miPanel.add(extraidoPor2);
		extraidoPor2.setColumns(10);
		extraidoPor2.setHorizontalAlignment(JTextField.CENTER);
		
		fechaExtraccion2 = new JDateChooser();		
		fechaExtraccion2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblFechaExtraccion.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblFechaExtraccion.setForeground(Color.BLACK);
			}
		});
		fechaExtraccion2.setBounds(370, 215, 130, 26);
		miPanel.add(fechaExtraccion2);
		
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
					horaExtraccion2.setBackground(Color.WHITE);
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
					aspecto2.setBackground(Color.WHITE);
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
					pHIS2.setBackground(Color.WHITE);
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
					pH2.setBackground(Color.WHITE);
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
					temperatura2.setBackground(Color.WHITE);
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
					caudal2.setBackground(Color.WHITE);
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
					ODIS2.setBackground(Color.WHITE);
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
					OD2.setBackground(Color.WHITE);
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
					DBO52.setBackground(Color.WHITE);
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
					DBO5F2.setBackground(Color.WHITE);
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
					DQO2.setBackground(Color.WHITE);
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
					AceitesYGrasas2.setBackground(Color.WHITE);
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
					SolidosTotales2.setBackground(Color.WHITE);
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
					STV2.setBackground(Color.WHITE);
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
					SST2.setBackground(Color.WHITE);
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
					SSV2.setBackground(Color.WHITE);
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
					SS102.setBackground(Color.WHITE);
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
					SS302.setBackground(Color.WHITE);
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
					SS602.setBackground(Color.WHITE);
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
					amoniaco2.setBackground(Color.WHITE);
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
					nitrato2.setBackground(Color.WHITE);
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
					nitrogenoTotal2.setBackground(Color.WHITE);
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
					fosforoTotal2.setBackground(Color.WHITE);
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
					cromo2.setBackground(Color.WHITE);
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
					plomo2.setBackground(Color.WHITE);
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
					zinc2.setBackground(Color.WHITE);
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
					aluminio2.setBackground(Color.WHITE);
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
					manganeso2.setBackground(Color.WHITE);
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
					potasio2.setBackground(Color.WHITE);
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
					alcalinidadTotal2.setBackground(Color.WHITE);
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
					acidezVolatil2.setBackground(Color.WHITE);
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
					alfa2.setBackground(Color.WHITE);
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
					alfaPrima2.setBackground(Color.WHITE);
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
					bicarbonato2.setBackground(Color.WHITE);
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
					salinidad2.setBackground(Color.WHITE);
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
					turbiedad2.setBackground(Color.WHITE);
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
					conductividad2.setBackground(Color.WHITE);
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
					sulfuro2.setBackground(Color.WHITE);
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
					sulfato2.setBackground(Color.WHITE);
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
					fenoles2.setBackground(Color.WHITE);
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
					tensoactivos2.setBackground(Color.WHITE);
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
					cloroResidual2.setBackground(Color.WHITE);
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
					cloroTotal2.setBackground(Color.WHITE);
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
					cloruro2.setBackground(Color.WHITE);
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
					dureza2.setBackground(Color.WHITE);
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
					color2.setBackground(Color.WHITE);
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
					hidrocarburos2.setBackground(Color.WHITE);
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
					coliformes2.setBackground(Color.WHITE);
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
					cursoAguaTipo2.setBackground(Color.WHITE);
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
					otros12.setBackground(Color.WHITE);
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
					otros22.setBackground(Color.WHITE);
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
					otros32.setBackground(Color.WHITE);
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
					otros42.setBackground(Color.WHITE);
				}
			}
		});
		otros42.setHorizontalAlignment(SwingConstants.CENTER);
		otros42.setColumns(10);
		otros42.setBounds(370, 1807, 130, 26);
		miPanel.add(otros42);	
				
		// termina segunda columna
		
		
		
		
		// comienza tercera columna
		
		nroAnalisis3 = new JTextField();
		nroAnalisis3.setBounds(550, 125, 130, 26);
		miPanel.add(nroAnalisis3);
		nroAnalisis3.setColumns(10);
		nroAnalisis3.setHorizontalAlignment(JTextField.CENTER);
		
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
					lugarExtraccion3.setBackground(Color.WHITE);
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
					extraidoPor3.setBackground(Color.WHITE);
				}
			}
		});
		extraidoPor3.setBounds(550, 185, 130, 26);
		miPanel.add(extraidoPor3);
		extraidoPor3.setColumns(10);
		extraidoPor3.setHorizontalAlignment(JTextField.CENTER);
		
		fechaExtraccion3 = new JDateChooser();		
		fechaExtraccion3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblFechaExtraccion.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblFechaExtraccion.setForeground(Color.BLACK);
			}
		});
		fechaExtraccion3.setBounds(550, 215, 130, 26);
		miPanel.add(fechaExtraccion3);
		
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
					horaExtraccion3.setBackground(Color.WHITE);
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
					aspecto3.setBackground(Color.WHITE);
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
					pHIS3.setBackground(Color.WHITE);
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
					pH3.setBackground(Color.WHITE);
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
					temperatura3.setBackground(Color.WHITE);
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
					caudal3.setBackground(Color.WHITE);
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
					ODIS3.setBackground(Color.WHITE);
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
					OD3.setBackground(Color.WHITE);
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
					DBO53.setBackground(Color.WHITE);
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
					DBO5F3.setBackground(Color.WHITE);
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
					DQO3.setBackground(Color.WHITE);
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
					AceitesYGrasas3.setBackground(Color.WHITE);
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
					SolidosTotales3.setBackground(Color.WHITE);
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
					STV3.setBackground(Color.WHITE);
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
					SST3.setBackground(Color.WHITE);
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
					SSV3.setBackground(Color.WHITE);
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
					SS103.setBackground(Color.WHITE);
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
					SS303.setBackground(Color.WHITE);
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
					SS603.setBackground(Color.WHITE);
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
					amoniaco3.setBackground(Color.WHITE);
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
					nitrato3.setBackground(Color.WHITE);
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
					nitrogenoTotal3.setBackground(Color.WHITE);
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
					fosforoTotal3.setBackground(Color.WHITE);
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
					cromo3.setBackground(Color.WHITE);
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
					plomo3.setBackground(Color.WHITE);
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
					zinc3.setBackground(Color.WHITE);
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
					aluminio3.setBackground(Color.WHITE);
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
					manganeso3.setBackground(Color.WHITE);
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
					potasio3.setBackground(Color.WHITE);
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
					alcalinidadTotal3.setBackground(Color.WHITE);
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
					acidezVolatil3.setBackground(Color.WHITE);
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
					alfa3.setBackground(Color.WHITE);
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
					alfaPrima3.setBackground(Color.WHITE);
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
					bicarbonato3.setBackground(Color.WHITE);
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
					salinidad3.setBackground(Color.WHITE);
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
					turbiedad3.setBackground(Color.WHITE);
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
					conductividad3.setBackground(Color.WHITE);
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
					sulfuro3.setBackground(Color.WHITE);
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
					sulfato3.setBackground(Color.WHITE);
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
					fenoles3.setBackground(Color.WHITE);
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
					tensoactivos3.setBackground(Color.WHITE);
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
					cloroResidual3.setBackground(Color.WHITE);
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
					cloroTotal3.setBackground(Color.WHITE);
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
					cloruro3.setBackground(Color.WHITE);
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
					dureza3.setBackground(Color.WHITE);
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
					color3.setBackground(Color.WHITE);
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
					hidrocarburos3.setBackground(Color.WHITE);
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
					coliformes3.setBackground(Color.WHITE);
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
					cursoAguaTipo3.setBackground(Color.WHITE);
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
					otros13.setBackground(Color.WHITE);
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
					otros23.setBackground(Color.WHITE);
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
					otros33.setBackground(Color.WHITE);
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
					otros43.setBackground(Color.WHITE);
				}
			}
		});
		otros43.setHorizontalAlignment(SwingConstants.CENTER);
		otros43.setColumns(10);
		otros43.setBounds(550, 1807, 130, 26);
		miPanel.add(otros43);
		
		// termina tercera columna
		
		// empieza cuarta columna
		
		nroAnalisis4 = new JTextField();
		nroAnalisis4.setBounds(730, 125, 130, 26);
		miPanel.add(nroAnalisis4);
		nroAnalisis4.setColumns(10);
		nroAnalisis4.setHorizontalAlignment(JTextField.CENTER);
		
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
					lugarExtraccion4.setBackground(Color.WHITE);
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
					extraidoPor4.setBackground(Color.WHITE);
				}
			}
		});
		extraidoPor4.setBounds(730, 185, 130, 26);
		miPanel.add(extraidoPor4);
		extraidoPor4.setColumns(10);
		extraidoPor4.setHorizontalAlignment(JTextField.CENTER);
		
		fechaExtraccion4 = new JDateChooser();		
		fechaExtraccion4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblFechaExtraccion.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblFechaExtraccion.setForeground(Color.BLACK);
			}
		});
		fechaExtraccion4.setBounds(730, 215, 130, 26);
		miPanel.add(fechaExtraccion4);
		
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
					horaExtraccion4.setBackground(Color.WHITE);
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
					aspecto4.setBackground(Color.WHITE);
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
					pHIS4.setBackground(Color.WHITE);
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
					pH4.setBackground(Color.WHITE);
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
					temperatura4.setBackground(Color.WHITE);
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
					caudal4.setBackground(Color.WHITE);
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
					ODIS4.setBackground(Color.WHITE);
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
					OD4.setBackground(Color.WHITE);
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
					DBO54.setBackground(Color.WHITE);
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
					DBO5F4.setBackground(Color.WHITE);
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
					DQO4.setBackground(Color.WHITE);
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
					AceitesYGrasas4.setBackground(Color.WHITE);
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
					SolidosTotales4.setBackground(Color.WHITE);
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
					STV4.setBackground(Color.WHITE);
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
					SST4.setBackground(Color.WHITE);
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
					SSV4.setBackground(Color.WHITE);
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
					SS104.setBackground(Color.WHITE);
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
					SS304.setBackground(Color.WHITE);
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
					SS604.setBackground(Color.WHITE);
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
					amoniaco4.setBackground(Color.WHITE);
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
					nitrato4.setBackground(Color.WHITE);
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
					nitrogenoTotal4.setBackground(Color.WHITE);
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
					fosforoTotal4.setBackground(Color.WHITE);
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
					cromo4.setBackground(Color.WHITE);
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
					plomo4.setBackground(Color.WHITE);
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
					zinc4.setBackground(Color.WHITE);
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
					aluminio4.setBackground(Color.WHITE);
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
					manganeso4.setBackground(Color.WHITE);
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
					potasio4.setBackground(Color.WHITE);
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
					alcalinidadTotal4.setBackground(Color.WHITE);
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
					acidezVolatil4.setBackground(Color.WHITE);
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
					alfa4.setBackground(Color.WHITE);
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
					alfaPrima4.setBackground(Color.WHITE);
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
					bicarbonato4.setBackground(Color.WHITE);
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
					salinidad4.setBackground(Color.WHITE);
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
					turbiedad4.setBackground(Color.WHITE);
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
					conductividad4.setBackground(Color.WHITE);
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
					sulfuro4.setBackground(Color.WHITE);
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
					sulfato4.setBackground(Color.WHITE);
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
					fenoles4.setBackground(Color.WHITE);
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
					tensoactivos4.setBackground(Color.WHITE);
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
					cloroResidual4.setBackground(Color.WHITE);
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
					cloroTotal4.setBackground(Color.WHITE);
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
					cloruro4.setBackground(Color.WHITE);
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
					dureza4.setBackground(Color.WHITE);
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
					color4.setBackground(Color.WHITE);
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
					hidrocarburos4.setBackground(Color.WHITE);
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
					coliformes4.setBackground(Color.WHITE);
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
					cursoAguaTipo4.setBackground(Color.WHITE);
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
					otros14.setBackground(Color.WHITE);
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
					otros24.setBackground(Color.WHITE);
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
					otros34.setBackground(Color.WHITE);
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
					otros44.setBackground(Color.WHITE);
				}
			}
		});
		otros44.setHorizontalAlignment(SwingConstants.CENTER);
		otros44.setColumns(10);
		otros44.setBounds(730, 1807, 130, 26);
		miPanel.add(otros44);		
		
		// termina cuarta columna		
		
		frame.getContentPane().add(scrollPane);
		
		miPanel.setPreferredSize(new Dimension(1000, 1850));		
		scrollPane.setViewportView(miPanel);
		
		JButton btnAgregarAnlisis = new JButton("Agregar an\u00E1lisis");
		btnAgregarAnlisis.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAgregarAnlisis.setBounds(900, 250, 215, 114);
		miPanel.add(btnAgregarAnlisis);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MenuBarrosANAGUA menuBarrosANAGUA = new MenuBarrosANAGUA();
				frame.dispose();
			}
		});
		btnVolver.setBounds(959, 34, 175, 51);
		miPanel.add(btnVolver);
		
		btnAgregarAnlisis.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ArrayList <AnalisisAgua> analisisAAgregar = new ArrayList <AnalisisAgua>();
				if (!nroAnalisis1.getText().equals("")) {
					AnalisisAgua analisisAgua1 = new AnalisisAgua(nroAnalisis1.getText(), String.valueOf(industria.getSelectedItem()), departamento.getText(), localidad.getText(), descargaEn.getText(), lugarExtraccion1.getText(),
							extraidoPor1.getText(), fechaExtraccion1.getDate(), horaExtraccion1.getText(), aspecto1.getText(), pHIS1.getText(), pH1.getText(), temperatura1.getText(), caudal1.getText(), ODIS1.getText(), OD1.getText(),
							DBO51.getText(), DBO5F1.getText(), DQO1.getText(), AceitesYGrasas1.getText(), SolidosTotales1.getText(), STV1.getText(), SST1.getText(), SSV1.getText(), SS101.getText(), SS301.getText(), SS601.getText(), amoniaco1.getText(), nitrato1.getText(), nitrogenoTotal1.getText(), fosforoTotal1.getText(),
							cromo1.getText(), plomo1.getText(), zinc1.getText(), aluminio1.getText(), manganeso1.getText(), potasio1.getText(), alcalinidadTotal1.getText(), acidezVolatil1.getText(), alfa1.getText(), alfaPrima1.getText(),
							bicarbonato1.getText(), salinidad1.getText(), turbiedad1.getText(), conductividad1.getText(), sulfuro1.getText(), sulfato1.getText(), fenoles1.getText(), tensoactivos1.getText(), cloroResidual1.getText(),
							cloroTotal1.getText(), cloruro1.getText(), dureza1.getText(), color1.getText(), hidrocarburos1.getText(), coliformes1.getText(), cursoAguaTipo1.getText(), "En proceso", otros11.getText(), otros21.getText(),
							otros31.getText(), otros41.getText());
					analisisAAgregar.add(analisisAgua1);
				}
				if (!nroAnalisis2.getText().equals("")) {
					AnalisisAgua analisisAgua2 = new AnalisisAgua(nroAnalisis2.getText(), String.valueOf(industria.getSelectedItem()), departamento.getText(), localidad.getText(), descargaEn.getText(), lugarExtraccion2.getText(),
							extraidoPor2.getText(), fechaExtraccion2.getDate(), horaExtraccion2.getText(), aspecto2.getText(), pHIS2.getText(), pH2.getText(), temperatura2.getText(), caudal2.getText(), ODIS2.getText(), OD2.getText(),
							DBO52.getText(), DBO5F2.getText(), DQO2.getText(), AceitesYGrasas2.getText(), SolidosTotales2.getText(), STV2.getText(), SST2.getText(), SSV2.getText(), SS102.getText(), SS302.getText(), SS602.getText(), amoniaco2.getText(), nitrato2.getText(), nitrogenoTotal2.getText(), fosforoTotal2.getText(),
							cromo2.getText(), plomo2.getText(), zinc2.getText(), aluminio2.getText(), manganeso2.getText(), potasio2.getText(), alcalinidadTotal2.getText(), acidezVolatil2.getText(), alfa2.getText(), alfaPrima2.getText(),
							bicarbonato2.getText(), salinidad2.getText(), turbiedad2.getText(), conductividad2.getText(), sulfuro2.getText(), sulfato2.getText(), fenoles2.getText(), tensoactivos2.getText(), cloroResidual2.getText(),
							cloroTotal2.getText(), cloruro2.getText(), dureza2.getText(), color2.getText(), hidrocarburos2.getText(), coliformes2.getText(), cursoAguaTipo2.getText(), "En proceso", otros12.getText(), otros22.getText(),
							otros32.getText(), otros42.getText());
					analisisAAgregar.add(analisisAgua2);
				}
				if (!nroAnalisis3.getText().equals("")) {
					AnalisisAgua analisisAgua3 = new AnalisisAgua(nroAnalisis3.getText(), String.valueOf(industria.getSelectedItem()), departamento.getText(), localidad.getText(), descargaEn.getText(), lugarExtraccion3.getText(),
							extraidoPor3.getText(), fechaExtraccion3.getDate(), horaExtraccion3.getText(), aspecto3.getText(), pHIS3.getText(), pH3.getText(), temperatura3.getText(), caudal3.getText(), ODIS3.getText(), OD3.getText(),
							DBO53.getText(), DBO5F3.getText(), DQO3.getText(), AceitesYGrasas3.getText(), SolidosTotales3.getText(), STV3.getText(), SST3.getText(), SSV3.getText(), SS303.getText(), SS303.getText(), SS603.getText(), amoniaco3.getText(), nitrato3.getText(), nitrogenoTotal3.getText(), fosforoTotal3.getText(),
							cromo3.getText(), plomo3.getText(), zinc3.getText(), aluminio3.getText(), manganeso3.getText(), potasio3.getText(), alcalinidadTotal3.getText(), acidezVolatil3.getText(), alfa3.getText(), alfaPrima3.getText(),
							bicarbonato3.getText(), salinidad3.getText(), turbiedad3.getText(), conductividad3.getText(), sulfuro3.getText(), sulfato3.getText(), fenoles3.getText(), tensoactivos3.getText(), cloroResidual3.getText(),
							cloroTotal3.getText(), cloruro3.getText(), dureza3.getText(), color3.getText(), hidrocarburos3.getText(), coliformes3.getText(), cursoAguaTipo3.getText(), "En proceso", otros13.getText(), otros23.getText(),
							otros33.getText(), otros43.getText());
					analisisAAgregar.add(analisisAgua3);
				}
				if (!nroAnalisis4.getText().equals("")) {
					AnalisisAgua analisisAgua4 = new AnalisisAgua(nroAnalisis4.getText(), String.valueOf(industria.getSelectedItem()), departamento.getText(), localidad.getText(), descargaEn.getText(), lugarExtraccion4.getText(),
							extraidoPor4.getText(), fechaExtraccion4.getDate(), horaExtraccion4.getText(), aspecto4.getText(), pHIS4.getText(), pH4.getText(), temperatura4.getText(), caudal4.getText(), ODIS4.getText(), OD4.getText(),
							DBO54.getText(), DBO5F4.getText(), DQO4.getText(), AceitesYGrasas4.getText(), SolidosTotales4.getText(), STV4.getText(), SST4.getText(), SSV4.getText(), SS104.getText(), SS304.getText(), SS604.getText(), amoniaco4.getText(), nitrato4.getText(), nitrogenoTotal4.getText(), fosforoTotal4.getText(),
							cromo4.getText(), plomo4.getText(), zinc4.getText(), aluminio4.getText(), manganeso4.getText(), potasio4.getText(), alcalinidadTotal4.getText(), acidezVolatil4.getText(), alfa4.getText(), alfaPrima4.getText(),
							bicarbonato4.getText(), salinidad4.getText(), turbiedad4.getText(), conductividad4.getText(), sulfuro4.getText(), sulfato4.getText(), fenoles4.getText(), tensoactivos4.getText(), cloroResidual4.getText(),
							cloroTotal4.getText(), cloruro4.getText(), dureza4.getText(), color4.getText(), hidrocarburos4.getText(), coliformes4.getText(), cursoAguaTipo4.getText(), "En proceso", otros14.getText(), otros24.getText(),
							otros34.getText(), otros44.getText());
					analisisAAgregar.add(analisisAgua4);
				}
				
					for (int i=0; i<analisisAAgregar.size(); i++) {
						try {
							aguasDAO.agregarAgua(analisisAAgregar.get(i));
							JOptionPane.showMessageDialog(null, "Se agregaron "+analisisAAgregar.size()+" análisis al sistema correctamente.");
						} catch (MySQLIntegrityConstraintViolationException e1) {
							JOptionPane.showMessageDialog(null, "Usted está intentando agregar un análisis con un número ya existente en el sistema.");
							e1.printStackTrace();
						} catch (SQLException e1) {
							JOptionPane.showMessageDialog(null, "Se ha producido un error. Revise los datos que intenta ingresar.");
							e1.printStackTrace();
						}
					}
					
					
				 
			}
		});
		
	}
}
