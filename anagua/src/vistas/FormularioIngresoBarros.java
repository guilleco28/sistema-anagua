package vistas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FocusTraversalPolicy;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

import barros.AnalisisBarro;
import barros.DatosDAO;
import industrias.Industria;
import industrias.IndustriasDAO;

import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import com.toedter.calendar.JDateChooser;
import javax.swing.SwingConstants;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.Font;

public class FormularioIngresoBarros {

	private JFrame frame;
	private JTextField nroAnalisis1;
	private JTextField lugarExtraccion1;
	private JTextField extraidoPor1;
	private JTextField horaExtraccion1;
	private JTextField aspecto1;
	private JTextField pH1;
	private JTextField solidosTotales1;
	private JTextField humedad1;
	private JTextField solidosTotalesVolatiles1;
	private JTextField liquidosLibres1;
	private JTextField sulfuro1;
	private JTextField cromoEnLixiviado1;
	private JTextField plomoEnLixiviado1;
	private JTextField materiaOrganica1;
	private JTextField hidrocarburosTotales1;
	private JTextField conductividad1;
	private JTextField relacionCN1;
	private JTextField otros11;
	private JTextField departamento;
	private JTextField localidad;
	private JTextField descargaEn;
	private JComboBox industria;
	private JTextField nroAnalisis2;
	private JTextField nroAnalisis3;
	private JTextField nroAnalisis4;
	private JTextField lugarExtraccion2;
	private JTextField extraidoPor2;
	private JTextField horaExtraccion2;
	private JTextField aspecto2;
	private JTextField pH2;
	private JTextField solidosTotales2;
	private JTextField humedad2;
	private JTextField solidosTotalesVolatiles2;
	private JTextField sulfuro2;
	private JTextField cromoEnLixiviado2;
	private JTextField plomoEnLixiviado2;
	private JTextField materiaOrganica2;
	private JTextField hidrocarburosTotales2;
	private JTextField conductividad2;
	private JTextField relacionCN2;
	private JTextField otros12;
	private JTextField lugarExtraccion3;
	private JTextField extraidoPor3;
	private JTextField horaExtraccion3;
	private JTextField aspecto3;
	private JTextField pH3;
	private JTextField solidosTotales3;
	private JTextField humedad3;
	private JTextField solidosTotalesVolatiles3;
	private JTextField liquidosLibres3;
	private JTextField sulfuro3;
	private JTextField cromoEnLixiviado3;
	private JTextField plomoEnLixiviado3;
	private JTextField materiaOrganica3;
	private JTextField hidrocarburosTotales3;
	private JTextField conductividad3;
	private JTextField relacionCN3;
	private JTextField otros13;
	private JTextField lugarExtraccion4;
	private JTextField extraidoPor4;
	private JTextField horaExtraccion4;
	private JTextField aspecto4;
	private JTextField pH4;
	private JTextField solidosTotales4;
	private JTextField humedad4;
	private JTextField solidosTotalesVolatiles4;
	private JTextField liquidosLibres4;
	private JTextField sulfuro4;
	private JTextField cromoEnLixiviado4;
	private JTextField plomoEnLixiviado4;
	private JTextField materiaOrganica4;
	private JTextField hidrocarburosTotales4;
	private JTextField conductividad4;
	private JTextField relacionCN4;
	private JTextField otros14;
	private Color destacado = Color.blue;
	private JTextField otros21;
	private JTextField otros22;
	private JTextField otros23;
	private JTextField otros24;
	private JTextField otros31;
	private JTextField otros32;
	private JTextField otros33;
	private JTextField otros34;
	private JTextField otros41;
	private JTextField otros42;
	private JTextField otros43;
	private JTextField otros44;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioIngresoBarros window = new FormularioIngresoBarros();
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
	public FormularioIngresoBarros() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings("deprecation")
	private void initialize() {
		
		DatosDAO datosDAO = new DatosDAO();
		IndustriasDAO industriasDAO = new IndustriasDAO();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 1200, 850);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Formulario de ingreso de análisis de barros - ANAGUA");
		frame.setVisible(true);
		frame.setResizable(false);
		
		JLabel lblIndustria = new JLabel("INDUSTRIA");
		lblIndustria.setBounds(300, 20, 75, 16);
		frame.getContentPane().add(lblIndustria);
		lblIndustria.setForeground(Color.BLACK);
		
		JLabel lblDepartamento = new JLabel("DEPARTAMENTO");
		lblDepartamento.setBounds(300, 50, 109, 16);
		frame.getContentPane().add(lblDepartamento);
		lblDepartamento.setForeground(Color.BLACK);
		
		JLabel lblLocalidad = new JLabel("LOCALIDAD");
		lblLocalidad.setBounds(300, 80, 109, 16);
		frame.getContentPane().add(lblLocalidad);
		lblLocalidad.setForeground(Color.BLACK);
		
		JLabel lblDescargaEn = new JLabel("DESCARGA EN");
		lblDescargaEn.setBounds(600, 50, 109, 16);
		frame.getContentPane().add(lblDescargaEn);
		lblDescargaEn.setForeground(Color.BLACK);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(26, 106, 1155, 12);
		frame.getContentPane().add(separator);
		
		JLabel lblNroAnalisis = new JLabel("Número de análisis");
		lblNroAnalisis.setBounds(37, 130, 150, 16);
		frame.getContentPane().add(lblNroAnalisis);
		lblNroAnalisis.setForeground(Color.BLACK);
		
		JLabel lblLugarExtraccion = new JLabel("Lugar de extracción");
		lblLugarExtraccion.setBounds(37, 160, 150, 16);
		frame.getContentPane().add(lblLugarExtraccion);
		lblLugarExtraccion.setForeground(Color.BLACK);
		
		JLabel lblExtraidoPor = new JLabel("Extraído por");
		lblExtraidoPor.setBounds(37, 190, 150, 16);
		frame.getContentPane().add(lblExtraidoPor);
		lblExtraidoPor.setForeground(Color.BLACK);
		
		JLabel lblFechaExtraccion = new JLabel("Fecha de extracción");
		lblFechaExtraccion.setBounds(37, 220, 150, 16);
		frame.getContentPane().add(lblFechaExtraccion);
		lblFechaExtraccion.setForeground(Color.BLACK);
		
		JLabel lblHoraExtraccion = new JLabel("Hora de extracción");
		lblHoraExtraccion.setBounds(37, 250, 150, 16);
		frame.getContentPane().add(lblHoraExtraccion);
		lblHoraExtraccion.setForeground(Color.BLACK);
		
		JLabel lblAspecto = new JLabel("Aspecto");
		lblAspecto.setBounds(37, 280, 150, 16);
		frame.getContentPane().add(lblAspecto);
		lblAspecto.setForeground(Color.BLACK);
		
		JLabel lblpH = new JLabel("pH");
		lblpH.setBounds(37, 310, 150, 16);
		frame.getContentPane().add(lblpH);
		lblpH.setForeground(Color.BLACK);
		
