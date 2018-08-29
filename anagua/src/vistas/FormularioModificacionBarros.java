package vistas;

import java.awt.EventQueue;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

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
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import com.toedter.calendar.JDateChooser;

public class FormularioModificacionBarros {

	private JFrame frame;
	private JComboBox nroAnalisis;
	private JTextField estado1;
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
	private JTextField departamento1;
	private JTextField localidad1;
	private JTextField descargaEn1;
	private JComboBox industria;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioModificacionBarros window = new FormularioModificacionBarros();
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
	public FormularioModificacionBarros() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		DatosDAO datosDAO = new DatosDAO();
		IndustriasDAO industriasDAO = new IndustriasDAO();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Formulario de modificación de análisis de barros - ANAGUA");
		frame.setVisible(true);
		
		JLabel lblIndustria = new JLabel("INDUSTRIA");
		lblIndustria.setBounds(37, 20, 75, 16);
		frame.getContentPane().add(lblIndustria);
		
		JLabel lblDepartamento = new JLabel("DEPARTAMENTO");
		lblDepartamento.setBounds(37, 50, 109, 16);
		frame.getContentPane().add(lblDepartamento);
		
		JLabel lblLocalidad = new JLabel("LOCALIDAD");
		lblLocalidad.setBounds(37, 80, 109, 16);
		frame.getContentPane().add(lblLocalidad);
		
		JLabel lblDescargaEn = new JLabel("DESCARGA EN");
		lblDescargaEn.setBounds(325, 50, 109, 16);
		frame.getContentPane().add(lblDescargaEn);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(6, 108, 588, 24);
		frame.getContentPane().add(separator);
		
		JLabel lblNroAnalisis = new JLabel("Número de análisis");
		lblNroAnalisis.setBounds(37, 130, 150, 16);
		frame.getContentPane().add(lblNroAnalisis);
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setBounds(37, 160, 150, 16);
		frame.getContentPane().add(lblEstado);
		
		JLabel lblLugarExtraccion = new JLabel("Lugar de extracción");
		lblLugarExtraccion.setBounds(37, 190, 150, 16);
		frame.getContentPane().add(lblLugarExtraccion);
		
		JLabel lblExtraidoPor = new JLabel("Extraído por");
		lblExtraidoPor.setBounds(37, 220, 150, 16);
		frame.getContentPane().add(lblExtraidoPor);
		
		JLabel lblFechaExtraccion = new JLabel("Fecha de extracción");
		lblFechaExtraccion.setBounds(37, 250, 150, 16);
		frame.getContentPane().add(lblFechaExtraccion);
		
		JLabel lblHoraExtraccion = new JLabel("Hora de extracción");
		lblHoraExtraccion.setBounds(37, 280, 150, 16);
		frame.getContentPane().add(lblHoraExtraccion);
		
		JLabel lblAspecto = new JLabel("Aspecto");
		lblAspecto.setBounds(37, 310, 150, 16);
		frame.getContentPane().add(lblAspecto);
		
		JLabel lblpH = new JLabel("pH");
		lblpH.setBounds(37, 340, 150, 16);
		frame.getContentPane().add(lblpH);
		
		JLabel lblTemperatura = new JLabel("Temperatura");
		lblTemperatura.setBounds(37, 370, 150, 16);
		frame.getContentPane().add(lblTemperatura);
		
		JLabel lblSolidosTotales = new JLabel("Sólidos totales");
		lblSolidosTotales.setBounds(37, 400, 150, 16);
		frame.getContentPane().add(lblSolidosTotales);
		
		JLabel lblHumedad = new JLabel("Humedad");
		lblHumedad.setBounds(37, 430, 150, 16);
		frame.getContentPane().add(lblHumedad);
		
		JLabel lblSolidosTotalesVolatiles = new JLabel("Sólidos totales volátiles");
		lblSolidosTotalesVolatiles.setBounds(37, 460, 150, 16);
		frame.getContentPane().add(lblSolidosTotalesVolatiles);
		
