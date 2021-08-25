package vistas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
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
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import com.toedter.calendar.JDateChooser;

import aguas.AguasDAO;
import aguas.AnalisisAgua;
import barros.AnalisisBarro;
import industrias.Industria;
import industrias.IndustriasDAO;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class FormularioModificacionAguas {

	private JFrame frame;
	private JPanel miPanel;
	private JScrollPane scrollPane;
	private JTextField departamento1;
	private JTextField localidad1;
	private JTextField descargaEn1;
	private JComboBox industria;
	private Color destacado = Color.blue;
	private JComboBox nroAnalisis1;
	private JTextField lugarExtraccion1;
	private JTextField aspecto1;
	private JDateChooser fchExtraccion;
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
	private JTextField estado1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioModificacionAguas window = new FormularioModificacionAguas();
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
	public FormularioModificacionAguas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		AguasDAO aguasDAO = new AguasDAO();
		IndustriasDAO industriasDAO = new IndustriasDAO();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 623, 870);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Formulario de modificación de análisis de aguas - ANAGUA");
		frame.setVisible(true);
		frame.setResizable(false);
		
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
		
		industria = new JComboBox();
		industria.setBounds(156, 16, 256, 27);
		miPanel.add(industria);
		for (Industria i : industriasDAO.obtenerIndustrias()){
			industria.addItem(i.getCliente());
		}
		industria.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent arg0){
				Industria industriaSeleccionada = industriasDAO.obtenerIndustriaPorNombre(String.valueOf(industria.getSelectedItem()));
				departamento1.setText(industriaSeleccionada.getDepartamento());
				localidad1.setText(industriaSeleccionada.getLocalidad());
				descargaEn1.setText(industriaSeleccionada.getDescargaAbreviada());
			}
		});
		
		AutoCompletion.enable(industria);
		
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
		
		JDateChooser fchExtraccion = new JDateChooser(); 
		fchExtraccion.setBounds(191, 215, 130, 26);
		miPanel.add(fchExtraccion);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(6, 108, 588, 24);
		frame.getContentPane().add(separator);
		
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
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setBounds(37, 1840, 179, 20);
		miPanel.add(lblEstado);
		lblEstado.setForeground(Color.BLACK);
		
		nroAnalisis1 = new JComboBox();
		nroAnalisis1.setBounds(191, 125, 130, 26);
		miPanel.add(nroAnalisis1);
		for (AnalisisAgua analisisAgua : aguasDAO.obtenerTodosLosAnalisisAguas()){
			if(analisisAgua.getpH() != null && analisisAgua.getpH() != "") {
				nroAnalisis1.addItem(analisisAgua.getNroAnalisis());
			}
		}
		
		AutoCompletion.enable(nroAnalisis1);
		
		nroAnalisis1.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent arg0){
				AnalisisAgua analisisAguaSeleccionado = aguasDAO.obtenerAnalisisAguaPorNumero(String.valueOf(nroAnalisis1.getSelectedItem()));
				estado1.setText(analisisAguaSeleccionado.getEstado());				
				industria.setSelectedItem(analisisAguaSeleccionado.getIndustria());
				lugarExtraccion1.setText(analisisAguaSeleccionado.getLugarExtraccion());
				if(analisisAguaSeleccionado.getLugarExtraccion().equals("*")) {
					lugarExtraccion1.setBackground(Color.YELLOW);
				} else {
					lugarExtraccion1.setBackground(Color.WHITE);
				}
				extraidoPor1.setText(analisisAguaSeleccionado.getExtraidoPor());
				if(analisisAguaSeleccionado.getExtraidoPor().equals("*")) {
					extraidoPor1.setBackground(Color.YELLOW);
				} else {
					extraidoPor1.setBackground(Color.WHITE);
				}
				if(analisisAguaSeleccionado.getFechaExtraccion() != null) {
					DateFormat df = new SimpleDateFormat("dd/MM/YYYY");
					String formattedDate = df.format(analisisAguaSeleccionado.getFechaExtraccion());
				    Date fechaParaDateChooser;
					try {
						fechaParaDateChooser = new SimpleDateFormat("dd/MM/yyyy").parse(formattedDate);
						fchExtraccion.setDate(fechaParaDateChooser);
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}  

				}
				horaExtraccion1.setText(analisisAguaSeleccionado.getHoraExtraccion());
				if(analisisAguaSeleccionado.getHoraExtraccion().equals("*")) {
					horaExtraccion1.setBackground(Color.YELLOW);
				} else {
					horaExtraccion1.setBackground(Color.WHITE);
				}
				if(analisisAguaSeleccionado.getAspecto().equals("*")) {
					aspecto1.setBackground(Color.YELLOW);
				} else {
					aspecto1.setBackground(Color.WHITE);
				}
				aspecto1.setText(analisisAguaSeleccionado.getAspecto());
				if(analisisAguaSeleccionado.getpH().equals("*")) {
					pH1.setBackground(Color.YELLOW);
				} else {
					pH1.setBackground(Color.WHITE);
				}
				pH1.setText(analisisAguaSeleccionado.getpH());				
				if(analisisAguaSeleccionado.getSolidosTotales().equals("*")) {
					SolidosTotales1.setBackground(Color.YELLOW);
				} else {
					SolidosTotales1.setBackground(Color.WHITE);
				}
				SolidosTotales1.setText(analisisAguaSeleccionado.getSolidosTotales());
				if(analisisAguaSeleccionado.getpHInSitu().equals("*")) {
					pHIS1.setBackground(Color.YELLOW);
				} else {
					pHIS1.setBackground(Color.WHITE);
				}
				pHIS1.setText(analisisAguaSeleccionado.getpHInSitu());
				if(analisisAguaSeleccionado.getTemperatura().equals("*")) {
					temperatura1.setBackground(Color.YELLOW);
				} else {
					temperatura1.setBackground(Color.WHITE);
				}
				temperatura1.setText(analisisAguaSeleccionado.getTemperatura());
				if(analisisAguaSeleccionado.getCaudalInstantaneo().equals("*")) {
					caudal1.setBackground(Color.YELLOW);
				} else {
					caudal1.setBackground(Color.WHITE);
				}
				caudal1.setText(analisisAguaSeleccionado.getCaudalInstantaneo());
				if(analisisAguaSeleccionado.getODInSitu().equals("*")) {
					ODIS1.setBackground(Color.YELLOW);
				} else {
					ODIS1.setBackground(Color.WHITE);
				}
				ODIS1.setText(analisisAguaSeleccionado.getODInSitu());
				if(analisisAguaSeleccionado.getOD().equals("*")) {
					OD1.setBackground(Color.YELLOW);
				} else {
					OD1.setBackground(Color.WHITE);
				}
				OD1.setText(analisisAguaSeleccionado.getOD());
				if(analisisAguaSeleccionado.getDBO5().equals("*")) {
					DBO51.setBackground(Color.YELLOW);
				} else {
					DBO51.setBackground(Color.WHITE);
				}
				DBO51.setText(analisisAguaSeleccionado.getDBO5());
				if(analisisAguaSeleccionado.getDBO5Filtrada().equals("*")) {
					DBO5F1.setBackground(Color.YELLOW);
				} else {
					DBO5F1.setBackground(Color.WHITE);
				}
				DBO5F1.setText(analisisAguaSeleccionado.getDBO5Filtrada());
				if(analisisAguaSeleccionado.getDQO().equals("*")) {
					DQO1.setBackground(Color.YELLOW);
				} else {
					DQO1.setBackground(Color.WHITE);
				}
				DQO1.setText(analisisAguaSeleccionado.getDQO());
				if(analisisAguaSeleccionado.getAceitesYGrasas().equals("*")) {
					AceitesYGrasas1.setBackground(Color.YELLOW);
				} else {
					AceitesYGrasas1.setBackground(Color.WHITE);
				}
				AceitesYGrasas1.setText(analisisAguaSeleccionado.getAceitesYGrasas());
				if(analisisAguaSeleccionado.getSolidosTotalesVolatiles().equals("*")) {
					STV1.setBackground(Color.YELLOW);
				} else {
					STV1.setBackground(Color.WHITE);
				}
				STV1.setText(analisisAguaSeleccionado.getSolidosTotalesVolatiles());

				SST1.setText(analisisAguaSeleccionado.getSst());
				if(analisisAguaSeleccionado.getSst().equals("*")) {
					SST1.setBackground(Color.YELLOW);
				} else {
					SST1.setBackground(Color.WHITE);
				}
				SSV1.setText(analisisAguaSeleccionado.getSsv());
				if(analisisAguaSeleccionado.getSsv().equals("*")) {
					SSV1.setBackground(Color.YELLOW);
				} else {
					SSV1.setBackground(Color.WHITE);
				}
				SS101.setText(analisisAguaSeleccionado.getSs10());
				if(analisisAguaSeleccionado.getSs10().equals("*")) {
					SS101.setBackground(Color.YELLOW);
				} else {
					SS101.setBackground(Color.WHITE);
				}
				SS301.setText(analisisAguaSeleccionado.getSs30());
				if(analisisAguaSeleccionado.getSs30().equals("*")) {
					SS301.setBackground(Color.YELLOW);
				} else {
					SS301.setBackground(Color.WHITE);
				}
				SS601.setText(analisisAguaSeleccionado.getSs60());
				if(analisisAguaSeleccionado.getSs10().equals("*")) {
					SS601.setBackground(Color.YELLOW);
				} else {
					SS601.setBackground(Color.WHITE);
				}
				amoniaco1.setText(analisisAguaSeleccionado.getAmoniaco());
				if(analisisAguaSeleccionado.getOtros4().equals("*")) {
					amoniaco1.setBackground(Color.YELLOW);
				} else {
					amoniaco1.setBackground(Color.WHITE);
				}
				nitrato1.setText(analisisAguaSeleccionado.getNitrato());
				if(analisisAguaSeleccionado.getNitrato().equals("*")) {
					nitrato1.setBackground(Color.YELLOW);
				} else {
					nitrato1.setBackground(Color.WHITE);
				}
				nitrogenoTotal1.setText(analisisAguaSeleccionado.getNitrogenoTotal());
				if(analisisAguaSeleccionado.getNitrogenoTotal().equals("*")) {
					nitrogenoTotal1.setBackground(Color.YELLOW);
				} else {
					nitrogenoTotal1.setBackground(Color.WHITE);
				}
				fosforoTotal1.setText(analisisAguaSeleccionado.getFosforoTotal());
				if(analisisAguaSeleccionado.getFosforoTotal().equals("*")) {
					fosforoTotal1.setBackground(Color.YELLOW);
				} else {
					fosforoTotal1.setBackground(Color.WHITE);
				}
				cromo1.setText(analisisAguaSeleccionado.getCromo());
				if(analisisAguaSeleccionado.getCromo().equals("*")) {
					cromo1.setBackground(Color.YELLOW);
				} else {
					cromo1.setBackground(Color.WHITE);
				}
				plomo1.setText(analisisAguaSeleccionado.getPlomo());
				if(analisisAguaSeleccionado.getPlomo().equals("*")) {
					plomo1.setBackground(Color.YELLOW);
				} else {
					plomo1.setBackground(Color.WHITE);
				}
				zinc1.setText(analisisAguaSeleccionado.getZinc());
				if(analisisAguaSeleccionado.getZinc().equals("*")) {
					zinc1.setBackground(Color.YELLOW);
				} else {
					zinc1.setBackground(Color.WHITE);
				}
				aluminio1.setText(analisisAguaSeleccionado.getAluminio());
				if(analisisAguaSeleccionado.getAluminio().equals("*")) {
					aluminio1.setBackground(Color.YELLOW);
				} else {
					aluminio1.setBackground(Color.WHITE);
				}
				manganeso1.setText(analisisAguaSeleccionado.getManganeso());
				if(analisisAguaSeleccionado.getManganeso().equals("*")) {
					manganeso1.setBackground(Color.YELLOW);
				} else {
					manganeso1.setBackground(Color.WHITE);
				}
				potasio1.setText(analisisAguaSeleccionado.getPotasio());
				if(analisisAguaSeleccionado.getPotasio().equals("*")) {
					potasio1.setBackground(Color.YELLOW);
				} else {
					potasio1.setBackground(Color.WHITE);
				}
				alcalinidadTotal1.setText(analisisAguaSeleccionado.getAlcalinidadTotal());
				if(analisisAguaSeleccionado.getAlcalinidadTotal().equals("*")) {
					alcalinidadTotal1.setBackground(Color.YELLOW);
				} else {
					alcalinidadTotal1.setBackground(Color.WHITE);
				}
				acidezVolatil1.setText(analisisAguaSeleccionado.getAcidezVolatil());
				if(analisisAguaSeleccionado.getAcidezVolatil().equals("*")) {
					acidezVolatil1.setBackground(Color.YELLOW);
				} else {
					acidezVolatil1.setBackground(Color.WHITE);
				}
				alfa1.setText(analisisAguaSeleccionado.getAlfa());
				if(analisisAguaSeleccionado.getAlfa().equals("*")) {
					alfa1.setBackground(Color.YELLOW);
				} else {
					alfa1.setBackground(Color.WHITE);
				}
				alfaPrima1.setText(analisisAguaSeleccionado.getAlfaPrima());
				if(analisisAguaSeleccionado.getAlfaPrima().equals("*")) {
					alfaPrima1.setBackground(Color.YELLOW);
				} else {
					alfaPrima1.setBackground(Color.WHITE);
				}				
				bicarbonato1.setText(analisisAguaSeleccionado.getBicarbonato());
				if(analisisAguaSeleccionado.getBicarbonato().equals("*")) {
					bicarbonato1.setBackground(Color.YELLOW);
				} else {
					bicarbonato1.setBackground(Color.WHITE);
				}
				salinidad1.setText(analisisAguaSeleccionado.getSalinidad());
				if(analisisAguaSeleccionado.getSalinidad().equals("*")) {
					salinidad1.setBackground(Color.YELLOW);
				} else {
					salinidad1.setBackground(Color.WHITE);
				}
				turbiedad1.setText(analisisAguaSeleccionado.getTurbiedad());
				if(analisisAguaSeleccionado.getTurbiedad().equals("*")) {
					turbiedad1.setBackground(Color.YELLOW);
				} else {
					turbiedad1.setBackground(Color.WHITE);
				}
				conductividad1.setText(analisisAguaSeleccionado.getConductividad());
				if(analisisAguaSeleccionado.getConductividad().equals("*")) {
					conductividad1.setBackground(Color.YELLOW);
				} else {
					conductividad1.setBackground(Color.WHITE);
				}
				sulfuro1.setText(analisisAguaSeleccionado.getSulfuro());
				if(analisisAguaSeleccionado.getSulfuro().equals("*")) {
					sulfuro1.setBackground(Color.YELLOW);
				} else {
					sulfuro1.setBackground(Color.WHITE);
				}
				sulfato1.setText(analisisAguaSeleccionado.getSulfato());
				if(analisisAguaSeleccionado.getSulfato().equals("*")) {
					sulfato1.setBackground(Color.YELLOW);
				} else {
					sulfato1.setBackground(Color.WHITE);
				}
				fenoles1.setText(analisisAguaSeleccionado.getFenoles());
				if(analisisAguaSeleccionado.getFenoles().equals("*")) {
					fenoles1.setBackground(Color.YELLOW);
				} else {
					fenoles1.setBackground(Color.WHITE);
				}
				tensoactivos1.setText(analisisAguaSeleccionado.getTensoactivosAnionicos());
				if(analisisAguaSeleccionado.getTensoactivosAnionicos().equals("*")) {
					tensoactivos1.setBackground(Color.YELLOW);
				} else {
					tensoactivos1.setBackground(Color.WHITE);
				}
				cloroResidual1.setText(analisisAguaSeleccionado.getCloroResidual());
				if(analisisAguaSeleccionado.getCloroResidual().equals("*")) {
					cloroResidual1.setBackground(Color.YELLOW);
				} else {
					cloroResidual1.setBackground(Color.WHITE);
				}
				cloroTotal1.setText(analisisAguaSeleccionado.getCloroTotal());
				if(analisisAguaSeleccionado.getCloroTotal().equals("*")) {
					cloroTotal1.setBackground(Color.YELLOW);
				} else {
					cloroTotal1.setBackground(Color.WHITE);
				}
				cloruro1.setText(analisisAguaSeleccionado.getCloruro());
				if(analisisAguaSeleccionado.getCloruro().equals("*")) {
					cloruro1.setBackground(Color.YELLOW);
				} else {
					cloruro1.setBackground(Color.WHITE);
				}
				dureza1.setText(analisisAguaSeleccionado.getDureza());
				if(analisisAguaSeleccionado.getDureza().equals("*")) {
					dureza1.setBackground(Color.YELLOW);
				} else {
					dureza1.setBackground(Color.WHITE);
				}
				color1.setText(analisisAguaSeleccionado.getColor());
				if(analisisAguaSeleccionado.getColor().equals("*")) {
					color1.setBackground(Color.YELLOW);
				} else {
					color1.setBackground(Color.WHITE);
				}
				hidrocarburos1.setText(analisisAguaSeleccionado.getHidrocarburos());
				if(analisisAguaSeleccionado.getHidrocarburos().equals("*")) {
					hidrocarburos1.setBackground(Color.YELLOW);
				} else {
					hidrocarburos1.setBackground(Color.WHITE);
				}
				coliformes1.setText(analisisAguaSeleccionado.getColiformesFecales());
				if(analisisAguaSeleccionado.getColiformesFecales().equals("*")) {
					coliformes1.setBackground(Color.YELLOW);
				} else {
					coliformes1.setBackground(Color.WHITE);
				}
				cursoAguaTipo1.setText(analisisAguaSeleccionado.getCursoDeAguaTipo());
				if(analisisAguaSeleccionado.getCursoDeAguaTipo().equals("*")) {
					cursoAguaTipo1.setBackground(Color.YELLOW);
				} else {
					cursoAguaTipo1.setBackground(Color.WHITE);
				}
				otros11.setText(analisisAguaSeleccionado.getOtros());
				if(analisisAguaSeleccionado.getOtros().equals("*")) {
					otros11.setBackground(Color.YELLOW);
				} else {
					otros11.setBackground(Color.WHITE);
				}
				otros21.setText(analisisAguaSeleccionado.getOtros2());
				if(analisisAguaSeleccionado.getOtros().equals("*")) {
					otros21.setBackground(Color.YELLOW);
				} else {
					otros21.setBackground(Color.WHITE);
				}
				otros31.setText(analisisAguaSeleccionado.getOtros3());
				if(analisisAguaSeleccionado.getOtros3().equals("*")) {
					otros31.setBackground(Color.YELLOW);
				} else {
					otros31.setBackground(Color.WHITE);
				}
				otros41.setText(analisisAguaSeleccionado.getOtros4());
				if(analisisAguaSeleccionado.getOtros4().equals("*")) {
					otros41.setBackground(Color.YELLOW);
				} else {
					otros41.setBackground(Color.WHITE);
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
		
		estado1 = new JTextField();
		estado1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblEstado.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblEstado.setForeground(Color.BLACK);
				if (estado1.getText().equals("*")) {
					estado1.setBackground(Color.YELLOW);
				} else {
					estado1.setBackground(Color.WHITE);
				}
			}
		});
		estado1.setHorizontalAlignment(SwingConstants.CENTER);
		estado1.setColumns(10);
		estado1.setBounds(191, 1837, 130, 26);
		estado1.setEditable(false);
		miPanel.add(estado1);
		
		JButton btnModificarAnlisis = new JButton("Modificar análisis");
		
		btnModificarAnlisis.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if (estado1.getText().equals("Validado")){
					JOptionPane.showMessageDialog(null, "No es posible modificar un análisis validado. Debe desvalidarlo para poder modificarlo.");
				} else {
					AnalisisAgua analisisAgua = new AnalisisAgua(String.valueOf(nroAnalisis1.getSelectedItem()), String.valueOf(industria.getSelectedItem()), departamento1.getText(), localidad1.getText(), descargaEn1.getText(), lugarExtraccion1.getText(),
							extraidoPor1.getText(), fchExtraccion.getDate(), horaExtraccion1.getText(), aspecto1.getText(), pHIS1.getText(), pH1.getText(), temperatura1.getText(), caudal1.getText(), ODIS1.getText(), OD1.getText(),
							DBO51.getText(), DBO5F1.getText(), DQO1.getText(), AceitesYGrasas1.getText(), SolidosTotales1.getText(), STV1.getText(), SST1.getText(), SSV1.getText(), SS101.getText(), SS301.getText(), SS601.getText(), amoniaco1.getText(), nitrato1.getText(), nitrogenoTotal1.getText(), fosforoTotal1.getText(),
							cromo1.getText(), plomo1.getText(), zinc1.getText(), aluminio1.getText(), manganeso1.getText(), potasio1.getText(), alcalinidadTotal1.getText(), acidezVolatil1.getText(), alfa1.getText(), alfaPrima1.getText(),
							bicarbonato1.getText(), salinidad1.getText(), turbiedad1.getText(), conductividad1.getText(), sulfuro1.getText(), sulfato1.getText(), fenoles1.getText(), tensoactivos1.getText(), cloroResidual1.getText(),
							cloroTotal1.getText(), cloruro1.getText(), dureza1.getText(), color1.getText(), hidrocarburos1.getText(), coliformes1.getText(), cursoAguaTipo1.getText(), "En proceso", otros11.getText(), otros21.getText(),
							otros31.getText(), otros41.getText());
					try {
						
						aguasDAO.modificarAgua(analisisAgua);
						JOptionPane.showMessageDialog(null, "Se modificó correctamente el análisis "+String.valueOf(nroAnalisis1.getSelectedItem()));
												
					} catch (MySQLIntegrityConstraintViolationException e1) {
						// no tiene sentido, es UPDATE
						e1.printStackTrace();
					} catch (SQLException e1) {	
						e1.printStackTrace();
					} 
				}
			}
			
		});
		
		btnModificarAnlisis.setBounds(372, 265, 155, 48);
		miPanel.add(btnModificarAnlisis);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MenuAguasANAGUA menuAguasANAGUA = new MenuAguasANAGUA();
				frame.dispose();
			}
		});
		btnVolver.setBounds(372, 365, 155, 48);
		miPanel.add(btnVolver);
		
		JButton btnValidar = new JButton("Validar");
		btnValidar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String pw = JOptionPane.showInputDialog("Ingrese la contraseña");
				if (pw.equals("1234")){
					aguasDAO.validarAnalisis(String.valueOf(nroAnalisis1.getSelectedItem()));
					estado1.setText("Validado");
				} else {
					JOptionPane.showMessageDialog(null, "Contraseña incorrecta. Intente nuevamente.");
				}
			}
		});
		btnValidar.setBounds(325, 1835, 117, 29);
		miPanel.add(btnValidar);
		
		JButton btnDesvalidar = new JButton("Desvalidar");
		btnDesvalidar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String pw = JOptionPane.showInputDialog("Ingrese la contraseña");
				if (pw.equals("1234")){
					aguasDAO.desvalidarAnalisis(String.valueOf(nroAnalisis1.getSelectedItem()));
					estado1.setText("En proceso");
				} else {
					JOptionPane.showMessageDialog(null, "Contraseña incorrecta. Intente nuevamente.");
				}
			}
		});
		btnDesvalidar.setBounds(443, 1835, 117, 29);
		miPanel.add(btnDesvalidar);
		
		
		frame.getContentPane().add(scrollPane);
		
		miPanel.setPreferredSize(new Dimension(600, 1880));		
		scrollPane.setViewportView(miPanel);
		
		
		
	}
}
