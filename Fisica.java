import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JButton;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Fisica extends JFrame {

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
	public Fisica() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 594, 471);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255)), "Temas de Fisica ", TitledBorder.LEADING, TitledBorder.TOP, null, Color.YELLOW));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		Image icon = new ImageIcon(this.getClass().getResource("image2.jpeg")).getImage();
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(icon));
		lblNewLabel.setBounds(10, 29, 209, 392);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(229, 11, 339, 410);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblFactorizacion = new JLabel("Conversi\u00F3n de unidades");
		lblFactorizacion.setForeground(Color.BLACK);
		lblFactorizacion.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 20));
		lblFactorizacion.setBounds(27, 11, 259, 39);
		panel.add(lblFactorizacion);
		
		Button btnVer = new Button("Ver");
		btnVer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Conversiones con=new Conversiones();
				con.setVisible(true);
				dispose();
				
			}
		});
		btnVer.setBounds(48, 56, 70, 22);
		panel.add(btnVer);
		
		JLabel lblDesigualdades = new JLabel("Vectores");
		lblDesigualdades.setForeground(Color.BLACK);
		lblDesigualdades.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 20));
		lblDesigualdades.setBounds(27, 84, 134, 39);
		panel.add(lblDesigualdades);
		
		Button btnVerDesigualdades = new Button("Ver");
		btnVerDesigualdades.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Vectores vec = new Vectores();
				vec.setVisible(true);
				dispose();
			}
		});
		btnVerDesigualdades.setBounds(48, 129, 70, 22);
		panel.add(btnVerDesigualdades);
		
		JLabel lblFuncionesLineales = new JLabel("Movimiento rectil\u00EDneo \r\nuniforme");
		lblFuncionesLineales.setForeground(Color.BLACK);
		lblFuncionesLineales.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 20));
		lblFuncionesLineales.setBounds(10, 157, 299, 39);
		panel.add(lblFuncionesLineales);
		
		Button btnVerFuncionesLineales = new Button("Ver");
		btnVerFuncionesLineales.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MRU mru = new MRU() ;
					mru.setVisible(true);
					dispose();
				}
			
		});
		btnVerFuncionesLineales.setBounds(48, 202, 70, 22);
		panel.add(btnVerFuncionesLineales);
		
		JButton btnNewButton = new JButton("Regresar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FMath fmath = new FMath();
				fmath.setVisible(true);
				dispose();
				
				
			}
		});
		btnNewButton.setBounds(244, 362, 85, 21);
		panel.add(btnNewButton);
	}
}
