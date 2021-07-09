/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primefeces.app.controladores;

import com.primefeces.app.modelos.Usuarios;
import com.primefeces.app.repositorios.UsuariosRepositorio;
import com.primefeces.app.servicios.DoctiposServicio;
import java.util.HashMap;
import java.util.Map;

import org.ocpsoft.rewrite.annotation.Join;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author NOWEN
 */
@Join(path = "/doctipo", to = "/doctipo-form.jsf")
@Controller
public class DoctiposControlador {

    @Autowired
    private DoctiposServicio doctipos;

   Map<String, Integer> params = new HashMap<>();
    public Map<String, Integer> getDoctipos() {
        return doctipos.getDoctipos();
    }

}
