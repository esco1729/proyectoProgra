import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class TipoDeUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private BaseDeDatos inicio;
	private JFrame frmInicio;
	private JPasswordField Contraseña;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
			TipoDeUsuario frame = new TipoDeUsuario();
			frame.setVisible(true);
				
			}
		});
	}
	

	/**
	 * Create the frame.
	 */
	public TipoDeUsuario() {
		inicio=new BaseDeDatos();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 452);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.textHighlight);
		panel.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255)), "Inicio", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u00A1Bienvenido/a!");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setBounds(146, 100, 193, 97);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Alumnos");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(88, 249, 135, 37);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Profesores");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBounds(302, 249, 135, 37);
		panel.add(btnNewButton_1);
		
		Image icon = new ImageIcon(this.getClass().getResource("/100tifico.jpg")).getImage();
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(icon));
		lblNewLabel_1.setBounds(-131, -157, 974, 704);
		panel.add(lblNewLabel_1);
		
	}
}
