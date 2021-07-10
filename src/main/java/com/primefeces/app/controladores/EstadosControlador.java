/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primefeces.app.controladores;

import com.primefeces.app.modelos.Doctipos;
import com.primefeces.app.modelos.Estados;
import com.primefeces.app.modelos.Usuarios;
import com.primefeces.app.repositorios.UsuariosRepositorio;
import com.primefeces.app.servicios.EstadosServicio;
import com.primefeces.app.servicios.UsuariosServicio;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
    private EstadosServicio estadose;

    
    private Estados estado;
    
     private List<Estados> listestados;


    Map<String, Integer> params = new HashMap<>();

    public Map<String, Integer> getEstados() {
        return estadose.getEstados();
    }

    
    
    public Estados getEstado() {
        return estado;
    }

    public void setEstado(Estados estado) {
        this.estado = estado;
    }

    public List<Estados> getListestados() {
        return estadose.getListEstados();
    }

    public Estados nuevo() {
        estado = new Estados();
        return estado;
    }

    public void crear() {
        estado = estadose.crear(estado);
    }

    public void editar(Estados doctipo) {
        this.estado = estadose.actualizar(doctipo);
    }

}
