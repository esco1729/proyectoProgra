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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class EjerciciosConversiones extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	int count = 0; 
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_7;
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
	public EjerciciosConversiones() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 871, 602);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnFactorComn = new JTextPane();
		txtpnFactorComn.setEditable(false);
		txtpnFactorComn.setForeground(Color.WHITE);
		txtpnFactorComn.setBackground(SystemColor.textHighlight);
		txtpnFactorComn.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 14));
		txtpnFactorComn.setText("a). Convertir 3 kg a lb.");
		txtpnFactorComn.setBounds(39, 101, 228, 34);
		contentPane.add(txtpnFactorComn);
		

		
		JTextPane txtpnIRespondaA = new JTextPane();
		txtpnIRespondaA.setText("i. Resuelva las siguientes factorizaciones");
		txtpnIRespondaA.setForeground(Color.WHITE);
		txtpnIRespondaA.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 16));
		txtpnIRespondaA.setEditable(false);
		txtpnIRespondaA.setBackground(SystemColor.textHighlight);
		txtpnIRespondaA.setBounds(29, 42, 377, 58);
		contentPane.add(txtpnIRespondaA);
		
		JTextPane txtpnB = new JTextPane();
		txtpnB.setText("b). Convertir 5 lb a kg");
		txtpnB.setForeground(Color.WHITE);
		txtpnB.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 14));
		txtpnB.setEditable(false);
		txtpnB.setBackground(SystemColor.textHighlight);
		txtpnB.setBounds(39, 219, 185, 34);
		contentPane.add(txtpnB);
		

		textField = new JTextField();
		textField.setBounds(75, 145, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		JButton btnNewButton = new JButton("Listo");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText();
				if(text.contains("6605") && text.contains("lb")) {
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
		btnNewButton.setBounds(75, 174, 95, 21);
		contentPane.add(btnNewButton);
		
		textField_2 = new JTextField();
		textField_2.setBounds(75, 260, 96, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		
		JButton btnNewButton_1 = new JButton("Listo");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField_2.getText();
				if(text.contains("2268")){
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
		btnNewButton_1.setBounds(76, 289, 95, 21);
		contentPane.add(btnNewButton_1);
		
		JTextPane txtpnCx = new JTextPane();
		txtpnCx.setText("c). Convertir 2 pies a metros");
		txtpnCx.setForeground(Color.WHITE);
		txtpnCx.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 14));
		txtpnCx.setEditable(false);
		txtpnCx.setBackground(SystemColor.textHighlight);
		txtpnCx.setBounds(39, 348, 185, 34);
		contentPane.add(txtpnCx);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(75, 392, 96, 19);
		contentPane.add(textField_3);
		
		JButton btnNewButton_1_1 = new JButton("Listo");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField_3.getText();
				if(text.contains("0.6096")){
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
		btnNewButton_1_1.setBounds(75, 421, 95, 21);
		contentPane.add(btnNewButton_1_1);
		
		JTextPane txtpnDx = new JTextPane();
		txtpnDx.setText("d). Convertir 5 millas a metros");
		txtpnDx.setForeground(Color.WHITE);
		txtpnDx.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 14));
		txtpnDx.setEditable(false);
		txtpnDx.setBackground(SystemColor.textHighlight);
		txtpnDx.setBounds(466, 101, 209, 34);
		contentPane.add(txtpnDx);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(504, 145, 96, 19);
		contentPane.add(textField_4);
		
		JButton btnNewButton_2 = new JButton("Listo");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField_4.getText();
				if(text.contains("8046.72")){
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
		btnNewButton_2.setBounds(505, 174, 95, 21);
		contentPane.add(btnNewButton_2);
		
		JTextPane txtpnB_1 = new JTextPane();
		txtpnB_1.setText("e). Convertir 3 horas a segundos");
		txtpnB_1.setForeground(Color.WHITE);
		txtpnB_1.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 14));
		txtpnB_1.setEditable(false);
		txtpnB_1.setBackground(SystemColor.textHighlight);
		txtpnB_1.setBounds(466, 219, 221, 34);
		contentPane.add(txtpnB_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(504, 260, 96, 19);
		contentPane.add(textField_5);
		
		JButton btnNewButton_2_1 = new JButton("Listo");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField_5.getText();
				if(text.contains("10800")){
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
		btnNewButton_2_1.setBounds(504, 288, 95, 21);
		contentPane.add(btnNewButton_2_1);
		
		JTextPane txtpnB_1_1 = new JTextPane();
		txtpnB_1_1.setText("f). Convertir 5 kg a g");
		txtpnB_1_1.setForeground(Color.WHITE);
		txtpnB_1_1.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 14));
		txtpnB_1_1.setEditable(false);
		txtpnB_1_1.setBackground(SystemColor.textHighlight);
		txtpnB_1_1.setBounds(466, 348, 185, 34);
		contentPane.add(txtpnB_1_1);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(504, 392, 96, 19);
		contentPane.add(textField_7);
		
		JButton btnNewButton_2_1_1 = new JButton("Listo");
		btnNewButton_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text1 = textField_7.getText();
				if(text1.contains("5000")){
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
		btnNewButton_2_1_1.setBounds(504, 421, 95, 21);
		contentPane.add(btnNewButton_2_1_1);
		
		JButton btnEjercicios = new JButton("Resultados");
		btnEjercicios.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnEjercicios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = count/6 * 100;
				JOptionPane.showMessageDialog(null, "Calificaci�n: " + result,"Resultados", JOptionPane.INFORMATION_MESSAGE);
				
				
			}
		});
		btnEjercicios.setBounds(266, 470, 159, 34);
		contentPane.add(btnEjercicios);
		
		JButton btnNewButton_3 = new JButton("Regresar");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Factorizacion fact = new Factorizacion();
				fact.setVisible(true);
				
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_3.setBounds(266, 514, 159, 34);
		contentPane.add(btnNewButton_3);
		


	}
}