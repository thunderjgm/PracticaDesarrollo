/*
 La aplicación WEB que se desarrolló está basada en servicios WEB. Esta aplicación cuenta con 2 roles, administrados y usuario.
 El administrador puede realizar todos los servicios prestados por el CRUD de la aplicación.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDAO implements CRUD{

    private PreparedStatement ps;
    private ResultSet rs;
    private Connection con;
    private Conexion conex=new Conexion();
    private int res;
    private String msj;
    private boolean estado;
    User user= new User();
    
    @Override
    public List listar() {
        List<User> datos=new ArrayList<>();
        String sql="select * from login";
            try{
                con=conex.getConnection();
                ps=con.prepareStatement(sql);
                rs=ps.executeQuery();
                while(rs.next()){
                    
                    User u=new User();
                    u.setIdUser(rs.getInt("idlogin"));
                    u.setUser(rs.getString("user"));
                    u.setPassword(rs.getString("password"));
                    datos.add(u);
                }
            }catch(Exception e){
            }
            return datos;
    }

    @Override
    public User listarID(int id) {
        String sql="select * from login where idlogin="+id;
            try{
                con=conex.getConnection();
                ps=con.prepareStatement(sql);
                rs=ps.executeQuery();
                while(rs.next()){

                    user.setIdUser(rs.getInt("idlogin"));
                    user.setUser(rs.getString("user"));
                    user.setPassword(rs.getString("password"));
                }
            }catch(Exception e){
            }
            return user;
    }

    @Override
    public String add(String user, String contraseña) {
        String sql="insert into login(user, password)values(?,?)";
        try{
           con=conex.getConnection();
           ps=con.prepareStatement(sql);
           ps.setString(1, user);
           ps.setString(2, contraseña);
           res=ps.executeUpdate();
           if(res==1){
               msj="Ususario agregado";
           }else{
               msj="ERROR";   
           }
        }catch (Exception e){
        }
        return msj;
    }

    @Override
    public String edit(int id, String User, String Password) {
        String sql="update login set user=?,password=? where idlogin="+id;
        try{
           con=conex.getConnection();
           ps=con.prepareStatement(sql);
           ps.setString(1, User);
           ps.setString(2, Password);
           res=ps.executeUpdate();
           if(res==1){
               msj="Ususario agregado";
           }else{
               msj="ERROR";   
           }
        }catch (Exception e){
        }
        return msj;
    }

    @Override
    public User delete(int id) {
        String sql="delete from login where idlogin="+id;
        try{
           con=conex.getConnection();
           ps=con.prepareStatement(sql);
           res=ps.executeUpdate();
           }catch (Exception e){
        }
        return user;
    }

    @Override
    public boolean ingresar(String user, String contraseña) {
        String sql="select * from login where user = ? and password = ?";
        try{
           con=conex.getConnection();
           ps=con.prepareStatement(sql);
           ps.setString(1, user);
           ps.setString(2, contraseña);
           rs=ps.executeQuery();
           if(rs.absolute(1)){
               estado=true;
           }else{
               estado=false;
           }
        }catch (Exception e){
        }
//        finally{
//            try {
//                if(conex.getConnection()!=null) conex.getConnection().close();
//                if(ps != null) ps.close();
//                if(rs !=null) rs.close();
//            } catch (Exception e) {
//            }
//        }
        return estado;
    }

    @Override
    public void cargar(){
        String cleandb = "truncate table login";      
        try{
                con=conex.getConnection();
                ps=con.prepareStatement(cleandb);
                res=ps.executeUpdate();
                
            }catch(Exception e){
            }
        String LoadCSV = "LOAD DATA INFILE 'csv.csv'\n" +
        "INTO TABLE login\n" +
        "FIELDS TERMINATED BY ';'\n" +
        "OPTIONALLY ENCLOSED BY '\"'\n" +
        "LINES TERMINATED BY '\\r\\n'\n" +
        "IGNORE 1 ROWS;";
        try{
                ps=con.prepareStatement(LoadCSV);
                rs=ps.executeQuery();
                
            }catch(Exception e){
            }            
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
