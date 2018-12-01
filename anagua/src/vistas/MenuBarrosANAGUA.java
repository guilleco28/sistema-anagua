package vistas;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuBarrosANAGUA {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuBarrosANAGUA window = new MenuBarrosANAGUA();
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
	public MenuBarrosANAGUA() {
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
		frame.setTitle("ANAGUA S.R.L. - Sección BARROS");
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int height = screenSize.height;
		int width = screenSize.width;
		frame.setSize(960, 618);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		
		JButton btnSeccinAguas = new JButton("Ingresar nuevos an\u00E1lisis");
		btnSeccinAguas.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnSeccinAguas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FormularioIngresoBarros formularioIngresoBarros = new FormularioIngresoBarros();
				frame.dispose();
			}
		});
		btnSeccinAguas.setBounds(235, 110, 427, 72);
		frame.getContentPane().add(btnSeccinAguas);
		
		JButton btnSeccinBarros = new JButton("Modificar datos de un an\u00E1lisis");
		btnSeccinBarros.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnSeccinBarros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSeccinBarros.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FormularioModificacionBarros formularioModificacionBarros = new FormularioModificacionBarros();
				frame.dispose();
			}
		});
		btnSeccinBarros.setBounds(235, 210, 427, 76);
		frame.getContentPane().add(btnSeccinBarros);
		
		JButton btnVerBaseDe = new JButton("Crear informe");
		btnVerBaseDe.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnVerBaseDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnVerBaseDe.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CrearInformeBarros crearInformeBarros = new CrearInformeBarros();
				frame.dispose();
			}
		});
		btnVerBaseDe.setBounds(235, 310, 427, 72);
		frame.getContentPane().add(btnVerBaseDe);
		
		JButton btnAltamodificacinDeIndustrias = new JButton("Volver al men\u00FA de inicio");
		btnAltamodificacinDeIndustrias.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnAltamodificacinDeIndustrias.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAltamodificacinDeIndustrias.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MenuANAGUA menuANAGUA = new MenuANAGUA();
				frame.dispose();
			}
		});
		btnAltamodificacinDeIndustrias.setBounds(235, 410, 427, 72);
		frame.getContentPane().add(btnAltamodificacinDeIndustrias);
		
		JLabel lblSeccinBarros = new JLabel("Secci\u00F3n BARROS");
		lblSeccinBarros.setHorizontalAlignment(SwingConstants.CENTER);
		lblSeccinBarros.setFont(new Font("Dialog", Font.PLAIN, 30));
		lblSeccinBarros.setBounds(133, 33, 640, 50);
		frame.getContentPane().add(lblSeccinBarros);
	}

}
