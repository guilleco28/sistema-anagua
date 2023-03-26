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

//import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

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
	private JTextField pH2;
	private JTextField solidosTotales2;
	private JTextField humedad2;
	private JTextField solidosTotalesVolatiles2;
	private JTextField liquidosLibres2;
	private JTextField sulfuro2;
	private JTextField cromoEnLixiviado2;
	private JTextField plomoEnLixiviado2;
	private JTextField materiaOrganica2;
	private JTextField hidrocarburosTotales2;
	private JTextField conductividad2;
	private JTextField relacionCN2;
	private JTextField lugarExtraccion3;
	private JTextField otros12;
	private JTextField extraidoPor3;
	private JTextField fechaExtraccion3;
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
	private JTextField fechaExtraccion4;
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
	Color colorPorDefecto = new Color (238, 238, 238);
	private JLabel lblOtros2;
	private JTextField otros21;
	private JTextField otros22;
	private JTextField otros23;
	private JTextField otros24;
	private JLabel lblOtros3;
	private JLabel lblOtros4;
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
		
		JLabel lblExtraidoPor = new JLabel("Extraído por");
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
		
		JLabel lblSolidosTotales = new JLabel("Sólidos totales");
		lblSolidosTotales.setBounds(37, 342, 150, 16);
		frame.getContentPane().add(lblSolidosTotales);
		
		JLabel lblHumedad = new JLabel("Humedad");
		lblHumedad.setBounds(37, 370, 150, 16);
		frame.getContentPane().add(lblHumedad);
		
		JLabel lblSolidosTotalesVolatiles = new JLabel("Sólidos totales volátiles");
		lblSolidosTotalesVolatiles.setBounds(37, 400, 150, 16);
		frame.getContentPane().add(lblSolidosTotalesVolatiles);
		
		JLabel lblLiquidosLibres = new JLabel("Líquidos libres");
		lblLiquidosLibres.setBounds(37, 430, 150, 16);
		frame.getContentPane().add(lblLiquidosLibres);
		
		JLabel lblSulfuro = new JLabel("Sulfuro");
		lblSulfuro.setBounds(37, 460, 150, 16);
		frame.getContentPane().add(lblSulfuro);
		
		JLabel lblCromoEnLixiviado = new JLabel("Cromo en lixiviado");
		lblCromoEnLixiviado.setBounds(37, 490, 150, 16);
		frame.getContentPane().add(lblCromoEnLixiviado);
		
		JLabel lblPlomoEnLixiviado = new JLabel("Plomo en lixiviado");
		lblPlomoEnLixiviado.setBounds(37, 520, 150, 16);
		frame.getContentPane().add(lblPlomoEnLixiviado);
		
		JLabel lblMateriaOrganica = new JLabel("Materia orgánica");
		lblMateriaOrganica.setBounds(37, 550, 150, 16);
		frame.getContentPane().add(lblMateriaOrganica);
		
		JLabel lblHidrocarburosTotales = new JLabel("Hidrocarburos totales");
		lblHidrocarburosTotales.setBounds(37, 580, 150, 16);
		frame.getContentPane().add(lblHidrocarburosTotales);
		
		JLabel lblConductividad = new JLabel("Conductividad");
		lblConductividad.setBounds(37, 610, 150, 16);
		frame.getContentPane().add(lblConductividad);
		
		JLabel lblRelacionCN = new JLabel("Relación C/N");
		lblRelacionCN.setBounds(37, 640, 150, 16);
		frame.getContentPane().add(lblRelacionCN);
		
		JLabel lblOtros = new JLabel("Otros 1");
		lblOtros.setBounds(37, 670, 150, 16);
		frame.getContentPane().add(lblOtros);
		
		nroAnalisis1 = new JComboBox();
		nroAnalisis1.setBounds(190, 125, 130, 26);
		frame.getContentPane().add(nroAnalisis1);
		AutoCompletion.enable(nroAnalisis1);
		nroAnalisis2 = new JComboBox();
		nroAnalisis2.setBounds(370, 126, 130, 26);
		frame.getContentPane().add(nroAnalisis2);
		AutoCompletion.enable(nroAnalisis2);
		nroAnalisis3 = new JComboBox();
		nroAnalisis3.setBounds(550, 126, 130, 26);
		frame.getContentPane().add(nroAnalisis3);
		AutoCompletion.enable(nroAnalisis3);
		nroAnalisis4 = new JComboBox();
		nroAnalisis4.setBounds(730, 126, 130, 26);
		frame.getContentPane().add(nroAnalisis4);
		AutoCompletion.enable(nroAnalisis4);
		for (AnalisisBarro analisisBarro : datosDAO.obtenerTodosLosAnalisisBarros()){
			if(analisisBarro.getNroAnalisis().equals("-- Sin especificar --") || (analisisBarro.getpH() != null && analisisBarro.getpH() != "")) {
				nroAnalisis1.addItem(analisisBarro.getNroAnalisis());
				nroAnalisis2.addItem(analisisBarro.getNroAnalisis());
				nroAnalisis3.addItem(analisisBarro.getNroAnalisis());
				nroAnalisis4.addItem(analisisBarro.getNroAnalisis());
			}
		}
		nroAnalisis1.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent arg0){
				AnalisisBarro analisisBarroSeleccionado = datosDAO.obtenerAnalisisBarroPorNumero(String.valueOf(nroAnalisis1.getSelectedItem()));
				industria.setText(analisisBarroSeleccionado.getIndustria());
				departamento.setText(analisisBarroSeleccionado.getDepartamento());
				localidad.setText(analisisBarroSeleccionado.getLocalidad());
				descargaEn.setText(analisisBarroSeleccionado.getDescargaEn());
				lugarExtraccion1.setText(analisisBarroSeleccionado.getLugarExtraccion());
				if (lugarExtraccion1.getText().equals("*")) {
					lugarExtraccion1.setBackground(Color.YELLOW);
				}  else {
					lugarExtraccion1.setBackground(colorPorDefecto);
				}
				extraidoPor1.setText(analisisBarroSeleccionado.getExtraidoPor());
				if (extraidoPor1.getText().equals("*")) {
					extraidoPor1.setBackground(Color.YELLOW);
				}  else {
					extraidoPor1.setBackground(colorPorDefecto);
				}
				if(analisisBarroSeleccionado.getFechaExtraccion() == null) {
					fechaExtraccion1.setText("");
				} else {
					DateFormat df = new SimpleDateFormat("dd/MM/YYYY");
				    fechaExtraccion1.setText(df.format(analisisBarroSeleccionado.getFechaExtraccion()));
				}
				horaExtraccion1.setText(analisisBarroSeleccionado.getHoraExtraccion());
				if (horaExtraccion1.getText().equals("*")) {
					horaExtraccion1.setBackground(Color.YELLOW);
				}  else {
					horaExtraccion1.setBackground(colorPorDefecto);
				}
				aspecto1.setText(analisisBarroSeleccionado.getAspecto());
				if (aspecto1.getText().equals("*")) {
					aspecto1.setBackground(Color.YELLOW);
				}  else {
					aspecto1.setBackground(colorPorDefecto);
				}
				pH1.setText(analisisBarroSeleccionado.getpH());
				if (pH1.getText().equals("*")) {
					pH1.setBackground(Color.YELLOW);
				}  else {
					pH1.setBackground(colorPorDefecto);
				}

				
				solidosTotales1.setText(analisisBarroSeleccionado.getSolidosTotales());
				if (solidosTotales1.getText().equals("*")) {
					solidosTotales1.setBackground(Color.YELLOW);
				}  else {
					solidosTotales1.setBackground(colorPorDefecto);
				}
				humedad1.setText(analisisBarroSeleccionado.getHumedad());
				if (humedad1.getText().equals("*")) {
					humedad1.setBackground(Color.YELLOW);
				}  else {
					humedad1.setBackground(colorPorDefecto);
				}
				solidosTotalesVolatiles1.setText(analisisBarroSeleccionado.getSolidosTotalesVolatiles());
				if (solidosTotalesVolatiles1.getText().equals("*")) {
					solidosTotalesVolatiles1.setBackground(Color.YELLOW);
				}  else {
					solidosTotalesVolatiles1.setBackground(colorPorDefecto);
				}
				liquidosLibres1.setText(analisisBarroSeleccionado.getLiquidosLibres());
				if (liquidosLibres1.getText().equals("*")) {
					liquidosLibres1.setBackground(Color.YELLOW);
				}  else {
					liquidosLibres1.setBackground(colorPorDefecto);
				}
				sulfuro1.setText(analisisBarroSeleccionado.getSulfuro());
				if (sulfuro1.getText().equals("*")) {
					sulfuro1.setBackground(Color.YELLOW);
				}  else {
					sulfuro1.setBackground(colorPorDefecto);
				}
				cromoEnLixiviado1.setText(analisisBarroSeleccionado.getCromoEnLixiviado());
				if (cromoEnLixiviado1.getText().equals("*")) {
					cromoEnLixiviado1.setBackground(Color.YELLOW);
				}  else {
					cromoEnLixiviado1.setBackground(colorPorDefecto);
				}
				plomoEnLixiviado1.setText(analisisBarroSeleccionado.getPlomoEnLixiviado());
				if (plomoEnLixiviado1.getText().equals("*")) {
					plomoEnLixiviado1.setBackground(Color.YELLOW);
				}  else {
					plomoEnLixiviado1.setBackground(colorPorDefecto);
				}
				materiaOrganica1.setText(analisisBarroSeleccionado.getMateriaOrganica());
				if (materiaOrganica1.getText().equals("*")) {
					materiaOrganica1.setBackground(Color.YELLOW);
				}  else {
					materiaOrganica1.setBackground(colorPorDefecto);
				}
				hidrocarburosTotales1.setText(analisisBarroSeleccionado.getHidrocarburosTotales());
				if (hidrocarburosTotales1.getText().equals("*")) {
					hidrocarburosTotales1.setBackground(Color.YELLOW);
				}  else {
					hidrocarburosTotales1.setBackground(colorPorDefecto);
				}
				conductividad1.setText(analisisBarroSeleccionado.getConductividad());
				if (conductividad1.getText().equals("*")) {
					conductividad1.setBackground(Color.YELLOW);
				}  else {
					conductividad1.setBackground(colorPorDefecto);
				}
				relacionCN1.setText(analisisBarroSeleccionado.getRelacionCN());
				if (relacionCN1.getText().equals("*")) {
					relacionCN1.setBackground(Color.YELLOW);
				}  else {
					relacionCN1.setBackground(colorPorDefecto);
				}
				otros11.setText(analisisBarroSeleccionado.getOtros1());
				if (otros11.getText().equals("*")) {
					otros11.setBackground(Color.YELLOW);
				}  else {
					otros11.setBackground(colorPorDefecto);
				}
				otros21.setText(analisisBarroSeleccionado.getOtros2());
				if (otros21.getText().equals("*")) {
					otros21.setBackground(Color.YELLOW);
				}  else {
					otros21.setBackground(colorPorDefecto);
				}
				otros31.setText(analisisBarroSeleccionado.getOtros3());
				if (otros31.getText().equals("*")) {
					otros31.setBackground(Color.YELLOW);
				}  else {
					otros31.setBackground(colorPorDefecto);
				}
				otros41.setText(analisisBarroSeleccionado.getOtros4());
				if (otros41.getText().equals("*")) {
					otros41.setBackground(Color.YELLOW);
				}  else {
					otros41.setBackground(colorPorDefecto);
				}
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
		
		solidosTotales1 = new JTextField();
		solidosTotales1.setBounds(190, 335, 130, 26);
		frame.getContentPane().add(solidosTotales1);
		solidosTotales1.setColumns(10);
		solidosTotales1.setHorizontalAlignment(JTextField.CENTER);
		solidosTotales1.setEditable(false);
		
		humedad1 = new JTextField();
		humedad1.setBounds(190, 365, 130, 26);
		frame.getContentPane().add(humedad1);
		humedad1.setColumns(10);
		humedad1.setHorizontalAlignment(JTextField.CENTER);
		humedad1.setEditable(false);
		
		solidosTotalesVolatiles1 = new JTextField();
		solidosTotalesVolatiles1.setBounds(190, 395, 130, 26);
		frame.getContentPane().add(solidosTotalesVolatiles1);
		solidosTotalesVolatiles1.setColumns(10);
		solidosTotalesVolatiles1.setHorizontalAlignment(JTextField.CENTER);
		solidosTotalesVolatiles1.setEditable(false);
		
		liquidosLibres1 = new JTextField();
		liquidosLibres1.setBounds(190, 425, 130, 26);
		frame.getContentPane().add(liquidosLibres1);
		liquidosLibres1.setColumns(10);
		liquidosLibres1.setHorizontalAlignment(JTextField.CENTER);
		liquidosLibres1.setEditable(false);
		
		sulfuro1 = new JTextField();
		sulfuro1.setBounds(190, 455, 130, 26);
		frame.getContentPane().add(sulfuro1);
		sulfuro1.setColumns(10);
		sulfuro1.setHorizontalAlignment(JTextField.CENTER);
		sulfuro1.setEditable(false);
		
		cromoEnLixiviado1 = new JTextField();
		cromoEnLixiviado1.setBounds(190, 485, 130, 26);
		frame.getContentPane().add(cromoEnLixiviado1);
		cromoEnLixiviado1.setColumns(10);
		cromoEnLixiviado1.setHorizontalAlignment(JTextField.CENTER);
		cromoEnLixiviado1.setEditable(false);
		
		plomoEnLixiviado1 = new JTextField();
		plomoEnLixiviado1.setBounds(190, 515, 130, 26);
		frame.getContentPane().add(plomoEnLixiviado1);
		plomoEnLixiviado1.setColumns(10);
		plomoEnLixiviado1.setHorizontalAlignment(JTextField.CENTER);
		plomoEnLixiviado1.setEditable(false);
		
		materiaOrganica1 = new JTextField();
		materiaOrganica1.setBounds(190, 545, 130, 26);
		frame.getContentPane().add(materiaOrganica1);
		materiaOrganica1.setColumns(10);
		materiaOrganica1.setHorizontalAlignment(JTextField.CENTER);
		materiaOrganica1.setEditable(false);
		
		hidrocarburosTotales1 = new JTextField();
		hidrocarburosTotales1.setBounds(190, 575, 130, 26);
		frame.getContentPane().add(hidrocarburosTotales1);
		hidrocarburosTotales1.setColumns(10);
		hidrocarburosTotales1.setHorizontalAlignment(JTextField.CENTER);
		hidrocarburosTotales1.setEditable(false);
		
		conductividad1 = new JTextField();
		conductividad1.setBounds(190, 605, 130, 26);
		frame.getContentPane().add(conductividad1);
		conductividad1.setColumns(10);
		conductividad1.setHorizontalAlignment(JTextField.CENTER);
		conductividad1.setEditable(false);
		
		relacionCN1 = new JTextField();
		relacionCN1.setBounds(190, 635, 130, 26);
		frame.getContentPane().add(relacionCN1);
		relacionCN1.setColumns(10);
		relacionCN1.setHorizontalAlignment(JTextField.CENTER);
		relacionCN1.setEditable(false);
		
		otros11 = new JTextField();
		otros11.setBounds(190, 665, 130, 26);
		frame.getContentPane().add(otros11);
		otros11.setColumns(10);
		otros11.setHorizontalAlignment(JTextField.CENTER);
		otros11.setEditable(false);
		
		
		
		
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
		
		nroAnalisis2.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent arg0){
				AnalisisBarro analisisBarroSeleccionado = datosDAO.obtenerAnalisisBarroPorNumero(String.valueOf(nroAnalisis2.getSelectedItem()));
				lugarExtraccion2.setText(analisisBarroSeleccionado.getLugarExtraccion());
				if (lugarExtraccion2.getText().equals("*")) {
					lugarExtraccion2.setBackground(Color.YELLOW);
				}  else {
					lugarExtraccion2.setBackground(colorPorDefecto);
				}
				extraidoPor2.setText(analisisBarroSeleccionado.getExtraidoPor());
				if (extraidoPor2.getText().equals("*")) {
					extraidoPor2.setBackground(Color.YELLOW);
				}  else {
					extraidoPor2.setBackground(colorPorDefecto);
				}
				if(analisisBarroSeleccionado.getFechaExtraccion() == null) {
					fechaExtraccion2.setText("");
				} else {
					DateFormat df = new SimpleDateFormat("dd/MM/YYYY");
				    fechaExtraccion2.setText(df.format(analisisBarroSeleccionado.getFechaExtraccion()));
				}
				horaExtraccion2.setText(analisisBarroSeleccionado.getHoraExtraccion());
				if (horaExtraccion2.getText().equals("*")) {
					horaExtraccion2.setBackground(Color.YELLOW);
				}  else {
					horaExtraccion2.setBackground(colorPorDefecto);
				}
				aspecto2.setText(analisisBarroSeleccionado.getAspecto());
				if (aspecto2.getText().equals("*")) {
					aspecto2.setBackground(Color.YELLOW);
				}  else {
					aspecto2.setBackground(colorPorDefecto);
				}
				pH2.setText(analisisBarroSeleccionado.getpH());
				if (pH2.getText().equals("*")) {
					pH2.setBackground(Color.YELLOW);
				}  else {
					pH2.setBackground(colorPorDefecto);
				}

				
				solidosTotales2.setText(analisisBarroSeleccionado.getSolidosTotales());
				if (solidosTotales2.getText().equals("*")) {
					solidosTotales2.setBackground(Color.YELLOW);
				}  else {
					solidosTotales2.setBackground(colorPorDefecto);
				}
				humedad2.setText(analisisBarroSeleccionado.getHumedad());
				if (humedad2.getText().equals("*")) {
					humedad2.setBackground(Color.YELLOW);
				}  else {
					humedad2.setBackground(colorPorDefecto);
				}
				solidosTotalesVolatiles2.setText(analisisBarroSeleccionado.getSolidosTotalesVolatiles());
				if (solidosTotalesVolatiles2.getText().equals("*")) {
					solidosTotalesVolatiles2.setBackground(Color.YELLOW);
				}  else {
					solidosTotalesVolatiles2.setBackground(colorPorDefecto);
				}
				liquidosLibres2.setText(analisisBarroSeleccionado.getLiquidosLibres());
				if (liquidosLibres2.getText().equals("*")) {
					liquidosLibres2.setBackground(Color.YELLOW);
				}  else {
					liquidosLibres2.setBackground(colorPorDefecto);
				}
				sulfuro2.setText(analisisBarroSeleccionado.getSulfuro());
				if (sulfuro2.getText().equals("*")) {
					sulfuro2.setBackground(Color.YELLOW);
				}  else {
					sulfuro2.setBackground(colorPorDefecto);
				}
				cromoEnLixiviado2.setText(analisisBarroSeleccionado.getCromoEnLixiviado());
				if (cromoEnLixiviado2.getText().equals("*")) {
					cromoEnLixiviado2.setBackground(Color.YELLOW);
				}  else {
					cromoEnLixiviado2.setBackground(colorPorDefecto);
				}
				plomoEnLixiviado2.setText(analisisBarroSeleccionado.getPlomoEnLixiviado());
				if (plomoEnLixiviado2.getText().equals("*")) {
					plomoEnLixiviado2.setBackground(Color.YELLOW);
				}  else {
					plomoEnLixiviado2.setBackground(colorPorDefecto);
				}
				materiaOrganica2.setText(analisisBarroSeleccionado.getMateriaOrganica());
				if (materiaOrganica2.getText().equals("*")) {
					materiaOrganica2.setBackground(Color.YELLOW);
				}  else {
					materiaOrganica2.setBackground(colorPorDefecto);
				}
				hidrocarburosTotales2.setText(analisisBarroSeleccionado.getHidrocarburosTotales());
				if (hidrocarburosTotales2.getText().equals("*")) {
					hidrocarburosTotales2.setBackground(Color.YELLOW);
				}  else {
					hidrocarburosTotales2.setBackground(colorPorDefecto);
				}
				conductividad2.setText(analisisBarroSeleccionado.getConductividad());
				if (conductividad2.getText().equals("*")) {
					conductividad2.setBackground(Color.YELLOW);
				}  else {
					conductividad2.setBackground(colorPorDefecto);
				}
				relacionCN2.setText(analisisBarroSeleccionado.getRelacionCN());
				if (relacionCN2.getText().equals("*")) {
					relacionCN2.setBackground(Color.YELLOW);
				}  else {
					relacionCN2.setBackground(colorPorDefecto);
				}
				otros12.setText(analisisBarroSeleccionado.getOtros1());
				if (otros12.getText().equals("*")) {
					otros12.setBackground(Color.YELLOW);
				}  else {
					otros12.setBackground(colorPorDefecto);
				}
				otros22.setText(analisisBarroSeleccionado.getOtros2());
				if (otros22.getText().equals("*")) {
					otros22.setBackground(Color.YELLOW);
				}  else {
					otros22.setBackground(colorPorDefecto);
				}
				otros32.setText(analisisBarroSeleccionado.getOtros3());
				if (otros32.getText().equals("*")) {
					otros32.setBackground(Color.YELLOW);
				}  else {
					otros32.setBackground(colorPorDefecto);
				}
				otros42.setText(analisisBarroSeleccionado.getOtros4());
				if (otros42.getText().equals("*")) {
					otros42.setBackground(Color.YELLOW);
				}  else {
					otros42.setBackground(colorPorDefecto);
				}
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
				if (lugarExtraccion3.getText().equals("*")) {
					lugarExtraccion3.setBackground(Color.YELLOW);
				}  else {
					lugarExtraccion3.setBackground(colorPorDefecto);
				}
				extraidoPor3.setText(analisisBarroSeleccionado.getExtraidoPor());
				if (extraidoPor3.getText().equals("*")) {
					extraidoPor3.setBackground(Color.YELLOW);
				}  else {
					extraidoPor3.setBackground(colorPorDefecto);
				}
				if(analisisBarroSeleccionado.getFechaExtraccion() == null) {
					fechaExtraccion3.setText("");
				} else {
					DateFormat df = new SimpleDateFormat("dd/MM/YYYY");
				    fechaExtraccion3.setText(df.format(analisisBarroSeleccionado.getFechaExtraccion()));
				}
				horaExtraccion3.setText(analisisBarroSeleccionado.getHoraExtraccion());
				if (horaExtraccion3.getText().equals("*")) {
					horaExtraccion3.setBackground(Color.YELLOW);
				}  else {
					horaExtraccion3.setBackground(colorPorDefecto);
				}
				aspecto3.setText(analisisBarroSeleccionado.getAspecto());
				if (aspecto3.getText().equals("*")) {
					aspecto3.setBackground(Color.YELLOW);
				}  else {
					aspecto3.setBackground(colorPorDefecto);
				}
				pH3.setText(analisisBarroSeleccionado.getpH());
				if (pH3.getText().equals("*")) {
					pH3.setBackground(Color.YELLOW);
				}  else {
					pH3.setBackground(colorPorDefecto);
				}

				solidosTotales3.setText(analisisBarroSeleccionado.getSolidosTotales());
				if (solidosTotales3.getText().equals("*")) {
					solidosTotales3.setBackground(Color.YELLOW);
				}  else {
					solidosTotales3.setBackground(colorPorDefecto);
				}
				humedad3.setText(analisisBarroSeleccionado.getHumedad());
				if (humedad3.getText().equals("*")) {
					humedad3.setBackground(Color.YELLOW);
				}  else {
					humedad3.setBackground(colorPorDefecto);
				}
				solidosTotalesVolatiles3.setText(analisisBarroSeleccionado.getSolidosTotalesVolatiles());
				if (solidosTotalesVolatiles3.getText().equals("*")) {
					solidosTotalesVolatiles3.setBackground(Color.YELLOW);
				}  else {
					solidosTotalesVolatiles3.setBackground(colorPorDefecto);
				}
				liquidosLibres3.setText(analisisBarroSeleccionado.getLiquidosLibres());
				if (liquidosLibres3.getText().equals("*")) {
					liquidosLibres3.setBackground(Color.YELLOW);
				}  else {
					liquidosLibres3.setBackground(colorPorDefecto);
				}
				sulfuro3.setText(analisisBarroSeleccionado.getSulfuro());
				if (sulfuro3.getText().equals("*")) {
					sulfuro3.setBackground(Color.YELLOW);
				}  else {
					sulfuro3.setBackground(colorPorDefecto);
				}
				cromoEnLixiviado3.setText(analisisBarroSeleccionado.getCromoEnLixiviado());
				if (cromoEnLixiviado3.getText().equals("*")) {
					cromoEnLixiviado3.setBackground(Color.YELLOW);
				}  else {
					cromoEnLixiviado3.setBackground(colorPorDefecto);
				}
				plomoEnLixiviado3.setText(analisisBarroSeleccionado.getPlomoEnLixiviado());
				if (plomoEnLixiviado3.getText().equals("*")) {
					plomoEnLixiviado3.setBackground(Color.YELLOW);
				}  else {
					plomoEnLixiviado3.setBackground(colorPorDefecto);
				}
				materiaOrganica3.setText(analisisBarroSeleccionado.getMateriaOrganica());
				if (materiaOrganica3.getText().equals("*")) {
					materiaOrganica3.setBackground(Color.YELLOW);
				}  else {
					materiaOrganica3.setBackground(colorPorDefecto);
				}
				hidrocarburosTotales3.setText(analisisBarroSeleccionado.getHidrocarburosTotales());
				if (hidrocarburosTotales3.getText().equals("*")) {
					hidrocarburosTotales3.setBackground(Color.YELLOW);
				}  else {
					hidrocarburosTotales3.setBackground(colorPorDefecto);
				}
				conductividad3.setText(analisisBarroSeleccionado.getConductividad());
				if (conductividad3.getText().equals("*")) {
					conductividad3.setBackground(Color.YELLOW);
				}  else {
					conductividad3.setBackground(colorPorDefecto);
				}
				relacionCN3.setText(analisisBarroSeleccionado.getRelacionCN());
				if (relacionCN3.getText().equals("*")) {
					relacionCN3.setBackground(Color.YELLOW);
				}  else {
					relacionCN3.setBackground(colorPorDefecto);
				}
				otros13.setText(analisisBarroSeleccionado.getOtros1());
				if (otros13.getText().equals("*")) {
					otros13.setBackground(Color.YELLOW);
				}  else {
					otros13.setBackground(colorPorDefecto);
				}
				otros23.setText(analisisBarroSeleccionado.getOtros2());
				if (otros23.getText().equals("*")) {
					otros23.setBackground(Color.YELLOW);
				}  else {
					otros23.setBackground(colorPorDefecto);
				}
				otros33.setText(analisisBarroSeleccionado.getOtros3());
				if (otros33.getText().equals("*")) {
					otros33.setBackground(Color.YELLOW);
				}  else {
					otros33.setBackground(colorPorDefecto);
				}
				otros43.setText(analisisBarroSeleccionado.getOtros4());
				if (otros43.getText().equals("*")) {
					otros43.setBackground(Color.YELLOW);
				}  else {
					otros43.setBackground(colorPorDefecto);
				}
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
				if (lugarExtraccion4.getText().equals("*")) {
					lugarExtraccion4.setBackground(Color.YELLOW);
				}  else {
					lugarExtraccion4.setBackground(colorPorDefecto);
				}
				extraidoPor4.setText(analisisBarroSeleccionado.getExtraidoPor());
				if (extraidoPor4.getText().equals("*")) {
					extraidoPor4.setBackground(Color.YELLOW);
				}  else {
					extraidoPor4.setBackground(colorPorDefecto);
				}
				if(analisisBarroSeleccionado.getFechaExtraccion() == null) {
					fechaExtraccion4.setText("");
				} else {
					DateFormat df = new SimpleDateFormat("dd/MM/YYYY");
				    fechaExtraccion4.setText(df.format(analisisBarroSeleccionado.getFechaExtraccion()));
				}
				horaExtraccion4.setText(analisisBarroSeleccionado.getHoraExtraccion());
				if (horaExtraccion4.getText().equals("*")) {
					horaExtraccion4.setBackground(Color.YELLOW);
				}  else {
					horaExtraccion4.setBackground(colorPorDefecto);
				}
				aspecto4.setText(analisisBarroSeleccionado.getAspecto());
				if (aspecto4.getText().equals("*")) {
					aspecto4.setBackground(Color.YELLOW);
				}  else {
					aspecto4.setBackground(colorPorDefecto);
				}
				pH4.setText(analisisBarroSeleccionado.getpH());
				if (pH4.getText().equals("*")) {
					pH4.setBackground(Color.YELLOW);
				}  else {
					pH4.setBackground(colorPorDefecto);
				}

				solidosTotales4.setText(analisisBarroSeleccionado.getSolidosTotales());
				if (solidosTotales4.getText().equals("*")) {
					solidosTotales4.setBackground(Color.YELLOW);
				}  else {
					solidosTotales4.setBackground(colorPorDefecto);
				}
				humedad4.setText(analisisBarroSeleccionado.getHumedad());
				if (humedad4.getText().equals("*")) {
					humedad4.setBackground(Color.YELLOW);
				}  else {
					humedad4.setBackground(colorPorDefecto);
				}
				solidosTotalesVolatiles4.setText(analisisBarroSeleccionado.getSolidosTotalesVolatiles());
				if (solidosTotalesVolatiles4.getText().equals("*")) {
					solidosTotalesVolatiles4.setBackground(Color.YELLOW);
				}  else {
					solidosTotalesVolatiles4.setBackground(colorPorDefecto);
				}
				liquidosLibres4.setText(analisisBarroSeleccionado.getLiquidosLibres());
				if (liquidosLibres4.getText().equals("*")) {
					liquidosLibres4.setBackground(Color.YELLOW);
				}  else {
					liquidosLibres4.setBackground(colorPorDefecto);
				}
				sulfuro4.setText(analisisBarroSeleccionado.getSulfuro());
				if (sulfuro4.getText().equals("*")) {
					sulfuro4.setBackground(Color.YELLOW);
				}  else {
					sulfuro4.setBackground(colorPorDefecto);
				}
				cromoEnLixiviado4.setText(analisisBarroSeleccionado.getCromoEnLixiviado());
				if (cromoEnLixiviado4.getText().equals("*")) {
					cromoEnLixiviado4.setBackground(Color.YELLOW);
				}  else {
					cromoEnLixiviado4.setBackground(colorPorDefecto);
				}
				plomoEnLixiviado4.setText(analisisBarroSeleccionado.getPlomoEnLixiviado());
				if (plomoEnLixiviado4.getText().equals("*")) {
					plomoEnLixiviado4.setBackground(Color.YELLOW);
				}  else {
					plomoEnLixiviado4.setBackground(colorPorDefecto);
				}
				materiaOrganica4.setText(analisisBarroSeleccionado.getMateriaOrganica());
				if (materiaOrganica4.getText().equals("*")) {
					materiaOrganica4.setBackground(Color.YELLOW);
				}  else {
					materiaOrganica4.setBackground(colorPorDefecto);
				}
				hidrocarburosTotales4.setText(analisisBarroSeleccionado.getHidrocarburosTotales());
				if (hidrocarburosTotales4.getText().equals("*")) {
					hidrocarburosTotales4.setBackground(Color.YELLOW);
				}  else {
					hidrocarburosTotales4.setBackground(colorPorDefecto);
				}
				conductividad4.setText(analisisBarroSeleccionado.getConductividad());
				if (conductividad4.getText().equals("*")) {
					conductividad4.setBackground(Color.YELLOW);
				}  else {
					conductividad4.setBackground(colorPorDefecto);
				}
				relacionCN4.setText(analisisBarroSeleccionado.getRelacionCN());
				if (relacionCN4.getText().equals("*")) {
					relacionCN4.setBackground(Color.YELLOW);
				}  else {
					relacionCN4.setBackground(colorPorDefecto);
				}
				otros14.setText(analisisBarroSeleccionado.getOtros1());
				if (otros14.getText().equals("*")) {
					otros14.setBackground(Color.YELLOW);
				}  else {
					otros14.setBackground(colorPorDefecto);
				}
				otros24.setText(analisisBarroSeleccionado.getOtros2());
				if (otros24.getText().equals("*")) {
					otros24.setBackground(Color.YELLOW);
				}  else {
					otros24.setBackground(colorPorDefecto);
				}
				otros34.setText(analisisBarroSeleccionado.getOtros3());
				if (otros34.getText().equals("*")) {
					otros34.setBackground(Color.YELLOW);
				}  else {
					otros34.setBackground(colorPorDefecto);
				}
				otros44.setText(analisisBarroSeleccionado.getOtros4());
				if (otros44.getText().equals("*")) {
					otros44.setBackground(Color.YELLOW);
				}  else {
					otros44.setBackground(colorPorDefecto);
				}
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
		
		solidosTotales2 = new JTextField();
		solidosTotales2.setHorizontalAlignment(SwingConstants.CENTER);
		solidosTotales2.setEditable(false);
		solidosTotales2.setColumns(10);
		solidosTotales2.setBounds(370, 335, 130, 26);
		frame.getContentPane().add(solidosTotales2);
		
		humedad2 = new JTextField();
		humedad2.setHorizontalAlignment(SwingConstants.CENTER);
		humedad2.setEditable(false);
		humedad2.setColumns(10);
		humedad2.setBounds(370, 365, 130, 26);
		frame.getContentPane().add(humedad2);
		
		solidosTotalesVolatiles2 = new JTextField();
		solidosTotalesVolatiles2.setHorizontalAlignment(SwingConstants.CENTER);
		solidosTotalesVolatiles2.setEditable(false);
		solidosTotalesVolatiles2.setColumns(10);
		solidosTotalesVolatiles2.setBounds(370, 395, 130, 26);
		frame.getContentPane().add(solidosTotalesVolatiles2);
		
		liquidosLibres2 = new JTextField();
		liquidosLibres2.setHorizontalAlignment(SwingConstants.CENTER);
		liquidosLibres2.setEditable(false);
		liquidosLibres2.setColumns(10);
		liquidosLibres2.setBounds(370, 425, 130, 26);
		frame.getContentPane().add(liquidosLibres2);
		
		sulfuro2 = new JTextField();
		sulfuro2.setHorizontalAlignment(SwingConstants.CENTER);
		sulfuro2.setEditable(false);
		sulfuro2.setColumns(10);
		sulfuro2.setBounds(370, 455, 130, 26);
		frame.getContentPane().add(sulfuro2);
		
		cromoEnLixiviado2 = new JTextField();
		cromoEnLixiviado2.setHorizontalAlignment(SwingConstants.CENTER);
		cromoEnLixiviado2.setEditable(false);
		cromoEnLixiviado2.setColumns(10);
		cromoEnLixiviado2.setBounds(370, 485, 130, 26);
		frame.getContentPane().add(cromoEnLixiviado2);
		
		plomoEnLixiviado2 = new JTextField();
		plomoEnLixiviado2.setHorizontalAlignment(SwingConstants.CENTER);
		plomoEnLixiviado2.setEditable(false);
		plomoEnLixiviado2.setColumns(10);
		plomoEnLixiviado2.setBounds(370, 515, 130, 26);
		frame.getContentPane().add(plomoEnLixiviado2);
		
		materiaOrganica2 = new JTextField();
		materiaOrganica2.setHorizontalAlignment(SwingConstants.CENTER);
		materiaOrganica2.setEditable(false);
		materiaOrganica2.setColumns(10);
		materiaOrganica2.setBounds(370, 545, 130, 26);
		frame.getContentPane().add(materiaOrganica2);
		
		hidrocarburosTotales2 = new JTextField();
		hidrocarburosTotales2.setHorizontalAlignment(SwingConstants.CENTER);
		hidrocarburosTotales2.setEditable(false);
		hidrocarburosTotales2.setColumns(10);
		hidrocarburosTotales2.setBounds(370, 575, 130, 26);
		frame.getContentPane().add(hidrocarburosTotales2);
		
		conductividad2 = new JTextField();
		conductividad2.setHorizontalAlignment(SwingConstants.CENTER);
		conductividad2.setEditable(false);
		conductividad2.setColumns(10);
		conductividad2.setBounds(370, 605, 130, 26);
		frame.getContentPane().add(conductividad2);
		
		relacionCN2 = new JTextField();
		relacionCN2.setHorizontalAlignment(SwingConstants.CENTER);
		relacionCN2.setEditable(false);
		relacionCN2.setColumns(10);
		relacionCN2.setBounds(370, 635, 130, 26);
		frame.getContentPane().add(relacionCN2);
		
		otros12 = new JTextField();
		otros12.setHorizontalAlignment(SwingConstants.CENTER);
		otros12.setEditable(false);
		otros12.setColumns(10);
		otros12.setBounds(370, 665, 130, 26);
		frame.getContentPane().add(otros12);
		
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
		
		solidosTotales3 = new JTextField();
		solidosTotales3.setHorizontalAlignment(SwingConstants.CENTER);
		solidosTotales3.setEditable(false);
		solidosTotales3.setColumns(10);
		solidosTotales3.setBounds(550, 335, 130, 26);
		frame.getContentPane().add(solidosTotales3);
		
		humedad3 = new JTextField();
		humedad3.setHorizontalAlignment(SwingConstants.CENTER);
		humedad3.setEditable(false);
		humedad3.setColumns(10);
		humedad3.setBounds(550, 365, 130, 26);
		frame.getContentPane().add(humedad3);
		
		solidosTotalesVolatiles3 = new JTextField();
		solidosTotalesVolatiles3.setHorizontalAlignment(SwingConstants.CENTER);
		solidosTotalesVolatiles3.setEditable(false);
		solidosTotalesVolatiles3.setColumns(10);
		solidosTotalesVolatiles3.setBounds(550, 395, 130, 26);
		frame.getContentPane().add(solidosTotalesVolatiles3);
		
		liquidosLibres3 = new JTextField();
		liquidosLibres3.setHorizontalAlignment(SwingConstants.CENTER);
		liquidosLibres3.setEditable(false);
		liquidosLibres3.setColumns(10);
		liquidosLibres3.setBounds(550, 425, 130, 26);
		frame.getContentPane().add(liquidosLibres3);
		
		sulfuro3 = new JTextField();
		sulfuro3.setHorizontalAlignment(SwingConstants.CENTER);
		sulfuro3.setEditable(false);
		sulfuro3.setColumns(10);
		sulfuro3.setBounds(550, 455, 130, 26);
		frame.getContentPane().add(sulfuro3);
		
		cromoEnLixiviado3 = new JTextField();
		cromoEnLixiviado3.setHorizontalAlignment(SwingConstants.CENTER);
		cromoEnLixiviado3.setEditable(false);
		cromoEnLixiviado3.setColumns(10);
		cromoEnLixiviado3.setBounds(550, 485, 130, 26);
		frame.getContentPane().add(cromoEnLixiviado3);
		
		plomoEnLixiviado3 = new JTextField();
		plomoEnLixiviado3.setHorizontalAlignment(SwingConstants.CENTER);
		plomoEnLixiviado3.setEditable(false);
		plomoEnLixiviado3.setColumns(10);
		plomoEnLixiviado3.setBounds(550, 515, 130, 26);
		frame.getContentPane().add(plomoEnLixiviado3);
		
		materiaOrganica3 = new JTextField();
		materiaOrganica3.setHorizontalAlignment(SwingConstants.CENTER);
		materiaOrganica3.setEditable(false);
		materiaOrganica3.setColumns(10);
		materiaOrganica3.setBounds(550, 545, 130, 26);
		frame.getContentPane().add(materiaOrganica3);
		
		hidrocarburosTotales3 = new JTextField();
		hidrocarburosTotales3.setHorizontalAlignment(SwingConstants.CENTER);
		hidrocarburosTotales3.setEditable(false);
		hidrocarburosTotales3.setColumns(10);
		hidrocarburosTotales3.setBounds(550, 575, 130, 26);
		frame.getContentPane().add(hidrocarburosTotales3);
		
		conductividad3 = new JTextField();
		conductividad3.setHorizontalAlignment(SwingConstants.CENTER);
		conductividad3.setEditable(false);
		conductividad3.setColumns(10);
		conductividad3.setBounds(550, 605, 130, 26);
		frame.getContentPane().add(conductividad3);
		
		relacionCN3 = new JTextField();
		relacionCN3.setHorizontalAlignment(SwingConstants.CENTER);
		relacionCN3.setEditable(false);
		relacionCN3.setColumns(10);
		relacionCN3.setBounds(550, 635, 130, 26);
		frame.getContentPane().add(relacionCN3);
		
		otros13 = new JTextField();
		otros13.setHorizontalAlignment(SwingConstants.CENTER);
		otros13.setEditable(false);
		otros13.setColumns(10);
		otros13.setBounds(550, 665, 130, 26);
		frame.getContentPane().add(otros13);
		
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
		
		solidosTotales4 = new JTextField();
		solidosTotales4.setHorizontalAlignment(SwingConstants.CENTER);
		solidosTotales4.setEditable(false);
		solidosTotales4.setColumns(10);
		solidosTotales4.setBounds(730, 337, 130, 26);
		frame.getContentPane().add(solidosTotales4);
		
		humedad4 = new JTextField();
		humedad4.setHorizontalAlignment(SwingConstants.CENTER);
		humedad4.setEditable(false);
		humedad4.setColumns(10);
		humedad4.setBounds(730, 365, 130, 26);
		frame.getContentPane().add(humedad4);
		
		solidosTotalesVolatiles4 = new JTextField();
		solidosTotalesVolatiles4.setHorizontalAlignment(SwingConstants.CENTER);
		solidosTotalesVolatiles4.setEditable(false);
		solidosTotalesVolatiles4.setColumns(10);
		solidosTotalesVolatiles4.setBounds(730, 395, 130, 26);
		frame.getContentPane().add(solidosTotalesVolatiles4);
		
		liquidosLibres4 = new JTextField();
		liquidosLibres4.setHorizontalAlignment(SwingConstants.CENTER);
		liquidosLibres4.setEditable(false);
		liquidosLibres4.setColumns(10);
		liquidosLibres4.setBounds(730, 425, 130, 26);
		frame.getContentPane().add(liquidosLibres4);
		
		sulfuro4 = new JTextField();
		sulfuro4.setHorizontalAlignment(SwingConstants.CENTER);
		sulfuro4.setEditable(false);
		sulfuro4.setColumns(10);
		sulfuro4.setBounds(730, 455, 130, 26);
		frame.getContentPane().add(sulfuro4);
		
		cromoEnLixiviado4 = new JTextField();
		cromoEnLixiviado4.setHorizontalAlignment(SwingConstants.CENTER);
		cromoEnLixiviado4.setEditable(false);
		cromoEnLixiviado4.setColumns(10);
		cromoEnLixiviado4.setBounds(730, 485, 130, 26);
		frame.getContentPane().add(cromoEnLixiviado4);
		
		plomoEnLixiviado4 = new JTextField();
		plomoEnLixiviado4.setHorizontalAlignment(SwingConstants.CENTER);
		plomoEnLixiviado4.setEditable(false);
		plomoEnLixiviado4.setColumns(10);
		plomoEnLixiviado4.setBounds(730, 515, 130, 26);
		frame.getContentPane().add(plomoEnLixiviado4);
		
		materiaOrganica4 = new JTextField();
		materiaOrganica4.setHorizontalAlignment(SwingConstants.CENTER);
		materiaOrganica4.setEditable(false);
		materiaOrganica4.setColumns(10);
		materiaOrganica4.setBounds(730, 545, 130, 26);
		frame.getContentPane().add(materiaOrganica4);
		
		hidrocarburosTotales4 = new JTextField();
		hidrocarburosTotales4.setHorizontalAlignment(SwingConstants.CENTER);
		hidrocarburosTotales4.setEditable(false);
		hidrocarburosTotales4.setColumns(10);
		hidrocarburosTotales4.setBounds(730, 575, 130, 26);
		frame.getContentPane().add(hidrocarburosTotales4);
		
		conductividad4 = new JTextField();
		conductividad4.setHorizontalAlignment(SwingConstants.CENTER);
		conductividad4.setEditable(false);
		conductividad4.setColumns(10);
		conductividad4.setBounds(730, 605, 130, 26);
		frame.getContentPane().add(conductividad4);
		
		relacionCN4 = new JTextField();
		relacionCN4.setHorizontalAlignment(SwingConstants.CENTER);
		relacionCN4.setEditable(false);
		relacionCN4.setColumns(10);
		relacionCN4.setBounds(730, 635, 130, 26);
		frame.getContentPane().add(relacionCN4);
		
		otros14 = new JTextField();
		otros14.setHorizontalAlignment(SwingConstants.CENTER);
		otros14.setEditable(false);
		otros14.setColumns(10);
		otros14.setBounds(730, 665, 130, 26);
		frame.getContentPane().add(otros14);
		
		JButton btnNewButton = new JButton("Crear informe");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(902, 334, 232, 82);
		frame.getContentPane().add(btnNewButton);
		
		lblOtros2 = new JLabel("Otros 2");
		lblOtros2.setBounds(37, 702, 150, 16);
		frame.getContentPane().add(lblOtros2);
		
		otros21 = new JTextField();
		otros21.setHorizontalAlignment(SwingConstants.CENTER);
		otros21.setEditable(false);
		otros21.setColumns(10);
		otros21.setBounds(190, 697, 130, 26);
		frame.getContentPane().add(otros21);
		
		otros22 = new JTextField();
		otros22.setHorizontalAlignment(SwingConstants.CENTER);
		otros22.setEditable(false);
		otros22.setColumns(10);
		otros22.setBounds(370, 697, 130, 26);
		frame.getContentPane().add(otros22);
		
		otros23 = new JTextField();
		otros23.setHorizontalAlignment(SwingConstants.CENTER);
		otros23.setEditable(false);
		otros23.setColumns(10);
		otros23.setBounds(550, 697, 130, 26);
		frame.getContentPane().add(otros23);
		
		otros24 = new JTextField();
		otros24.setHorizontalAlignment(SwingConstants.CENTER);
		otros24.setEditable(false);
		otros24.setColumns(10);
		otros24.setBounds(730, 697, 130, 26);
		frame.getContentPane().add(otros24);
		
		lblOtros3 = new JLabel("Otros 3");
		lblOtros3.setBounds(37, 734, 150, 16);
		frame.getContentPane().add(lblOtros3);
		
		lblOtros4 = new JLabel("Otros 4");
		lblOtros4.setBounds(37, 766, 150, 16);
		frame.getContentPane().add(lblOtros4);
		
		otros31 = new JTextField();
		otros31.setHorizontalAlignment(SwingConstants.CENTER);
		otros31.setEditable(false);
		otros31.setColumns(10);
		otros31.setBounds(190, 729, 130, 26);
		frame.getContentPane().add(otros31);
		
		otros32 = new JTextField();
		otros32.setHorizontalAlignment(SwingConstants.CENTER);
		otros32.setEditable(false);
		otros32.setColumns(10);
		otros32.setBounds(370, 729, 130, 26);
		frame.getContentPane().add(otros32);
		
		otros33 = new JTextField();
		otros33.setHorizontalAlignment(SwingConstants.CENTER);
		otros33.setEditable(false);
		otros33.setColumns(10);
		otros33.setBounds(550, 729, 130, 26);
		frame.getContentPane().add(otros33);
		
		otros34 = new JTextField();
		otros34.setHorizontalAlignment(SwingConstants.CENTER);
		otros34.setEditable(false);
		otros34.setColumns(10);
		otros34.setBounds(730, 729, 130, 26);
		frame.getContentPane().add(otros34);
		
		otros41 = new JTextField();
		otros41.setHorizontalAlignment(SwingConstants.CENTER);
		otros41.setEditable(false);
		otros41.setColumns(10);
		otros41.setBounds(190, 761, 130, 26);
		frame.getContentPane().add(otros41);
		
		otros42 = new JTextField();
		otros42.setHorizontalAlignment(SwingConstants.CENTER);
		otros42.setEditable(false);
		otros42.setColumns(10);
		otros42.setBounds(370, 761, 130, 26);
		frame.getContentPane().add(otros42);
		
		otros43 = new JTextField();
		otros43.setHorizontalAlignment(SwingConstants.CENTER);
		otros43.setEditable(false);
		otros43.setColumns(10);
		otros43.setBounds(550, 761, 130, 26);
		frame.getContentPane().add(otros43);
		
		otros44 = new JTextField();
		otros44.setHorizontalAlignment(SwingConstants.CENTER);
		otros44.setEditable(false);
		otros44.setColumns(10);
		otros44.setBounds(730, 761, 130, 26);
		frame.getContentPane().add(otros44);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				final String pattern = "dd/MM/yyyy";				
				
				ArrayList <AnalisisBarro> analisisParaInforme = new ArrayList <AnalisisBarro>();
				if (!String.valueOf(nroAnalisis1.getSelectedItem()).equals("-- Sin especificar --")){
					String dateString = fechaExtraccion1.getText();
					DateFormat df = new SimpleDateFormat(pattern);
					Date date = null;
					try {
						date = df.parse(dateString);
					} catch (ParseException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}			

					AnalisisBarro analisisBarro = null;
					analisisBarro = new AnalisisBarro (industria.getText(), departamento.getText(), localidad.getText(), descargaEn.getText(), String.valueOf(nroAnalisis1.getSelectedItem()),
							lugarExtraccion1.getText(), extraidoPor1.getText(), date, horaExtraccion1.getText(), aspecto1.getText(), pH1.getText(),
							solidosTotales1.getText(), humedad1.getText(), solidosTotalesVolatiles1.getText(), liquidosLibres1.getText(), sulfuro1.getText(),
							cromoEnLixiviado1.getText(), plomoEnLixiviado1.getText(), materiaOrganica1.getText(), hidrocarburosTotales1.getText(), conductividad1.getText(),
							relacionCN1.getText(), otros11.getText(), otros21.getText(), otros31.getText(), otros41.getText(), null);
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
							solidosTotales2.getText(), humedad2.getText(), solidosTotalesVolatiles2.getText(), liquidosLibres2.getText(), sulfuro2.getText(),
							cromoEnLixiviado2.getText(), plomoEnLixiviado2.getText(), materiaOrganica2.getText(), hidrocarburosTotales2.getText(), conductividad2.getText(),
							relacionCN2.getText(), otros12.getText(), otros22.getText(), otros32.getText(), otros43.getText(),null);
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
							solidosTotales3.getText(), humedad3.getText(), solidosTotalesVolatiles3.getText(), liquidosLibres3.getText(), sulfuro3.getText(),
							cromoEnLixiviado3.getText(), plomoEnLixiviado3.getText(), materiaOrganica3.getText(), hidrocarburosTotales3.getText(), conductividad3.getText(),
							relacionCN3.getText(), otros13.getText(), otros23.getText(), otros33.getText(), otros43.getText(), null);
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
							solidosTotales4.getText(), humedad4.getText(), solidosTotalesVolatiles4.getText(), liquidosLibres4.getText(), sulfuro4.getText(),
							cromoEnLixiviado4.getText(), plomoEnLixiviado4.getText(), materiaOrganica4.getText(), hidrocarburosTotales4.getText(), conductividad4.getText(),
							relacionCN4.getText(), otros14.getText(), otros24.getText(), otros34.getText(), otros44.getText(), null);
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
				try {
					ExcelBarros.realizarInforme();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		

	}
	

}
