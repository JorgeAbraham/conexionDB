/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;
import java.sql.*;
import javax.swing.JOptionPane;



/**
 *
 * @author Diana
 */
public class conexionBD 
{
    private datosBD Datos=new datosBD();
    
    public Connection getConnection(String NombreBD)
    {
        
        
    	Connection conn = null;
    	try 
    	{
           
            Class.forName(Datos.getDriverBD());
            conn = DriverManager.getConnection(Datos.getDbURL()+NombreBD, Datos.getDbUserName(),Datos.getDbPassword());
            System.out.println("Conexion exitosa a: "+NombreBD);
      	}
    	catch (ClassNotFoundException | SQLException e) 
    	{
      		JOptionPane.showMessageDialog(null,"Could not connect to DB: " + e.getMessage());
      	}
        
        return conn;
    }
	
    
    public Connection getConnection(datosBD Datos,String NombreBD)
    {
        
        
    	Connection conn = null;
    	try 
    	{
           
            Class.forName(Datos.getDriverBD());
            conn = DriverManager.getConnection(Datos.getDbURL()+NombreBD+"?autoReconnect=true", Datos.getDbUserName(),Datos.getDbPassword());
            System.out.println("Conexion exitosa a: "+NombreBD);
      	}
    	catch (ClassNotFoundException | SQLException e) 
    	{
      		JOptionPane.showMessageDialog(null,"Could not connect to DB: " + e.getMessage());
      	}
        
        return conn;
    }
    
    
	public void putConnection(Connection conn) 
	{
		if (conn != null) 
		{
			try 
			{ 
				conn.close(); 
			}
			catch (SQLException e) {  JOptionPane.showMessageDialog(null, e.getMessage()); }
		}
	
	}
        
    
}
