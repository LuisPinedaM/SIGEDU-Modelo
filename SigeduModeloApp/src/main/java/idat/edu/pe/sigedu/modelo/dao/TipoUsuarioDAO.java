/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idat.edu.pe.sigedu.modelo.dao;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import sun.util.logging.PlatformLogger;

/**
 *
 * @author Administrador
 */
public class TipoUsuarioDAO implements DAOBaseI<TipoUsuario, Integer>{
    
    private JDBCUtil jdbc;

    public TipoUsuarioDAO(JDBCUtil jdbc) {
        this.jdbc = jdbc;
    }
    
    @Override
    publc List<TipoUsuario> buscarTodo() {
        String sql = "SELECT id,descripcion as dec FROM tipousuario;";
            PreparedStatement pStament = jdbc.obtenerPreparedStatement (sql);
            ResusltSet rs = jdbc.ejecutarConsulta(pStament);
            List<TipoUsuario> resultado = new ArrayList<TipoUsuario>();
            TipoUsuario objEncontrado = null;
            
            try {
                while (rs.Next()) {
                    objEncontrado = new TipoUsuario();
                    objEncontrado.setId(rs.getInt("id"));
                    objEncontrado.setDescripcion(rs.getString("dec"));
                    resultado.add(objEncontrado);
            }
            } catch (SQLException ex) {
                Logger.getLogger(TipoUsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            return resultado;
    }
}
