/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primefeces.app.servicios;

import com.primefeces.app.modelos.Emails;
import com.primefeces.app.repositorios.EmailsRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author NOWEN
 */
@Service
public class EmailsServicio {

    @Autowired
    private EmailsRepositorio emailsre;

   

    public List<Emails> getLisareas() {
        List<Emails> parametr = emailsre.findAll();
        return parametr;
    }

    public Emails crear(Emails parametr) {
        return emailsre.save(parametr);
    }

    public Emails actualizar(Emails parametr) {
        return emailsre.findByIdxxxxxx(parametr.getIdxxxxxx());
    }
     public Emails findByEmailxxx(String parametr) {
        return emailsre.findByEmailxxx(parametr);
    }
}