		JLabel lblLiquidosLibres = new JLabel("Líquidos libres");
		lblLiquidosLibres.setBounds(37, 490, 150, 16);
		frame.getContentPane().add(lblLiquidosLibres);
		
		JLabel lblSulfuro = new JLabel("Sulfuro");
		lblSulfuro.setBounds(37, 520, 150, 16);
		frame.getContentPane().add(lblSulfuro);
		
		JLabel lblCromoEnLixiviado = new JLabel("Cromo en lixiviado");
		lblCromoEnLixiviado.setBounds(37, 550, 150, 16);
		frame.getContentPane().add(lblCromoEnLixiviado);
		
		JLabel lblPlomoEnLixiviado = new JLabel("Plomo en lixiviado");
		lblPlomoEnLixiviado.setBounds(37, 580, 150, 16);
		frame.getContentPane().add(lblPlomoEnLixiviado);
		
		JLabel lblMateriaOrganica = new JLabel("Materia orgánica");
		lblMateriaOrganica.setBounds(37, 610, 150, 16);
		frame.getContentPane().add(lblMateriaOrganica);
		
		JLabel lblHidrocarburosTotales = new JLabel("Hidrocarburos totales");
		lblHidrocarburosTotales.setBounds(37, 640, 150, 16);
		frame.getContentPane().add(lblHidrocarburosTotales);
		
		JLabel lblConductividad = new JLabel("Conductividad");
		lblConductividad.setBounds(37, 670, 150, 16);
		frame.getContentPane().add(lblConductividad);
		
		JLabel lblRelacionCN = new JLabel("Relación C/N");
		lblRelacionCN.setBounds(37, 700, 150, 16);
		frame.getContentPane().add(lblRelacionCN);
		
		JLabel lblOtros = new JLabel("Otros");
		lblOtros.setBounds(37, 730, 150, 16);
		frame.getContentPane().add(lblOtros);		
		
