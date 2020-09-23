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
import javax.swing.JEditorPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class rango extends JFrame {
	

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
	public rango() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 871, 522);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnFactorComn = new JTextPane();
		txtpnFactorComn.setText("DOMINIO Y RANGO\r\n\r\nEl dominio de una funci\u00F3n f ( x ) es el conjunto de todos los valores para los cuales la funci\u00F3n est\u00E1 definida, y el rango de la funci\u00F3n es el conjunto de todos los valores que f toma.\r\n\r\n(En gram\u00E1tica, probablemente le llame al dominio el conjunto reemplazo y al rango el conjunto soluci\u00F3n. Quiz\u00E1 tambi\u00E9n estos han sido llamados la entrada y salida de la funci\u00F3n.)\r\n\r\nEn matem\u00E1ticas, el dominio de una funci\u00F3n es el conjunto de existencia de ella misma, es decir, los valores para los cuales la funci\u00F3n est\u00E1 definida.\r\n\r\nEl rango de una funci\u00F3n se refiere al codominio o a la imagen de la funci\u00F3n, dependiendo del uso. El uso moderno casi siempre utiliza rango para referirse a la imagen. \r\n\r\n\r\n");
		txtpnFactorComn.setEditable(false);
		txtpnFactorComn.setForeground(Color.WHITE);
		txtpnFactorComn.setBackground(SystemColor.textHighlight);
		txtpnFactorComn.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 12));
		txtpnFactorComn.setBounds(10, 11, 419, 433);
		contentPane.add(txtpnFactorComn);
		
		JTextPane txtpnEjemplosIFactor = new JTextPane();
		txtpnEjemplosIFactor.setFont(new Font("Segoe UI", Font.ITALIC, 12));
		txtpnEjemplosIFactor.setText("EJEMPLOS:\r\n\r\nEncontrar dominio y rango de la funcion:\r\nf(x)= x/x-5 \r\ndominio:\r\nx-5 \u2260 0\r\nx \u22605 \r\nrango:\r\n(-\u221E,1)u(1,\u221E)\r\n");
		txtpnEjemplosIFactor.setBackground(SystemColor.textHighlight);
		txtpnEjemplosIFactor.setForeground(Color.WHITE);
		txtpnEjemplosIFactor.setEditable(false);
		txtpnEjemplosIFactor.setBounds(474, 11, 250, 169);
		contentPane.add(txtpnEjemplosIFactor);
		
		JButton btnEjercicios = new JButton("Ejercicios Relacionados");
		btnEjercicios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EjerciciosRelacionadosRango ejeDR = new EjerciciosRelacionadosRango();
				ejeDR.setVisible(true);
			}
		});
		btnEjercicios.setBounds(474, 244, 159, 34);
		contentPane.add(btnEjercicios);
		
		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Matematica math = new Matematica();
			math.setVisible(true);
			
			
			}
		});
		btnRegresar.setBounds(474, 288, 159, 34);
		contentPane.add(btnRegresar);
	}
}