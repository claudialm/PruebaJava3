/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajava3;
import interfaces.interfaz;
import javax.swing.JFrame;

/*******************************************************************************
 *Claudia Veas M.
 * @author LAB03
 * Fecha: Noviembre 10 de 2017
 * Programa: PruebaJava3
 * Responsabilidad: Clase Principal
 */
public class PruebaJava3 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
         Interfaz w = new interfaz();
        w.setVisible(true);
        w.setBounds(0, 0, 400, 400);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
    }
    
}
