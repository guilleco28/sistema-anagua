package vistas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import barros.AnalisisBarro;
import industrias.Industria;
import industrias.IndustriasDAO;

public class ModificarIndustria {

	private JFrame frame;
	private JComboBox nombre;
	private JTextField responsable;
	private JTextField departamento;
	private JTextField localidad;
	private JTextField direccion;
	private JTextField telefono;
	private JTextField claveAcceso;
	private JTextField contacto;
	private JTextField rubro;
	private JTextField descargaAbreviada;
	private JTextField descarga;
	private IndustriasDAO industriasDAO = new IndustriasDAO();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModificarIndustria window = new ModificarIndustria();
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
	public ModificarIndustria() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 550, 400);
		frame.setSize(960, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("ANAGUA S.R.L. - Modificar industria");
		frame.setResizable(false);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNombre.setBounds(102, 80, 220, 31);
		frame.getContentPane().add(lblNombre);
		
		JLabel lblResponsable = new JLabel("Responsable");
		lblResponsable.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblResponsable.setBounds(102, 120, 220, 31);
		frame.getContentPane().add(lblResponsable);
		
		JLabel lblDepartamento = new JLabel("Departamento");
		lblDepartamento.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblDepartamento.setBounds(102, 160, 220, 31);
		frame.getContentPane().add(lblDepartamento);
		
		JLabel lblLocalidad = new JLabel("Localidad");
		lblLocalidad.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblLocalidad.setBounds(102, 200, 220, 31);
		frame.getContentPane().add(lblLocalidad);
		
		JLabel lblDireccion = new JLabel("Dirección");
		lblDireccion.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblDireccion.setBounds(102, 240, 220, 31);
		frame.getContentPane().add(lblDireccion);
		
		JLabel lblTelefono = new JLabel("Teléfono");
		lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblTelefono.setBounds(102, 280, 220, 31);
		frame.getContentPane().add(lblTelefono);
		
		JLabel lblClaveDeAcceso = new JLabel("Clave de acceso web");
		lblClaveDeAcceso.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblClaveDeAcceso.setBounds(102, 320, 220, 31);
		frame.getContentPane().add(lblClaveDeAcceso);
		
		JLabel lblContacto = new JLabel("Contacto");
		lblContacto.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblContacto.setBounds(102, 360, 220, 31);
		frame.getContentPane().add(lblContacto);
		
		JLabel lblRubro = new JLabel("Rubro");
		lblRubro.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblRubro.setBounds(102, 400, 220, 31);
		frame.getContentPane().add(lblRubro);
		
		JLabel lblDescargaAbreviada = new JLabel("Descarga abreviada");
		lblDescargaAbreviada.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDescargaAbreviada.setBounds(102, 440, 220, 31);
		frame.getContentPane().add(lblDescargaAbreviada);
		
		JLabel lblDescarga = new JLabel("Descarga");
		lblDescarga.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblDescarga.setBounds(102, 480, 220, 31);
		frame.getContentPane().add(lblDescarga);
		
		nombre = new JComboBox();
		nombre.setFont(new Font("Tahoma", Font.PLAIN, 23));
		nombre.setBounds(315, 80, 324, 32);
		frame.getContentPane().add(nombre);
		for (Industria industria : industriasDAO.obtenerIndustrias()){
			nombre.addItem(industria.getCliente());
			
		}
		nombre.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent arg0){
				Industria industriaSeleccionada = industriasDAO.obtenerIndustriaPorNombre((String.valueOf(nombre.getSelectedItem())));
				responsable.setText(industriaSeleccionada.getResponsable());
				departamento.setText(industriaSeleccionada.getDepartamento());
				localidad.setText(industriaSeleccionada.getLocalidad());
				direccion.setText(industriaSeleccionada.getDireccion());
				telefono.setText(industriaSeleccionada.getTelefono());
				claveAcceso.setText(industriaSeleccionada.getClaveDeAccesoWeb());
				contacto.setText(industriaSeleccionada.getContacto());
				rubro.setText(industriaSeleccionada.getRubro());
				descargaAbreviada.setText(industriaSeleccionada.getDescargaAbreviada());
				descarga.setText(industriaSeleccionada.getDescarga());				
			}
		});
		
		responsable = new JTextField();
		responsable.setFont(new Font("Tahoma", Font.PLAIN, 23));
		responsable.setColumns(10);
		responsable.setBounds(315, 118, 324, 37);
		frame.getContentPane().add(responsable);
		
		departamento = new JTextField();
		departamento.setFont(new Font("Tahoma", Font.PLAIN, 23));
		departamento.setColumns(10);
		departamento.setBounds(315, 158, 324, 37);
		frame.getContentPane().add(departamento);
		
		localidad = new JTextField();
		localidad.setFont(new Font("Tahoma", Font.PLAIN, 23));
		localidad.setColumns(10);
		localidad.setBounds(315, 198, 324, 37);
		frame.getContentPane().add(localidad);
		
		direccion = new JTextField();
		direccion.setFont(new Font("Tahoma", Font.PLAIN, 23));
		direccion.setColumns(10);
		direccion.setBounds(315, 238, 324, 37);
		frame.getContentPane().add(direccion);
		
		telefono = new JTextField();
		telefono.setFont(new Font("Tahoma", Font.PLAIN, 23));
		telefono.setColumns(10);
		telefono.setBounds(315, 278, 324, 37);
		frame.getContentPane().add(telefono);
		
		claveAcceso = new JTextField();
		claveAcceso.setFont(new Font("Tahoma", Font.PLAIN, 23));
		claveAcceso.setColumns(10);
		claveAcceso.setBounds(315, 316, 324, 37);
		frame.getContentPane().add(claveAcceso);
		
		contacto = new JTextField();
		contacto.setFont(new Font("Tahoma", Font.PLAIN, 23));
		contacto.setColumns(10);
		contacto.setBounds(315, 358, 324, 37);
		frame.getContentPane().add(contacto);
		
		rubro = new JTextField();
		rubro.setFont(new Font("Tahoma", Font.PLAIN, 23));
		rubro.setColumns(10);
		rubro.setBounds(315, 398, 324, 37);
		frame.getContentPane().add(rubro);
		
		descargaAbreviada = new JTextField();
		descargaAbreviada.setFont(new Font("Tahoma", Font.PLAIN, 23));
		descargaAbreviada.setColumns(10);
		descargaAbreviada.setBounds(315, 436, 324, 37);
		frame.getContentPane().add(descargaAbreviada);
		
		descarga = new JTextField();
		descarga.setFont(new Font("Tahoma", Font.PLAIN, 23));
		descarga.setColumns(10);
		descarga.setBounds(315, 478, 324, 37);
		frame.getContentPane().add(descarga);
		
		JButton btnModificarIndustria = new JButton("Modificar");
		btnModificarIndustria.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Industria industriaVieja = industriasDAO.obtenerIndustriaPorNombre(String.valueOf(nombre.getSelectedItem()));
				int id = industriaVieja.getId();
				Industria industriaModificada = new Industria (id, String.valueOf(nombre.getSelectedItem()), responsable.getText(), departamento.getText(), localidad.getText(), direccion.getText(), telefono.getText(), claveAcceso.getText(), contacto.getText(), rubro.getText(), descargaAbreviada.getText(), descarga.getText());
				try {
					industriasDAO.modificarIndustria(industriaModificada);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(null, "Se modificó correctamente la industria "+String.valueOf(nombre.getSelectedItem()));
			}
		});
		btnModificarIndustria.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnModificarIndustria.setBounds(720, 213, 158, 85);
		frame.getContentPane().add(btnModificarIndustria);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MenuIndustrias menuIndustrias = new MenuIndustrias ();
				frame.dispose();
			}
		});
		btnVolver.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnVolver.setBounds(720, 426, 158, 85);
		frame.getContentPane().add(btnVolver);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}

}
