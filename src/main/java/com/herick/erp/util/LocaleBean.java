package com.herick.erp.util;

import java.io.Serializable;
import java.util.Locale;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named
@SessionScoped
public class LocaleBean implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Locale locale = new Locale("pt", "BR");
    
    public void changeLocale() {
    	
    	FacesContext context = FacesContext.getCurrentInstance();

        if (locale.getLanguage().equals("pt")) {
        	locale = new Locale("en", "US");
            context.getViewRoot().setLocale(new Locale("en", "US"));
        } else {
        	locale = new Locale("pt", "BR");
            context.getViewRoot().setLocale(new Locale("pt", "BR"));
        }
    }

	public Locale getLocale() {
		return locale;
	}

	public void setLocale(Locale locale) {
		this.locale = locale;
	}
}


