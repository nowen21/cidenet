/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primefeces.app.Anotaciones;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author NOWEN
 */
@FacesValidator(value = "CampoRequeridoValidator")
public class CampoRequeridoValidator implements Validator {

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        switch (component.getId()) {
            case "primapel":
                validarCampo(value, "El primer apellido es obligatorio");
                break;
            case "seguapel":
                validarCampo(value, "El segundo apellillo es obligatorio");
                break;
            case "primnomb":
                validarCampo(value, "El primer nombre es obligatorio");
                break;
            case "segunomb":
                validarCampo(value, "El segundo nombre es obligatorio");
                break;
            case "otronomb":
                validarCampo(value, "El otro nombre es obligatorio");
                break;
            case "cedulaxx":
                validarCampo(value, "El número de cédula es obligatorio");
                break;

        }

    }

    private void validarCampo(Object value, String messagex) {
        if (value.equals("")) {
            FacesMessage msn = new FacesMessage(FacesMessage.SEVERITY_ERROR, messagex, messagex);
            throw new ValidatorException(msn);
        }
    }
}
