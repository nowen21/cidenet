/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primefeces.app.repositorios;

import com.primefeces.app.modelos.Basemails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author NOWEN
 */
@Repository
public interface BasemailsRepositorio extends JpaRepository<Basemails, Integer>{
    public Basemails findByEmailxxx(String emailxxx);
}
