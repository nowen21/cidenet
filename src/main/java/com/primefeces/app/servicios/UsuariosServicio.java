/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primefeces.app.servicios;

import com.primefeces.app.modelos.Basemails;
import com.primefeces.app.modelos.Emails;
import com.primefeces.app.modelos.Usuarios;
import com.primefeces.app.repositorios.UsuariosRepositorio;
import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;
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
    @Autowired
    private PaisesServicio paiservi;
    @Autowired
    private BasemailsServicio basemase;
    @Autowired
    private EmailsServicio emailser;

    public List<Usuarios> usuarios() {
        List<Usuarios> usuarios = usuarior.findAll();
        if (usuarios == null) {
            usuarios = new ArrayList<Usuarios>();
        }

        return usuarios;
    }

    /**
     *
     * guardado del usuario
     */
    @Transactional
    public Usuarios registrar(Usuarios usuariox) {
//        try {
        // validaciones para armar el correo
        String emailxxx = usuariox.getPrimnomb().toLowerCase().trim();
        emailxxx += ".";
        emailxxx += usuariox.getPrimapel().toLowerCase().trim();
        emailxxx += paiservi.findByIdxxxxxx(usuariox.getPaiseid()).getDominio();
        // se está editando
        Basemails basemail = basemase.findByEmailxxx(emailxxx);
        Emails emailsxx = new Emails();
        if (basemail == null) { // crear nuevo correo y consecutivo
             System.out.println("usuario 6");
            // nueva base de correo
            basemail = basemase.crear(new Basemails(emailxxx));
            // consecutivo inicial
            emailsxx = emailser.crear(new Emails(emailxxx, 0, basemail));
        }
       System.out.println("usuario 5");
        // se está editando el usuario
        if (usuariox.getIdxxxxxx() != null) {  
            System.out.println("consecutivo"+usuariox.getEmailid().getConsecutivo());
            if (usuariox.getEmailid().getConsecutivo() > 0) { System.out.println("usuario 1");
                emailxxx = emailxxx + "." + usuariox.getEmailid().getConsecutivo();
            }
           System.out.println("usuario 2");
            usuariox.getEmailid().setEmailxxx(emailxxx);
        } else { // usuario nuevo
 System.out.println("usuario 4");
            usuariox.setEmailid(emailsxx);
        }
        System.out.println("usuario 3");

//                    = List < Usuarios > correos = usuarior.findByEmailxxxStartsWith(emailxxx);
//            for (Usuarios u : correos) {
////            String correo = u.getEmailxxx();
////            System.out.println("correo " + correo);
//            }
//        usuariox.setEmailxxx(emailxxx);
        usuariox.setEstadoId(1);
        return usuarior.save(usuariox);
//        } catch (Exception e) {
//            return usuariox;
//        }
//       
    }

    /**
     *
     * consultar usuario por el id
     */
    public Usuarios leerUsuario(Usuarios usuariox) {
        return usuarior.findByIdxxxxxx(usuariox.getIdxxxxxx());
    }

    public Usuarios porCedula(String cedulaxx) {
        return usuarior.findByCedulaxx(cedulaxx);
    }
}
