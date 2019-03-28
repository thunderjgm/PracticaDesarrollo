
package Servlet;

import Modelo.UserService;
import Modelo.MovilService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Controlador extends HttpServlet {

        private String add = "add.jsp";
        private String edit="edit.jsp";
        private String index="index.jsp";
        private String entra="menu.jsp";
        private String noroot="index_movil2.jsp";
        private String login="validacion.jsp";
        private String celulares="index_movil.jsp";
        private String acceso="";
    
        UserService user=new UserService();
        MovilService movil=new MovilService();
        
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String accion=request.getParameter("accion");
        
        if(accion.equals("add")){
            acceso=add;
        }
        else if(accion.equals("eliminar")){
            int id=Integer.parseInt(request.getParameter("id"));
            user.eliminar(id);
            acceso=index;
        }
        
        else if(accion.equals("Guardar")){
            String User=request.getParameter("txtuser");
            String Password=request.getParameter("txtpassword");
            user.agregar(User, Password);
            acceso=login;
        }
        else if(accion.endsWith("editar")){
            acceso=edit;
            request.setAttribute("iduser", request.getParameter("id"));
        }
        else if(accion.equals("Actualizar")){
            String User=request.getParameter("txtuser");
            String Password=request.getParameter("txtpassword");
            int id=Integer.parseInt(request.getParameter("txtid"));
            user.actualizar(id, User, Password);
            acceso=index;
        }
        else if(accion.equals("cargar")){
            user.cargar();
            acceso=index;
        }
        
        else if(accion.equalsIgnoreCase("mostrar")){
            acceso=celulares;
        }
        
        else if(accion.equals("Ingresar")){
            String User=request.getParameter("txtuser");
            String Password=request.getParameter("txtpassword");
            
            if(user.ingresar(User, Password)){
                
                HttpSession objsesion = request.getSession(true);
                objsesion.setAttribute("User", User);
                if(User.equals("root") && Password.equals("root")){
                    acceso=index;
                }else{
                    acceso=noroot;
                }             
                
            }else{
                acceso=login;
            }
        }
        
        
       RequestDispatcher dispatcher=request.getRequestDispatcher(acceso);
       dispatcher.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
