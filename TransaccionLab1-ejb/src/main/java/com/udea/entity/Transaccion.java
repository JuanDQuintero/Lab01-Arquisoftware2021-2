/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author juand
 */
@Entity
@Table(name = "transaccion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Transaccion.findAll", query = "SELECT t FROM Transaccion t")
    , @NamedQuery(name = "Transaccion.findByIdTransaccion", query = "SELECT t FROM Transaccion t WHERE t.idTransaccion = :idTransaccion")
    , @NamedQuery(name = "Transaccion.findByIdUsuario", query = "SELECT t FROM Transaccion t WHERE t.idUsuario = :idUsuario")
    , @NamedQuery(name = "Transaccion.findByNomUsuario", query = "SELECT t FROM Transaccion t WHERE t.nomUsuario = :nomUsuario")
    , @NamedQuery(name = "Transaccion.findByEmailUsuario", query = "SELECT t FROM Transaccion t WHERE t.emailUsuario = :emailUsuario")
    , @NamedQuery(name = "Transaccion.findByNumeroTarjeta", query = "SELECT t FROM Transaccion t WHERE t.numeroTarjeta = :numeroTarjeta")
    , @NamedQuery(name = "Transaccion.findByCsvTarjeta", query = "SELECT t FROM Transaccion t WHERE t.csvTarjeta = :csvTarjeta")
    , @NamedQuery(name = "Transaccion.findByTipoTarjeta", query = "SELECT t FROM Transaccion t WHERE t.tipoTarjeta = :tipoTarjeta")
    , @NamedQuery(name = "Transaccion.findByExpiracionTarj", query = "SELECT t FROM Transaccion t WHERE t.expiracionTarj = :expiracionTarj")
    , @NamedQuery(name = "Transaccion.findByValorPago", query = "SELECT t FROM Transaccion t WHERE t.valorPago = :valorPago")
    , @NamedQuery(name = "Transaccion.findByFechaPago", query = "SELECT t FROM Transaccion t WHERE t.fechaPago = :fechaPago")
    , @NamedQuery(name = "Transaccion.findByRefPago", query = "SELECT t FROM Transaccion t WHERE t.refPago = :refPago")})
public class Transaccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_transaccion")
    private Integer idTransaccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "id_usuario")
    private String idUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "nom_usuario")
    private String nomUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "email_usuario")
    private String emailUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "numero_tarjeta")
    private String numeroTarjeta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "csv_tarjeta")
    private String csvTarjeta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "tipo_tarjeta")
    private String tipoTarjeta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "expiracion_tarj")
    private String expiracionTarj;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valor_pago")
    private double valorPago;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "fecha_pago")
    private String fechaPago;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "ref_pago")
    private String refPago;

    public Transaccion() {
    }

    public Transaccion(Integer idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public Transaccion(Integer idTransaccion, String idUsuario, String nomUsuario, String emailUsuario, String numeroTarjeta, String csvTarjeta, String tipoTarjeta, String expiracionTarj, double valorPago, String fechaPago, String refPago) {
        this.idTransaccion = idTransaccion;
        this.idUsuario = idUsuario;
        this.nomUsuario = nomUsuario;
        this.emailUsuario = emailUsuario;
        this.numeroTarjeta = numeroTarjeta;
        this.csvTarjeta = csvTarjeta;
        this.tipoTarjeta = tipoTarjeta;
        this.expiracionTarj = expiracionTarj;
        this.valorPago = valorPago;
        this.fechaPago = fechaPago;
        this.refPago = refPago;
    }

    public Integer getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(Integer idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNomUsuario() {
        return nomUsuario;
    }

    public void setNomUsuario(String nomUsuario) {
        this.nomUsuario = nomUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getCsvTarjeta() {
        return csvTarjeta;
    }

    public void setCsvTarjeta(String csvTarjeta) {
        this.csvTarjeta = csvTarjeta;
    }

    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    public String getExpiracionTarj() {
        return expiracionTarj;
    }

    public void setExpiracionTarj(String expiracionTarj) {
        this.expiracionTarj = expiracionTarj;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getRefPago() {
        return refPago;
    }

    public void setRefPago(String refPago) {
        this.refPago = refPago;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTransaccion != null ? idTransaccion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transaccion)) {
            return false;
        }
        Transaccion other = (Transaccion) object;
        if ((this.idTransaccion == null && other.idTransaccion != null) || (this.idTransaccion != null && !this.idTransaccion.equals(other.idTransaccion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.udea.entity.Transaccion[ idTransaccion=" + idTransaccion + " ]";
    }
    
}
