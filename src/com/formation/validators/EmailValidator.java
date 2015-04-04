package com.formation.validators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

import com.formation.tools.BeanUtil;

public class EmailValidator implements Validator{

	@Override
	public void validate(FacesContext arg0, UIComponent arg1, Object arg2)
			throws ValidatorException {
		 String enteredEmail = (String)arg2;
	        //Set the email pattern string
	        Pattern p = Pattern.compile("[a-z]+@[a-z]+.[a-z]+");
	        
	        //Match the given string with the pattern
	        Matcher m = p.matcher(enteredEmail);
	        
	        //Check whether match is found
	        boolean matchFound = m.matches();
	        if (!matchFound) {
	     		throw new ValidatorException(BeanUtil.createErrorMessage("invalid.email"));
	   
	        }
		
	}

}
