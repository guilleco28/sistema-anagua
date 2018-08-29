package vistas;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class MenuANAGUA {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuANAGUA window = new MenuANAGUA();
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
	public MenuANAGUA() {
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
		
		JButton btnSeccinAguas = new JButton("Secci�n AGUAS");
		btnSeccinAguas.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnSeccinAguas.setBounds(268, 40, 386, 77);
		frame.getContentPane().add(btnSeccinAguas);
		
		JButton btnSeccinBarros = new JButton("Secci�n BARROS");
		btnSeccinBarros.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnSeccinBarros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSeccinBarros.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MenuBarrosANAGUA menuBarrosANAGUA = new MenuBarrosANAGUA();
				frame.dispose();
			}
		});
		btnSeccinBarros.setBounds(268, 140, 386, 82);
		frame.getContentPane().add(btnSeccinBarros);
		
		JButton btnVerBaseDe = new JButton("Ver base de datos");
		btnVerBaseDe.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnVerBaseDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnVerBaseDe.setBounds(268, 240, 386, 78);
		frame.getContentPane().add(btnVerBaseDe);
		
		JButton btnAltamodificacinDeIndustrias = new JButton("Alta/Modificaci�n de industrias");
		btnAltamodificacinDeIndustrias.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnAltamodificacinDeIndustrias.setBounds(268, 340, 386, 82);
		frame.getContentPane().add(btnAltamodificacinDeIndustrias);
		
		JButton btnVerAyuda = new JButton("Ver ayuda");
		btnVerAyuda.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnVerAyuda.setBounds(268, 440, 386, 77);
		frame.getContentPane().add(btnVerAyuda);
	}
}