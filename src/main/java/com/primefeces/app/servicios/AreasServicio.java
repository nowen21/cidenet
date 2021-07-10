/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primefeces.app.servicios;

import com.primefeces.app.modelos.Areas;
import com.primefeces.app.repositorios.AreasRepositorio;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author NOWEN
 */
@Service
public class AreasServicio {

    @Autowired
    private AreasRepositorio areasrep;

    public Map<String, Integer> getAreas() {
        Map<String, Integer> params = new HashMap<>();
        List<Areas> parametr = areasrep.findAll();
        for (int i = 0; i < parametr.size(); i++) {
            params.put(parametr.get(i).getArea(), parametr.get(i).getIdxxxxxx());
        }
        return params;
    }

    public List<Areas> getLisareas() {
        List<Areas> parametr = areasrep.findAll();
        return parametr;
    }

    public Areas crear(Areas area) {
        return areasrep.save(area);
    }

    public Areas actualizar(Areas area) {
        return areasrep.findByIdxxxxxx(area.getIdxxxxxx());
    }
}
