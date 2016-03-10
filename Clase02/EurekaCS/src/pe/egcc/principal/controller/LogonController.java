/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.principal.controller;

import pe.egcc.eurekacs.domain.Empleado;
import pe.egcc.principal.service.LogonService;
import pe.egcc.principal.util.Memoria;

/**
 *
 * @author Alumno
 */
public class LogonController {
    
    public void validar(String usuario,String clave)
    {
        LogonService service=new LogonService();
        Empleado empleado=service.validar(usuario,clave);
        if(empleado==null){
            throw new RuntimeException("DATOS INCORRECTOS");
        }else{
            Memoria.put("usuario",empleado);
            
        }
    }
    
}
