/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primefeces.app.servicios;

import com.primefeces.app.modelos.Basemails;
import com.primefeces.app.repositorios.BasemailsRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author NOWEN
 */
@Service
public class BasemailsServicio {

    @Autowired
    private BasemailsRepositorio basemare;

   

    public List<Basemails> getLista() {
        List<Basemails> parametr = basemare.findAll();
        return parametr;
    }

    public Basemails crear(Basemails parametr) {
        return basemare.save(parametr);
    }

//    public Emails actualizar(Emails parametr) {
//        return basemare.findByIdxxxxxx(parametr.getIdxxxxxx());
//    }
     public Basemails findByEmailxxx(String parametr) {
        return basemare.findByEmailxxx(parametr);
    }
}
