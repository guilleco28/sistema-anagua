package vistas;

import java.awt.EventQueue;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

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

public class FormularioIngresoBarros {

	private JFrame frame;
	private JTextField nroAnalisis1;
	private JTextField lugarExtraccion1;
	private JTextField extraidoPor1;
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
	private JTextField departamento;
	private JTextField localidad;
	private JTextField descargaEn;
	private JComboBox industria;

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
	private void initialize() {
		
		DatosDAO datosDAO = new DatosDAO();
		IndustriasDAO industriasDAO = new IndustriasDAO();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 1200, 850);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Formulario de ingreso de análisis de barros - ANAGUA");
		frame.setVisible(true);
		
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
		
		nroAnalisis1 = new JTextField();
		nroAnalisis1.setBounds(191, 125, 130, 26);
		frame.getContentPane().add(nroAnalisis1);
		nroAnalisis1.setColumns(10);
		nroAnalisis1.setHorizontalAlignment(JTextField.CENTER);
		
		lugarExtraccion1 = new JTextField();
		lugarExtraccion1.setBounds(191, 155, 130, 26);
		frame.getContentPane().add(lugarExtraccion1);
		lugarExtraccion1.setColumns(10);
		lugarExtraccion1.setHorizontalAlignment(JTextField.CENTER);
		
		extraidoPor1 = new JTextField();
		extraidoPor1.setBounds(191, 185, 130, 26);
		frame.getContentPane().add(extraidoPor1);
		extraidoPor1.setColumns(10);
		extraidoPor1.setHorizontalAlignment(JTextField.CENTER);
		
		JDateChooser fechaExtraccion = new JDateChooser();		
		fechaExtraccion.setBounds(191, 215, 130, 26);
		frame.getContentPane().add(fechaExtraccion);
		
		horaExtraccion1 = new JTextField();
		horaExtraccion1.setBounds(191, 245, 130, 26);
		frame.getContentPane().add(horaExtraccion1);
		horaExtraccion1.setColumns(10);
		horaExtraccion1.setHorizontalAlignment(JTextField.CENTER);
		
		aspecto1 = new JTextField();
		aspecto1.setBounds(191, 275, 130, 26);
		frame.getContentPane().add(aspecto1);
		aspecto1.setColumns(10);
		aspecto1.setHorizontalAlignment(JTextField.CENTER);
		
		pH1 = new JTextField();
		pH1.setBounds(191, 305, 130, 26);
		frame.getContentPane().add(pH1);
		pH1.setColumns(10);
		pH1.setHorizontalAlignment(JTextField.CENTER);
		
		temperatura1 = new JTextField();
		temperatura1.setBounds(191, 335, 130, 26);
		frame.getContentPane().add(temperatura1);
		temperatura1.setColumns(10);
		temperatura1.setHorizontalAlignment(JTextField.CENTER);
		
		solidosTotales1 = new JTextField();
		solidosTotales1.setBounds(191, 365, 130, 26);
		frame.getContentPane().add(solidosTotales1);
		solidosTotales1.setColumns(10);
		solidosTotales1.setHorizontalAlignment(JTextField.CENTER);
		
		humedad1 = new JTextField();
		humedad1.setBounds(191, 395, 130, 26);
		frame.getContentPane().add(humedad1);
		humedad1.setColumns(10);
		humedad1.setHorizontalAlignment(JTextField.CENTER);
		
		solidosTotalesVolatiles1 = new JTextField();
		solidosTotalesVolatiles1.setBounds(191, 425, 130, 26);
		frame.getContentPane().add(solidosTotalesVolatiles1);
		solidosTotalesVolatiles1.setColumns(10);
		solidosTotalesVolatiles1.setHorizontalAlignment(JTextField.CENTER);
		
		liquidosLibres1 = new JTextField();
		liquidosLibres1.setBounds(191, 455, 130, 26);
		frame.getContentPane().add(liquidosLibres1);
		liquidosLibres1.setColumns(10);
		liquidosLibres1.setHorizontalAlignment(JTextField.CENTER);
		