		JLabel lblSolidosTotales = new JLabel("Sólidos totales");
		lblSolidosTotales.setBounds(37, 340, 150, 16);
		frame.getContentPane().add(lblSolidosTotales);
		lblSolidosTotales.setForeground(Color.BLACK);
		
		JLabel lblHumedad = new JLabel("Humedad");
		lblHumedad.setBounds(37, 370, 150, 16);
		frame.getContentPane().add(lblHumedad);
		lblHumedad.setForeground(Color.BLACK);
		
		JLabel lblSolidosTotalesVolatiles = new JLabel("Sólidos totales volátiles");
		lblSolidosTotalesVolatiles.setBounds(37, 400, 150, 16);
		frame.getContentPane().add(lblSolidosTotalesVolatiles);
		lblSolidosTotalesVolatiles.setForeground(Color.BLACK);
		
		JLabel lblLiquidosLibres = new JLabel("Líquidos libres");
		lblLiquidosLibres.setBounds(37, 430, 150, 16);
		frame.getContentPane().add(lblLiquidosLibres);
		lblLiquidosLibres.setForeground(Color.BLACK);
		
		JLabel lblSulfuro = new JLabel("Sulfuro");
		lblSulfuro.setBounds(37, 460, 150, 16);
		frame.getContentPane().add(lblSulfuro);
		lblSulfuro.setForeground(Color.BLACK);
		
		JLabel lblCromoEnLixiviado = new JLabel("Cromo en lixiviado");
		lblCromoEnLixiviado.setBounds(37, 490, 150, 16);
		frame.getContentPane().add(lblCromoEnLixiviado);
		lblCromoEnLixiviado.setForeground(Color.BLACK);
		
		JLabel lblPlomoEnLixiviado = new JLabel("Plomo en lixiviado");
		lblPlomoEnLixiviado.setBounds(37, 520, 150, 16);
		frame.getContentPane().add(lblPlomoEnLixiviado);
		lblPlomoEnLixiviado.setForeground(Color.BLACK);
		
		JLabel lblMateriaOrganica = new JLabel("Materia orgánica");
		lblMateriaOrganica.setBounds(37, 550, 150, 16);
		frame.getContentPane().add(lblMateriaOrganica);
		lblMateriaOrganica.setForeground(Color.BLACK);
		
		JLabel lblHidrocarburosTotales = new JLabel("Hidrocarburos totales");
		lblHidrocarburosTotales.setBounds(37, 580, 150, 16);
		frame.getContentPane().add(lblHidrocarburosTotales);
		lblHidrocarburosTotales.setForeground(Color.BLACK);
		
		JLabel lblConductividad = new JLabel("Conductividad");
		lblConductividad.setBounds(37, 610, 150, 16);
		frame.getContentPane().add(lblConductividad);
		lblConductividad.setForeground(Color.BLACK);
		
		JLabel lblRelacionCN = new JLabel("Relación C/N");
		lblRelacionCN.setBounds(37, 640, 150, 16);
		frame.getContentPane().add(lblRelacionCN);
		lblRelacionCN.setForeground(Color.BLACK);
		
		JLabel lblOtros = new JLabel("Otros 1");
		lblOtros.setBounds(37, 670, 150, 16);
		frame.getContentPane().add(lblOtros);
		lblOtros.setForeground(Color.BLACK);
		
		JLabel lblOtros2 = new JLabel("Otros 2");
		lblOtros2.setForeground(Color.BLACK);
		lblOtros2.setBounds(37, 701, 150, 16);
		frame.getContentPane().add(lblOtros2);
		
		JLabel lblOtros3 = new JLabel("Otros 3");
		lblOtros3.setForeground(Color.BLACK);
		lblOtros3.setBounds(37, 730, 150, 16);
		frame.getContentPane().add(lblOtros3);
		
		JLabel lblOtros4 = new JLabel("Otros 4");
		lblOtros4.setForeground(Color.BLACK);
		lblOtros4.setBounds(37, 760, 150, 16);
		frame.getContentPane().add(lblOtros4);
		
		
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
		frame.getContentPane().add(nroAnalisis1);
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
		frame.getContentPane().add(lugarExtraccion1);
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
		frame.getContentPane().add(extraidoPor1);
		extraidoPor1.setColumns(10);
		extraidoPor1.setHorizontalAlignment(JTextField.CENTER);
		
