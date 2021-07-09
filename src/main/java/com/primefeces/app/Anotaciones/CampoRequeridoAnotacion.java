package com.primefeces.app.Anotaciones;

import java.lang.annotation.ElementType;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD, ElementType.METHOD })
@Constraint(validatedBy = CampoRequeridoValidacion.class)
/**
 * UsuariosAnotacion raliza las validacione de los campos del dialog del crud
 * para los usuarios
 *
 * @author Ing. José Dúmar Jiménez Ruíz
 * @version 1.0
 * @since 2021-07-04
 */
public @interface CampoRequeridoAnotacion {

    // definir el mensaje de error
    String message() default "no debe ser vacío";
    
    // definir los grupos    
    Class<?>[] groups() default {};
    
    // definir los Payload
    Class<? extends Payload>[] payload() default {};
}
