/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primefeces.app.controladores;

import com.primefeces.app.modelos.Estados;
import com.primefeces.app.modelos.Paises;
import com.primefeces.app.servicios.PaisesServicio;
import java.util.List;
import java.util.Map;
import org.ocpsoft.rewrite.annotation.Join;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author NOWEN
 */
@Join(path = "/pais", to = "/pais-form.jsf")
@Controller
public class PaisesControlador {

    @Autowired
    private PaisesServicio paiseser;
    private Paises pais;
    private List<Estados> listpaises;

    public Map<String, Integer> getPaisesxx() {
        return paiseser.getPaisesxx();
    }

    public Paises getPais() {
        return pais;
    }

    public void setEstado(Paises pais) {
        this.pais = pais;
    }

    public List<Paises> getListpaises() {
        return paiseser.getListpaises();
    }

    public Paises nuevo() {
        pais = new Paises();
        return pais;
    }

    public void crear() {
        pais = paiseser.crear(pais);
    }

    public void editar(Paises paisxxxx) {
        this.pais = paiseser.actualizar(paisxxxx);
    }

}
