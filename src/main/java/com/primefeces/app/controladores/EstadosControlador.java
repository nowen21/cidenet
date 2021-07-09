/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primefeces.app.controladores;

import com.primefeces.app.modelos.Usuarios;
import com.primefeces.app.repositorios.UsuariosRepositorio;
import com.primefeces.app.servicios.UsuariosServicio;
import org.ocpsoft.rewrite.annotation.Join;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author NOWEN
 */
@Join(path = "/estado", to = "/estado-form.jsf")
@Controller
public class EstadosControlador {

    @Autowired
    private UsuariosRepositorio usuarior;

    private Usuarios usuariox = new Usuarios();

    public String save() {
        usuarior.save(usuariox);
        usuariox = new Usuarios();
        return "/product-list.xhtml?faces-redirect=true";
    }

}
