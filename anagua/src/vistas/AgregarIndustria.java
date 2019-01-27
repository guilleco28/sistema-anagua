package vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import industrias.Industria;
import industrias.IndustriasDAO;

import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AgregarIndustria {

	private JFrame frame;
	private JTextField nombre;
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
					AgregarIndustria window = new AgregarIndustria();
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
	public AgregarIndustria() {
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
		frame.setTitle("ANAGUA S.R.L. - Agregar industria");
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
		
		nombre = new JTextField();
		nombre.setFont(new Font("Tahoma", Font.PLAIN, 23));
		nombre.setBounds(315, 78, 324, 37);
		frame.getContentPane().add(nombre);
		nombre.setColumns(10);
		
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
		
		JButton btnAgregarIndustria = new JButton("Agregar");
		btnAgregarIndustria.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//cambiar id
				int id = industriasDAO.obtenerUltimoID() + 1;
				Industria industria = new Industria (id, nombre.getText(), responsable.getText(), departamento.getText(), localidad.getText(), direccion.getText(), telefono.getText(), claveAcceso.getText(), contacto.getText(), rubro.getText(), descargaAbreviada.getText(), descarga.getText());
				industriasDAO.agregarIndustria(industria);
				JOptionPane.showMessageDialog(null, "Se agregó correctamente la industria "+nombre.getText());
			}
		});
		btnAgregarIndustria.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnAgregarIndustria.setBounds(720, 213, 158, 85);
		frame.getContentPane().add(btnAgregarIndustria);
		
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
