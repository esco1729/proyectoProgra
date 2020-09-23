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
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Vectores extends JFrame {

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
	public Vectores() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 886, 589);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnEjercicios = new JButton("Ejercicios Relacionados");
		btnEjercicios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			EjerciciosConversiones eje = new EjerciciosConversiones();
			eje.setVisible(true);
			
			}
		});
		btnEjercicios.setBounds(630, 490, 159, 34);
		contentPane.add(btnEjercicios);
		
		JTextPane def = new JTextPane();
		def.setEditable(false);
		def.setForeground(Color.WHITE);
		def.setBackground(SystemColor.textHighlight);
		def.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 12));
		def.setText("1) Definici\u00F3n. En la actualidad existen gran cantidad de unidades para medir cada magnitud f\u00EDsica. Esto es debido a que, por un lado, en determinadas regiones se usaban sus propias unidades lo que ha propiciado que existan gran n\u00FAmero de ellas, y por otro, en ocasiones es necesario emplear unidades que nos permitan obtener valores m\u00E1s peque\u00F1os y con los que nos sea m\u00E1s sencillo trabajar.\r\n\r\nEn cualquier caso, la comunidad cient\u00EDfica recomienda utilizar \u00FAnicamente las unidades del Sistema Internacional y si nuestras magnitudes no se encuentran en este sistema, por lo general deberemos convertirlas a un valor equivalente.\r\n\r\n2). Unidades fundamentales. \r\nEl Sistema Internacional de Unidades consta de 7 unidades b\u00E1sicas o fundamentales, las cu\u00E1les expresan magnitudes f\u00EDsicas. \r\n\r\n");
		def.setBounds(10, 11, 419, 433);
		contentPane.add(def);
		
		JButton btnNewButton_3 = new JButton("Regresar");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Fisica phy = new Fisica();
				phy.setVisible(true);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_3.setBounds(10, 497, 159, 34);
		contentPane.add(btnNewButton_3);
		
		JTextPane txtpnConversinDe = new JTextPane();
		txtpnConversinDe.setText("3). Conversi\u00F3n de unidades de tiempo\r\n\r\n\r\n\r\n\r\n\r\n4). Conversi\u00F3n de unidades de longitud\r\n\r\n\r\n\r\n\r\n\r\n5). Conversi\u00F3n de unidades de velocidad\r\n\r\n\r\n\r\n\r\n\r\n6). Conversi\u00F3n de unidades de fuerza\r\n\r\n\r\n\r\n\r\n");
		txtpnConversinDe.setForeground(Color.WHITE);
		txtpnConversinDe.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 12));
		txtpnConversinDe.setEditable(false);
		txtpnConversinDe.setBackground(SystemColor.textHighlight);
		txtpnConversinDe.setBounds(439, 11, 419, 433);
		contentPane.add(txtpnConversinDe);
	}
}