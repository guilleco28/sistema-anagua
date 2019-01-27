package vistas;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

import industrias.VerIndustrias;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.sql.SQLException;

public class MenuIndustrias {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuIndustrias window = new MenuIndustrias();
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
	public MenuIndustrias() {
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
		frame.setTitle("ANAGUA S.R.L. - Sección industrias");
		frame.setResizable(false);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		JButton btnNewButton = new JButton("Agregar industria");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AgregarIndustria agregarIndustria = new AgregarIndustria();
				frame.dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 28));
		btnNewButton.setBounds(250, 100, 410, 70);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnModificarIndustria = new JButton("Modificar industria");
		btnModificarIndustria.setFont(new Font("Tahoma", Font.PLAIN, 28));
		btnModificarIndustria.setBounds(250, 189, 410, 70);
		frame.getContentPane().add(btnModificarIndustria);
		
		JButton btnVerIndustrias = new JButton("Ver industrias");
		btnVerIndustrias.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				VerIndustrias verIndustrias = new VerIndustrias();
				try {
					verIndustrias.verIndustrias();
				} catch (IOException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnVerIndustrias.setFont(new Font("Tahoma", Font.PLAIN, 28));
		btnVerIndustrias.setBounds(250, 275, 410, 70);
		frame.getContentPane().add(btnVerIndustrias);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MenuANAGUA menuANAGUA = new MenuANAGUA();
				frame.dispose();
			}
		});
		btnVolver.setFont(new Font("Tahoma", Font.PLAIN, 28));
		btnVolver.setBounds(250, 363, 410, 70);
		frame.getContentPane().add(btnVolver);
		

		
	}
}
