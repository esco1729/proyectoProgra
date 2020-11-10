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

public class EjerciciosVectores extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	int count = 0; 
	private JTextField textField_3;
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
	public EjerciciosVectores() {
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
		txtpnFactorComn.setText("a). Un vector AB tiene componentes (5,-2). Hallar las coordenadas de (A) si se conoce el extremo B=(12,-3).");
		txtpnFactorComn.setBounds(39, 88, 386, 47);
		contentPane.add(txtpnFactorComn);
		

		
		JTextPane txtpnIRespondaA = new JTextPane();
		txtpnIRespondaA.setText("i. Resuelva los siguientes problemas");
		txtpnIRespondaA.setForeground(Color.WHITE);
		txtpnIRespondaA.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 16));
		txtpnIRespondaA.setEditable(false);
		txtpnIRespondaA.setBackground(SystemColor.textHighlight);
		txtpnIRespondaA.setBounds(29, 42, 377, 58);
		contentPane.add(txtpnIRespondaA);
		
		JTextPane txtpnB = new JTextPane();
		txtpnB.setText("b). Calcular la distancia entre los puntos A=(2,1) y B=(-3,2).");
		txtpnB.setForeground(Color.WHITE);
		txtpnB.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 14));
		txtpnB.setEditable(false);
		txtpnB.setBackground(SystemColor.textHighlight);
		txtpnB.setBounds(39, 219, 260, 50);
		contentPane.add(txtpnB);
		

		textField = new JTextField();
		textField.setBounds(75, 145, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		JButton btnNewButton = new JButton("Listo");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText();
				if(text.contains("(7,-1)")) {
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
		textField_2.setBounds(75, 279, 96, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		
		JButton btnNewButton_1 = new JButton("Listo");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField_2.getText();
				if(text.contains("5.099")){
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
		btnNewButton_1.setBounds(76, 308, 95, 21);
		contentPane.add(btnNewButton_1);
		
		JTextPane txtpnCx = new JTextPane();
		txtpnCx.setText("c). Hallar las coordenadas del punto medio del segmento AB, de extremos A=(3,9) y B=(-1,5).");
		txtpnCx.setForeground(Color.WHITE);
		txtpnCx.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 14));
		txtpnCx.setEditable(false);
		txtpnCx.setBackground(SystemColor.textHighlight);
		txtpnCx.setBounds(39, 348, 306, 46);
		contentPane.add(txtpnCx);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(75, 404, 96, 19);
		contentPane.add(textField_3);
		
		JButton btnNewButton_1_1 = new JButton("Listo");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField_3.getText();
				if(text.contains("(1,7)")){
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
		btnNewButton_1_1.setBounds(75, 433, 95, 21);
		contentPane.add(btnNewButton_1_1);
		
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
				
				Vectores vec = new Vectores();
				vec.setVisible(true);
				
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_3.setBounds(266, 514, 159, 34);
		contentPane.add(btnNewButton_3);
		
		JTextPane txtpnY = new JTextPane();
		txtpnY.setText("B =");
		txtpnY.setForeground(Color.WHITE);
		txtpnY.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 14));
		txtpnY.setEditable(false);
		txtpnY.setBackground(SystemColor.textHighlight);
		txtpnY.setBounds(39, 140, 33, 34);
		contentPane.add(txtpnY);
		


	}
}