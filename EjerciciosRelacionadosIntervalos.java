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
//importamos paquetes de erramientas que vamos a utilizar.


@SuppressWarnings("unused")
public class EjerciciosRelacionadosIntervalos extends JFrame {
	//creacion de clase ejerciciosrelacinadosRango

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	int count = 0;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
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
	public EjerciciosRelacionadosIntervalos() {
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
		textField.setBounds(76, 182, 121, 30);
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
		
		JLabel lblNewLabel_1_1_1 = new JLabel("c). {x/3<8}");
		lblNewLabel_1_1_1.setFont(new Font("Segoe UI Light", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_1_1_1.setBounds(39, 386, 187, 70);
		contentPane.add(lblNewLabel_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(69, 452, 137, 30);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("c). {2/3<x<2}");
		lblNewLabel_1_2.setFont(new Font("Segoe UI Light", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_1_2.setBounds(404, 115, 187, 70);
		contentPane.add(lblNewLabel_1_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(427, 182, 137, 30);
		contentPane.add(textField_4);
		
		btnNewButton = new JButton("Listo");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText();
				if(text.contains("(0,8)")) {
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
		btnNewButton.setBounds(76, 222, 121, 21);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Listo");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField_1.getText();
				if(text.contains("(0,1)")) {
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
		btnNewButton_1.setBounds(69, 355, 137, 21);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Listo");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField_2.getText();
				if(text.contains("x<24")) {
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
		btnNewButton_2.setBounds(69, 498, 136, 21);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Listo");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField_4.getText();
				if(text.contains("2/3<x<2")) {
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
		btnNewButton_3.setBounds(427, 222, 137, 21);
		contentPane.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("Resultado");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					int result = count/4 * 100;
					JOptionPane.showMessageDialog(null, "Calificación: " + result,"Resultados", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnNewButton_4.setBounds(457, 456, 85, 21);
		contentPane.add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("Regresar");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Intervalos inter = new Intervalos();
				inter.setVisible(true);
				dispose();
				
				
			}
		});
		btnNewButton_5.setBounds(457, 498, 85, 21);
		contentPane.add(btnNewButton_5);
	
	
	
	
	
	
	
	}
}
