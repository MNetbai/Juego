package org.fesac.bd;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class ConexionBD {
	
	static private String usuario = "root";
	static private String password = "1234";

	private Connection con = null;
	
	// Constructor, establece conexion con la BD
	public ConexionBD() {
		
		try {
	
		    con = (Connection) DriverManager.getConnection(
		            "jdbc:mysql://localhost/juego?"
		            + "user="+usuario+"&password="+password);
	
		    // Otros y operaciones sobre la base de datos...
	
		} catch (SQLException ex) {
	
		    // Mantener el control sobre el tipo de error
		    System.out.println("SQLException: " + ex.getMessage());
	
		}
	}
	
	public void cerrarConexion(){
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void consultaMySQL(){
		
		ResultSet rs = null;
		Statement cmd = null;
		
		try {
			cmd = (Statement) con.createStatement();
		    rs = cmd.executeQuery("SELECT nombre, ciudad, puntos FROM equipo");
		    
		    while (rs.next()) {
		        String nombre = rs.getString("nombre");
		        String ciudad = rs.getString(2);
		        int puntos = rs.getInt(3); 
		        System.out.println(nombre + " - " + ciudad + " - " + puntos);
		    }

		    rs.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}