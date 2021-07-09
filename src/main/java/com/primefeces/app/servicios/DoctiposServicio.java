/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primefeces.app.servicios;

import com.primefeces.app.modelos.Doctipos;
import com.primefeces.app.repositorios.DoctiposRepositorio;
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
public class DoctiposServicio {
    
    @Autowired 
    private DoctiposRepositorio doctipor;
    public Map<String, Integer> getDoctipos() {
    Map<String, Integer> params = new HashMap<>();
    List<Doctipos> parametr = doctipor.findAll();
      for (int i = 0; i < parametr.size(); i++) {
        params.put(parametr.get(i).getTipo(), parametr.get(i).getId());
      }
    return params;
  }
}
