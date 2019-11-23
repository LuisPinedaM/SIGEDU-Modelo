/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idat.edu.pe.sigedu.modelo.dao;

import java.util.List;
/**
 *
 * @author Administrador
 */
public interface DAOBaseI<T,ID> {
    
    List<T> buscarTodo();
    T buscarPorId(ID id);
    void crear(T object);
    void actualizar(T object);
    void borrar(ID id);
        
}
