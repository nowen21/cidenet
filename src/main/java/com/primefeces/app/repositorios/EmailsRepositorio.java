/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primefeces.app.repositorios;

import com.primefeces.app.modelos.Emails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author NOWEN
 */
@Repository
public interface EmailsRepositorio extends JpaRepository<Emails, Integer> {

    public Emails findByIdxxxxxx(Integer id);

    public Emails findByEmailxxx(String emailxxx);
}
