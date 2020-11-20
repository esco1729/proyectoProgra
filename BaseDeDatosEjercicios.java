import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;

public class BaseDeDatosEjercicios {
	
	public void Buscar() throws SQLException {
	Connection conecion=null;
	ArrayList<String> problemasDesigualdades = new ArrayList<String>();
	ArrayList<String> respuestasDesigualdades = new ArrayList<String>();
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		
		conecion= (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/fmathdatabase", "root", "nicollita7");
		
		String query = "SELECT * FROM ejerciciosdesigualdad";
		Statement stm =conecion.createStatement();
		ResultSet rs = stm.executeQuery(query);
		
		while(rs.next()) {
			String problema = rs.getString("problema");
			problemasDesigualdades.add(problema);
			String respuesta = rs.getString("respuesta");
			respuestasDesigualdades.add(respuesta);
			
			
		}
		
		for(String s: problemasDesigualdades) {
			System.out.println(s);
		}
		
		
		
	}catch(ClassNotFoundException ie) {
		JOptionPane.showMessageDialog(null, "Ocurrió un error de conexión");
	}
	
	
	
	}
	
	
	
	
	
	
	
	
	
}
