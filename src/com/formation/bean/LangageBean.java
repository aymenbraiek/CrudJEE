package com.formation.bean;

import java.util.Locale;

import javax.faces.context.FacesContext;



public class LangageBean {



	public String activateFR() {
		  FacesContext context = FacesContext.getCurrentInstance();
		  context.getViewRoot().setLocale(Locale.FRENCH);
		  FacesContext.getCurrentInstance ().getApplication().setDefaultLocale(Locale.FRENCH);
		  return null;
		 }

		 public String activateEN() {
	
		  FacesContext context = FacesContext.getCurrentInstance();
		 context.getViewRoot().setLocale(Locale.ENGLISH);
		 FacesContext.getCurrentInstance().getApplication().setDefaultLocale(Locale.ENGLISH);
		  return null;
		 }
	
}
