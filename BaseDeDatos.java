 
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;



public class BaseDeDatos {

	private String usuario;
	private String contrase�a;

	public BaseDeDatos() {

		usuario = "";
		contrase�a = "";

	}

	public void setUsuario(String usuario) {

		this.usuario = usuario;

	}

	public String getUsuario() {

		return usuario;

	}

	public void setContrase�a(String contrase�a) {

		this.contrase�a = contrase�a;

	}

	public String getContrase�a() {

		return contrase�a;

	}

	public void ingresarBaseDeDatos(String usuario, String Contrase�a) {

		ArrayList<String> usuario1 = new ArrayList<String>();
		usuario1.add(usuario);
		ArrayList<String> contrase�a = new ArrayList<String>();
		contrase�a.add(Contrase�a);
	}
	
	public Connection conexionBaseDatosRegistrar(String Usuario , String Contrase�a) {
		
		Connection conecion=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			conecion= DriverManager.getConnection("jdbc:mysql://localhost:3306/fmathdatabase", "root", "Lolo1234");
			
			
			String query="INSERT INTO usuarios (Usuario,Clave) values('"+Usuario+"','"+Contrase�a+"')";
			
			Statement stm =conecion.createStatement();
			
			stm.executeUpdate(query);
			
			JOptionPane.showMessageDialog(null, "�Tarea compleatada con exito!");
			
		} catch (ClassNotFoundException e) {
			
			JOptionPane.showMessageDialog(null, "�Error al cargar el controlador!");
			
			e.printStackTrace();
		}
		catch (SQLException e) {
			
			JOptionPane.showMessageDialog(null, "�Error de Conexion!");
			
			e.printStackTrace();
			
		}
		
		return conecion;
		
	}
	
	public Connection conexionIngresar(String Usuario , String Contrasenia) {
		

		Connection conecion=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			conecion= DriverManager.getConnection("jdbc:mysql://localhost:3306/fmathdatabase", "root", "");

			Statement stm =conecion.createStatement();
			
			PreparedStatement ps = conecion.prepareStatement("select * from usuarios where Usuario = '"+Usuario+"' and Clave = '"+Contrasenia+"'");
			ResultSet rs = ps.executeQuery();
			
			
			JOptionPane.showMessageDialog(null, "�Tarea compleatada con exito!");

			
		} catch (ClassNotFoundException e) {
			
			JOptionPane.showMessageDialog(null, "�Error al cargar el controlador!");
			
			e.printStackTrace();
		}
		catch (SQLException e) {
			
			JOptionPane.showMessageDialog(null, "�Error de Conexion!");
			
			e.printStackTrace();
			
		}
		return conecion;
		
		
	}


}
