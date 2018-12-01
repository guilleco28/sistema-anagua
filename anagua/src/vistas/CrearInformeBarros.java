package vistas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.EventListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

import barros.AnalisisBarro;
import barros.DatosDAO;
import industrias.Industria;
import industrias.IndustriasDAO;
import prueba.ExcelBarros;

import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.beans.PropertyChangeEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class CrearInformeBarros {

	private JFrame frame;
	private JTextField departamento;
	private JTextField localidad;
	private JTextField descargaEn;
	private JTextField industria;
	private JComboBox nroAnalisis1;
	private JComboBox nroAnalisis2;
	private JComboBox nroAnalisis3;
	private JComboBox nroAnalisis4;
	private JTextField lugarExtraccion1;
	private JTextField extraidoPor1;
	private JTextField fechaExtraccion1;
	private JTextField horaExtraccion1;
	private JTextField aspecto1;
	private JTextField pH1;
	private JTextField temperatura1;
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
	private JTextField otros1;
	private JTextField lugarExtraccion2;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField extraidoPor2;
	private JTextField textField_2;
	private JTextField fechaExtraccion2;
	private JTextField textField_3;
	private JTextField horaExtraccion2;
	private JTextField textField_4;
	private JTextField aspecto2;
	private JTextField textField_5;
	private JTextField pH2;
	private JTextField textField_6;
	private JTextField temperatura2;
	private JTextField textField_7;
	private JTextField solidosTotales2;
	private JTextField textField_8;
	private JTextField humedad2;
	private JTextField textField_9;
	private JTextField solidosTotalesVolatiles2;
	private JTextField textField_10;
	private JTextField liquidosLibres2;
	private JTextField textField_11;
	private JTextField sulfuro2;
	private JTextField textField_12;
	private JTextField cromoEnLixiviado2;
	private JTextField textField_13;
	private JTextField plomoEnLixiviado2;
	private JTextField textField_14;
	private JTextField materiaOrganica2;
	private JTextField textField_15;
	private JTextField hidrocarburosTotales2;
	private JTextField textField_16;
	private JTextField conductividad2;
	private JTextField textField_17;
	private JTextField relacionCN2;
	private JTextField lugarExtraccion3;
	private JTextField otros2;
	private JTextField extraidoPor3;
	private JTextField fechaExtraccion3;
	private JTextField horaExtraccion3;
	private JTextField aspecto3;
	private JTextField pH3;
	private JTextField temperatura3;
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
	private JTextField otros3;
	private JTextField lugarExtraccion4;
	private JTextField extraidoPor4;
	private JTextField fechaExtraccion4;
	private JTextField horaExtraccion4;
	private JTextField aspecto4;
	private JTextField pH4;
	private JTextField temperatura4;
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
	private JTextField otros4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrearInformeBarros window = new CrearInformeBarros();
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
	public CrearInformeBarros() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		DatosDAO datosDAO = new DatosDAO();
		IndustriasDAO industriasDAO = new IndustriasDAO();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 1200, 849);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Formulario de creación de informes de barros - ANAGUA");
		frame.setVisible(true);
		frame.setResizable(false);
		
		JLabel lblIndustria = new JLabel("INDUSTRIA");
		lblIndustria.setBounds(300, 20, 75, 16);
		frame.getContentPane().add(lblIndustria);
		
		JLabel lblDepartamento = new JLabel("DEPARTAMENTO");
		lblDepartamento.setBounds(300, 50, 109, 16);
		frame.getContentPane().add(lblDepartamento);
		
		JLabel lblLocalidad = new JLabel("LOCALIDAD");
		lblLocalidad.setBounds(300, 80, 109, 16);
		frame.getContentPane().add(lblLocalidad);
		
		JLabel lblDescargaEn = new JLabel("DESCARGA EN");
		lblDescargaEn.setBounds(600, 50, 109, 16);
		frame.getContentPane().add(lblDescargaEn);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(26, 106, 1155, 12);
		frame.getContentPane().add(separator);
		
		JLabel lblNroAnalisis = new JLabel("Número de análisis");
		lblNroAnalisis.setBounds(37, 130, 150, 16);
		frame.getContentPane().add(lblNroAnalisis);
		
		JLabel lblLugarExtraccion = new JLabel("Lugar de extracción");
		lblLugarExtraccion.setBounds(37, 160, 150, 16);
		frame.getContentPane().add(lblLugarExtraccion);
		
		JLabel lblExtraidoPor = new JLabel("ExtraÃ­do por");
		lblExtraidoPor.setBounds(37, 190, 150, 16);
		frame.getContentPane().add(lblExtraidoPor);
		
		JLabel lblFechaExtraccion = new JLabel("Fecha de extracción");
		lblFechaExtraccion.setBounds(37, 220, 150, 16);
		frame.getContentPane().add(lblFechaExtraccion);
		
		JLabel lblHoraExtraccion = new JLabel("Hora de extracción");
		lblHoraExtraccion.setBounds(37, 250, 150, 16);
		frame.getContentPane().add(lblHoraExtraccion);
		
		JLabel lblAspecto = new JLabel("Aspecto");
		lblAspecto.setBounds(37, 280, 150, 16);
		frame.getContentPane().add(lblAspecto);
		
		JLabel lblpH = new JLabel("pH");
		lblpH.setBounds(37, 310, 150, 16);
		frame.getContentPane().add(lblpH);
		
		JLabel lblTemperatura = new JLabel("Temperatura");
		lblTemperatura.setBounds(37, 340, 150, 16);
		frame.getContentPane().add(lblTemperatura);
		
		JLabel lblSolidosTotales = new JLabel("Sólidos totales");
		lblSolidosTotales.setBounds(37, 370, 150, 16);
		frame.getContentPane().add(lblSolidosTotales);
		
		JLabel lblHumedad = new JLabel("Humedad");
		lblHumedad.setBounds(37, 400, 150, 16);
		frame.getContentPane().add(lblHumedad);
		
		JLabel lblSolidosTotalesVolatiles = new JLabel("Sólidos totales volátiles");
		lblSolidosTotalesVolatiles.setBounds(37, 430, 150, 16);
		frame.getContentPane().add(lblSolidosTotalesVolatiles);
		
		JLabel lblLiquidosLibres = new JLabel("Líquidos libres");
		lblLiquidosLibres.setBounds(37, 460, 150, 16);
		frame.getContentPane().add(lblLiquidosLibres);
		
		JLabel lblSulfuro = new JLabel("Sulfuro");
		lblSulfuro.setBounds(37, 490, 150, 16);
		frame.getContentPane().add(lblSulfuro);
		
		JLabel lblCromoEnLixiviado = new JLabel("Cromo en lixiviado");
		lblCromoEnLixiviado.setBounds(37, 520, 150, 16);
		frame.getContentPane().add(lblCromoEnLixiviado);
		
		JLabel lblPlomoEnLixiviado = new JLabel("Plomo en lixiviado");
		lblPlomoEnLixiviado.setBounds(37, 550, 150, 16);
		frame.getContentPane().add(lblPlomoEnLixiviado);
		
		JLabel lblMateriaOrganica = new JLabel("Materia orgánica");
		lblMateriaOrganica.setBounds(37, 580, 150, 16);
		frame.getContentPane().add(lblMateriaOrganica);
		
		JLabel lblHidrocarburosTotales = new JLabel("Hidrocarburos totales");
		lblHidrocarburosTotales.setBounds(37, 610, 150, 16);
		frame.getContentPane().add(lblHidrocarburosTotales);
		
		JLabel lblConductividad = new JLabel("Conductividad");
		lblConductividad.setBounds(37, 640, 150, 16);
		frame.getContentPane().add(lblConductividad);
		
		JLabel lblRelacionCN = new JLabel("Relación C/N");
		lblRelacionCN.setBounds(37, 670, 150, 16);
		frame.getContentPane().add(lblRelacionCN);
		
		JLabel lblOtros = new JLabel("Otros");
		lblOtros.setBounds(37, 700, 150, 16);
		frame.getContentPane().add(lblOtros);
		
		nroAnalisis1 = new JComboBox();
		nroAnalisis1.setBounds(190, 125, 130, 26);
		frame.getContentPane().add(nroAnalisis1);
		nroAnalisis2 = new JComboBox();
		nroAnalisis2.setBounds(370, 126, 130, 26);
		frame.getContentPane().add(nroAnalisis2);
		nroAnalisis3 = new JComboBox();
		nroAnalisis3.setBounds(550, 126, 130, 26);
		frame.getContentPane().add(nroAnalisis3);
		nroAnalisis4 = new JComboBox();
		nroAnalisis4.setBounds(730, 126, 130, 26);
		frame.getContentPane().add(nroAnalisis4);
		for (AnalisisBarro analisisBarro : datosDAO.obtenerTodosLosAnalisisBarros()){
			nroAnalisis1.addItem(analisisBarro.getNroAnalisis());
			nroAnalisis2.addItem(analisisBarro.getNroAnalisis());
			nroAnalisis3.addItem(analisisBarro.getNroAnalisis());
			nroAnalisis4.addItem(analisisBarro.getNroAnalisis());
		}
		nroAnalisis1.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent arg0){
				AnalisisBarro analisisBarroSeleccionado = datosDAO.obtenerAnalisisBarroPorNumero(String.valueOf(nroAnalisis1.getSelectedItem()));
				industria.setText(analisisBarroSeleccionado.getIndustria());
				departamento.setText(analisisBarroSeleccionado.getDepartamento());
				localidad.setText(analisisBarroSeleccionado.getLocalidad());
				descargaEn.setText(analisisBarroSeleccionado.getDescargaEn());
				lugarExtraccion1.setText(analisisBarroSeleccionado.getLugarExtraccion());
				extraidoPor1.setText(analisisBarroSeleccionado.getExtraidoPor());
				if(analisisBarroSeleccionado.getFechaExtraccion() == null) {
					fechaExtraccion1.setText("");
				} else {
					DateFormat df = new SimpleDateFormat("dd/MM/YYYY");
				    fechaExtraccion1.setText(df.format(analisisBarroSeleccionado.getFechaExtraccion()));
				}
				horaExtraccion1.setText(analisisBarroSeleccionado.getHoraExtraccion());
				aspecto1.setText(analisisBarroSeleccionado.getAspecto());
				pH1.setText(analisisBarroSeleccionado.getpH());
				temperatura1.setText(analisisBarroSeleccionado.getTemperatura());
				solidosTotales1.setText(analisisBarroSeleccionado.getSolidosTotales());
				humedad1.setText(analisisBarroSeleccionado.getHumedad());
				solidosTotalesVolatiles1.setText(analisisBarroSeleccionado.getSolidosTotalesVolatiles());
				liquidosLibres1.setText(analisisBarroSeleccionado.getLiquidosLibres());
				sulfuro1.setText(analisisBarroSeleccionado.getSulfuro());
				cromoEnLixiviado1.setText(analisisBarroSeleccionado.getCromoEnLixiviado());
				plomoEnLixiviado1.setText(analisisBarroSeleccionado.getPlomoEnLixiviado());
				materiaOrganica1.setText(analisisBarroSeleccionado.getMateriaOrganica());
				hidrocarburosTotales1.setText(analisisBarroSeleccionado.getHidrocarburosTotales());
				conductividad1.setText(analisisBarroSeleccionado.getConductividad());
				relacionCN1.setText(analisisBarroSeleccionado.getRelacionCN());
				otros1.setText(analisisBarroSeleccionado.getOtros());
			}
		});
		
		lugarExtraccion1 = new JTextField();
		lugarExtraccion1.setBounds(191, 155, 130, 26);
		frame.getContentPane().add(lugarExtraccion1);
		lugarExtraccion1.setColumns(10);
		lugarExtraccion1.setHorizontalAlignment(JTextField.CENTER);
		lugarExtraccion1.setEditable(false);
		
		extraidoPor1 = new JTextField();
		extraidoPor1.setBounds(191, 185, 130, 26);
		frame.getContentPane().add(extraidoPor1);
		extraidoPor1.setColumns(10);
		extraidoPor1.setHorizontalAlignment(JTextField.CENTER);
		extraidoPor1.setEditable(false);
		
		fechaExtraccion1 = new JTextField();
		fechaExtraccion1.setBounds(191, 215, 130, 26);
		frame.getContentPane().add(fechaExtraccion1);
		fechaExtraccion1.setColumns(10);
		fechaExtraccion1.setHorizontalAlignment(JTextField.CENTER);
		fechaExtraccion1.setEditable(false);
		
		horaExtraccion1 = new JTextField();
		horaExtraccion1.setBounds(191, 245, 130, 26);
		frame.getContentPane().add(horaExtraccion1);
		horaExtraccion1.setColumns(10);
		horaExtraccion1.setHorizontalAlignment(JTextField.CENTER);
		horaExtraccion1.setEditable(false);
		
		aspecto1 = new JTextField();
		aspecto1.setBounds(191, 275, 130, 26);
		frame.getContentPane().add(aspecto1);
		aspecto1.setColumns(10);
		aspecto1.setHorizontalAlignment(JTextField.CENTER);
		aspecto1.setEditable(false);
		
		pH1 = new JTextField();
		pH1.setBounds(191, 305, 130, 26);
		frame.getContentPane().add(pH1);
		pH1.setColumns(10);
		pH1.setHorizontalAlignment(JTextField.CENTER);
		pH1.setEditable(false);
		
		temperatura1 = new JTextField();
		temperatura1.setBounds(191, 335, 130, 26);
		frame.getContentPane().add(temperatura1);
		temperatura1.setColumns(10);
		temperatura1.setHorizontalAlignment(JTextField.CENTER);
		temperatura1.setEditable(false);
		
		solidosTotales1 = new JTextField();
		solidosTotales1.setBounds(191, 365, 130, 26);
		frame.getContentPane().add(solidosTotales1);
		solidosTotales1.setColumns(10);
		solidosTotales1.setHorizontalAlignment(JTextField.CENTER);
		solidosTotales1.setEditable(false);
		
		humedad1 = new JTextField();
		humedad1.setBounds(191, 395, 130, 26);
		frame.getContentPane().add(humedad1);
		humedad1.setColumns(10);
		humedad1.setHorizontalAlignment(JTextField.CENTER);
		humedad1.setEditable(false);
		
		solidosTotalesVolatiles1 = new JTextField();
		solidosTotalesVolatiles1.setBounds(191, 425, 130, 26);
		frame.getContentPane().add(solidosTotalesVolatiles1);
		solidosTotalesVolatiles1.setColumns(10);
		solidosTotalesVolatiles1.setHorizontalAlignment(JTextField.CENTER);
		solidosTotalesVolatiles1.setEditable(false);
		
		liquidosLibres1 = new JTextField();
		liquidosLibres1.setBounds(191, 455, 130, 26);
		frame.getContentPane().add(liquidosLibres1);
		liquidosLibres1.setColumns(10);
		liquidosLibres1.setHorizontalAlignment(JTextField.CENTER);
		liquidosLibres1.setEditable(false);
		
		sulfuro1 = new JTextField();
		sulfuro1.setBounds(191, 485, 130, 26);
		frame.getContentPane().add(sulfuro1);
		sulfuro1.setColumns(10);
		sulfuro1.setHorizontalAlignment(JTextField.CENTER);
		sulfuro1.setEditable(false);
		
		cromoEnLixiviado1 = new JTextField();
		cromoEnLixiviado1.setBounds(191, 515, 130, 26);
		frame.getContentPane().add(cromoEnLixiviado1);
		cromoEnLixiviado1.setColumns(10);
		cromoEnLixiviado1.setHorizontalAlignment(JTextField.CENTER);
		cromoEnLixiviado1.setEditable(false);
		
		plomoEnLixiviado1 = new JTextField();
		plomoEnLixiviado1.setBounds(191, 545, 130, 26);
		frame.getContentPane().add(plomoEnLixiviado1);
		plomoEnLixiviado1.setColumns(10);
		plomoEnLixiviado1.setHorizontalAlignment(JTextField.CENTER);
		plomoEnLixiviado1.setEditable(false);
		
		materiaOrganica1 = new JTextField();
		materiaOrganica1.setBounds(191, 575, 130, 26);
		frame.getContentPane().add(materiaOrganica1);
		materiaOrganica1.setColumns(10);
		materiaOrganica1.setHorizontalAlignment(JTextField.CENTER);
		materiaOrganica1.setEditable(false);
		
		hidrocarburosTotales1 = new JTextField();
		hidrocarburosTotales1.setBounds(191, 605, 130, 26);
		frame.getContentPane().add(hidrocarburosTotales1);
		hidrocarburosTotales1.setColumns(10);
		hidrocarburosTotales1.setHorizontalAlignment(JTextField.CENTER);
		hidrocarburosTotales1.setEditable(false);
		
		conductividad1 = new JTextField();
		conductividad1.setBounds(191, 635, 130, 26);
		frame.getContentPane().add(conductividad1);
		conductividad1.setColumns(10);
		conductividad1.setHorizontalAlignment(JTextField.CENTER);
		conductividad1.setEditable(false);
		
		relacionCN1 = new JTextField();
		relacionCN1.setBounds(191, 665, 130, 26);
		frame.getContentPane().add(relacionCN1);
		relacionCN1.setColumns(10);
		relacionCN1.setHorizontalAlignment(JTextField.CENTER);
		relacionCN1.setEditable(false);
		
		otros1 = new JTextField();
		otros1.setBounds(191, 695, 130, 26);
		frame.getContentPane().add(otros1);
		otros1.setColumns(10);
		otros1.setHorizontalAlignment(JTextField.CENTER);
		otros1.setEditable(false);
		
		
		
		
		/*btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			
			public void mouseClicked(MouseEvent e) {
				AnalisisBarro analisisBarro = new AnalisisBarro (String.valueOf(industria.getSelectedItem()), departamento.getText(), localidad.getText(), descargaEn.getText(), nroAnalisis1.getText(),
						lugarExtraccion1.getText(), extraidoPor1.getText(), fechaExtraccion1.getText(), horaExtraccion1.getText(), aspecto1.getText(), pH1.getText(),
						temperatura1.getText(), solidosTotales1.getText(), humedad1.getText(), solidosTotalesVolatiles1.getText(), liquidosLibres1.getText(), sulfuro1.getText(),
						cromoEnLixiviado1.getText(), plomoEnLixiviado1.getText(), materiaOrganica1.getText(), hidrocarburosTotales1.getText(), conductividad1.getText(),
						relacionCN1.getText(), otros1.getText(), "En proceso");
				try {
					datosDAO.agregarBarro(analisisBarro);
				} catch (MySQLIntegrityConstraintViolationException e1) {
					JOptionPane.showMessageDialog(null, "Usted estÃ¡ intentando agregar un anÃ¡lisis con un nÃºmero ya existente en el sistema.");
				} catch (SQLException e1) {
					JOptionPane.showMessageDialog(null, "Se ha producido un error. Revise los datos que intenta ingresar.");
					e1.printStackTrace();
				}
				//JOptionPane.showMessageDialog(null, "Se agregÃ³ el anÃ¡lisis correctamente al sistema.");
			}
		});*/
		
		industria = new JTextField();
		industria.setBounds(416, 16, 272, 27);
		frame.getContentPane().add(industria);
		industria.setColumns(10);
		industria.setEditable(false);		
		
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
		
		/*JComboBox nroAnalisis2 = new JComboBox();
		nroAnalisis2.setBounds(370, 126, 130, 26);
		frame.getContentPane().add(nroAnalisis2);
		for (AnalisisBarro analisisBarro : datosDAO.obtenerTodosLosAnalisisBarros()){
			nroAnalisis2.addItem(analisisBarro.getNroAnalisis());
		}*/
		nroAnalisis2.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent arg0){
				AnalisisBarro analisisBarroSeleccionado = datosDAO.obtenerAnalisisBarroPorNumero(String.valueOf(nroAnalisis2.getSelectedItem()));
				lugarExtraccion2.setText(analisisBarroSeleccionado.getLugarExtraccion());
				extraidoPor2.setText(analisisBarroSeleccionado.getExtraidoPor());
				if(analisisBarroSeleccionado.getFechaExtraccion() == null) {
					fechaExtraccion2.setText("");
				} else {
					DateFormat df = new SimpleDateFormat("dd/MM/YYYY");
				    fechaExtraccion2.setText(df.format(analisisBarroSeleccionado.getFechaExtraccion()));
				}
				horaExtraccion2.setText(analisisBarroSeleccionado.getHoraExtraccion());
				aspecto2.setText(analisisBarroSeleccionado.getAspecto());
				pH2.setText(analisisBarroSeleccionado.getpH());
				temperatura2.setText(analisisBarroSeleccionado.getTemperatura());
				solidosTotales2.setText(analisisBarroSeleccionado.getSolidosTotales());
				humedad2.setText(analisisBarroSeleccionado.getHumedad());
				solidosTotalesVolatiles2.setText(analisisBarroSeleccionado.getSolidosTotalesVolatiles());
				liquidosLibres2.setText(analisisBarroSeleccionado.getLiquidosLibres());
				sulfuro2.setText(analisisBarroSeleccionado.getSulfuro());
				cromoEnLixiviado2.setText(analisisBarroSeleccionado.getCromoEnLixiviado());
				plomoEnLixiviado2.setText(analisisBarroSeleccionado.getPlomoEnLixiviado());
				materiaOrganica2.setText(analisisBarroSeleccionado.getMateriaOrganica());
				hidrocarburosTotales2.setText(analisisBarroSeleccionado.getHidrocarburosTotales());
				conductividad2.setText(analisisBarroSeleccionado.getConductividad());
				relacionCN2.setText(analisisBarroSeleccionado.getRelacionCN());
				otros2.setText(analisisBarroSeleccionado.getOtros());
			}
		});
		
		/*JComboBox nroAnalisis3 = new JComboBox();
		nroAnalisis3.setBounds(550, 126, 130, 26);
		frame.getContentPane().add(nroAnalisis3);
		for (AnalisisBarro analisisBarro : datosDAO.obtenerTodosLosAnalisisBarros()){
			nroAnalisis3.addItem(analisisBarro.getNroAnalisis());
		}*/
		nroAnalisis3.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent arg0){
				AnalisisBarro analisisBarroSeleccionado = datosDAO.obtenerAnalisisBarroPorNumero(String.valueOf(nroAnalisis3.getSelectedItem()));
				lugarExtraccion3.setText(analisisBarroSeleccionado.getLugarExtraccion());
				extraidoPor3.setText(analisisBarroSeleccionado.getExtraidoPor());
				if(analisisBarroSeleccionado.getFechaExtraccion() == null) {
					fechaExtraccion3.setText("");
				} else {
					DateFormat df = new SimpleDateFormat("dd/MM/YYYY");
				    fechaExtraccion3.setText(df.format(analisisBarroSeleccionado.getFechaExtraccion()));
				}
				horaExtraccion3.setText(analisisBarroSeleccionado.getHoraExtraccion());
				aspecto3.setText(analisisBarroSeleccionado.getAspecto());
				pH3.setText(analisisBarroSeleccionado.getpH());
				temperatura3.setText(analisisBarroSeleccionado.getTemperatura());
				solidosTotales3.setText(analisisBarroSeleccionado.getSolidosTotales());
				humedad3.setText(analisisBarroSeleccionado.getHumedad());
				solidosTotalesVolatiles3.setText(analisisBarroSeleccionado.getSolidosTotalesVolatiles());
				liquidosLibres3.setText(analisisBarroSeleccionado.getLiquidosLibres());
				sulfuro3.setText(analisisBarroSeleccionado.getSulfuro());
				cromoEnLixiviado3.setText(analisisBarroSeleccionado.getCromoEnLixiviado());
				plomoEnLixiviado3.setText(analisisBarroSeleccionado.getPlomoEnLixiviado());
				materiaOrganica3.setText(analisisBarroSeleccionado.getMateriaOrganica());
				hidrocarburosTotales3.setText(analisisBarroSeleccionado.getHidrocarburosTotales());
				conductividad3.setText(analisisBarroSeleccionado.getConductividad());
				relacionCN3.setText(analisisBarroSeleccionado.getRelacionCN());
				otros3.setText(analisisBarroSeleccionado.getOtros());
			}
		});
		
		/*JComboBox nroAnalisis4 = new JComboBox();
		nroAnalisis4.setBounds(730, 126, 130, 26);
		frame.getContentPane().add(nroAnalisis4);
		for (AnalisisBarro analisisBarro : datosDAO.obtenerTodosLosAnalisisBarros()){
			nroAnalisis4.addItem(analisisBarro.getNroAnalisis());
		}*/
		nroAnalisis4.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent arg0){
				AnalisisBarro analisisBarroSeleccionado = datosDAO.obtenerAnalisisBarroPorNumero(String.valueOf(nroAnalisis4.getSelectedItem()));
				lugarExtraccion4.setText(analisisBarroSeleccionado.getLugarExtraccion());
				extraidoPor4.setText(analisisBarroSeleccionado.getExtraidoPor());
				if(analisisBarroSeleccionado.getFechaExtraccion() == null) {
					fechaExtraccion4.setText("");
				} else {
					DateFormat df = new SimpleDateFormat("dd/MM/YYYY");
				    fechaExtraccion4.setText(df.format(analisisBarroSeleccionado.getFechaExtraccion()));
				}
				horaExtraccion4.setText(analisisBarroSeleccionado.getHoraExtraccion());
				aspecto4.setText(analisisBarroSeleccionado.getAspecto());
				pH4.setText(analisisBarroSeleccionado.getpH());
				temperatura4.setText(analisisBarroSeleccionado.getTemperatura());
				solidosTotales4.setText(analisisBarroSeleccionado.getSolidosTotales());
				humedad4.setText(analisisBarroSeleccionado.getHumedad());
				solidosTotalesVolatiles4.setText(analisisBarroSeleccionado.getSolidosTotalesVolatiles());
				liquidosLibres4.setText(analisisBarroSeleccionado.getLiquidosLibres());
				sulfuro4.setText(analisisBarroSeleccionado.getSulfuro());
				cromoEnLixiviado4.setText(analisisBarroSeleccionado.getCromoEnLixiviado());
				plomoEnLixiviado4.setText(analisisBarroSeleccionado.getPlomoEnLixiviado());
				materiaOrganica4.setText(analisisBarroSeleccionado.getMateriaOrganica());
				hidrocarburosTotales4.setText(analisisBarroSeleccionado.getHidrocarburosTotales());
				conductividad4.setText(analisisBarroSeleccionado.getConductividad());
				relacionCN4.setText(analisisBarroSeleccionado.getRelacionCN());
				otros4.setText(analisisBarroSeleccionado.getOtros());
			}
		});
		
		lugarExtraccion2 = new JTextField();
		lugarExtraccion2.setHorizontalAlignment(SwingConstants.CENTER);
		lugarExtraccion2.setEditable(false);
		lugarExtraccion2.setColumns(10);
		lugarExtraccion2.setBounds(370, 155, 130, 26);
		frame.getContentPane().add(lugarExtraccion2);
		
		extraidoPor2 = new JTextField();
		extraidoPor2.setHorizontalAlignment(SwingConstants.CENTER);
		extraidoPor2.setEditable(false);
		extraidoPor2.setColumns(10);
		extraidoPor2.setBounds(370, 185, 130, 26);
		frame.getContentPane().add(extraidoPor2);
		
		fechaExtraccion2 = new JTextField();
		fechaExtraccion2.setHorizontalAlignment(SwingConstants.CENTER);
		fechaExtraccion2.setEditable(false);
		fechaExtraccion2.setColumns(10);
		fechaExtraccion2.setBounds(370, 215, 130, 26);
		frame.getContentPane().add(fechaExtraccion2);
		
		horaExtraccion2 = new JTextField();
		horaExtraccion2.setHorizontalAlignment(SwingConstants.CENTER);
		horaExtraccion2.setEditable(false);
		horaExtraccion2.setColumns(10);
		horaExtraccion2.setBounds(370, 245, 130, 26);
		frame.getContentPane().add(horaExtraccion2);
		
		aspecto2 = new JTextField();
		aspecto2.setHorizontalAlignment(SwingConstants.CENTER);
		aspecto2.setEditable(false);
		aspecto2.setColumns(10);
		aspecto2.setBounds(370, 275, 130, 26);
		frame.getContentPane().add(aspecto2);
		
		pH2 = new JTextField();
		pH2.setHorizontalAlignment(SwingConstants.CENTER);
		pH2.setEditable(false);
		pH2.setColumns(10);
		pH2.setBounds(370, 305, 130, 26);
		frame.getContentPane().add(pH2);
		
		temperatura2 = new JTextField();
		temperatura2.setHorizontalAlignment(SwingConstants.CENTER);
		temperatura2.setEditable(false);
		temperatura2.setColumns(10);
		temperatura2.setBounds(370, 335, 130, 26);
		frame.getContentPane().add(temperatura2);
		
		solidosTotales2 = new JTextField();
		solidosTotales2.setHorizontalAlignment(SwingConstants.CENTER);
		solidosTotales2.setEditable(false);
		solidosTotales2.setColumns(10);
		solidosTotales2.setBounds(370, 365, 130, 26);
		frame.getContentPane().add(solidosTotales2);
		
		humedad2 = new JTextField();
		humedad2.setHorizontalAlignment(SwingConstants.CENTER);
		humedad2.setEditable(false);
		humedad2.setColumns(10);
		humedad2.setBounds(370, 395, 130, 26);
		frame.getContentPane().add(humedad2);
		
		solidosTotalesVolatiles2 = new JTextField();
		solidosTotalesVolatiles2.setHorizontalAlignment(SwingConstants.CENTER);
		solidosTotalesVolatiles2.setEditable(false);
		solidosTotalesVolatiles2.setColumns(10);
		solidosTotalesVolatiles2.setBounds(370, 425, 130, 26);
		frame.getContentPane().add(solidosTotalesVolatiles2);
		
		liquidosLibres2 = new JTextField();
		liquidosLibres2.setHorizontalAlignment(SwingConstants.CENTER);
		liquidosLibres2.setEditable(false);
		liquidosLibres2.setColumns(10);
		liquidosLibres2.setBounds(370, 455, 130, 26);
		frame.getContentPane().add(liquidosLibres2);
		
		sulfuro2 = new JTextField();
		sulfuro2.setHorizontalAlignment(SwingConstants.CENTER);
		sulfuro2.setEditable(false);
		sulfuro2.setColumns(10);
		sulfuro2.setBounds(370, 485, 130, 26);
		frame.getContentPane().add(sulfuro2);
		
		cromoEnLixiviado2 = new JTextField();
		cromoEnLixiviado2.setHorizontalAlignment(SwingConstants.CENTER);
		cromoEnLixiviado2.setEditable(false);
		cromoEnLixiviado2.setColumns(10);
		cromoEnLixiviado2.setBounds(370, 515, 130, 26);
		frame.getContentPane().add(cromoEnLixiviado2);
		
		plomoEnLixiviado2 = new JTextField();
		plomoEnLixiviado2.setHorizontalAlignment(SwingConstants.CENTER);
		plomoEnLixiviado2.setEditable(false);
		plomoEnLixiviado2.setColumns(10);
		plomoEnLixiviado2.setBounds(370, 545, 130, 26);
		frame.getContentPane().add(plomoEnLixiviado2);
		
		materiaOrganica2 = new JTextField();
		materiaOrganica2.setHorizontalAlignment(SwingConstants.CENTER);
		materiaOrganica2.setEditable(false);
		materiaOrganica2.setColumns(10);
		materiaOrganica2.setBounds(370, 575, 130, 26);
		frame.getContentPane().add(materiaOrganica2);
		
		hidrocarburosTotales2 = new JTextField();
		hidrocarburosTotales2.setHorizontalAlignment(SwingConstants.CENTER);
		hidrocarburosTotales2.setEditable(false);
		hidrocarburosTotales2.setColumns(10);
		hidrocarburosTotales2.setBounds(370, 605, 130, 26);
		frame.getContentPane().add(hidrocarburosTotales2);
		
		conductividad2 = new JTextField();
		conductividad2.setHorizontalAlignment(SwingConstants.CENTER);
		conductividad2.setEditable(false);
		conductividad2.setColumns(10);
		conductividad2.setBounds(370, 635, 130, 26);
		frame.getContentPane().add(conductividad2);
		
		relacionCN2 = new JTextField();
		relacionCN2.setHorizontalAlignment(SwingConstants.CENTER);
		relacionCN2.setEditable(false);
		relacionCN2.setColumns(10);
		relacionCN2.setBounds(370, 665, 130, 26);
		frame.getContentPane().add(relacionCN2);
		
		otros2 = new JTextField();
		otros2.setHorizontalAlignment(SwingConstants.CENTER);
		otros2.setEditable(false);
		otros2.setColumns(10);
		otros2.setBounds(370, 695, 130, 26);
		frame.getContentPane().add(otros2);
		
		lugarExtraccion2 = new JTextField();
		lugarExtraccion2.setHorizontalAlignment(SwingConstants.CENTER);
		lugarExtraccion2.setEditable(false);
		lugarExtraccion2.setColumns(10);
		lugarExtraccion2.setBounds(370, 155, 130, 26);
		frame.getContentPane().add(lugarExtraccion2);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(370, 185, 130, 26);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(370, 215, 130, 26);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(370, 245, 130, 26);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(370, 275, 130, 26);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(370, 305, 130, 26);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(370, 335, 130, 26);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(370, 365, 130, 26);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(370, 395, 130, 26);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBounds(370, 425, 130, 26);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBounds(370, 455, 130, 26);
		frame.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		textField_10.setBounds(370, 485, 130, 26);
		frame.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setEditable(false);
		textField_11.setColumns(10);
		textField_11.setBounds(370, 515, 130, 26);
		frame.getContentPane().add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setEditable(false);
		textField_12.setColumns(10);
		textField_12.setBounds(370, 545, 130, 26);
		frame.getContentPane().add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setEditable(false);
		textField_13.setColumns(10);
		textField_13.setBounds(370, 575, 130, 26);
		frame.getContentPane().add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14.setEditable(false);
		textField_14.setColumns(10);
		textField_14.setBounds(370, 605, 130, 26);
		frame.getContentPane().add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setHorizontalAlignment(SwingConstants.CENTER);
		textField_15.setEditable(false);
		textField_15.setColumns(10);
		textField_15.setBounds(370, 635, 130, 26);
		frame.getContentPane().add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setHorizontalAlignment(SwingConstants.CENTER);
		textField_16.setEditable(false);
		textField_16.setColumns(10);
		textField_16.setBounds(370, 665, 130, 26);
		frame.getContentPane().add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setHorizontalAlignment(SwingConstants.CENTER);
		textField_17.setEditable(false);
		textField_17.setColumns(10);
		textField_17.setBounds(370, 695, 130, 26);
		frame.getContentPane().add(textField_17);
		
		lugarExtraccion3 = new JTextField();
		lugarExtraccion3.setHorizontalAlignment(SwingConstants.CENTER);
		lugarExtraccion3.setEditable(false);
		lugarExtraccion3.setColumns(10);
		lugarExtraccion3.setBounds(550, 155, 130, 26);
		frame.getContentPane().add(lugarExtraccion3);
		
		extraidoPor3 = new JTextField();
		extraidoPor3.setHorizontalAlignment(SwingConstants.CENTER);
		extraidoPor3.setEditable(false);
		extraidoPor3.setColumns(10);
		extraidoPor3.setBounds(550, 185, 130, 26);
		frame.getContentPane().add(extraidoPor3);
		
		fechaExtraccion3 = new JTextField();
		fechaExtraccion3.setHorizontalAlignment(SwingConstants.CENTER);
		fechaExtraccion3.setEditable(false);
		fechaExtraccion3.setColumns(10);
		fechaExtraccion3.setBounds(550, 215, 130, 26);
		frame.getContentPane().add(fechaExtraccion3);
		
		horaExtraccion3 = new JTextField();
		horaExtraccion3.setHorizontalAlignment(SwingConstants.CENTER);
		horaExtraccion3.setEditable(false);
		horaExtraccion3.setColumns(10);
		horaExtraccion3.setBounds(550, 245, 130, 26);
		frame.getContentPane().add(horaExtraccion3);
		
		aspecto3 = new JTextField();
		aspecto3.setHorizontalAlignment(SwingConstants.CENTER);
		aspecto3.setEditable(false);
		aspecto3.setColumns(10);
		aspecto3.setBounds(550, 275, 130, 26);
		frame.getContentPane().add(aspecto3);
		
		pH3 = new JTextField();
		pH3.setHorizontalAlignment(SwingConstants.CENTER);
		pH3.setEditable(false);
		pH3.setColumns(10);
		pH3.setBounds(550, 305, 130, 26);
		frame.getContentPane().add(pH3);
		
		temperatura3 = new JTextField();
		temperatura3.setHorizontalAlignment(SwingConstants.CENTER);
		temperatura3.setEditable(false);
		temperatura3.setColumns(10);
		temperatura3.setBounds(550, 335, 130, 26);
		frame.getContentPane().add(temperatura3);
		
		solidosTotales3 = new JTextField();
		solidosTotales3.setHorizontalAlignment(SwingConstants.CENTER);
		solidosTotales3.setEditable(false);
		solidosTotales3.setColumns(10);
		solidosTotales3.setBounds(550, 365, 130, 26);
		frame.getContentPane().add(solidosTotales3);
		
		humedad3 = new JTextField();
		humedad3.setHorizontalAlignment(SwingConstants.CENTER);
		humedad3.setEditable(false);
		humedad3.setColumns(10);
		humedad3.setBounds(550, 395, 130, 26);
		frame.getContentPane().add(humedad3);
		
		solidosTotalesVolatiles3 = new JTextField();
		solidosTotalesVolatiles3.setHorizontalAlignment(SwingConstants.CENTER);
		solidosTotalesVolatiles3.setEditable(false);
		solidosTotalesVolatiles3.setColumns(10);
		solidosTotalesVolatiles3.setBounds(550, 425, 130, 26);
		frame.getContentPane().add(solidosTotalesVolatiles3);
		
		liquidosLibres3 = new JTextField();
		liquidosLibres3.setHorizontalAlignment(SwingConstants.CENTER);
		liquidosLibres3.setEditable(false);
		liquidosLibres3.setColumns(10);
		liquidosLibres3.setBounds(550, 455, 130, 26);
		frame.getContentPane().add(liquidosLibres3);
		
		sulfuro3 = new JTextField();
		sulfuro3.setHorizontalAlignment(SwingConstants.CENTER);
		sulfuro3.setEditable(false);
		sulfuro3.setColumns(10);
		sulfuro3.setBounds(550, 485, 130, 26);
		frame.getContentPane().add(sulfuro3);
		
		cromoEnLixiviado3 = new JTextField();
		cromoEnLixiviado3.setHorizontalAlignment(SwingConstants.CENTER);
		cromoEnLixiviado3.setEditable(false);
		cromoEnLixiviado3.setColumns(10);
		cromoEnLixiviado3.setBounds(550, 515, 130, 26);
		frame.getContentPane().add(cromoEnLixiviado3);
		
		plomoEnLixiviado3 = new JTextField();
		plomoEnLixiviado3.setHorizontalAlignment(SwingConstants.CENTER);
		plomoEnLixiviado3.setEditable(false);
		plomoEnLixiviado3.setColumns(10);
		plomoEnLixiviado3.setBounds(550, 545, 130, 26);
		frame.getContentPane().add(plomoEnLixiviado3);
		
		materiaOrganica3 = new JTextField();
		materiaOrganica3.setHorizontalAlignment(SwingConstants.CENTER);
		materiaOrganica3.setEditable(false);
		materiaOrganica3.setColumns(10);
		materiaOrganica3.setBounds(550, 575, 130, 26);
		frame.getContentPane().add(materiaOrganica3);
		
		hidrocarburosTotales3 = new JTextField();
		hidrocarburosTotales3.setHorizontalAlignment(SwingConstants.CENTER);
		hidrocarburosTotales3.setEditable(false);
		hidrocarburosTotales3.setColumns(10);
		hidrocarburosTotales3.setBounds(550, 605, 130, 26);
		frame.getContentPane().add(hidrocarburosTotales3);
		
		conductividad3 = new JTextField();
		conductividad3.setHorizontalAlignment(SwingConstants.CENTER);
		conductividad3.setEditable(false);
		conductividad3.setColumns(10);
		conductividad3.setBounds(550, 635, 130, 26);
		frame.getContentPane().add(conductividad3);
		
		relacionCN3 = new JTextField();
		relacionCN3.setHorizontalAlignment(SwingConstants.CENTER);
		relacionCN3.setEditable(false);
		relacionCN3.setColumns(10);
		relacionCN3.setBounds(550, 665, 130, 26);
		frame.getContentPane().add(relacionCN3);
		
		otros3 = new JTextField();
		otros3.setHorizontalAlignment(SwingConstants.CENTER);
		otros3.setEditable(false);
		otros3.setColumns(10);
		otros3.setBounds(550, 695, 130, 26);
		frame.getContentPane().add(otros3);
		
		lugarExtraccion4 = new JTextField();
		lugarExtraccion4.setHorizontalAlignment(SwingConstants.CENTER);
		lugarExtraccion4.setEditable(false);
		lugarExtraccion4.setColumns(10);
		lugarExtraccion4.setBounds(730, 155, 130, 26);
		frame.getContentPane().add(lugarExtraccion4);
		
		extraidoPor4 = new JTextField();
		extraidoPor4.setHorizontalAlignment(SwingConstants.CENTER);
		extraidoPor4.setEditable(false);
		extraidoPor4.setColumns(10);
		extraidoPor4.setBounds(730, 185, 130, 26);
		frame.getContentPane().add(extraidoPor4);
		
		fechaExtraccion4 = new JTextField();
		fechaExtraccion4.setHorizontalAlignment(SwingConstants.CENTER);
		fechaExtraccion4.setEditable(false);
		fechaExtraccion4.setColumns(10);
		fechaExtraccion4.setBounds(730, 215, 130, 26);
		frame.getContentPane().add(fechaExtraccion4);
		
		horaExtraccion4 = new JTextField();
		horaExtraccion4.setHorizontalAlignment(SwingConstants.CENTER);
		horaExtraccion4.setEditable(false);
		horaExtraccion4.setColumns(10);
		horaExtraccion4.setBounds(730, 245, 130, 26);
		frame.getContentPane().add(horaExtraccion4);
		
		aspecto4 = new JTextField();
		aspecto4.setHorizontalAlignment(SwingConstants.CENTER);
		aspecto4.setEditable(false);
		aspecto4.setColumns(10);
		aspecto4.setBounds(730, 275, 130, 26);
		frame.getContentPane().add(aspecto4);
		
		pH4 = new JTextField();
		pH4.setHorizontalAlignment(SwingConstants.CENTER);
		pH4.setEditable(false);
		pH4.setColumns(10);
		pH4.setBounds(730, 305, 130, 26);
		frame.getContentPane().add(pH4);
		
		temperatura4 = new JTextField();
		temperatura4.setHorizontalAlignment(SwingConstants.CENTER);
		temperatura4.setEditable(false);
		temperatura4.setColumns(10);
		temperatura4.setBounds(730, 335, 130, 26);
		frame.getContentPane().add(temperatura4);
		
		solidosTotales4 = new JTextField();
		solidosTotales4.setHorizontalAlignment(SwingConstants.CENTER);
		solidosTotales4.setEditable(false);
		solidosTotales4.setColumns(10);
		solidosTotales4.setBounds(730, 365, 130, 26);
		frame.getContentPane().add(solidosTotales4);
		
		humedad4 = new JTextField();
		humedad4.setHorizontalAlignment(SwingConstants.CENTER);
		humedad4.setEditable(false);
		humedad4.setColumns(10);
		humedad4.setBounds(730, 395, 130, 26);
		frame.getContentPane().add(humedad4);
		
		solidosTotalesVolatiles4 = new JTextField();
		solidosTotalesVolatiles4.setHorizontalAlignment(SwingConstants.CENTER);
		solidosTotalesVolatiles4.setEditable(false);
		solidosTotalesVolatiles4.setColumns(10);
		solidosTotalesVolatiles4.setBounds(730, 425, 130, 26);
		frame.getContentPane().add(solidosTotalesVolatiles4);
		
		liquidosLibres4 = new JTextField();
		liquidosLibres4.setHorizontalAlignment(SwingConstants.CENTER);
		liquidosLibres4.setEditable(false);
		liquidosLibres4.setColumns(10);
		liquidosLibres4.setBounds(730, 455, 130, 26);
		frame.getContentPane().add(liquidosLibres4);
		
		sulfuro4 = new JTextField();
		sulfuro4.setHorizontalAlignment(SwingConstants.CENTER);
		sulfuro4.setEditable(false);
		sulfuro4.setColumns(10);
		sulfuro4.setBounds(730, 485, 130, 26);
		frame.getContentPane().add(sulfuro4);
		
		cromoEnLixiviado4 = new JTextField();
		cromoEnLixiviado4.setHorizontalAlignment(SwingConstants.CENTER);
		cromoEnLixiviado4.setEditable(false);
		cromoEnLixiviado4.setColumns(10);
		cromoEnLixiviado4.setBounds(730, 515, 130, 26);
		frame.getContentPane().add(cromoEnLixiviado4);
		
		plomoEnLixiviado4 = new JTextField();
		plomoEnLixiviado4.setHorizontalAlignment(SwingConstants.CENTER);
		plomoEnLixiviado4.setEditable(false);
		plomoEnLixiviado4.setColumns(10);
		plomoEnLixiviado4.setBounds(730, 545, 130, 26);
		frame.getContentPane().add(plomoEnLixiviado4);
		
		materiaOrganica4 = new JTextField();
		materiaOrganica4.setHorizontalAlignment(SwingConstants.CENTER);
		materiaOrganica4.setEditable(false);
		materiaOrganica4.setColumns(10);
		materiaOrganica4.setBounds(730, 575, 130, 26);
		frame.getContentPane().add(materiaOrganica4);
		
		hidrocarburosTotales4 = new JTextField();
		hidrocarburosTotales4.setHorizontalAlignment(SwingConstants.CENTER);
		hidrocarburosTotales4.setEditable(false);
		hidrocarburosTotales4.setColumns(10);
		hidrocarburosTotales4.setBounds(730, 605, 130, 26);
		frame.getContentPane().add(hidrocarburosTotales4);
		
		conductividad4 = new JTextField();
		conductividad4.setHorizontalAlignment(SwingConstants.CENTER);
		conductividad4.setEditable(false);
		conductividad4.setColumns(10);
		conductividad4.setBounds(730, 635, 130, 26);
		frame.getContentPane().add(conductividad4);
		
		relacionCN4 = new JTextField();
		relacionCN4.setHorizontalAlignment(SwingConstants.CENTER);
		relacionCN4.setEditable(false);
		relacionCN4.setColumns(10);
		relacionCN4.setBounds(730, 665, 130, 26);
		frame.getContentPane().add(relacionCN4);
		
		otros4 = new JTextField();
		otros4.setHorizontalAlignment(SwingConstants.CENTER);
		otros4.setEditable(false);
		otros4.setColumns(10);
		otros4.setBounds(730, 695, 130, 26);
		frame.getContentPane().add(otros4);
		
		JButton btnNewButton = new JButton("Crear informe");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(902, 334, 232, 82);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				final String pattern = "dd/MM/yyyy";				
				
				ArrayList <AnalisisBarro> analisisParaInforme = new ArrayList <AnalisisBarro>();
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

					AnalisisBarro analisisBarro = null;
					analisisBarro = new AnalisisBarro (industria.getText(), departamento.getText(), localidad.getText(), descargaEn.getText(), String.valueOf(nroAnalisis1.getSelectedItem()),
							lugarExtraccion1.getText(), extraidoPor1.getText(), date, horaExtraccion1.getText(), aspecto1.getText(), pH1.getText(),
							temperatura1.getText(), solidosTotales1.getText(), humedad1.getText(), solidosTotalesVolatiles1.getText(), liquidosLibres1.getText(), sulfuro1.getText(),
							cromoEnLixiviado1.getText(), plomoEnLixiviado1.getText(), materiaOrganica1.getText(), hidrocarburosTotales1.getText(), conductividad1.getText(),
							relacionCN1.getText(), otros1.getText(), null);
					analisisParaInforme.add(analisisBarro);
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
					AnalisisBarro analisisBarro = new AnalisisBarro (industria.getText(), departamento.getText(), localidad.getText(), descargaEn.getText(), String.valueOf(nroAnalisis2.getSelectedItem()),
							lugarExtraccion2.getText(), extraidoPor2.getText(), date2, horaExtraccion2.getText(), aspecto2.getText(), pH2.getText(),
							temperatura2.getText(), solidosTotales2.getText(), humedad2.getText(), solidosTotalesVolatiles2.getText(), liquidosLibres2.getText(), sulfuro2.getText(),
							cromoEnLixiviado2.getText(), plomoEnLixiviado2.getText(), materiaOrganica2.getText(), hidrocarburosTotales2.getText(), conductividad2.getText(),
							relacionCN2.getText(), otros2.getText(), null);
					analisisParaInforme.add(analisisBarro);					
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
					AnalisisBarro analisisBarro = new AnalisisBarro (industria.getText(), departamento.getText(), localidad.getText(), descargaEn.getText(), String.valueOf(nroAnalisis3.getSelectedItem()),
							lugarExtraccion3.getText(), extraidoPor3.getText(), date3, horaExtraccion3.getText(), aspecto3.getText(), pH3.getText(),
							temperatura3.getText(), solidosTotales3.getText(), humedad3.getText(), solidosTotalesVolatiles3.getText(), liquidosLibres3.getText(), sulfuro3.getText(),
							cromoEnLixiviado3.getText(), plomoEnLixiviado3.getText(), materiaOrganica3.getText(), hidrocarburosTotales3.getText(), conductividad3.getText(),
							relacionCN3.getText(), otros3.getText(), null);
					analisisParaInforme.add(analisisBarro);					
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
					AnalisisBarro analisisBarro = new AnalisisBarro (industria.getText(), departamento.getText(), localidad.getText(), descargaEn.getText(), String.valueOf(nroAnalisis4.getSelectedItem()),
							lugarExtraccion4.getText(), extraidoPor4.getText(), date4, horaExtraccion4.getText(), aspecto4.getText(), pH4.getText(),
							temperatura4.getText(), solidosTotales4.getText(), humedad4.getText(), solidosTotalesVolatiles4.getText(), liquidosLibres4.getText(), sulfuro4.getText(),
							cromoEnLixiviado4.getText(), plomoEnLixiviado4.getText(), materiaOrganica4.getText(), hidrocarburosTotales4.getText(), conductividad4.getText(),
							relacionCN4.getText(), otros4.getText(), null);
					analisisParaInforme.add(analisisBarro);
					
				}
				try {
					datosDAO.generarTablaParaInformeBarros(analisisParaInforme);
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				//Process p = pb.start();
				ExcelBarros excelBarros = new ExcelBarros();
				ExcelBarros.realizarInforme();
			}
		});
		
		

	}
	

}
