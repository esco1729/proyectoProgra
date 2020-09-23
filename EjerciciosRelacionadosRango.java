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
// se importan

@SuppressWarnings("unused")
public class EjerciciosRelacionadosRango extends JFrame {

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
				
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EjerciciosRelacionadosRango() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 697, 616);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("i. Encuentre los dominios y rangos\r\n de estas funciones:\r\n\r\n");
		lblNewLabel.setFont(new Font("Segoe UI Light", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(47, 11, 452, 125);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("a). f(x)=(x+2)/(3x-1)");
		lblNewLabel_1.setFont(new Font("Segoe UI Light", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_1.setBounds(76, 115, 187, 70);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(49, 182, 121, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("b). f(x)=3x+4/2x-5");
		lblNewLabel_1_1.setFont(new Font("Segoe UI Light", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_1_1.setBounds(39, 242, 187, 70);
		contentPane.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(69, 311, 137, 30);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("c). f(x)=8x/3x+9");
		lblNewLabel_1_1_1.setFont(new Font("Segoe UI Light", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_1_1_1.setBounds(39, 386, 187, 70);
		contentPane.add(lblNewLabel_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(69, 452, 137, 30);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("c). f(x)= (x-1)/(x-3)(x+2)");
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

