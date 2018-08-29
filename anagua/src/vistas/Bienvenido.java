package vistas;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.SwingConstants;

public class Bienvenido {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bienvenido window = new Bienvenido();
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
	public Bienvenido() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		//frame.setBounds(100, 100, 550, 400);
		//frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Bienvenido al sistema gestor de análisis de aguas y barros de ANAGUA");
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int height = screenSize.height;
		int width = screenSize.width;
		frame.setSize(width/2, height/2);
		frame.setLocationRelativeTo(null);
		frame.setTitle("ANAGUA S.R.L.");
	
		
		JButton btnAnagua = new JButton("ANAGUA");
		btnAnagua.setFont(new Font("Tahoma", Font.PLAIN, 28));
		btnAnagua.setBounds(250, 186, 410, 70);
		btnAnagua.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				IngresoANAGUA ingresoANAGUA = new IngresoANAGUA();
				frame.dispose();
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnAnagua);
		
		JButton btnMedioAmbiente = new JButton("Medio Ambiente");
		btnMedioAmbiente.setFont(new Font("Tahoma", Font.PLAIN, 28));
		btnMedioAmbiente.setBounds(251, 343, 409, 70);
		frame.getContentPane().add(btnMedioAmbiente);
		
		JLabel lblSeleccioneElPerfil = new JLabel("Seleccione el perfil con el que desea ingresar");
		lblSeleccioneElPerfil.setHorizontalAlignment(SwingConstants.CENTER);
		lblSeleccioneElPerfil.setBounds(70, 49, 755, 49);
		lblSeleccioneElPerfil.setFont(new Font("Dialog", Font.PLAIN, 30));
		frame.getContentPane().add(lblSeleccioneElPerfil);
		
		
		
		
	}
}
