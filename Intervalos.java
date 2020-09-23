//@autor
//Micaela Yataz, 18960


import java.awt.BorderLayout;
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
// importamos paquetes de erramientas que vamos a utilizar.

public class Intervalos extends JFrame {
//creacion de clase intervalos
	
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
	public Intervalos() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 871, 522);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//creamos el frame, colocando tamaño de borde, colores.
		
		JTextPane txtpnIntervalos = new JTextPane();
		txtpnIntervalos.setText("INTERVALOS \r\n\r\nEs un subconjunto de la recta real que se llama intervalo, y contiene a todos los n\u00FAmeros reales que est\u00E1n comprendidos entre dos cualesquiera de sus elementos.\r\n\r\nINTERVALOS ABIERTOS:\r\nDefinici\u00F3nDados los n\u00FAmeros reales a y b que cumplen a<b, se define el conjunto (a;b)={x e R: a<b} llamado, intervalo abierto de extremo inferior a y extremo superior b.\r\n\r\nOTRAS ANOTACIONES:\r\n(a:b); [a,b] o <a;b>\r\n\r\nINTERVALO CERRADO:\r\nS\u00ED incluye los extremos\r\nQue se indica: I: [a,b]\r\n\r\nINTERVALO SEMIABIETO:\r\nIncluye \u00FAnicamente uno de los extremos. \r\nCon la notaci\u00F3n\r\n(a:b]\r\n\r\nINTERVALO CON INFINITO:\r\nEste tipo de intervalos aparece cuando se conoce solo uno de los extremos y el otro es el infinito, es decir, un valor en t\u00E9rminos absolutos mayor que cualquier otro, ya sea positivo o negativo. Al no poderse incluir el infinito en el intervalo, estos se consideran siempre abiertos.\r\nIncluye un extremo e infinito por la derecha.\r\n[a, infitnito)\r\n\r\n\r\n");
		txtpnIntervalos.setEditable(false);
		txtpnIntervalos.setForeground(Color.WHITE);
		txtpnIntervalos.setBackground(SystemColor.textHighlight);
		txtpnIntervalos.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 12));
		txtpnIntervalos.setBounds(10, 11, 419, 433);
		contentPane.add(txtpnIntervalos);
		// creamos la ventana donde aparece el texto de explicacion del tema, ademas se le configura colores, tamaño y la fuente, tamaño. 
		
		JTextPane txtpnEjemplosIFactor = new JTextPane();
		txtpnEjemplosIFactor.setFont(new Font("Segoe UI", Font.ITALIC, 12));
		txtpnEjemplosIFactor.setText("EJEMPLOS: \r\n\r\n1. 2\u2264 x \u2264 5=  [2,5]\r\n2. 2< x < 5=  (2,5)\r\n3. 3< x <15=  (3,5)\r\n4. 7\u2264 x \u2264 9=  [7,9]\r\n");
		txtpnEjemplosIFactor.setBackground(SystemColor.textHighlight);
		txtpnEjemplosIFactor.setForeground(Color.WHITE);
		txtpnEjemplosIFactor.setEditable(false);
		txtpnEjemplosIFactor.setBounds(474, 11, 250, 169);
		contentPane.add(txtpnEjemplosIFactor);
		// creamos la ventana donde aparecen los ejercicios; se confugura el tamaño, colores, fuente y tamaño.
		
		
		JButton btnEjercicios = new JButton("Ejercicios Relacionados");
		btnEjercicios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEjercicios.setBounds(493, 202, 159, 34);
		contentPane.add(btnEjercicios);
		//creamos un boton para que el usuario acceda a la serie de ejercicios que tiene que realizar.
	}
}
