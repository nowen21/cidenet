/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primefeces.app.controladores;

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
    private Paises paisxxxx;
    private List<Paises> paisesxx;

    public Paises getPaisxxxx() {
        return paisxxxx;
    }

    public Map<String, Integer> getPaisesxx() {
        return paiseser.getPaisesxx();
    }
}
