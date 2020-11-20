import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.*;

import java.awt.Font;
import javax.swing.border.TitledBorder;


import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.sql.Connection;


public class InterfazDeUsuarioContraseña extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private BaseDeDatos inicio;
	private JFrame frmInicio;
	private JPasswordField txtContra;
	private	JButton btnRegistrarse;
	private JButton btnIngresar;
	private static InterfazDeUsuarioContraseña frame;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
			 frame = new InterfazDeUsuarioContraseña();
			frame.setVisible(true);
			
			}
		});
	}
	

	/**
	 * Create the frame.
	 */
	public InterfazDeUsuarioContraseña() {
		inicio=new BaseDeDatos();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 311, 452);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 128));
		panel.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255)), "Inicio", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(55, 195, 172, 31);
		panel.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		btnIngresar = new JButton("Ingresar");
		
		MiListener oyente = new MiListener();
		btnIngresar.addActionListener(oyente);
		btnIngresar.setBounds(17, 323, 116, 31);
		panel.add(btnIngresar);
		
		btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setBounds(160, 323, 116, 31);
		panel.add(btnRegistrarse);
		
	
		
		btnRegistrarse.addActionListener(oyente);		
		txtContra = new JPasswordField();
		txtContra.setBounds(55, 257, 172, 31);
		panel.add(txtContra);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Destructor X\\Downloads\\pngocean.com (5).png"));
		lblNewLabel.setBounds(0, 79, 285, 347);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Destructor X\\Downloads\\pngocean.com (7).png"));
		lblNewLabel_1.setBounds(0, 11, 137, 100);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("INICIAR SESI\u00D3N");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.ITALIC, 22));
		lblNewLabel_2.setBounds(109, 35, 166, 45);
		panel.add(lblNewLabel_2);
		
		
		
	}
	private class MiListener implements ActionListener{
		int continuar = 0;
		@Override
		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == btnRegistrarse) {
				inicio.conexionBaseDatosRegistrar(txtUsuario.getText(), String.valueOf(txtContra.getPassword()));
				continuar = 0;
			}
			if (e.getSource() == btnIngresar) {
				
				Connection conecion=null;
				Statement stm=null;
				ResultSet rs=null;
				String dato="";
				String contra="";
				
				try {
					
				conecion=inicio.conexion();
				stm=conecion.createStatement();
				rs=stm.executeQuery("SELECT * FROM usuarios");
				
				while(rs.next()) {
					
					dato=rs.getString(2);
					contra=rs.getString(3);
					
					if(dato.equals(txtUsuario.getText()) && contra.equals(String.valueOf(txtContra.getText()))) {
						
						continuar=1;
						
					}
					
				}
				
				
				}catch(SQLException u) {
					
					u.printStackTrace();
					
					
				}
				
			}
		
			
			if(continuar == 1) {
				
				FMath math=new FMath();
				math.setVisible(true);
				frame.setVisible(false);
			}
			else {
				
				JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrecta");
				
			}
			
			
		}
		
	}
}
