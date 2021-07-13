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
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author NOWEN
 */
@Entity
public class Basemails implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idxxxxxx")
    private Integer idxxxxxx;
    @Column(name = "emailxxx")
    private String emailxxx;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "basemailid")
    private Collection<Emails> emails;

    public Basemails() {
    }

    public Basemails(String emailxxx) {
        this.emailxxx = emailxxx;
    }

    public Basemails(Integer idxxxxxx) {
        this.idxxxxxx = idxxxxxx;
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

    @XmlTransient
    public Collection<Emails> getEmails() {
        return emails;
    }

    public void setEmails(Collection<Emails> emails) {
        this.emails = emails;
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
        if (!(object instanceof Basemails)) {
            return false;
        }
        Basemails other = (Basemails) object;
        if ((this.idxxxxxx == null && other.idxxxxxx != null) || (this.idxxxxxx != null && !this.idxxxxxx.equals(other.idxxxxxx))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.primefeces.app.modelos.Basemails[ idxxxxxx=" + idxxxxxx + " ]";
    }
    
}