		sulfuro1 = new JTextField();
		sulfuro1.setBounds(191, 485, 130, 26);
		frame.getContentPane().add(sulfuro1);
		sulfuro1.setColumns(10);
		sulfuro1.setHorizontalAlignment(JTextField.CENTER);
		
		cromoEnLixiviado1 = new JTextField();
		cromoEnLixiviado1.setBounds(191, 515, 130, 26);
		frame.getContentPane().add(cromoEnLixiviado1);
		cromoEnLixiviado1.setColumns(10);
		cromoEnLixiviado1.setHorizontalAlignment(JTextField.CENTER);
		
		plomoEnLixiviado1 = new JTextField();
		plomoEnLixiviado1.setBounds(191, 545, 130, 26);
		frame.getContentPane().add(plomoEnLixiviado1);
		plomoEnLixiviado1.setColumns(10);
		plomoEnLixiviado1.setHorizontalAlignment(JTextField.CENTER);
		
		materiaOrganica1 = new JTextField();
		materiaOrganica1.setBounds(191, 575, 130, 26);
		frame.getContentPane().add(materiaOrganica1);
		materiaOrganica1.setColumns(10);
		materiaOrganica1.setHorizontalAlignment(JTextField.CENTER);
		
		hidrocarburosTotales1 = new JTextField();
		hidrocarburosTotales1.setBounds(191, 605, 130, 26);
		frame.getContentPane().add(hidrocarburosTotales1);
		hidrocarburosTotales1.setColumns(10);
		hidrocarburosTotales1.setHorizontalAlignment(JTextField.CENTER);
		
		conductividad1 = new JTextField();
		conductividad1.setBounds(191, 635, 130, 26);
		frame.getContentPane().add(conductividad1);
		conductividad1.setColumns(10);
		conductividad1.setHorizontalAlignment(JTextField.CENTER);
		
		relacionCN1 = new JTextField();
		relacionCN1.setBounds(191, 665, 130, 26);
		frame.getContentPane().add(relacionCN1);
		relacionCN1.setColumns(10);
		relacionCN1.setHorizontalAlignment(JTextField.CENTER);
		
		otros1 = new JTextField();
		otros1.setBounds(191, 695, 130, 26);
		frame.getContentPane().add(otros1);
		otros1.setColumns(10);
		otros1.setHorizontalAlignment(JTextField.CENTER);
		
		JButton btnNewButton = new JButton("Agregar análisis");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {				
				AnalisisBarro analisisBarro = new AnalisisBarro (String.valueOf(industria.getSelectedItem()), departamento.getText(), localidad.getText(), descargaEn.getText(), nroAnalisis1.getText(),
						lugarExtraccion1.getText(), extraidoPor1.getText(), fechaExtraccion.getDate(), horaExtraccion1.getText(), aspecto1.getText(), pH1.getText(),
						temperatura1.getText(), solidosTotales1.getText(), humedad1.getText(), solidosTotalesVolatiles1.getText(), liquidosLibres1.getText(), sulfuro1.getText(),
						cromoEnLixiviado1.getText(), plomoEnLixiviado1.getText(), materiaOrganica1.getText(), hidrocarburosTotales1.getText(), conductividad1.getText(),
						relacionCN1.getText(), otros1.getText(), "En proceso");
				try {
					datosDAO.agregarBarro(analisisBarro);
				} catch (MySQLIntegrityConstraintViolationException e1) {
					JOptionPane.showMessageDialog(null, "Usted está intentando agregar un análisis con un número ya existente en el sistema.");
				} catch (SQLException e1) {
					JOptionPane.showMessageDialog(null, "Se ha producido un error. Revise los datos que intenta ingresar.");
					e1.printStackTrace();
				}
				//JOptionPane.showMessageDialog(null, "Se agregó el análisis correctamente al sistema.");
				 
			}
		});
		
		btnNewButton.setBounds(188, 725, 150, 29);
		frame.getContentPane().add(btnNewButton);
		
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
		
		
		

		
		
	}
}
