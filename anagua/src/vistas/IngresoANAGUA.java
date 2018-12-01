package vistas;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IngresoANAGUA {

	private JFrame frame;
	private JTextField textoUsuario;
	private JTextField textoContrasena;
	private JButton btnIngresar;
	private JLabel lblIngreseSusCredenciales;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IngresoANAGUA window = new IngresoANAGUA();
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
	public IngresoANAGUA() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 550, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int height = screenSize.height;
		int width = screenSize.width;
		frame.setSize(width/2, height/2);
		frame.setLocationRelativeTo(null);
		frame.setTitle("ANAGUA S.R.L.");
		frame.setResizable(false);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblUsuario.setBounds(221, 162, 121, 58);
		frame.getContentPane().add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblContrasea.setBounds(197, 252, 188, 58);
		frame.getContentPane().add(lblContrasea);
		
		textoUsuario = new JTextField();
		textoUsuario.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textoUsuario.setBounds(430, 163, 293, 58);
		frame.getContentPane().add(textoUsuario);
		textoUsuario.setColumns(10);
		
		textoContrasena = new JPasswordField();
		textoContrasena.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textoContrasena.setColumns(10);
		textoContrasena.setBounds(430, 253, 293, 58);
		frame.getContentPane().add(textoContrasena);
		
		btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnIngresar.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnIngresar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (textoUsuario.getText().equals("administrador") && textoContrasena.getText().equals("anagua.2017")){
					MenuANAGUA menuANAGUA = new MenuANAGUA();
					frame.dispose();										
				} else {
					JOptionPane.showMessageDialog(null, "Credenciales inválidas. Intente nuevamente.");
					textoUsuario.setText(null);
					textoContrasena.setText(null);
				}
			}
		});
		btnIngresar.setBounds(325, 366, 341, 85);
		frame.getContentPane().add(btnIngresar);
		
		lblIngreseSusCredenciales = new JLabel("Ingrese sus credenciales");
		lblIngreseSusCredenciales.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngreseSusCredenciales.setFont(new Font("Dialog", Font.PLAIN, 36));
		lblIngreseSusCredenciales.setBounds(127, 58, 702, 53);
		frame.getContentPane().add(lblIngreseSusCredenciales);
		
	}
}
