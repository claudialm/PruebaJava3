/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*******************************************************************************
 *Claudia Veas M.
 * @author LAB03
 * Fecha: Noviembre 10 de 2017
 * Programa: PruebaJava3
 * Responsabilidad: Clase Principal
 */
public class interfaz 
{
    private static interfaz inter;
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String USER = "root";
    private static final String PASS = "";
    private static final String URL = "jdbc:mysql://localhost:3306/PruebaJava3";

    public interfaz()
{
    inter = null;
 
     try
 {
        Class.forName(DRIVER);
            inter = DriverManager.getConnection(URL, USER, PASS);
            if (inter != null) 
            {
             System.out.println("Conexion Establecida");
            }
  }
        catch(ClassNotFoundException | SQLException e)
  {
         System.out.println("Error en la Conexion");
  }
}
    public Connection conectar()
    {
        return inter;  
    }
    
    public void desconectar()
    {
      inter=null;
        if (inter==null) 
        {
          System.out.println("Conexion Finalizada");

        }
        
        }



}


















