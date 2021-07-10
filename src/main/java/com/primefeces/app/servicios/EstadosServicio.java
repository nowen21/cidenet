/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primefeces.app.servicios;

import com.primefeces.app.modelos.Estados;
import com.primefeces.app.repositorios.EstadosRepositorio;
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
public class EstadosServicio {

    @Autowired
    private EstadosRepositorio estadore;

    public Map<String, Integer> getEstados() {
        Map<String, Integer> params = new HashMap<>();
        List<Estados> parametr = estadore.findAll();
        for (int i = 0; i < parametr.size(); i++) {
            params.put(parametr.get(i).getEstadoxx(), parametr.get(i).getIdxxxxxx());
        }
        return params;
    }

    public List<Estados> getListEstados() {
        List<Estados> parametr = estadore.findAll();
        return parametr;
    }

    public Estados crear(Estados estado) {
        return estadore.save(estado);
    }

    public Estados actualizar(Estados estado) {
        return estadore.findByIdxxxxxx(estado.getIdxxxxxx());
    }
}
