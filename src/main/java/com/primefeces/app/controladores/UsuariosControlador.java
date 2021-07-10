/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primefeces.app.controladores;

import com.primefeces.app.modelos.Usuarios;
import com.primefeces.app.servicios.UsuariosServicio;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.annotation.PostConstruct;
import org.ocpsoft.rewrite.annotation.Join;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author NOWEN
 */
@Join(path = "/", to = "/usuario-form.jsf")
@Controller
public class UsuariosControlador implements Serializable {

    @Autowired
    private UsuariosServicio usuarios;

    private Usuarios usuariox = new Usuarios();

    private Date minDateTime;
    private Date maxDateTime;


    @PostConstruct
    public void init() throws ParseException {
        Calendar calendar = GregorianCalendar.getInstance();
        Date today = new Date();
        calendar.setTime(today);
        SimpleDateFormat objSDF = new SimpleDateFormat("yyyy-MM-dd");
        String fechaxxx = objSDF.format(today);
        String[] parts = fechaxxx.split("-");
        int ultimdia = calendar.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);//dias del mes
        calendar.set(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]), ultimdia);
        minDateTime = new SimpleDateFormat("yyyy-MM-dd").parse(parts[0] + "-" + parts[1] + "-01");
        maxDateTime = new SimpleDateFormat("yyyy-MM-dd").parse(parts[0] + "-" + parts[1] + "-" + ultimdia);

    }

    public Usuarios getUsuariox() {
        return usuariox;
    }

    public void setUsuariox(Usuarios usuariox) {
        this.usuariox = usuariox;
    }

    private Usuarios seleusua;

    public Usuarios getSeleusua() {
        return seleusua;
    }

    public void setSeleusua(Usuarios seleusua) {
        this.seleusua = seleusua;
    }

    public String save() {
//        usuarior.save(usuariox);
        usuariox = new Usuarios();
        return "/product-list.xhtml?faces-redirect=true";
    }

    public List<Usuarios> getUsuarios() {
        return usuarios.usuarios();
    }

    public void nuevoUsuario() {  System.out.println("com.primefeces.app.controladores.UsuariosControlador.nuevoUsuario()");
        this.usuariox = new Usuarios();
    }


    public void registrar() {
        usuarios.registrar(usuariox);
//        if (this.selectedProduct.getCode() == null) {
//            this.selectedProduct.setCode(UUID.randomUUID().toString().replaceAll("-", "").substring(0, 9));
//            this.products.add(this.selectedProduct);
//            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Product Added"));
//        }
//        else {
//            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Product Updated"));
//        }
//
//        PrimeFaces.current().executeScript("PF('manageProductDialog').hide()");
//        PrimeFaces.current().ajax().update("form:messages", "form:dt-products");
    }
    
// consultar el usuario que se recibe por parametro

    public void leerUsuario(Usuarios usuarixx) {
        usuariox = usuarios.leerUsuario(usuarixx);
    }

    public Date getMinDateTime() throws ParseException {
        return minDateTime;
    }

    public Date getMaxDateTime() {
        return maxDateTime;
    }

    
    
}
