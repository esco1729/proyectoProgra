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
			EjerciciosVectores eje = new EjerciciosVectores();
			eje.setVisible(true);
			dispose();
			
			}
		});
		btnEjercicios.setBounds(630, 490, 159, 34);
		contentPane.add(btnEjercicios);
		
		JTextPane def = new JTextPane();
		def.setEditable(false);
		def.setForeground(Color.WHITE);
		def.setBackground(SystemColor.textHighlight);
		def.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 12));
		def.setText("1) Definici\u00F3n. Un vector tiene tres caracter\u00EDsticas esenciales: m\u00F3dulo, direcci\u00F3n y sentido. Para que dos vectores sean considerados iguales, deben tener igual m\u00F3dulo, igual direcci\u00F3n e igual sentido.\r\n\r\nLos vectores se representan goem\u00E9tricamente con flechas y se le asigna por lo general una letra que en su parte superior lleva una peque\u00F1a flecha de izquierda a derecha.\r\n\r\n\r\n\u2022 M\u00F3dulo: est\u00E1 representado por el tama\u00F1o del vector, y hace referencia a la intensidad de la magnitud ( n\u00FAmero). Se denota con la letra solamente A o |A|\r\n\r\n\ta). Vectores de igual m\u00F3dulo. Todos podr\u00EDan representar, por ejemplo, una velocidad de 15 km/h, pero en distintas direcciones, por lo tanto todos tendr\u00EDan distinta velocidad.\r\n\tb). Vectores de distinto m\u00F3dulo. Se espera que el vector de menor tama\u00F1o represente por ejemplo una velocidad menor que la de los dem\u00E1s.\r\n\tc). Vectores de distinto m\u00F3dulo: As\u00ED, los vectores de la figura podr\u00EDan representar velocidades de 20 km/h, 5 km/h y 15 km/h, respectivamente. \r\n\r\n\u2022 Sentido: est\u00E1 indicado por la punta de la flecha. (signo positivo que por lo general no se coloca, o un signo negativo). No corresponde comparar el sentido de dos vectores que no tienen la misma direcci\u00F3n, de modo que se habla solamente de vectores con el mismo sentido o con sentido opuesto. ");
		def.setBounds(10, 11, 419, 467);
		contentPane.add(def);
		
		JButton btnNewButton_3 = new JButton("Regresar");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Fisica phy = new Fisica();
				phy.setVisible(true);
				dispose();
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_3.setBounds(10, 497, 159, 34);
		contentPane.add(btnNewButton_3);
		
		JTextPane txtpnConversinDe = new JTextPane();
		txtpnConversinDe.setText("\u2022 Direcci\u00F3n: corresponde a la inclinaci\u00F3n de la recta, y representa al \u00E1ngulo entre ella y un eje horizontal imaginario ( ver figura 2) . Tambi\u00E9n se pueden utilizar los ejes de coordenadas cartesianas (x, y y z) como tambi\u00E9n los puntos cardinales para la direcci\u00F3n.\r\n\r\n\ta). Vectores de distinto m\u00F3dulo: Dos vectores tienen la misma direcci\u00F3n cuando la inclinaci\u00F3n de la recta que los representa es la misma, es decir, cuando son paralelos.\r\n\r\n\tb). Vectores de igual direcci\u00F3n: Sin importar hacia d\u00F3nde apuntan o cu\u00E1l es su tama\u00F1o, los vectores de la figura son paralelos, por lo que tienen la misma direcci\u00F3n. ");
		txtpnConversinDe.setForeground(Color.WHITE);
		txtpnConversinDe.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 12));
		txtpnConversinDe.setEditable(false);
		txtpnConversinDe.setBackground(SystemColor.textHighlight);
		txtpnConversinDe.setBounds(439, 11, 419, 433);
		contentPane.add(txtpnConversinDe);
	}
}