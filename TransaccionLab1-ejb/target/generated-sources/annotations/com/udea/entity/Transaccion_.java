package com.udea.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-02-17T23:24:57")
@StaticMetamodel(Transaccion.class)
public class Transaccion_ { 

    public static volatile SingularAttribute<Transaccion, Integer> idTransaccion;
    public static volatile SingularAttribute<Transaccion, String> expiracionTarj;
    public static volatile SingularAttribute<Transaccion, String> tipoTarjeta;
    public static volatile SingularAttribute<Transaccion, String> idUsuario;
    public static volatile SingularAttribute<Transaccion, Double> valorPago;
    public static volatile SingularAttribute<Transaccion, String> nomUsuario;
    public static volatile SingularAttribute<Transaccion, String> emailUsuario;
    public static volatile SingularAttribute<Transaccion, String> numeroTarjeta;
    public static volatile SingularAttribute<Transaccion, String> csvTarjeta;
    public static volatile SingularAttribute<Transaccion, String> fechaPago;
    public static volatile SingularAttribute<Transaccion, String> refPago;

}