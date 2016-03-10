/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.principal.util;

import java.awt.Component;
import javax.swing.JOptionPane;
import static oracle.sql.NUMBER.e;

/**
 *
 * @author Alumno
 */
public class Dialogo {
    
    private Dialogo(){
        
    }
    
    
    public static void error(Component parent,String message){
        
        JOptionPane.showMessageDialog(parent,message,"EUREKA ERROR",JOptionPane.ERROR_MESSAGE);
    }
    
      public static void info(Component parent,String message){
        
        //JOptionPane.showMessageDialog(parent,message,"EUREKA INFO",JOptionPane.INFORMATION_MESSAGE);
        //Dialogo.error(rootPane,e.getMessage());
      }
      
}


