/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.principal.dao.espc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import pe.egcc.eurekacs.domain.Cliente;
import pe.egcc.principal.db.AccesoDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Alumno
 */
public class DaoClienteImpl implements DaoClienteEspec{

    
    
    
    
    @Override
    public Cliente readForId(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cliente> readAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cliente> readForCriteria(Cliente bean) {
    
       List<Cliente> lista=new ArrayList<>();
       
        
        Connection cn=null;
     try{
         cn=AccesoDB.getConnection();
         String sql="select chr_xliecodigo,vch_cliepaterno,vch_cliematerno,\n" +
"vch_clienombre,chr_cliedni,vch_clieciudad,\n" +
"vch_cliedireccion,vch_clietelefono,vch_clieemail\n" +
"from cliente\n" +
"where vch_cliepaterno like ?\n" +
"and vch_cliematerno like ?\n" +
"and vch_clienombre like ?";
         
         PreparedStatement pstm=cn.prepareStatement(sql);
         pstm.setString(1,bean.getPaterno()+"%");
         pstm.setString(2,bean.getMaterno()+"%");
         pstm.setString(3,bean.getNombre()+"%");
         
         ResultSet rs=pstm.executeQuery();
         while(rs.next()){
             
             Cliente cliente=getBean(rs);
             lista.add(cliente);
             
         }
         
         rs.close();
         pstm.close();
         
         
        
             
     }catch(SQLException e){
         throw new RuntimeException(e.getMessage());
     }catch(Exception e){
         String mensaje="Se ha producido un error,intentelo mas tarde";
         if(e.getMessage()!=null && !e.getMessage().isEmpty()){
             mensaje+=(""+e.getMessage());
         }
         throw new RuntimeException(mensaje);
     }finally{
         try{
            cn.close();
             
         }catch(Exception e){
             
         }
     }
     
     return cliente;
    }

    @Override
    public void insert(Cliente bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Cliente bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private Cliente getBean(ResultSet rs){
        Cliente bean=new Cliente();
        bean.setCodigo(rs.getString(""));
        bean.setPaterno(rs.getString(""));
        bean.setMaterno(rs.getString(""));
        bean.setNombre(rs.getString(""));
        bean.setCodigo(rs.getString(""));
        bean.setCodigo(rs.getString(""));
        bean.setCodigo(rs.getString(""));
        bean.setCodigo(rs.getString(""));
        bean.setCodigo(rs.getString(""));
        
        return bean;
        
    }
}
