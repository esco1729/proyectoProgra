/**
 * @author liter
 * Nicolle Escobar 20647
 */
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.TextArea;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class FuncionesLineales extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FuncionesLineales() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 886, 589);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\liter\\OneDrive\\Escritorio\\Universidad\\Semestre II\\Programaci\u00F3n\\Proyecto\\todosLosArchivos\\tabla.jpg"));
		lblNewLabel.setBounds(136, 415, 103, 51);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\liter\\OneDrive\\Escritorio\\Universidad\\Semestre II\\Programaci\u00F3n\\Proyecto\\todosLosArchivos\\graph.jpg"));
		lblNewLabel_1.setBounds(524, 38, 174, 205);
		contentPane.add(lblNewLabel_1);
		
		JButton btnEjercicios = new JButton("Ejercicios Relacionados");
		btnEjercicios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			EjerciciosFunciones func = new EjerciciosFunciones();
			func.setVisible(true);
			
			}
		});
		btnEjercicios.setBounds(630, 490, 159, 34);
		contentPane.add(btnEjercicios);
		
		JTextPane def = new JTextPane();
		def.setEditable(false);
		def.setForeground(Color.WHITE);
		def.setBackground(SystemColor.textHighlight);
		def.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 12));
		def.setText("1) Definici\u00F3n. Una funci\u00F3n lineal es una funci\u00F3n polin\u00F3mica de primer grado, es decir, una funci\u00F3n cuya representaci\u00F3n en el plano cartesiano es una l\u00EDnea recta de forma\r\n\t\t\tf(x) = m\u22C5x+n\r\nsiendo m\u2260n.\r\n\u2022 m es la pendiente de la funci\u00F3n\r\n\u2022 n es la ordenada (en el origen) de la funci\u00F3n\r\n\r\n2) Propiedades. \r\nLa pendiente es el coeficiente de la variable, es decir, m. Geom\u00E9tricamente, cuanto mayor es la pendiente, m\u00E1s inclinada es la recta. Es decir, m\u00E1s r\u00E1pido crece la funci\u00F3n.\r\n\r\n\ta). Si la pendiente es positiva, la funci\u00F3n es creciente.\r\n\r\n\tb). Si la pendiente es negativa, la funci\u00F3n es decreciente.\r\n\r\nEjemplos:\r\ni. Representando la funci\u00F3n \r\n\t\t\tf(x) = 2x -3\r\n\t\t\t\t\t\t\r\nHacemos una tabla para calcular dos puntos en la gr\u00E1fica:\r\n\r\n\r\n\r\n\r\n");
		def.setBounds(10, 11, 419, 433);
		contentPane.add(def);
		
		JTextPane txtpnEjemplosIFactor = new JTextPane();
		txtpnEjemplosIFactor.setFont(new Font("Segoe UI", Font.ITALIC, 12));
		txtpnEjemplosIFactor.setText("Representamos la recta a partir de los puntos (4, 5) y (-2, -7)\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nii. Puntos de intersecci\u00F3n con los ejes. El punto de corte con el eje Y es el \r\npunto de la recta que tiene la primera coordenada igual a 0.\r\n\t\t\t\t\t\t\t\t(0, f(0))\r\n\r\nEl punto de corte con el eje X es el punto de la recta que tiene \r\n0 en la segunda coordenada. Se calcula igualando a \r\n0 la funci\u00F3n y resolviendo la ecuaci\u00F3n obtenida.");
		txtpnEjemplosIFactor.setBackground(SystemColor.textHighlight);
		txtpnEjemplosIFactor.setForeground(Color.WHITE);
		txtpnEjemplosIFactor.setEditable(false);
		txtpnEjemplosIFactor.setBounds(439, 10, 406, 486);
		contentPane.add(txtpnEjemplosIFactor);
		
		JButton btnNewButton_3 = new JButton("Regresar");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Matematica math = new Matematica();
				math.setVisible(true);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_3.setBounds(10, 497, 159, 34);
		contentPane.add(btnNewButton_3);
	}
}
