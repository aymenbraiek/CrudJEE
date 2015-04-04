package com.formation.tools;

import java.util.ResourceBundle;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;



public class BeanUtil {

	public static void addErrorMessage(String key) {
		FacesContext facesContext = FacesContext.getCurrentInstance();
		facesContext.addMessage("",createErrorMessage(key) );
	}
	
	public static FacesMessage createErrorMessage(String key){
		return new FacesMessage(FacesMessage.SEVERITY_ERROR,"" ,  getMessages(key));
		
	}
	

	 
	    public static String getMessages(String key) {
	    	FacesContext context = FacesContext.getCurrentInstance();
	    	 ResourceBundle bundle = ResourceBundle.getBundle("com.formation.bundle.messagesErr",context.getApplication().getDefaultLocale());
	        String message = null;
	        try {
	            message = bundle.getString(key);
	        } catch ( Exception e) {
	            return "unkown message "+key;
	        }
	        return message;
	    }
	 
	    
		public static Object getBean(String nomBean){
			
			FacesContext fc = FacesContext.getCurrentInstance();
			
			Object bean = fc.getApplication().createValueBinding("#{"+nomBean+"}").getValue(fc);
				
			 
			return  bean;
			
			
		}
		
		
		

}
