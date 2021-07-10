/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primefeces.app.servicios;

import com.primefeces.app.modelos.Estados;
import com.primefeces.app.modelos.Paises;
import com.primefeces.app.repositorios.PaisesRepositorio;
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
public class PaisesServicio {

    @Autowired
    private PaisesRepositorio paisesre;

    private Map<String, Integer> paisesxx;

    public Map<String, Integer> getPaisesxx() {
        Map<String, Integer> params = new HashMap<>();
        List<Paises> parametr = paisesre.findAll();
        for (int i = 0; i < parametr.size(); i++) {
            params.put(parametr.get(i).getPais(), parametr.get(i).getIdxxxxxx());
        }
        return params;
    }

    public List<Paises> getListpaises() {
        List<Paises> parametr = paisesre.findAll();
        return parametr;
    }

    public Paises crear(Paises pais) {
        return paisesre.save(pais);
    }

    public Paises actualizar(Paises pais) {
        return paisesre.findByIdxxxxxx(pais.getIdxxxxxx());
    }
}
