/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.principal.service;

/**
 *
 * @author Alumno
 */
import pe.egcc.eurekacs.domain.Empleado;
import pe.egcc.principal.dao.espc.DaoEmpleadoEspec;
import pe.egcc.principal.dao.espc.DaoEmpleadoImpl;
//resuelve problemas 

public class LogonService {
    
    
    public Empleado validar(String usuario,String clave){
        Empleado bean;
        /*if(usuario.equals("gustavo")){
            bean=new Empleado();
            
        }
        return new Empleado();*/
        
        
        DaoEmpleadoEspec dao=new DaoEmpleadoImpl();
        bean=dao.validar(usuario,clave);
        
        return bean;
    }
}