		nroAnalisis = new JComboBox();
		nroAnalisis.setBounds(191, 125, 130, 26);
		frame.getContentPane().add(nroAnalisis);
		for (AnalisisBarro analisisBarro : datosDAO.obtenerTodosLosAnalisisBarros()){
			nroAnalisis.addItem(analisisBarro.getNroAnalisis());
		}
		nroAnalisis.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent arg0){
				AnalisisBarro analisisBarroSeleccionado = datosDAO.obtenerAnalisisBarroPorNumero(String.valueOf(nroAnalisis.getSelectedItem()));
				estado1.setText(analisisBarroSeleccionado.getEstado());
				industria.setSelectedItem(analisisBarroSeleccionado.getIndustria());
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
		
		estado1 = new JTextField();
		estado1.setBounds(191, 155, 130, 26);
		frame.getContentPane().add(estado1);
		estado1.setColumns(10);
		estado1.setHorizontalAlignment(JTextField.CENTER);
		estado1.setEditable(false);
		
		lugarExtraccion1 = new JTextField();
		lugarExtraccion1.setBounds(191, 185, 130, 26);
		frame.getContentPane().add(lugarExtraccion1);
		lugarExtraccion1.setColumns(10);
		lugarExtraccion1.setHorizontalAlignment(JTextField.CENTER);
		
		extraidoPor1 = new JTextField();
		extraidoPor1.setBounds(191, 215, 130, 26);
		frame.getContentPane().add(extraidoPor1);
		extraidoPor1.setColumns(10);
		extraidoPor1.setHorizontalAlignment(JTextField.CENTER);
		
		fechaExtraccion1 = new JTextField();
		fechaExtraccion1.setBounds(191, 245, 130, 26);
		frame.getContentPane().add(fechaExtraccion1); 
		fechaExtraccion1.setColumns(10);
		fechaExtraccion1.setHorizontalAlignment(JTextField.CENTER);
		fechaExtraccion1.setEditable(false);
		
		horaExtraccion1 = new JTextField();
		horaExtraccion1.setBounds(191, 275, 130, 26);
		frame.getContentPane().add(horaExtraccion1);
		horaExtraccion1.setColumns(10);
		horaExtraccion1.setHorizontalAlignment(JTextField.CENTER);
		
		aspecto1 = new JTextField();
		aspecto1.setBounds(191, 305, 130, 26);
		frame.getContentPane().add(aspecto1);
		aspecto1.setColumns(10);
		aspecto1.setHorizontalAlignment(JTextField.CENTER);
		
		pH1 = new JTextField();
		pH1.setBounds(191, 335, 130, 26);
		frame.getContentPane().add(pH1);
		pH1.setColumns(10);
		pH1.setHorizontalAlignment(JTextField.CENTER);
		
		temperatura1 = new JTextField();
		temperatura1.setBounds(191, 365, 130, 26);
		frame.getContentPane().add(temperatura1);
		temperatura1.setColumns(10);
		temperatura1.setHorizontalAlignment(JTextField.CENTER);
		
		solidosTotales1 = new JTextField();
		solidosTotales1.setBounds(191, 395, 130, 26);
		frame.getContentPane().add(solidosTotales1);
		solidosTotales1.setColumns(10);
		solidosTotales1.setHorizontalAlignment(JTextField.CENTER);
		
		humedad1 = new JTextField();
		humedad1.setBounds(191, 425, 130, 26);
		frame.getContentPane().add(humedad1);
		humedad1.setColumns(10);
		humedad1.setHorizontalAlignment(JTextField.CENTER);
		
		solidosTotalesVolatiles1 = new JTextField();
		solidosTotalesVolatiles1.setBounds(191, 455, 130, 26);
		frame.getContentPane().add(solidosTotalesVolatiles1);
		solidosTotalesVolatiles1.setColumns(10);
		solidosTotalesVolatiles1.setHorizontalAlignment(JTextField.CENTER);
		
		liquidosLibres1 = new JTextField();
		liquidosLibres1.setBounds(191, 485, 130, 26);
		frame.getContentPane().add(liquidosLibres1);
		liquidosLibres1.setColumns(10);
		liquidosLibres1.setHorizontalAlignment(JTextField.CENTER);
		
		sulfuro1 = new JTextField();
		sulfuro1.setBounds(191, 515, 130, 26);
		frame.getContentPane().add(sulfuro1);
		sulfuro1.setColumns(10);
		sulfuro1.setHorizontalAlignment(JTextField.CENTER);
		
		cromoEnLixiviado1 = new JTextField();
		cromoEnLixiviado1.setBounds(191, 545, 130, 26);
		frame.getContentPane().add(cromoEnLixiviado1);
		cromoEnLixiviado1.setColumns(10);
		cromoEnLixiviado1.setHorizontalAlignment(JTextField.CENTER);
		
		plomoEnLixiviado1 = new JTextField();
		plomoEnLixiviado1.setBounds(191, 575, 130, 26);
		frame.getContentPane().add(plomoEnLixiviado1);
		plomoEnLixiviado1.setColumns(10);
		plomoEnLixiviado1.setHorizontalAlignment(JTextField.CENTER);
		
		materiaOrganica1 = new JTextField();
		materiaOrganica1.setBounds(191, 605, 130, 26);
		frame.getContentPane().add(materiaOrganica1);
		materiaOrganica1.setColumns(10);
		materiaOrganica1.setHorizontalAlignment(JTextField.CENTER);
		
		hidrocarburosTotales1 = new JTextField();
		hidrocarburosTotales1.setBounds(191, 635, 130, 26);
		frame.getContentPane().add(hidrocarburosTotales1);
		hidrocarburosTotales1.setColumns(10);
		hidrocarburosTotales1.setHorizontalAlignment(JTextField.CENTER);
		
		conductividad1 = new JTextField();
		conductividad1.setBounds(191, 665, 130, 26);
		frame.getContentPane().add(conductividad1);
		conductividad1.setColumns(10);
		conductividad1.setHorizontalAlignment(JTextField.CENTER);
		
		relacionCN1 = new JTextField();
		relacionCN1.setBounds(191, 695, 130, 26);
		frame.getContentPane().add(relacionCN1);
		relacionCN1.setColumns(10);
		relacionCN1.setHorizontalAlignment(JTextField.CENTER);
		
		otros1 = new JTextField();
		otros1.setBounds(191, 725, 130, 26);
		frame.getContentPane().add(otros1);
		otros1.setColumns(10);
		otros1.setHorizontalAlignment(JTextField.CENTER);
		
		industria = new JComboBox();
		industria.setBounds(156, 16, 256, 27);
		frame.getContentPane().add(industria);
		for (Industria i : industriasDAO.obtenerIndustrias()){
			industria.addItem(i.getCliente());
		}
		industria.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent arg0){
				Industria industriaSeleccionada = industriasDAO.obtenerIndustriaPorNombre((String.valueOf(industria.getSelectedItem())));
				departamento1.setText(industriaSeleccionada.getDepartamento());
				localidad1.setText(industriaSeleccionada.getLocalidad());
				descargaEn1.setText(industriaSeleccionada.getDescarga());				
			}
		});
		
		departamento1 = new JTextField();
		departamento1.setBounds(158, 45, 163, 26);
		frame.getContentPane().add(departamento1);
		departamento1.setColumns(10);
		
		localidad1 = new JTextField();
		localidad1.setColumns(10);
		localidad1.setBounds(158, 75, 163, 26);
		frame.getContentPane().add(localidad1);
		
		descargaEn1 = new JTextField();
		descargaEn1.setColumns(10);
		descargaEn1.setBounds(420, 45, 163, 26);
		frame.getContentPane().add(descargaEn1);
		
		JButton btnValidar = new JButton("Validar");
		btnValidar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				datosDAO.validarAnalisis(String.valueOf(nroAnalisis.getSelectedItem()));
				estado1.setText("Validado");
			}
		});
		btnValidar.setBounds(325, 155, 117, 29);
		frame.getContentPane().add(btnValidar);
		
		JButton btnDesvalidar = new JButton("Desvalidar");
		btnDesvalidar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				datosDAO.desvalidarAnalisis(String.valueOf(nroAnalisis.getSelectedItem()));
				estado1.setText("En proceso");
			}
		});
		btnDesvalidar.setBounds(443, 155, 117, 29);
		frame.getContentPane().add(btnDesvalidar);
		
		JButton btnModificarAnlisis = new JButton("Modificar análisis");
		
		btnModificarAnlisis.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if (estado1.getText().equals("Validado")){
					JOptionPane.showMessageDialog(null, "No es posible modificar un análisis validado. Debe desvalidarlo para poder modificarlo.");
				} else {
					AnalisisBarro analisisBarro = new AnalisisBarro (String.valueOf(industria.getSelectedItem()), departamento1.getText(), localidad1.getText(), descargaEn1.getText(), String.valueOf(nroAnalisis.getSelectedItem()),
							lugarExtraccion1.getText(), extraidoPor1.getText(), null, horaExtraccion1.getText(), aspecto1.getText(), pH1.getText(),
							temperatura1.getText(), solidosTotales1.getText(), humedad1.getText(), solidosTotalesVolatiles1.getText(), liquidosLibres1.getText(), sulfuro1.getText(),
							cromoEnLixiviado1.getText(), plomoEnLixiviado1.getText(), materiaOrganica1.getText(), hidrocarburosTotales1.getText(), conductividad1.getText(),
							relacionCN1.getText(), otros1.getText(), "En proceso");
					try {
						datosDAO.modificarBarro(analisisBarro);
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
		frame.getContentPane().add(btnModificarAnlisis);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MenuBarrosANAGUA menuBarrosANAGUA = new MenuBarrosANAGUA();
				frame.dispose();
			}
		});
		btnVolver.setBounds(372, 365, 155, 48);
		frame.getContentPane().add(btnVolver);
	}
}
