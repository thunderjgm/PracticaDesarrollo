
package Modelo;

import webservice.Movil;


public class MovilService {

    public MovilService() {
        
    }
    
    public java.util.List<webservice.Movil> listarM() {
        webservice.Servicios_Service service = new webservice.Servicios_Service();
        webservice.Servicios port = service.getServiciosPort();
        return port.listarM();
    }
    
    public Movil listarIDMarca(int idMarca) {
        webservice.Servicios_Service service = new webservice.Servicios_Service();
        webservice.Servicios port = service.getServiciosPort();
        return port.listarIDMarca(idMarca);
    }
}