		JDateChooser fechaExtraccion = new JDateChooser();		
		fechaExtraccion.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblFechaExtraccion.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblFechaExtraccion.setForeground(Color.BLACK);
			}
		});
		fechaExtraccion.setBounds(191, 215, 130, 26);
		frame.getContentPane().add(fechaExtraccion);
		
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
		frame.getContentPane().add(horaExtraccion1);
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
		frame.getContentPane().add(aspecto1);
		aspecto1.setColumns(10);
		aspecto1.setHorizontalAlignment(JTextField.CENTER);
		
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
		pH1.setBounds(191, 305, 130, 26);
		frame.getContentPane().add(pH1);
		pH1.setColumns(10);
		pH1.setHorizontalAlignment(JTextField.CENTER);
		

		
		solidosTotales1 = new JTextField();
		solidosTotales1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblSolidosTotales.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblSolidosTotales.setForeground(Color.BLACK);
				if (solidosTotales1.getText().equals("*")) {
					solidosTotales1.setBackground(Color.YELLOW);
				} else {
					solidosTotales1.setBackground(Color.WHITE);
				}
			}
		});

		solidosTotales1.setBounds(191, 335, 130, 26);
		frame.getContentPane().add(solidosTotales1);
		solidosTotales1.setColumns(10);
		solidosTotales1.setHorizontalAlignment(JTextField.CENTER);
		
		humedad1 = new JTextField();
		humedad1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblHumedad.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblHumedad.setForeground(Color.BLACK);
				if (humedad1.getText().equals("*")) {
					humedad1.setBackground(Color.YELLOW);
				} else {
					humedad1.setBackground(Color.WHITE);
				}
			}
		});
		humedad1.setBounds(191, 365, 130, 26);
		frame.getContentPane().add(humedad1);
		humedad1.setColumns(10);
		humedad1.setHorizontalAlignment(JTextField.CENTER);
		
		solidosTotalesVolatiles1 = new JTextField();
		solidosTotalesVolatiles1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblSolidosTotalesVolatiles.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblSolidosTotalesVolatiles.setForeground(Color.BLACK);
				if (solidosTotalesVolatiles1.getText().equals("*")) {
					solidosTotalesVolatiles1.setBackground(Color.YELLOW);
				} else {
					solidosTotalesVolatiles1.setBackground(Color.WHITE);
				}
			}
		});
		solidosTotalesVolatiles1.setBounds(191, 395, 130, 26);
		frame.getContentPane().add(solidosTotalesVolatiles1);
		solidosTotalesVolatiles1.setColumns(10);
		solidosTotalesVolatiles1.setHorizontalAlignment(JTextField.CENTER);
		
		liquidosLibres1 = new JTextField();
		liquidosLibres1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblLiquidosLibres.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblLiquidosLibres.setForeground(Color.BLACK);
				if (liquidosLibres1.getText().equals("*")) {
					liquidosLibres1.setBackground(Color.YELLOW);
				} else {
					liquidosLibres1.setBackground(Color.WHITE);
				}
			}
		});
		liquidosLibres1.setBounds(191, 425, 130, 26);
		frame.getContentPane().add(liquidosLibres1);
		liquidosLibres1.setColumns(10);
		liquidosLibres1.setHorizontalAlignment(JTextField.CENTER);
		
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
		sulfuro1.setBounds(191, 455, 130, 26);
		frame.getContentPane().add(sulfuro1);
		sulfuro1.setColumns(10);
		sulfuro1.setHorizontalAlignment(JTextField.CENTER);
		
		cromoEnLixiviado1 = new JTextField();
		cromoEnLixiviado1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblCromoEnLixiviado.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblCromoEnLixiviado.setForeground(Color.BLACK);
				if (cromoEnLixiviado1.getText().equals("*")) {
					cromoEnLixiviado1.setBackground(Color.YELLOW);
				} else {
					cromoEnLixiviado1.setBackground(Color.WHITE);
				}
			}
		});
		cromoEnLixiviado1.setBounds(191, 485, 130, 26);
		frame.getContentPane().add(cromoEnLixiviado1);
		cromoEnLixiviado1.setColumns(10);
		cromoEnLixiviado1.setHorizontalAlignment(JTextField.CENTER);
		
		plomoEnLixiviado1 = new JTextField();
		plomoEnLixiviado1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblPlomoEnLixiviado.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblPlomoEnLixiviado.setForeground(Color.BLACK);
				if (plomoEnLixiviado1.getText().equals("*")) {
					plomoEnLixiviado1.setBackground(Color.YELLOW);
				} else {
					plomoEnLixiviado1.setBackground(Color.WHITE);
				}
			}
		});
		plomoEnLixiviado1.setBounds(191, 515, 130, 26);
		frame.getContentPane().add(plomoEnLixiviado1);
		plomoEnLixiviado1.setColumns(10);
		plomoEnLixiviado1.setHorizontalAlignment(JTextField.CENTER);
		
		materiaOrganica1 = new JTextField();
		materiaOrganica1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblMateriaOrganica.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblMateriaOrganica.setForeground(Color.BLACK);
				if (materiaOrganica1.getText().equals("*")) {
					materiaOrganica1.setBackground(Color.YELLOW);
				} else {
					materiaOrganica1.setBackground(Color.WHITE);
				}
			}
		});
		materiaOrganica1.setBounds(191, 545, 130, 26);
		frame.getContentPane().add(materiaOrganica1);
		materiaOrganica1.setColumns(10);
		materiaOrganica1.setHorizontalAlignment(JTextField.CENTER);
		
		hidrocarburosTotales1 = new JTextField();
		hidrocarburosTotales1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblHidrocarburosTotales.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblHidrocarburosTotales.setForeground(Color.BLACK);
				if (hidrocarburosTotales1.getText().equals("*")) {
					hidrocarburosTotales1.setBackground(Color.YELLOW);
				} else {
					hidrocarburosTotales1.setBackground(Color.WHITE);
				}
			}
		});
		hidrocarburosTotales1.setBounds(191, 575, 130, 26);
		frame.getContentPane().add(hidrocarburosTotales1);
		hidrocarburosTotales1.setColumns(10);
		hidrocarburosTotales1.setHorizontalAlignment(JTextField.CENTER);
		
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
		conductividad1.setBounds(191, 605, 130, 26);
		frame.getContentPane().add(conductividad1);
		conductividad1.setColumns(10);
		conductividad1.setHorizontalAlignment(JTextField.CENTER);
		
		relacionCN1 = new JTextField();
		relacionCN1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblRelacionCN.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblRelacionCN.setForeground(Color.BLACK);
				if (relacionCN1.getText().equals("*")) {
					relacionCN1.setBackground(Color.YELLOW);
				} else {
					relacionCN1.setBackground(Color.WHITE);
				}
			}
		});
		relacionCN1.setBounds(191, 635, 130, 26);
		frame.getContentPane().add(relacionCN1);
		relacionCN1.setColumns(10);
		relacionCN1.setHorizontalAlignment(JTextField.CENTER);
		
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
		otros11.setBounds(191, 665, 130, 26);
		frame.getContentPane().add(otros11);
		otros11.setColumns(10);
		otros11.setHorizontalAlignment(JTextField.CENTER);		
		
		
		industria = new JComboBox();
		industria.setBounds(421, 15, 272, 27);
		frame.getContentPane().add(industria);
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
		frame.getContentPane().add(departamento);
		departamento.setColumns(10);
		departamento.setEditable(false);
		
		localidad = new JTextField();
		localidad.setColumns(10);
		localidad.setBounds(421, 75, 169, 26);
		frame.getContentPane().add(localidad);
		localidad.setEditable(false);
		
		descargaEn = new JTextField();
		descargaEn.setColumns(10);
		descargaEn.setBounds(703, 45, 169, 26);
		frame.getContentPane().add(descargaEn);
		descargaEn.setEditable(false);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MenuBarrosANAGUA menuBarrosANAGUA = new MenuBarrosANAGUA();
				frame.dispose();
			}
		});
		btnVolver.setBounds(959, 34, 175, 51);
		frame.getContentPane().add(btnVolver);
		
		nroAnalisis2 = new JTextField();
		nroAnalisis2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblNroAnalisis.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblNroAnalisis.setForeground(Color.BLACK);
			}
		});
		nroAnalisis2.setHorizontalAlignment(SwingConstants.CENTER);
		nroAnalisis2.setColumns(10);
		nroAnalisis2.setBounds(391, 125, 130, 26);
		frame.getContentPane().add(nroAnalisis2);
		
		nroAnalisis3 = new JTextField();
		nroAnalisis3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblNroAnalisis.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblNroAnalisis.setForeground(Color.BLACK);
			}
		});
		nroAnalisis3.setHorizontalAlignment(SwingConstants.CENTER);
		nroAnalisis3.setColumns(10);
		nroAnalisis3.setBounds(591, 125, 130, 26);
		frame.getContentPane().add(nroAnalisis3);
		
		nroAnalisis4 = new JTextField();
		nroAnalisis4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblNroAnalisis.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblNroAnalisis.setForeground(Color.BLACK);
			}
		});
		nroAnalisis4.setHorizontalAlignment(SwingConstants.CENTER);
		nroAnalisis4.setColumns(10);
		nroAnalisis4.setBounds(791, 125, 130, 26);
		frame.getContentPane().add(nroAnalisis4);
		
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
		lugarExtraccion2.setHorizontalAlignment(SwingConstants.CENTER);
		lugarExtraccion2.setColumns(10);
		lugarExtraccion2.setBounds(391, 155, 130, 26);
		frame.getContentPane().add(lugarExtraccion2);
		
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
		extraidoPor2.setHorizontalAlignment(SwingConstants.CENTER);
		extraidoPor2.setColumns(10);
		extraidoPor2.setBounds(391, 185, 130, 26);
		frame.getContentPane().add(extraidoPor2);
		
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
		horaExtraccion2.setHorizontalAlignment(SwingConstants.CENTER);
		horaExtraccion2.setColumns(10);
		horaExtraccion2.setBounds(391, 245, 130, 26);
		frame.getContentPane().add(horaExtraccion2);
		
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
		aspecto2.setHorizontalAlignment(SwingConstants.CENTER);
		aspecto2.setColumns(10);
		aspecto2.setBounds(391, 275, 130, 26);
		frame.getContentPane().add(aspecto2);
		
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
		pH2.setBounds(391, 305, 130, 26);
		frame.getContentPane().add(pH2);
		
		solidosTotales2 = new JTextField();
		solidosTotales2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblSolidosTotales.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblSolidosTotales.setForeground(Color.BLACK);
				if (solidosTotales2.getText().equals("*")) {
					solidosTotales2.setBackground(Color.YELLOW);
				} else {
					solidosTotales2.setBackground(Color.WHITE);
				}
			}
		});
		solidosTotales2.setHorizontalAlignment(SwingConstants.CENTER);
		solidosTotales2.setColumns(10);
		solidosTotales2.setBounds(391, 335, 130, 26);
		frame.getContentPane().add(solidosTotales2);
		
		humedad2 = new JTextField();
		humedad2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblHumedad.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblHumedad.setForeground(Color.BLACK);
				if (humedad2.getText().equals("*")) {
					humedad2.setBackground(Color.YELLOW);
				} else {
					humedad2.setBackground(Color.WHITE);
				}
			}
		});
		humedad2.setHorizontalAlignment(SwingConstants.CENTER);
		humedad2.setColumns(10);
		humedad2.setBounds(391, 365, 130, 26);
		frame.getContentPane().add(humedad2);
		
		solidosTotalesVolatiles2 = new JTextField();
		solidosTotalesVolatiles2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblSolidosTotalesVolatiles.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblSolidosTotalesVolatiles.setForeground(Color.BLACK);
				if (solidosTotalesVolatiles2.getText().equals("*")) {
					solidosTotalesVolatiles2.setBackground(Color.YELLOW);
				} else {
					solidosTotalesVolatiles2.setBackground(Color.WHITE);
				}
			}
		});
		solidosTotalesVolatiles2.setHorizontalAlignment(SwingConstants.CENTER);
		solidosTotalesVolatiles2.setColumns(10);
		solidosTotalesVolatiles2.setBounds(391, 395, 130, 26);
		frame.getContentPane().add(solidosTotalesVolatiles2);
		
		JTextField liquidosLibres2 = new JTextField();
		liquidosLibres2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblLiquidosLibres.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblLiquidosLibres.setForeground(Color.BLACK);
				if (liquidosLibres2.getText().equals("*")) {
					liquidosLibres2.setBackground(Color.YELLOW);
				} else {
					liquidosLibres2.setBackground(Color.WHITE);
				}
			}
		});
		liquidosLibres2.setHorizontalAlignment(SwingConstants.CENTER);
		liquidosLibres2.setColumns(10);
		liquidosLibres2.setBounds(391, 425, 130, 26);
		frame.getContentPane().add(liquidosLibres2);
		
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
		sulfuro2.setBounds(391, 455, 130, 26);
		frame.getContentPane().add(sulfuro2);
		
		cromoEnLixiviado2 = new JTextField();
		cromoEnLixiviado2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblCromoEnLixiviado.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblCromoEnLixiviado.setForeground(Color.BLACK);
				if (cromoEnLixiviado2.getText().equals("*")) {
					cromoEnLixiviado2.setBackground(Color.YELLOW);
				} else {
					cromoEnLixiviado2.setBackground(Color.WHITE);
				}
			}
		});
		cromoEnLixiviado2.setHorizontalAlignment(SwingConstants.CENTER);
		cromoEnLixiviado2.setColumns(10);
		cromoEnLixiviado2.setBounds(391, 485, 130, 26);
		frame.getContentPane().add(cromoEnLixiviado2);
		
		plomoEnLixiviado2 = new JTextField();
		plomoEnLixiviado2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblPlomoEnLixiviado.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblPlomoEnLixiviado.setForeground(Color.BLACK);
				if (plomoEnLixiviado2.getText().equals("*")) {
					plomoEnLixiviado2.setBackground(Color.YELLOW);
				} else {
					plomoEnLixiviado2.setBackground(Color.WHITE);
				}
			}
		});
		plomoEnLixiviado2.setHorizontalAlignment(SwingConstants.CENTER);
		plomoEnLixiviado2.setColumns(10);
		plomoEnLixiviado2.setBounds(391, 515, 130, 26);
		frame.getContentPane().add(plomoEnLixiviado2);
		
		materiaOrganica2 = new JTextField();
		materiaOrganica2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblMateriaOrganica.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblMateriaOrganica.setForeground(Color.BLACK);
				if (materiaOrganica2.getText().equals("*")) {
					materiaOrganica2.setBackground(Color.YELLOW);
				} else {
					materiaOrganica2.setBackground(Color.WHITE);
				}
			}
		});
		materiaOrganica2.setHorizontalAlignment(SwingConstants.CENTER);
		materiaOrganica2.setColumns(10);
		materiaOrganica2.setBounds(391, 545, 130, 26);
		frame.getContentPane().add(materiaOrganica2);
		
		hidrocarburosTotales2 = new JTextField();
		hidrocarburosTotales2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblHidrocarburosTotales.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblHidrocarburosTotales.setForeground(Color.BLACK);
				if (hidrocarburosTotales2.getText().equals("*")) {
					hidrocarburosTotales2.setBackground(Color.YELLOW);
				} else {
					hidrocarburosTotales2.setBackground(Color.WHITE);
				}
			}
		});
		hidrocarburosTotales2.setHorizontalAlignment(SwingConstants.CENTER);
		hidrocarburosTotales2.setColumns(10);
		hidrocarburosTotales2.setBounds(391, 575, 130, 26);
		frame.getContentPane().add(hidrocarburosTotales2);
		
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
		conductividad2.setBounds(391, 605, 130, 26);
		frame.getContentPane().add(conductividad2);
		
		relacionCN2 = new JTextField();
		relacionCN2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblRelacionCN.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblRelacionCN.setForeground(Color.BLACK);
				if (relacionCN2.getText().equals("*")) {
					relacionCN2.setBackground(Color.YELLOW);
				} else {
					relacionCN2.setBackground(Color.WHITE);
				}
			}
		});
		relacionCN2.setHorizontalAlignment(SwingConstants.CENTER);
		relacionCN2.setColumns(10);
		relacionCN2.setBounds(391, 635, 130, 26);
		frame.getContentPane().add(relacionCN2);
		
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
		otros12.setBounds(391, 665, 130, 26);
		frame.getContentPane().add(otros12);
		
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
		lugarExtraccion3.setHorizontalAlignment(SwingConstants.CENTER);
		lugarExtraccion3.setColumns(10);
		lugarExtraccion3.setBounds(591, 155, 130, 26);
		frame.getContentPane().add(lugarExtraccion3);
		
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
		extraidoPor3.setHorizontalAlignment(SwingConstants.CENTER);
		extraidoPor3.setColumns(10);
		extraidoPor3.setBounds(591, 185, 130, 26);
		frame.getContentPane().add(extraidoPor3);
		
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
		horaExtraccion3.setHorizontalAlignment(SwingConstants.CENTER);
		horaExtraccion3.setColumns(10);
		horaExtraccion3.setBounds(591, 245, 130, 26);
		frame.getContentPane().add(horaExtraccion3);
		
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
		aspecto3.setHorizontalAlignment(SwingConstants.CENTER);
		aspecto3.setColumns(10);
		aspecto3.setBounds(591, 275, 130, 26);
		frame.getContentPane().add(aspecto3);
		
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
		pH3.setBounds(591, 305, 130, 26);
		frame.getContentPane().add(pH3);
		
		solidosTotales3 = new JTextField();
		solidosTotales3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblSolidosTotales.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblSolidosTotales.setForeground(Color.BLACK);
				if (solidosTotales3.getText().equals("*")) {
					solidosTotales3.setBackground(Color.YELLOW);
				} else {
					solidosTotales3.setBackground(Color.WHITE);
				}
			}
		});
		solidosTotales3.setHorizontalAlignment(SwingConstants.CENTER);
		solidosTotales3.setColumns(10);
		solidosTotales3.setBounds(591, 335, 130, 26);
		frame.getContentPane().add(solidosTotales3);
		
		humedad3 = new JTextField();
		humedad3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblHumedad.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblHumedad.setForeground(Color.BLACK);
				if (humedad3.getText().equals("*")) {
					humedad3.setBackground(Color.YELLOW);
				} else {
					humedad3.setBackground(Color.WHITE);
				}
			}
		});
		humedad3.setHorizontalAlignment(SwingConstants.CENTER);
		humedad3.setColumns(10);
		humedad3.setBounds(591, 365, 130, 26);
		frame.getContentPane().add(humedad3);
		
		solidosTotalesVolatiles3 = new JTextField();
		solidosTotalesVolatiles3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblSolidosTotalesVolatiles.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblSolidosTotalesVolatiles.setForeground(Color.BLACK);
				if (solidosTotalesVolatiles3.getText().equals("*")) {
					solidosTotalesVolatiles3.setBackground(Color.YELLOW);
				} else {
					solidosTotalesVolatiles3.setBackground(Color.WHITE);
				}
			}
		});
		solidosTotalesVolatiles3.setHorizontalAlignment(SwingConstants.CENTER);
		solidosTotalesVolatiles3.setColumns(10);
		solidosTotalesVolatiles3.setBounds(591, 395, 130, 26);
		frame.getContentPane().add(solidosTotalesVolatiles3);
		
		liquidosLibres3 = new JTextField();
		liquidosLibres3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblLiquidosLibres.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblLiquidosLibres.setForeground(Color.BLACK);
				if (liquidosLibres3.getText().equals("*")) {
					liquidosLibres3.setBackground(Color.YELLOW);
				} else {
					liquidosLibres3.setBackground(Color.WHITE);
				}
			}
		});
		liquidosLibres3.setHorizontalAlignment(SwingConstants.CENTER);
		liquidosLibres3.setColumns(10);
		liquidosLibres3.setBounds(591, 425, 130, 26);
		frame.getContentPane().add(liquidosLibres3);
		
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
		sulfuro3.setBounds(591, 455, 130, 26);
		frame.getContentPane().add(sulfuro3);
		
		cromoEnLixiviado3 = new JTextField();
		cromoEnLixiviado3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblCromoEnLixiviado.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblCromoEnLixiviado.setForeground(Color.BLACK);
				if (cromoEnLixiviado3.getText().equals("*")) {
					cromoEnLixiviado3.setBackground(Color.YELLOW);
				} else {
					cromoEnLixiviado3.setBackground(Color.WHITE);
				}
			}
		});
		cromoEnLixiviado3.setHorizontalAlignment(SwingConstants.CENTER);
		cromoEnLixiviado3.setColumns(10);
		cromoEnLixiviado3.setBounds(591, 485, 130, 26);
		frame.getContentPane().add(cromoEnLixiviado3);
		
		plomoEnLixiviado3 = new JTextField();
		plomoEnLixiviado3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblPlomoEnLixiviado.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblPlomoEnLixiviado.setForeground(Color.BLACK);
				if (plomoEnLixiviado3.getText().equals("*")) {
					plomoEnLixiviado3.setBackground(Color.YELLOW);
				} else {
					plomoEnLixiviado3.setBackground(Color.WHITE);
				}
			}
		});
		plomoEnLixiviado3.setHorizontalAlignment(SwingConstants.CENTER);
		plomoEnLixiviado3.setColumns(10);
		plomoEnLixiviado3.setBounds(591, 515, 130, 26);
		frame.getContentPane().add(plomoEnLixiviado3);
		
		materiaOrganica3 = new JTextField();
		materiaOrganica3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblMateriaOrganica.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblMateriaOrganica.setForeground(Color.BLACK);
				if (materiaOrganica3.getText().equals("*")) {
					materiaOrganica3.setBackground(Color.YELLOW);
				} else {
					materiaOrganica3.setBackground(Color.WHITE);
				}
			}
		});
		materiaOrganica3.setHorizontalAlignment(SwingConstants.CENTER);
		materiaOrganica3.setColumns(10);
		materiaOrganica3.setBounds(591, 545, 130, 26);
		frame.getContentPane().add(materiaOrganica3);
		
		hidrocarburosTotales3 = new JTextField();
		hidrocarburosTotales3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblHidrocarburosTotales.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblHidrocarburosTotales.setForeground(Color.BLACK);
				if (hidrocarburosTotales3.getText().equals("*")) {
					hidrocarburosTotales3.setBackground(Color.YELLOW);
				} else {
					hidrocarburosTotales3.setBackground(Color.WHITE);
				}
			}
		});
		hidrocarburosTotales3.setHorizontalAlignment(SwingConstants.CENTER);
		hidrocarburosTotales3.setColumns(10);
		hidrocarburosTotales3.setBounds(591, 575, 130, 26);
		frame.getContentPane().add(hidrocarburosTotales3);
		
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
		conductividad3.setBounds(591, 605, 130, 26);
		frame.getContentPane().add(conductividad3);
		
		relacionCN3 = new JTextField();
		relacionCN3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblRelacionCN.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblRelacionCN.setForeground(Color.BLACK);
				if (relacionCN3.getText().equals("*")) {
					relacionCN3.setBackground(Color.YELLOW);
				} else {
					relacionCN3.setBackground(Color.WHITE);
				}
			}
		});
		relacionCN3.setHorizontalAlignment(SwingConstants.CENTER);
		relacionCN3.setColumns(10);
		relacionCN3.setBounds(591, 635, 130, 26);
		frame.getContentPane().add(relacionCN3);
		
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
		otros13.setBounds(591, 665, 130, 26);
		frame.getContentPane().add(otros13);
		
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
		lugarExtraccion4.setHorizontalAlignment(SwingConstants.CENTER);
		lugarExtraccion4.setColumns(10);
		lugarExtraccion4.setBounds(791, 155, 130, 26);
		frame.getContentPane().add(lugarExtraccion4);
		
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
		extraidoPor4.setHorizontalAlignment(SwingConstants.CENTER);
		extraidoPor4.setColumns(10);
		extraidoPor4.setBounds(791, 185, 130, 26);
		frame.getContentPane().add(extraidoPor4);
		
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
		horaExtraccion4.setHorizontalAlignment(SwingConstants.CENTER);
		horaExtraccion4.setColumns(10);
		horaExtraccion4.setBounds(791, 245, 130, 26);
		frame.getContentPane().add(horaExtraccion4);
		
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
		aspecto4.setHorizontalAlignment(SwingConstants.CENTER);
		aspecto4.setColumns(10);
		aspecto4.setBounds(791, 275, 130, 26);
		frame.getContentPane().add(aspecto4);
		
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
		pH4.setBounds(791, 305, 130, 26);
		frame.getContentPane().add(pH4);
		
		solidosTotales4 = new JTextField();
		solidosTotales4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblSolidosTotales.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblSolidosTotales.setForeground(Color.BLACK);
				if (solidosTotales4.getText().equals("*")) {
					solidosTotales4.setBackground(Color.YELLOW);
				} else {
					solidosTotales4.setBackground(Color.WHITE);
				}
			}
		});
		solidosTotales4.setHorizontalAlignment(SwingConstants.CENTER);
		solidosTotales4.setColumns(10);
		solidosTotales4.setBounds(791, 335, 130, 26);
		frame.getContentPane().add(solidosTotales4);
		
		humedad4 = new JTextField();
		humedad4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblHumedad.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblHumedad.setForeground(Color.BLACK);
				if (humedad4.getText().equals("*")) {
					humedad4.setBackground(Color.YELLOW);
				} else {
					humedad4.setBackground(Color.WHITE);
				}
			}
		});
		humedad4.setHorizontalAlignment(SwingConstants.CENTER);
		humedad4.setColumns(10);
		humedad4.setBounds(791, 365, 130, 26);
		frame.getContentPane().add(humedad4);
		
		solidosTotalesVolatiles4 = new JTextField();
		solidosTotalesVolatiles4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblSolidosTotalesVolatiles.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblSolidosTotalesVolatiles.setForeground(Color.BLACK);
				if (solidosTotalesVolatiles4.getText().equals("*")) {
					solidosTotalesVolatiles4.setBackground(Color.YELLOW);
				} else {
					solidosTotalesVolatiles4.setBackground(Color.WHITE);
				}
			}
		});
		solidosTotalesVolatiles4.setHorizontalAlignment(SwingConstants.CENTER);
		solidosTotalesVolatiles4.setColumns(10);
		solidosTotalesVolatiles4.setBounds(791, 395, 130, 26);
		frame.getContentPane().add(solidosTotalesVolatiles4);
		
		liquidosLibres4 = new JTextField();
		liquidosLibres4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblLiquidosLibres.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblLiquidosLibres.setForeground(Color.BLACK);
				if (liquidosLibres4.getText().equals("*")) {
					liquidosLibres4.setBackground(Color.YELLOW);
				} else {
					liquidosLibres4.setBackground(Color.WHITE);
				}
			}
		});
		liquidosLibres4.setHorizontalAlignment(SwingConstants.CENTER);
		liquidosLibres4.setColumns(10);
		liquidosLibres4.setBounds(791, 425, 130, 26);
		frame.getContentPane().add(liquidosLibres4);
		
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
		sulfuro4.setBounds(791, 455, 130, 26);
		frame.getContentPane().add(sulfuro4);
		
		cromoEnLixiviado4 = new JTextField();
		cromoEnLixiviado4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblCromoEnLixiviado.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblCromoEnLixiviado.setForeground(Color.BLACK);
				if (cromoEnLixiviado4.getText().equals("*")) {
					cromoEnLixiviado4.setBackground(Color.YELLOW);
				} else {
					cromoEnLixiviado4.setBackground(Color.WHITE);
				}
			}
		});
		cromoEnLixiviado4.setHorizontalAlignment(SwingConstants.CENTER);
		cromoEnLixiviado4.setColumns(10);
		cromoEnLixiviado4.setBounds(791, 485, 130, 26);
		frame.getContentPane().add(cromoEnLixiviado4);
		
		plomoEnLixiviado4 = new JTextField();
		plomoEnLixiviado4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblPlomoEnLixiviado.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblPlomoEnLixiviado.setForeground(Color.BLACK);
				if (plomoEnLixiviado4.getText().equals("*")) {
					plomoEnLixiviado4.setBackground(Color.YELLOW);
				} else {
					plomoEnLixiviado4.setBackground(Color.WHITE);
				}
			}
		});
		plomoEnLixiviado4.setHorizontalAlignment(SwingConstants.CENTER);
		plomoEnLixiviado4.setColumns(10);
		plomoEnLixiviado4.setBounds(791, 515, 130, 26);
		frame.getContentPane().add(plomoEnLixiviado4);
		
		materiaOrganica4 = new JTextField();
		materiaOrganica4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblMateriaOrganica.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblMateriaOrganica.setForeground(Color.BLACK);
				if (materiaOrganica4.getText().equals("*")) {
					materiaOrganica4.setBackground(Color.YELLOW);
				} else {
					materiaOrganica4.setBackground(Color.WHITE);
				}
			}
		});
		materiaOrganica4.setHorizontalAlignment(SwingConstants.CENTER);
		materiaOrganica4.setColumns(10);
		materiaOrganica4.setBounds(791, 545, 130, 26);
		frame.getContentPane().add(materiaOrganica4);
		
		hidrocarburosTotales4 = new JTextField();
		hidrocarburosTotales4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblHidrocarburosTotales.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblHidrocarburosTotales.setForeground(Color.BLACK);
				if (hidrocarburosTotales4.getText().equals("*")) {
					hidrocarburosTotales4.setBackground(Color.YELLOW);
				} else {
					hidrocarburosTotales4.setBackground(Color.WHITE);
				}
			}
		});
		hidrocarburosTotales4.setHorizontalAlignment(SwingConstants.CENTER);
		hidrocarburosTotales4.setColumns(10);
		hidrocarburosTotales4.setBounds(791, 575, 130, 26);
		frame.getContentPane().add(hidrocarburosTotales4);
		
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
		conductividad4.setBounds(791, 605, 130, 26);
		frame.getContentPane().add(conductividad4);
		
		relacionCN4 = new JTextField();
		relacionCN4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblRelacionCN.setForeground(destacado);
			}
			@Override
			public void focusLost(FocusEvent e) {
				lblRelacionCN.setForeground(Color.BLACK);
				if (relacionCN4.getText().equals("*")) {
					relacionCN4.setBackground(Color.YELLOW);
				} else {
					relacionCN4.setBackground(Color.WHITE);
				}
			}
		});
		relacionCN4.setHorizontalAlignment(SwingConstants.CENTER);
		relacionCN4.setColumns(10);
		relacionCN4.setBounds(791, 635, 130, 26);
		frame.getContentPane().add(relacionCN4);
		
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
		otros14.setBounds(791, 665, 130, 26);
		frame.getContentPane().add(otros14);
		
		JDateChooser fechaExtraccion2 = new JDateChooser();
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
		fechaExtraccion2.setBounds(391, 215, 130, 26);
		frame.getContentPane().add(fechaExtraccion2);
		
		JDateChooser fechaExtraccion3 = new JDateChooser();
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
		fechaExtraccion3.setBounds(591, 215, 130, 26);
		frame.getContentPane().add(fechaExtraccion3);
		
		JDateChooser fechaExtraccion4 = new JDateChooser();
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
		fechaExtraccion4.setBounds(791, 215, 130, 26);
		frame.getContentPane().add(fechaExtraccion4);
		
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
		otros21.setBounds(191, 696, 130, 26);
		frame.getContentPane().add(otros21);
		
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
		otros22.setBounds(391, 696, 130, 26);
		frame.getContentPane().add(otros22);
		
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
		otros23.setBounds(591, 696, 130, 26);
		frame.getContentPane().add(otros23);
		
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
		otros24.setBounds(791, 696, 130, 26);
		frame.getContentPane().add(otros24);
		
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
		otros31.setBounds(191, 726, 130, 26);
		frame.getContentPane().add(otros31);
		
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
		otros32.setBounds(391, 726, 130, 26);
		frame.getContentPane().add(otros32);
		
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
		otros33.setBounds(591, 726, 130, 26);
		frame.getContentPane().add(otros33);
		
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
		otros34.setBounds(791, 726, 130, 26);
		frame.getContentPane().add(otros34);		
		
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
		otros41.setBounds(191, 755, 130, 26);
		frame.getContentPane().add(otros41);
		
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
		otros42.setBounds(391, 755, 130, 26);
		frame.getContentPane().add(otros42);
		
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
		otros43.setBounds(591, 755, 130, 26);
		frame.getContentPane().add(otros43);
		
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
		otros44.setBounds(791, 755, 130, 26);
		frame.getContentPane().add(otros44);
		
		JButton btnNewButton = new JButton("Agregar análisis");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ArrayList <AnalisisBarro> analisisAAgregar = new ArrayList <AnalisisBarro>();
				if (!nroAnalisis1.getText().equals("")) {
					AnalisisBarro analisisBarro1 = new AnalisisBarro (String.valueOf(industria.getSelectedItem()), departamento.getText(), localidad.getText(), descargaEn.getText(), nroAnalisis1.getText(),
							lugarExtraccion1.getText(), extraidoPor1.getText(), fechaExtraccion.getDate(), horaExtraccion1.getText(), aspecto1.getText(), pH1.getText(),
							solidosTotales1.getText(), humedad1.getText(), solidosTotalesVolatiles1.getText(), liquidosLibres1.getText(), sulfuro1.getText(),
							cromoEnLixiviado1.getText(), plomoEnLixiviado1.getText(), materiaOrganica1.getText(), hidrocarburosTotales1.getText(), conductividad1.getText(),
							relacionCN1.getText(), otros11.getText(), otros21.getText(), otros31.getText(), otros41.getText(), "En proceso");
					analisisAAgregar.add(analisisBarro1);
				}
				if (!nroAnalisis2.getText().equals("")) {
					AnalisisBarro analisisBarro2 = new AnalisisBarro (String.valueOf(industria.getSelectedItem()), departamento.getText(), localidad.getText(), descargaEn.getText(), nroAnalisis2.getText(),
							lugarExtraccion2.getText(), extraidoPor2.getText(), fechaExtraccion2.getDate(), horaExtraccion2.getText(), aspecto2.getText(), pH2.getText(),
							solidosTotales2.getText(), humedad2.getText(), solidosTotalesVolatiles2.getText(), liquidosLibres2.getText(), sulfuro2.getText(),
							cromoEnLixiviado2.getText(), plomoEnLixiviado2.getText(), materiaOrganica2.getText(), hidrocarburosTotales2.getText(), conductividad2.getText(),
							relacionCN2.getText(), otros12.getText(), otros22.getText(), otros32.getText(), otros42.getText(), "En proceso");
					analisisAAgregar.add(analisisBarro2);
				}
				if (!nroAnalisis3.getText().equals("")) {
					AnalisisBarro analisisBarro3 = new AnalisisBarro (String.valueOf(industria.getSelectedItem()), departamento.getText(), localidad.getText(), descargaEn.getText(), nroAnalisis3.getText(),
							lugarExtraccion3.getText(), extraidoPor3.getText(), fechaExtraccion3.getDate(), horaExtraccion3.getText(), aspecto3.getText(), pH3.getText(),
							solidosTotales3.getText(), humedad3.getText(), solidosTotalesVolatiles3.getText(), liquidosLibres3.getText(), sulfuro3.getText(),
							cromoEnLixiviado3.getText(), plomoEnLixiviado3.getText(), materiaOrganica3.getText(), hidrocarburosTotales3.getText(), conductividad3.getText(),
							relacionCN3.getText(), otros13.getText(), otros23.getText(), otros33.getText(), otros43.getText(), "En proceso");
					analisisAAgregar.add(analisisBarro3);
				}
				if (!nroAnalisis4.getText().equals("")) {
					AnalisisBarro analisisBarro4 = new AnalisisBarro (String.valueOf(industria.getSelectedItem()), departamento.getText(), localidad.getText(), descargaEn.getText(), nroAnalisis4.getText(),
							lugarExtraccion4.getText(), extraidoPor4.getText(), fechaExtraccion4.getDate(), horaExtraccion4.getText(), aspecto4.getText(), pH4.getText(),
							solidosTotales4.getText(), humedad4.getText(), solidosTotalesVolatiles4.getText(), liquidosLibres4.getText(), sulfuro4.getText(),
							cromoEnLixiviado4.getText(), plomoEnLixiviado4.getText(), materiaOrganica4.getText(), hidrocarburosTotales4.getText(), conductividad4.getText(),
							relacionCN4.getText(), otros14.getText(), otros24.getText(), otros34.getText(), otros44.getText(), "En proceso");
					analisisAAgregar.add(analisisBarro4);
				}
				try {
					for (int i=0; i<analisisAAgregar.size(); i++) {
						datosDAO.agregarBarro(analisisAAgregar.get(i));
					}
					JOptionPane.showMessageDialog(null, "Se agregaron "+analisisAAgregar.size()+" análisis al sistema correctamente.");
				} catch (MySQLIntegrityConstraintViolationException e1) {
					JOptionPane.showMessageDialog(null, "Usted está intentando agregar un análisis con un número ya existente en el sistema.");
				} catch (SQLException e1) {
					JOptionPane.showMessageDialog(null, "Se ha producido un error. Revise los datos que intenta ingresar.");
					e1.printStackTrace();
				}				
				 
			}
		});
		
		btnNewButton.setBounds(959, 340, 215, 114);
		frame.getContentPane().add(btnNewButton);
		ArrayList <Component> order = new ArrayList <Component>();
		order.add(nroAnalisis1);
		order.add(nroAnalisis2);
		order.add(nroAnalisis3);
		order.add(nroAnalisis4);
		order.add(lugarExtraccion1);
		order.add(lugarExtraccion2);
		order.add(lugarExtraccion3);
		order.add(lugarExtraccion4);
		order.add(extraidoPor1);
		order.add(extraidoPor2);
		order.add(extraidoPor3);
		order.add(extraidoPor4);
		order.add(fechaExtraccion);
		order.add(fechaExtraccion2);
		order.add(fechaExtraccion3);
		order.add(fechaExtraccion4);
		order.add(horaExtraccion1);
		order.add(horaExtraccion2);
		order.add(horaExtraccion3);
		order.add(horaExtraccion4);
		order.add(aspecto1);
		order.add(aspecto2);
		order.add(aspecto3);
		order.add(aspecto4);
		order.add(pH1);
		order.add(pH2);
		order.add(pH3);
		order.add(pH4);
		order.add(solidosTotales1);
		order.add(solidosTotales2);
		order.add(solidosTotales3);
		order.add(solidosTotales4);
		order.add(humedad1);
		order.add(humedad2);
		order.add(humedad3);
		order.add(humedad4);
		order.add(solidosTotalesVolatiles1);
		order.add(solidosTotalesVolatiles2);
		order.add(solidosTotalesVolatiles3);
		order.add(solidosTotalesVolatiles4);
		order.add(liquidosLibres1);
		order.add(liquidosLibres2);
		order.add(liquidosLibres3);
		order.add(liquidosLibres4);
		order.add(sulfuro1);
		order.add(sulfuro2);
		order.add(sulfuro3);
		order.add(sulfuro4);
		order.add(cromoEnLixiviado1);
		order.add(cromoEnLixiviado2);
		order.add(cromoEnLixiviado3);
		order.add(cromoEnLixiviado4);
		order.add(plomoEnLixiviado1);
		order.add(plomoEnLixiviado2);
		order.add(plomoEnLixiviado3);
		order.add(plomoEnLixiviado4);
		order.add(materiaOrganica1);
		order.add(materiaOrganica2);
		order.add(materiaOrganica3);
		order.add(materiaOrganica4);
		order.add(hidrocarburosTotales1);
		order.add(hidrocarburosTotales2);
		order.add(hidrocarburosTotales3);
		order.add(hidrocarburosTotales4);
		order.add(conductividad1);
		order.add(conductividad2);
		order.add(conductividad3);
		order.add(conductividad4);
		order.add(relacionCN1);
		order.add(relacionCN2);
		order.add(relacionCN3);
		order.add(relacionCN4);
		order.add(otros11);
		order.add(otros12);
		order.add(otros13);
		order.add(otros14);
		order.add(otros21);
		order.add(otros22);
		order.add(otros23);
		order.add(otros24);
		order.add(otros31);
		order.add(otros32);
		order.add(otros33);
		order.add(otros34);
		order.add(otros41);
		order.add(otros42);	
		order.add(otros43);	
		order.add(otros44);	
		
		/*tabulacion vertical		
		order.add(nroAnalisis1);
		order.add(lugarExtraccion1);
		order.add(extraidoPor1);
		order.add(fechaExtraccion);
		order.add(horaExtraccion1);
		order.add(aspecto1);
		order.add(pH1);
		order.add(solidosTotales1);
		order.add(humedad1);
		order.add(solidosTotalesVolatiles1);
		order.add(liquidosLibres1);
		order.add(sulfuro1);
		order.add(cromoEnLixiviado1);
		order.add(plomoEnLixiviado1);
		order.add(materiaOrganica1);
		order.add(hidrocarburosTotales1);
		order.add(conductividad1);
		order.add(relacionCN1);
		order.add(otros11);
		order.add(otros21);
		order.add(otros31);
		order.add(otros41);		
		order.add(nroAnalisis2);
		order.add(lugarExtraccion2);
		order.add(extraidoPor2);
		order.add(fechaExtraccion2);
		order.add(horaExtraccion2);
		order.add(aspecto2);
		order.add(pH2);
		order.add(solidosTotales2);
		order.add(humedad2);
		order.add(solidosTotalesVolatiles2);
		order.add(liquidosLibres2);
		order.add(sulfuro2);
		order.add(cromoEnLixiviado2);
		order.add(plomoEnLixiviado2);
		order.add(materiaOrganica2);
		order.add(hidrocarburosTotales2);
		order.add(conductividad2);
		order.add(relacionCN2);
		order.add(otros12);
		order.add(otros22);
		order.add(otros32);
		order.add(otros42);	
		order.add(nroAnalisis3);
		order.add(lugarExtraccion3);
		order.add(extraidoPor3);
		order.add(fechaExtraccion3);
		order.add(horaExtraccion3);
		order.add(aspecto3);
		order.add(pH3);
		order.add(solidosTotales3);
		order.add(humedad3);
		order.add(solidosTotalesVolatiles3);
		order.add(liquidosLibres3);
		order.add(sulfuro3);
		order.add(cromoEnLixiviado3);
		order.add(plomoEnLixiviado3);
		order.add(materiaOrganica3);
		order.add(hidrocarburosTotales3);
		order.add(conductividad3);
		order.add(relacionCN3);
		order.add(otros13);
		order.add(otros23);
		order.add(otros33);
		order.add(otros43);	
		order.add(nroAnalisis4);
		order.add(lugarExtraccion4);
		order.add(extraidoPor4);
		order.add(fechaExtraccion4);
		order.add(horaExtraccion4);
		order.add(aspecto4);
		order.add(pH4);
		order.add(solidosTotales4);
		order.add(humedad4);
		order.add(solidosTotalesVolatiles4);
		order.add(liquidosLibres4);
		order.add(sulfuro4);
		order.add(cromoEnLixiviado4);
		order.add(plomoEnLixiviado4);
		order.add(materiaOrganica4);
		order.add(hidrocarburosTotales4);
		order.add(conductividad4);
		order.add(relacionCN4);
		order.add(otros14);
		order.add(otros24);
		order.add(otros34);
		order.add(otros44);	
		*/
		order.add(btnNewButton);
		

		
		FocusTraversalPolicy myFocusTraversalPolicy = new MyFocusTraversalPolicy(order);
		frame.setFocusTraversalPolicy(myFocusTraversalPolicy);
		

		
		
	}
}
