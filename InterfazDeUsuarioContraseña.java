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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
			InterfazDeUsuarioContraseña frame = new InterfazDeUsuarioContraseña();
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
		/*btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Connection conecion=null;
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					
					conecion= DriverManager.getConnection("jdbc:mysql://localhost:3306/fmathdatabase", "root", "Lolo1234");

					Statement stm = conecion.createStatement();
					
					PreparedStatement ps = conecion.prepareStatement("select * from usuarios");
					ResultSet rs = ps.executeQuery();
					
					boolean i=rs.next(),salir=false;

					
					while (i && !salir)
					{
						if(rs.getString(2).equals(txtUsuario.getText()) && rs.getString(3).equals(txtContra.getText())) {
							
							
							FMath window = new FMath();
							window.setVisible(true);
							
							System.out.println("¡Sesion iniciada con exito!");
							
							salir=true;
							
						}
						else {
							
							System.out.println("Usuario o contraseña incorrectos");
							salir=true;
						}
						
					}
					
				} catch (ClassNotFoundException e) {
					
					JOptionPane.showMessageDialog(null, "¡Error al cargar el controlador!");
					
					e.printStackTrace();
				}
				catch (SQLException e) {
					
					JOptionPane.showMessageDialog(null, "¡Error de Conexion!");
					
					e.printStackTrace();
					
				}
				
			}});*/
		
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

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource() == btnRegistrarse) {
				System.out.println("entre");
				inicio.conexionBaseDatosRegistrar(txtUsuario.getText(), String.valueOf(txtContra.getPassword()));
			}
			if (e.getSource() == btnIngresar) {
				inicio.conexionIngresar(txtUsuario.getText(), String.valueOf(txtContra.getPassword()));
			}
		}
		
	}
}
