package vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import java.awt.Scrollbar;
import java.awt.Panel;
import javax.swing.JScrollPane;
import javax.swing.JPanel;

public class FormularioIngresoAguas {

	private JFrame frame;
	private JTextField departamento;
	private JTextField localidad;
	private JTextField descargaEn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioIngresoAguas window = new FormularioIngresoAguas();
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
	public FormularioIngresoAguas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1600, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblIndustria = new JLabel("INDUSTRIA");
		lblIndustria.setBounds(425, 33, 102, 20);
		lblIndustria.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(lblIndustria);
		
		JLabel lblDepartamento = new JLabel("DEPARTAMENTO");
		lblDepartamento.setBounds(378, 69, 149, 20);
		lblDepartamento.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(lblDepartamento);
		
		JLabel lblLocalidad = new JLabel("LOCALIDAD");
		lblLocalidad.setBounds(425, 105, 110, 20);
		lblLocalidad.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(lblLocalidad);
		
		JLabel lblDescargaEn = new JLabel("DESCARGA EN");
		lblDescargaEn.setBounds(864, 69, 135, 20);
		lblDescargaEn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(lblDescargaEn);
		
		JComboBox industria = new JComboBox();
		industria.setBounds(555, 32, 297, 26);
		frame.getContentPane().add(industria);
		
		JLabel lblNmeroDeAnlisis = new JLabel("N\u00FAmero de an\u00E1lisis");
		lblNmeroDeAnlisis.setBounds(50, 200, 179, 20);
		lblNmeroDeAnlisis.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(lblNmeroDeAnlisis);
		
		departamento = new JTextField();
		departamento.setBounds(555, 68, 297, 26);
		frame.getContentPane().add(departamento);
		departamento.setColumns(10);
		
		localidad = new JTextField();
		localidad.setBounds(555, 104, 297, 26);
		localidad.setColumns(10);
		frame.getContentPane().add(localidad);
		
		descargaEn = new JTextField();
		descargaEn.setBounds(1000, 68, 297, 26);
		descargaEn.setColumns(10);
		frame.getContentPane().add(descargaEn);
		
		JLabel label = new JLabel("Lugar de extracción");
		label.setBounds(50, 240, 179, 20);
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(label);
		
		JLabel label2 = new JLabel("Extraído por");
		label2.setBounds(50, 280, 179, 20);
		label2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(label2);
		
		JLabel label3 = new JLabel("Fecha de extracción");
		label3.setBounds(50, 320, 179, 20);
		label3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(label3);
		
		JLabel label4 = new JLabel("Fecha de extracción");
		label4.setBounds(50, 360, 179, 20);
		label4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(label4);
		
		JLabel label5 = new JLabel("Fecha de extracción");
		label5.setBounds(50, 400, 179, 20);
		label5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(label5);
		
		JLabel label6 = new JLabel("Fecha de extracción");
		label6.setBounds(50, 440, 179, 20);
		label6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(label6);
		
		JLabel label7 = new JLabel("Fecha de extracción");
		label7.setBounds(50, 480, 179, 20);
		label7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(label7);
		
		JLabel label8 = new JLabel("Fecha de extracción");
		label8.setBounds(50, 520, 179, 20);
		label8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(label8);
		
		JLabel label9 = new JLabel("Fecha de extracción");
		label9.setBounds(50, 560, 179, 20);
		label9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(label9);
		
		JLabel label10 = new JLabel("Fecha de extracción");
		label10.setBounds(50, 600, 179, 20);
		label10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(label10);
		
		JLabel label11 = new JLabel("Fecha de extracción");
		label11.setBounds(50, 640, 179, 20);
		label11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(label11);
		
		JLabel label12 = new JLabel("Fecha de extracción");
		label12.setBounds(50, 680, 179, 20);
		label12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(label12);
		
		JLabel label13 = new JLabel("Fecha de extracción");
		label13.setBounds(50, 720, 179, 20);
		label13.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(label13);
		
		JLabel label14 = new JLabel("Fecha de extracción");
		label14.setBounds(50, 760, 179, 20);
		label14.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(label14);
		
		JLabel label15 = new JLabel("Fecha de extracción");
		label15.setBounds(50, 800, 179, 20);
		label15.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(label15);
		
		JLabel label16 = new JLabel("Fecha de extracción");
		label16.setBounds(50, 840, 179, 20);
		label16.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(label16);
		
		JLabel label17 = new JLabel("Fecha de extracción");
		label17.setBounds(50, 880, 179, 20);
		label17.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(label17);
		
		JLabel label18 = new JLabel("Fech de extracción");
		label18.setBounds(50, 920, 179, 20);
		label18.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(label18);
		
		JLabel label19 = new JLabel("Fecha de extracción");
		label19.setBounds(50, 960, 179, 20);
		label19.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(label19);
		
		JLabel label20 = new JLabel("Fecha de extracción");
		label20.setBounds(50, 1000, 179, 20);
		label20.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(label20);
		
		JLabel label21 = new JLabel("Fecha de extracción");
		label21.setBounds(50, 1040, 179, 20);
		label21.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(label21);
		
		JLabel label22 = new JLabel("Fecha de extracción");
		label22.setBounds(50, 1080, 179, 20);
		label22.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(label22);
		
		JLabel label23 = new JLabel("Fecha de extracción");
		label23.setBounds(50, 1120, 179, 20);
		label23.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(label23);
		
		JLabel label24 = new JLabel("Fecha de extracción");
		label24.setBounds(50, 1160, 179, 20);
		label24.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(label24);
		
		JLabel label25 = new JLabel("Fecha de extracción");
		label25.setBounds(50, 1200, 179, 20);
		label25.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(label25);
		
		JLabel label26 = new JLabel("Fecha de extracción");
		label26.setBounds(50, 1240, 179, 20);
		label26.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(label26);
		
		JLabel label27 = new JLabel("Fecha de extracción");
		label27.setBounds(50, 1280, 179, 20);
		label27.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(label27);
		
		JLabel label28 = new JLabel("Fecha de extracción");
		label28.setBounds(50, 1320, 179, 20);
		label28.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(label28);
		
		JLabel label29 = new JLabel("Fecha de extracción");
		label29.setBounds(50, 1360, 179, 20);
		label29.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(label29);
		
		JLabel label30 = new JLabel("Fecha de extracción");
		label30.setBounds(50, 1400, 179, 20);
		label30.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(label30);
		
		JLabel label31 = new JLabel("Fecha de extracción");
		label31.setBounds(50, 1440, 179, 20);
		label31.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(label31);
		
		JLabel label32 = new JLabel("Fecha de extracción");
		label32.setBounds(50, 1480, 179, 20);
		label32.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(label32);
		
		JLabel label33 = new JLabel("Fecha de extracción");
		label33.setBounds(50, 1520, 179, 20);
		label33.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(label33);
		
		JLabel label34 = new JLabel("Fecha de extracción");
		label34.setBounds(50, 1560, 179, 20);
		label34.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(label34);
		
		JLabel label35 = new JLabel("Fecha de extracción");
		label35.setBounds(50, 1600, 179, 20);
		label35.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(label35);
		
		JLabel label36 = new JLabel("Fecha de extracción");
		label36.setBounds(50, 1640, 179, 20);
		label36.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(label36);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(788, 920, -762, -758);
		frame.getContentPane().add(scrollPane);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(15, 178, 857, 907);
		frame.getContentPane().add(scrollPane_1);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollPane_1.setRowHeaderView(scrollBar);
		
		

	}
}
