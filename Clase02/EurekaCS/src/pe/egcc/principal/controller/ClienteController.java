/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.principal.controller;

import pe.egcc.principal.dao.espc.DaoClienteEspec;

/**
 *
 * @author Alumno
 */
public class ClienteController {
      private DaoClienteEspec cliente;
    
    public ClienteController(){
        cliente=new DaoClienteImpl()
    }
    
    
    public List<Cliente> getClientes(Cliente bean){
        
        
    }
}
