/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primefeces.app.servicios;

import com.primefeces.app.modelos.Usuarios;
import com.primefeces.app.repositorios.UsuariosRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author NOWEN
 */
@Service
public class UsuariosServicio {

    @Autowired
    private UsuariosRepositorio usuarior;

    public List<Usuarios> usuarios() {
        return usuarior.findAll();
    }
}
