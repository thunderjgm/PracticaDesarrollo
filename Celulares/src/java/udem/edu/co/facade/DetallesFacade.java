/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import udem.edu.co.entitys.Detalles;

/**
 *
 * @author Juan Jose
 */
@Stateless
public class DetallesFacade extends AbstractFacade<Detalles> {

    @PersistenceContext(unitName = "CelularesPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DetallesFacade() {
        super(Detalles.class);
    }
    
}
