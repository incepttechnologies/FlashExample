/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.incept;

import java.io.Serializable;
import java.util.Set;
import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.context.Flash;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author bhalepr
 */
@Named(value = "flashExampleBean")
@ViewScoped
public class FlashExampleBean implements Serializable {

    public String someViewAction() {
        System.out.println("flashExampleBean.someViewAction called");
        Flash fl = FacesContext.getCurrentInstance().getExternalContext().getFlash();
        Set flSet = fl.keySet();
        System.out.println("FL set size = " + flSet.size()
                + ", i1 value=" + fl.get("i1")
                + ", i2 value=" + fl.get("i2")
                + ", i3 value=" + fl.get("i3"));

        return "index_1";
    }

}
