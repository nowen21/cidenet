/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primefeces.app.modelos;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author NOWEN
 */
@Entity
public class Emails implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idxxxxxx")
    private Integer idxxxxxx;
    @Basic(optional = false)

    @Column(name = "emailxxx")
    private String emailxxx;
    @Basic(optional = false)
    @Column(name = "consecutivo")
    private int consecutivo;
    @JoinColumn(name = "basemailid", referencedColumnName = "idxxxxxx")
    @ManyToOne(optional = false)
    private Basemails basemailid;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "emailid")
    private Collection<Usuarios> usuarios;

    public Emails() {
    }

    public Emails(Integer idxxxxxx) {
        this.idxxxxxx = idxxxxxx;
    }

    public Emails(String emailxxx, int consecutivo, Basemails basemailid) {
        this.emailxxx = emailxxx;
        this.consecutivo = consecutivo;
        this.basemailid = basemailid;
    }

    public Emails(Integer idxxxxxx, String emailxxx, int consecutivo) {
        this.idxxxxxx = idxxxxxx;
        this.emailxxx = emailxxx;
        this.consecutivo = consecutivo;
    }

    public Integer getIdxxxxxx() {
        return idxxxxxx;
    }

    public void setIdxxxxxx(Integer idxxxxxx) {
        this.idxxxxxx = idxxxxxx;
    }

    public String getEmailxxx() {
        return emailxxx;
    }

    public void setEmailxxx(String emailxxx) {
        this.emailxxx = emailxxx;
    }

    public int getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(int consecutivo) {
        this.consecutivo = consecutivo;
    }

    public Basemails getBasemailid() {
        return basemailid;
    }

    public void setBasemailid(Basemails basemailid) {
        this.basemailid = basemailid;
    }

    @XmlTransient
    public Collection<Usuarios> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Collection<Usuarios> usuarios) {
        this.usuarios = usuarios;
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
        if (!(object instanceof Emails)) {
            return false;
        }
        Emails other = (Emails) object;
        if ((this.idxxxxxx == null && other.idxxxxxx != null) || (this.idxxxxxx != null && !this.idxxxxxx.equals(other.idxxxxxx))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.primefeces.app.modelos.Emails[ idxxxxxx=" + idxxxxxx + " ]";
    }
    
}
