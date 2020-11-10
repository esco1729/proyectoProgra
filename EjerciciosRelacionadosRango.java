import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.TextArea;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
// se importan

@SuppressWarnings("unused")
public class EjerciciosRelacionadosRango extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_3;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnResultados;
	private JButton btnRegresar;
	int count = 0;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;

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
		lblNewLabel.setBounds(47, 11, 544, 125);
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
		
		JLabel lblNewLabel_1_1_1 = new JLabel("c). f(x)=8x/3x+9");
		lblNewLabel_1_1_1.setFont(new Font("Segoe UI Light", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_1_1_1.setBounds(39, 386, 187, 70);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("c). f(x)= (x-1)/(x-3)(x+2)");
		lblNewLabel_1_2.setFont(new Font("Segoe UI Light", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_1_2.setBounds(404, 115, 187, 70);
		contentPane.add(lblNewLabel_1_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(183, 297, 121, 30);
		contentPane.add(textField_3);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(183, 182, 121, 30);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(47, 297, 121, 30);
		contentPane.add(textField_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(47, 330, 121, 30);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(183, 330, 121, 30);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(47, 446, 121, 30);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(183, 446, 121, 30);
		contentPane.add(textField_7);
		
		btnNewButton = new JButton("Listo");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText();
				String text1 = textField_1.getText();
				if(text.contains("R")||text.contains("x>=-49/12") && text1.contains("R")||text1.contains("x>=-49/12")) {
					Image icon = new ImageIcon(this.getClass().getResource("/check.jpg")).getImage();
					Image modificada = icon.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
					JLabel lbl = new JLabel();
					lbl.setIcon(new ImageIcon(modificada));
					JOptionPane.showMessageDialog(null, lbl);
					count++;
				}
				
				else {
					Image icon1 = new ImageIcon(this.getClass().getResource("/equis.jpg")).getImage();
					Image modificada = icon1.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
					JLabel lbl = new JLabel();
					lbl.setIcon(new ImageIcon(modificada));
					JOptionPane.showMessageDialog(null, lbl);
				}
				
				
			}
		});
		btnNewButton.setBounds(127, 222, 85, 21);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Listo");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField_2.getText();
				String text1 = textField_3.getText();
				String text2 = textField_4.getText();
				String text3 = textField_5.getText();
				if(text.contains("x<5/2")||text.contains("x>5/2")||text.contains("x<3/2")||text.contains("x>3/2") && 
						text1.contains("x<5/2")||text1.contains("x>5/2")||text1.contains("x<3/2")||text1.contains("x>3/2") &&
				text2.contains("x<5/2")||text2.contains("x>5/2")||text2.contains("x<3/2")||text2.contains("x>3/2") &&
				text3.contains("x<5/2")||text3.contains("x>5/2")||text3.contains("x<3/2")||text3.contains("x>3/2")) {
					Image icon = new ImageIcon(this.getClass().getResource("/check.jpg")).getImage();
					Image modificada = icon.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
					JLabel lbl = new JLabel();
					lbl.setIcon(new ImageIcon(modificada));
					JOptionPane.showMessageDialog(null, lbl);
					count++;
				}
				
				else {
					Image icon1 = new ImageIcon(this.getClass().getResource("/equis.jpg")).getImage();
					Image modificada = icon1.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
					JLabel lbl = new JLabel();
					lbl.setIcon(new ImageIcon(modificada));
					JOptionPane.showMessageDialog(null, lbl);
				}
				
			}
		});
		btnNewButton_1.setBounds(127, 370, 85, 21);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Listo");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField_6.getText();
				String text1 = textField_7.getText();
				String text2 = textField_8.getText();
				String text3 = textField_9.getText();
				if(text.contains("x<-3")||text.contains("x>-3")||text.contains("x<8/3")||text.contains("x>8/3") && 
						text1.contains("x<-3")||text1.contains("x>-3")||text1.contains("x<8/3")||text1.contains("x>8/3") &&
				text2.contains("x<-3")||text2.contains("x>-3")||text2.contains("x<8/3")||text2.contains("x>8/3") &&
				text3.contains("x<-3")||text3.contains("x>-3")||text3.contains("x<8/3")||text3.contains("x>8/3")) {
					Image icon = new ImageIcon(this.getClass().getResource("/check.jpg")).getImage();
					Image modificada = icon.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
					JLabel lbl = new JLabel();
					lbl.setIcon(new ImageIcon(modificada));
					JOptionPane.showMessageDialog(null, lbl);
					count++;
				}
				
				else {
					Image icon1 = new ImageIcon(this.getClass().getResource("/equis.jpg")).getImage();
					Image modificada = icon1.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
					JLabel lbl = new JLabel();
					lbl.setIcon(new ImageIcon(modificada));
					JOptionPane.showMessageDialog(null, lbl);
				}

			}
		});
		btnNewButton_2.setBounds(127, 525, 85, 21);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Listo");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField_10.getText();
				String text1 = textField_11.getText();
				if(text.contains("R")||text.contains("x>=-25/9") && text1.contains("R")||text1.contains("x>=-25/9")) {
					Image icon = new ImageIcon(this.getClass().getResource("/check.jpg")).getImage();
					Image modificada = icon.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
					JLabel lbl = new JLabel();
					lbl.setIcon(new ImageIcon(modificada));
					JOptionPane.showMessageDialog(null, lbl);
					count++;
				}
				
				else {
					Image icon1 = new ImageIcon(this.getClass().getResource("/equis.jpg")).getImage();
					Image modificada = icon1.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
					JLabel lbl = new JLabel();
					lbl.setIcon(new ImageIcon(modificada));
					JOptionPane.showMessageDialog(null, lbl);
				}
				
				
				
				
				
				
			}
		});
		btnNewButton_3.setBounds(450, 222, 85, 21);
		contentPane.add(btnNewButton_3);
		
		btnResultados = new JButton("Resultados");
		btnResultados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = count/4 * 100;
				JOptionPane.showMessageDialog(null, "Calificación: " + result,"Resultados", JOptionPane.INFORMATION_MESSAGE);

			}
			
			
			
		});
		btnResultados.setBounds(534, 450, 85, 21);
		contentPane.add(btnResultados);
		
		btnRegresar = new JButton("Regresar");
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rango r = new rango();
				r.setVisible(true);
				
				
			}
		});
		btnRegresar.setBounds(534, 486, 85, 21);
		contentPane.add(btnRegresar);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(47, 486, 121, 30);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(183, 486, 121, 30);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(364, 182, 121, 30);
		contentPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(498, 182, 121, 30);
		contentPane.add(textField_11);
	
	
	
	
	
	
	
	}
}