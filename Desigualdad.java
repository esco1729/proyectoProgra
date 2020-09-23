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

public class Desigualdad extends JFrame {

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
	public Desigualdad() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 886, 589);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane def = new JTextPane();
		def.setEditable(false);
		def.setForeground(Color.WHITE);
		def.setBackground(SystemColor.textHighlight);
		def.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 12));
		def.setText("1) Definici\u00F3n. Es una proposici\u00F3n de relaci\u00F3n de orden existente entre dos expresiones algebraicas conectadas a trav\u00E9s de los signos: desigual que \u2260, mayor que >, menor que <, menor o igual que \u2264, as\u00ED como mayor o igual que \u2265, resultando ambas expresiones de valores distintos.\r\n\r\n2) Propiedades. \r\n\r\n\ta). Si se multiplica ambos miembros de la expresi\u00F3n por el mismo valor, la desigualdad se mantiene.\r\n\r\n\tb). Si dividimos ambos miembros de la expresi\u00F3n por el mismo valor, la desigualdad se mantiene.\r\n\r\n\tc). Si restamos el mismo valor a ambos miembros de expresi\u00F3n, la desigualdad se mantiene.\r\n\r\n\td). Si sumamos el mismo valor a ambos miembros de la expresi\u00F3n, la desigualdad se mantiene.\r\n\r\nEjemplos:\r\ni. Usando las propiedades para resolver desigualdades\r\n\r\nEmpieza despejando la variable restando 5 de ambos lados de la desigualdad.\r\n4p + 5 < 29\r\n4p + 5 - 5 < 29 -5\r\n4p < 24\r\n\r\nDivide ambos lados de la desigualdad entre 4 para expresar la variable con un coeficiente de 1.\r\n(4p / 4) < (24 / 4)\r\n\r\nRespuesta\r\np < 6\r\n\r\n");
		def.setBounds(10, 11, 419, 433);
		contentPane.add(def);
		
		Button btnEjercicios = new Button("Ejercicios Relacionados");
		btnEjercicios.setForeground(Color.BLACK);
		btnEjercicios.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnEjercicios.setBackground(Color.WHITE);
		btnEjercicios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EjerciciosRelacionadosDesigualdad ejeDes = new EjerciciosRelacionadosDesigualdad();
				ejeDes.setVisible(true);
				
				
				
				
			}
		});
		btnEjercicios.setBounds(481, 489, 169, 34);
		contentPane.add(btnEjercicios);
		
		JTextPane txtpnEjemplosIFactor = new JTextPane();
		txtpnEjemplosIFactor.setFont(new Font("Segoe UI", Font.ITALIC, 12));
		txtpnEjemplosIFactor.setText("iv. Divisi\u00F3n por un n\u00FAmero negativo\r\n\r\nEmpieza a despejar la variable restando 14 de ambos lados de la desigualdad.\r\n-6p + 14 < -58\r\n-6p + 14 - 14 <-58 - 14\r\n-6p < -72\r\n\r\nDivide entre -6 ambos lados de la desigualdad para expresar la variable con un coeficiente de 1.\r\nRespuesta\r\np > 12\t\r\n\r\nv. Usando las propiedades distributivas para eliminar par\u00E9ntesis y fracciones\r\n\r\nDistribuir para eliminar los par\u00E9ntesis.\r\n2(3x - 5) \u2264 4x + 6\r\n6x - 10 \u2264 4x + 6\r\n\r\nRestar 4x de ambos lados para tener el t\u00E9rmino de la variable a un lado solamente.\r\n6x -10 - 4x \u2264 4x + 6 - 4x\r\n2x - 10 \u2264 6\r\n\r\nSuma 10 a ambos lados para despejar la variable.\r\n2x - 10 + 10 \u2264 10 + 6\r\n\r\nDivide ambos lados entre 2 para expresar la variable con un coeficiente de 1.\r\n2x/2 \u2264 16/2\r\nx \u2264 8 \r\n");
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
		btnNewButton_3.setBounds(10, 489, 159, 34);
		contentPane.add(btnNewButton_3);
	}
}
