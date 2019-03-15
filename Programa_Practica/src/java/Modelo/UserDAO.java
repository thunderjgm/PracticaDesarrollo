/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDAO implements CRUD{

    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conex=new Conexion();
    int res;
    String msj;
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
                    u.setIDUser(rs.getInt("idlogin"));
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

                    user.setIDUser(rs.getInt("idlogin"));
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
    
    
    
}
