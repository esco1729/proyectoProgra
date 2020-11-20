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
import javax.swing.JTextField;
//importamos paquetes de erramientas que vamos a utilizar.


@SuppressWarnings("unused")
public class EjerciciosRelacionadoIntervalos extends JFrame {
	//creacion de clase ejerciciosrelacinadosRango

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				EjerciciosRelacionadosIntervalos in=new EjerciciosRelacionadosIntervalos();
				in.setVisible(true);
				
				
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EjerciciosRelacionadoIntervalos() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 697, 616);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//creamos el frame, colocando tamaño de borde, colores.
		
		JLabel lblNewLabel = new JLabel("i.Escriba en forma de  intervalos lo siguiente:\r\n\r\n");
		lblNewLabel.setFont(new Font("Segoe UI Light", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(47, 11, 452, 125);
		contentPane.add(lblNewLabel);
		//en esta parte se ingresa las instruccines para que el usuario vea las instrucciones; se confugra colores, tamaño, funete y se agrega el panel 
		
		JLabel lblNewLabel_1 = new JLabel("a). {x/3<x<8}");
		lblNewLabel_1.setFont(new Font("Segoe UI Light", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_1.setBounds(76, 115, 187, 70);
		contentPane.add(lblNewLabel_1);
		// se crea el cuadro donde ira 
		
		textField = new JTextField();
		textField.setBounds(49, 182, 121, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("b). {x/-3<x<1}");
		lblNewLabel_1_1.setFont(new Font("Segoe UI Light", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_1_1.setBounds(39, 242, 187, 70);
		contentPane.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(69, 311, 137, 30);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("c). f(x)={x/x<8}");
		lblNewLabel_1_1_1.setFont(new Font("Segoe UI Light", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_1_1_1.setBounds(39, 386, 187, 70);
		contentPane.add(lblNewLabel_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(69, 452, 137, 30);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("c). {x/x>0}");
		lblNewLabel_1_2.setFont(new Font("Segoe UI Light", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_1_2.setBounds(404, 115, 187, 70);
		contentPane.add(lblNewLabel_1_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(185, 182, 121, 30);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(427, 182, 137, 30);
		contentPane.add(textField_4);
	
	
	
	
	
	
	
	}
}

