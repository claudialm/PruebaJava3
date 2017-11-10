/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;
import javax.swing.*;
import java.awt.*;

import interfaces.conexionBD3;
import java.sql.Connection;
import java.awt.event.*;
/*******************************************************************************
 *Claudia Veas M.
 * @author LAB03
 * Fecha: Noviembre 10 de 2017
 * Programa: PruebaJava3
 * Responsabilidad: Clase Principal
 */
public class conexionBD3 extends JFrame
{
    JPanel panel;
    JLabel label;
    JTextField text;
    JButton boton;
    JButton boton2;

    conexionBD3 con;

     public conexionBD3()
    {
        panel = new JPanel();
        label = new JLabel();
        text = new JTextField(30);
        boton = new JButton();
        boton2 = new JButton();
        
        
        this.add(panel);
        panel.add(label);
        panel.add(text);
        panel.add(boton);
        panel.add(boton2);
        
        
        label.setText("Tercera Evaluacion Sumativa");
        label.setText("Base de Datos");
        boton.setText("Conectar");
        boton2.setText("Desconectar");
        panel.setBackground(Color.blue);
    
       
        boton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
              con = new conexionBD3();
              Connection reg = con.conectar();
            }
        });
        
        boton2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
               con.desconectar();
            }
        });



    }






}
