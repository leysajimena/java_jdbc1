/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.principal.service;

import java.util.List;
import pe.egcc.eurekacs.domain.Cliente;
import pe.egcc.principal.dao.espc.DaoClienteEspec;

/**
 *
 * @author Alumno
 */
public class ClienteService {
    
    private DaoClienteEspec dao;
    
    public ClienteService(){
        dao=new DaoClienteImpl()
    }
    
    
    public List<Cliente> getClientes(Cliente bean){
        
        
    }
}
