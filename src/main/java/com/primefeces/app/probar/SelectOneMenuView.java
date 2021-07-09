/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primefeces.app.probar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.bean.RequestScoped;
import javax.faces.model.SelectItem;
import javax.faces.model.SelectItemGroup;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author NOWEN
 */
@Named
@RequestScoped
public class SelectOneMenuView {
    private Country country;
    private List<Country> countries;
    @Inject
    private CountryService service;

    @PostConstruct
    public void init() {
        //countries
        countries = service.getCountries();
    }
    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public List<Country> getCountries() {
        return countries;
    }
    public void setService(CountryService service) {
        this.service = service;
    }
}
