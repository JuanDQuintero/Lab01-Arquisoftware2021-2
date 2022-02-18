/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.controller;

import com.udea.entity.Transaccion;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author juand
 */
public class TransaccionMBean {

    @EJB
    private com.udea.session.TransaccionManagerLocal transaccionManager;
    
    private Transaccion transaccion; //para mostrar, actualizar o insertar en el formulario
    private List<Transaccion> transacciones; //para visualizar en la tabla



    public List<Transaccion> getTransacciones() {
        if ((transacciones == null) || (transacciones.isEmpty())) {
            refresh();
        }
        return transacciones;
    }

    public String list() {
        transacciones = transaccionManager.getAllTransacciones();
        return "LIST";
    }

    public String index() {
        return "index";
    }
    public String transac() {
        return "transaccion";
    }
    
    private void refresh() {
        transacciones = transaccionManager.getAllTransacciones();
    }

    public com.udea.session.TransaccionManagerLocal getTransaccionManager() {
        return transaccionManager;
    }

    public void setTransaccionManager(com.udea.session.TransaccionManagerLocal transaccionManager) {
        this.transaccionManager = transaccionManager;
    }

    public Transaccion getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(Transaccion transaccion) {
        this.transaccion = transaccion;
    }



    
}
