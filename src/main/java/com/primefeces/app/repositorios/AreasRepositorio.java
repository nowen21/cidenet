/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primefeces.app.repositorios;


import com.primefeces.app.modelos.Areas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author NOWEN
 */
@Repository
public interface AreasRepositorio extends JpaRepository<Areas, Integer>{
    public Areas findByIdxxxxxx(Integer id);
}
