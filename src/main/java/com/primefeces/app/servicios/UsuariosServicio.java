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
import org.springframework.util.StringUtils;

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
        // validaciones para armar el correo
        String emailxxx = usuariox.getPrimnomb().toLowerCase().trim();
        emailxxx += ".";
//        usuariox.setPrimapel(usuariox.getPrimapel() + " P");
        emailxxx += usuariox.getPrimapel().toLowerCase().trim();
        String dominiox = paiservi.findByIdxxxxxx(usuariox.getPaiseid()).getDominio();
        System.out.println("pais "+dominiox);
        // se está editando
        emailxxx = StringUtils.replace(emailxxx, " ", "");

        Basemails basemail = basemase.findByEmailxxx(emailxxx + dominiox);
        Emails emailsxx = new Emails();

        int consecut = 0;
        // se está editando el usuario
        if (usuariox.getIdxxxxxx() == null) {
            if (basemail == null) {
                usuariox = nuevoCorreo(usuariox, emailxxx, dominiox, basemail, emailsxx);
            } else {
                for (Emails u : basemail.getEmails()) {
                    consecut = u.getConsecutivo();
                }
                consecut++;
                emailsxx.setConsecutivo(consecut);
                emailxxx = emailxxx + "." + consecut + dominiox;
                emailsxx.setBasemailid(basemail);
                emailsxx.setEmailxxx(emailxxx);
                usuariox.setEmailid(emailser.crear(emailsxx));
            }
        } else { // usuario nuevo
            if (basemail == null) { 
                emailxxx = emailxxx + dominiox;
                emailsxx=usuariox.getEmailid();
                emailsxx.getBasemailid().setEmailxxx(emailxxx);
                emailsxx.setEmailxxx(emailxxx);
                emailsxx.setConsecutivo(consecut);
                usuariox.setEmailid(emailsxx);
            }
        }
        usuariox.setEstadoId(1);
        return usuarior.save(usuariox);   
    }

    public Usuarios nuevoCorreo(Usuarios usuariox, String emailxxx, String dominiox, Basemails basemail, Emails emailsxx) {
        emailxxx += dominiox;
        basemail = new Basemails(emailxxx);
        basemail = basemase.crear(basemail);
        emailsxx.setBasemailid(basemail);
        emailsxx.setConsecutivo(0);
        emailsxx.setEmailxxx(emailxxx);
        emailsxx = emailser.crear(emailsxx);
        usuariox.setEmailid(emailsxx);
        return usuariox;
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
