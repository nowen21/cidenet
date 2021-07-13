/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primefeces.app.modelos;

import com.primefeces.app.Anotaciones.CedulaAnotacion;
import com.primefeces.app.Anotaciones.SinenieAnotacion;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author NOWEN
 */
@Entity

public class Usuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer idxxxxxx;
    @Basic(optional = false)
    @SinenieAnotacion
    @Column(name = "primnomb")
    private String primnomb;
    @Basic(optional = false)
    @SinenieAnotacion
    @Column(name = "segunomb")
    private String segunomb;
    @Basic(optional = false)
    @SinenieAnotacion
    @Column(name = "primapel")
    private String primapel;
    @SinenieAnotacion
    @Basic(optional = false)
    @Column(name = "seguapel")
    private String seguapel;
    @Basic(optional = false)
    @SinenieAnotacion
    @Column(name = "otronomb")
    private String otronomb;
    @Basic(optional = false)
    @CedulaAnotacion
    @Column(name = "cedulaxx")
    private String cedulaxx;
    @Basic(optional = false)
    @Column(name = "fechingr")
    @Temporal(TemporalType.DATE)
    private Date fechingr;
    @Column(name = "fhregist")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fhregist;
    @Basic(optional = false)
    private Integer areaid;
    @Basic(optional = false)
    private Integer doctipoid;
    @Basic(optional = false)
    private Integer estadoid;
    @Basic(optional = false)
    private Integer paiseid;
    @JoinColumn(name = "emailid", referencedColumnName = "idxxxxxx")
    @ManyToOne(optional = false)
    private Emails emailid;

    public Emails getEmailid() {
        return emailid;
    }

    public void setEmailid(Emails emailid) {
        this.emailid = emailid;
    }

    public Usuarios() {
        this.estadoid = 1;
        this.fhregist = new Date();
    }

    public Usuarios(Integer idxxxxxx) {
        this.idxxxxxx = idxxxxxx;
    }

    public Usuarios(String primnomb, String segunomb, String primapel, String seguapel, String otronomb, String cedulaxx, Emails emailid, Date fechingr) {
        this.primnomb = primnomb;
        this.segunomb = segunomb;
        this.primapel = primapel;
        this.seguapel = seguapel;
        this.otronomb = otronomb;
        this.cedulaxx = cedulaxx;
        this.emailid = emailid;
        this.fechingr = fechingr;
    }

    public Integer getIdxxxxxx() {
        return idxxxxxx;
    }

    public void setIdxxxxxx(Integer idxxxxxx) {
        this.idxxxxxx = idxxxxxx;
    }

    public String getPrimnomb() {
        return primnomb;
    }

    public void setPrimnomb(String primnomb) {
        this.primnomb = primnomb;
    }

    public String getSegunomb() {
        return segunomb;
    }

    public void setSegunomb(String segunomb) {
        this.segunomb = segunomb;
    }

    public String getPrimapel() {
        return primapel;
    }

    public void setPrimapel(String primapel) {
        this.primapel = primapel;
    }

    public String getSeguapel() {
        return seguapel;
    }

    public void setSeguapel(String seguapel) {
        this.seguapel = seguapel;
    }

    public String getOtronomb() {
        return otronomb;
    }

    public void setOtronomb(String otronomb) {
        this.otronomb = otronomb;
    }

    public String getCedulaxx() {
        return cedulaxx;
    }

    public void setCedulaxx(String cedulaxx) {
        this.cedulaxx = cedulaxx;
    }

    public void setFechingr(Date fechingr) {
        this.fechingr = fechingr;
    }

    public Date getFechingr() {
        return fechingr;
    }

    public Date getFhregist() {
        return fhregist;
    }

    public void setFhregist(Date fhregist) {
        this.fhregist = fhregist;
    }

    public Integer getAreaid() {
        return areaid;
    }

    public void setAreaid(Integer areaid) {
        this.areaid = areaid;
    }

    public Integer getDoctipoid() {
        return doctipoid;
    }

    public void setDoctipoid(Integer doctipoid) {
        this.doctipoid = doctipoid;
    }

    public Integer getEstadoid() {
        return estadoid;
    }

    public void setEstadoId(Integer estadoid) {
        this.estadoid = estadoid;
    }

    public Integer getPaiseid() {
        return paiseid;
    }

    public void setPaiseid(Integer paiseid) {
        this.paiseid = paiseid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idxxxxxx != null ? idxxxxxx.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuarios)) {
            return false;
        }
        Usuarios other = (Usuarios) object;
        if ((this.idxxxxxx == null && other.idxxxxxx != null) || (this.idxxxxxx != null && !this.idxxxxxx.equals(other.idxxxxxx))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "idxxxxxx=" + idxxxxxx + ", primnomb=" + primnomb + ", segunomb=" + segunomb + ", primapel=" + primapel + ", seguapel=" + seguapel + ", otronomb=" + otronomb + ", cedulaxx=" + cedulaxx + ", fechingr=" + fechingr + ", fhregist=" + fhregist + ", areaid=" + areaid + ", doctipoid=" + doctipoid + ", estadoid=" + estadoid + ", paiseid=" + paiseid + ", emailid=" + emailid + '}';
    }

   
}
