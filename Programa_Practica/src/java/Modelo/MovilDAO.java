
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MovilDAO implements CRUD{
    private PreparedStatement ps;
    private ResultSet rs;
    private Connection con;
    private Conexion conex=new Conexion();
    private int res;
    private String msj;
    private boolean estado;
    Movil movil = new Movil();

    @Override
    public List listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String add(String user, String contraseña) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String edit(int id, String user, String contraseña) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean ingresar(String user, String contraseña) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cargar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User listarID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List listarM() {
        List<Movil> datos=new ArrayList<>();
        String sql="select * from marca";
            try{
                con=conex.getConnection();
                ps=con.prepareStatement(sql);
                rs=ps.executeQuery();
                while(rs.next()){
                    
                    Movil m=new Movil();
                    m.setIdMarca(rs.getInt("idmarca"));
                    m.setNombre(rs.getString("nombre"));
                    datos.add(m);
                }
            }catch(Exception e){
            }
            return datos;
    }

    @Override
    public Movil listarIDM(int idMarca) {
        String sql="select * from marca where idmarca="+idMarca;
            try{
                con=conex.getConnection();
                ps=con.prepareStatement(sql);
                rs=ps.executeQuery();
                while(rs.next()){

                    movil.setIdMarca(rs.getInt("idmarca"));
                    movil.setNombre(rs.getString("nombre"));                    
                }
            }catch(Exception e){
            }
            return movil;
    }

    
    
    
}
