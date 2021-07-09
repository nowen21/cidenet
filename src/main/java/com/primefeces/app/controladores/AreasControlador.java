/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primefeces.app.controladores;

import com.primefeces.app.modelos.Areas;
import com.primefeces.app.servicios.AreasServicio;
import java.util.HashMap;
import java.util.Map;
import org.ocpsoft.rewrite.annotation.Join;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author NOWEN
 */
@Join(path = "/area", to = "/area-form.jsf")
@Controller
public class AreasControlador {

    @Autowired
    private AreasServicio paiseser;
    Map<String, Integer> params = new HashMap<>();
    public Map<String, Integer> getAreaxxxx() {
        return paiseser.getAreas();
    }

}
