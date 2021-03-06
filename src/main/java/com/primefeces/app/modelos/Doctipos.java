/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primefeces.app.modelos;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 *
 * @author NOWEN
 */
@Entity
public class Doctipos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer idxxxxxx;
    @Basic(optional = false)
    @Column(name = "tipo")
    private String tipo;

    public Doctipos() {
    }

    public Doctipos(Integer id) {
        this.idxxxxxx = id;
    }

    public Doctipos(Integer id, String tipo) {
        this.idxxxxxx = id;
        this.tipo = tipo;
    }

    public Integer getIdxxxxxx() {
        return idxxxxxx;
    }

    public void setIdxxxxxx(Integer id) {
        this.idxxxxxx = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
        if (!(object instanceof Doctipos)) {
            return false;
        }
        Doctipos other = (Doctipos) object;
        if ((this.idxxxxxx == null && other.idxxxxxx != null) || (this.idxxxxxx != null && !this.idxxxxxx.equals(other.idxxxxxx))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.primefeces.app.modelos.Doctipos[ id=" + idxxxxxx + " ]";
    }
    
}
