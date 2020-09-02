import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.Font;
import java.awt.Button;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class FMath {

	private JFrame frmInicio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FMath window = new FMath();
					window.frmInicio.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FMath() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmInicio = new JFrame();
		frmInicio.getContentPane().setBackground(SystemColor.textHighlight);
		frmInicio.getContentPane().setLayout(null);
		
		Label lblTITULO = new Label("F'Math");
		lblTITULO.setForeground(Color.WHITE);
		lblTITULO.setFont(new Font("Segoe UI", Font.ITALIC, 48));
		lblTITULO.setAlignment(Label.CENTER);
		lblTITULO.setBounds(62, 61, 185, 72);
		frmInicio.getContentPane().add(lblTITULO);
		
		Button btnMatematica = new Button("Matematica");
		btnMatematica.setForeground(Color.WHITE);
		btnMatematica.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 15));
		btnMatematica.setBackground(SystemColor.textHighlight);
		btnMatematica.setBounds(26, 254, 124, 59);
		frmInicio.getContentPane().add(btnMatematica);
		
		Button btnFisica = new Button("Fisica");
		btnFisica.setForeground(Color.WHITE);
		btnFisica.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 15));
		btnFisica.setBackground(SystemColor.textHighlight);
		btnFisica.setBounds(155, 254, 124, 59);
		frmInicio.getContentPane().add(btnFisica);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Destructor X\\Downloads\\pngocean.com (2).png"));
		lblNewLabel.setBounds(95, 106, 163, 163);
		frmInicio.getContentPane().add(lblNewLabel);
		frmInicio.setBounds(100, 100, 321, 412);
		frmInicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
