/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.principal.dao.espc;

import java.util.List;

/**
 *
 * @author Alumno
 */
public interface DaoCrudEspec<T> {
    
    T readForId(String codigo);
    List<T> readAll();
    List<T> readForCriteria(T bean);
    
    
    void insert(T bean);
    void update(T bean);
    void delete(String codigo);
    
}
