/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primefeces.app.controladores;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named
@RequestScoped
public class DefaultCommandView {

    private String text;
    private String text2;

    private String btn = "btn1";

    private List<String> buttons;

    @PostConstruct
    public void init() {
        buttons = new ArrayList<String>();
        buttons.add("btn1");
        buttons.add("btn2");
        buttons.add("btn3");
    }

    public String getBtn() {
        return btn;
    }

    public void setBtn(String btn) {
        this.btn = btn;
    }

    public List<String> getButtons() {
        return buttons;
    }

    public void setButtons(List<String> buttons) {
        this.buttons = buttons;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }

    public void addMessage(String btn) {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Submitted with " + btn));
    }

    public void btn1Submit() {
        addMessage("btn1");
    }

    public void btn2Submit() {
        addMessage("btn2");
    }

    public void btn3Submit() {
        addMessage("btn3");
    }
}