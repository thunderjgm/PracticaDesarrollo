
package Modelo;

import java.util.List;

public interface CRUD {
    
    public List listar();
    public User listarID(int id);
    public String add(String user, String contraseña);
    public String edit(int id, String user, String contraseña);
    public User delete(int id);
    public boolean ingresar(String user, String contraseña);
    public void cargar();
}
