/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primefeces.app.validaciones;

import com.primefeces.app.modelos.Usuarios;
import com.primefeces.app.servicios.UsuariosServicio;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;

/**
 *
 * @author NOWEN
 */
public class ValidarUsuario {

    private FacesContext contexto;
    private UIComponent validarx;
    private Object valorxxx;
    private UsuariosServicio usuarios;
//    private Usuarios usuariox;

    public ValidarUsuario(FacesContext contexto, UIComponent validarx, Object valorxxx, UsuariosServicio usuarios) {
        this.contexto = contexto;
        this.validarx = validarx;
        this.valorxxx = valorxxx;
        this.usuarios = usuarios;
//        this.usuariox = usuariox;
    }

    /**
     * unificar el mensaje
     */
    private void mensaje(String mensaje) {
        ((UIInput) validarx).setValid(false);
        contexto.addMessage(validarx.getClientId(), new FacesMessage(mensaje));
    }

    /**
     * realizar las validaciones para el número de cédula
     */
    private void cedula() {
        if (usuarios.porCedula(valorxxx.toString()) != null) {
            mensaje("La cédula ya se encuentra en uso");
        }
        if (valorxxx.equals("")) {
            mensaje("Ingrese un número de cédula");
        }
        tamanioTexto("La cédula no puede ser mayor a 20 caracteres", 20);

    }

    /**
     * validar tamaño texto
     *
     * @param mensaje mensaje que se va a mostrar
     * @param tamanio valor que se va comparar
     */
    public void tamanioTexto(String mensaje, int tamanio) {
        if (valorxxx.toString().length() > tamanio) {
            mensaje(mensaje);
        }
    }

    public void fechingr() {
        if (valorxxx == null) {
            mensaje("Seleccione la fecha de Ingreso");
        }
    }

    /**
     * validaciones para todos los campos
     */
    public void validar() {
        System.out.println(validarx.getId());
        switch (validarx.getId()) {
            case "cedulaxx":
                cedula();
                break;
            case "fechingr":
                fechingr();
                break;
            case "primapel":
                if (valorxxx.equals("")) {
                    mensaje("Ingrese el primer apellido");
                }
                tamanioTexto("El primer apelldo no puede ser mayor a 20 caracteres", 20);
                break;
            case "seguapel":
                if (valorxxx.equals("")) {
                    mensaje("Ingrese el segundo apellido");
                }
                tamanioTexto("El segundo apelldo no puede ser mayor a 20 caracteres", 20);
                break;
            case "primnomb":
                if (valorxxx.equals("")) {
                    mensaje("Ingrese el primer nombre");
                }
                tamanioTexto("El primer nombre no puede ser mayor a 20 caracteres", 20);
                break;
            case "segunomb":
                if (valorxxx.equals("")) {
                    mensaje("Ingrese el segundo nombre");
                }
                tamanioTexto("El segundo nombre no puede ser mayor a 20 caracteres", 20);
                break;

            case "otronomb":
//                if (valorxxx.equals("")) {
//                    mensaje("Ingrese el otro nombre");
//                }
                tamanioTexto("El otro nombre no puede ser mayor a 50 caracteres", 50);
                break;
            case "doctipoid":
                System.out.println(valorxxx);
                if (valorxxx == null) {
                    mensaje("Seleccione el tipo de documento");
                }
                break;
        }

    }
;
}
