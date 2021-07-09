/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primefeces.app.servicios;

import com.primefeces.app.modelos.Paises;
import com.primefeces.app.repositorios.PaisesRepositorio;
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
public class PaisesServicio {
    
    @Autowired 
    private PaisesRepositorio paisesrep;
    
    private Map<String, Integer> paisesxx;
    public Map<String, Integer> getPaisesxx() {
    Map<String, Integer> params = new HashMap<>();
    List<Paises> parametr = paisesrep.findAll();
      for (int i = 0; i < parametr.size(); i++) {
        params.put(parametr.get(i).getPais(), parametr.get(i).getId());
      }
    return params;
  }
}
