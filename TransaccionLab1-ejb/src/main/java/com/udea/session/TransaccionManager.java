/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.session;

import com.udea.entity.Transaccion;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

/**
 *
 * @author juand
 */
@Stateless
public class TransaccionManager implements TransaccionManagerLocal {
    
    private EntityManager em;


    @Override
    public List<Transaccion> getAllTransacciones() {
        return null;
    }

 
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public Transaccion create(Transaccion trans) {
        return em.merge(trans);    
    }


    
}
