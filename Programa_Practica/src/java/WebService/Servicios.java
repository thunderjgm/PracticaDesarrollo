
package WebService;

import Modelo.User;
import Modelo.UserDAO;
import java.util.List;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "Servicios")
public class Servicios {
    UserDAO dao=new UserDAO();
    
    
    @WebMethod(operationName = "Listar")
    public List<User> listar() {
        List datos=dao.listar();
        return datos;
    }
    
    @WebMethod(operationName = "agregar")
    public String agregar(@WebParam(name = "user") String user, @WebParam(name = "password") String password) {
        String datos=dao.add(user, password);
        return datos;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Actualizar")
    public String Actualizar(@WebParam(name = "id") int id, @WebParam(name = "user") String user, @WebParam(name = "password") String password) {
        String datos= dao.edit(id, user, password);
        return datos;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Eliminar")
    public User Eliminar(@WebParam(name = "id") int id) {
        User u=dao.delete(id);
        return u;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "listarID")
    public User listarID(@WebParam(name = "id") int id) {
        User user=dao.listarID(id);
        return user;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Ingresar")
    public boolean Ingresar(@WebParam(name = "user") String user, @WebParam(name = "password") String password) {
        boolean datos= dao.ingresar(user, password);
        return datos;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "cargar")
    @Oneway
    public void cargar() {
        dao.cargar();
    }


}
