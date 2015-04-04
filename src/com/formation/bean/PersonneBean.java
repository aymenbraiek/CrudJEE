package com.formation.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.model.ListDataModel;

import com.formation.objects.Personne;
import com.formation.services.PersonneService;
import com.formation.servicesImpl.PersonneServiceImpl;
import com.formation.tools.BeanUtil;



public class PersonneBean implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    private PersonneService personneService;

    public PersonneBean() {    
        try {
			
	
		}catch (Exception e) {
			e.printStackTrace();
		}
    }

    public String createPersonneAction() {
      PersonneDataTableBean data=(PersonneDataTableBean) BeanUtil.getBean("personneDataTableBean");
        try {
        	  Personne personne=new Personne(null,data.getNom(),data.getPrenom(),data.getDateNaissance(),data.getEmail(),data.getSalaire());
           
        	  personneService.savePersonne(personne);
        	  data.getPersonnes().add(personne);
            data.clean();
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            return "failure";
        }
    }
    
    
    public void recherchePersonneListener(AjaxBehaviorEvent event)
    {
    	this.recherchePersonneAction();
    }
    
    public String recherchePersonneAction() {
        PersonneDataTableBean data=(PersonneDataTableBean) BeanUtil.getBean("personneDataTableBean");
          try {
          	
            List<Personne> l=  (List<Personne>) this.personneService.getPersonneS(data.getNom(), data.getPrenom());
            data.setPersonnes(l);   
            return null;
          } catch (Exception e) {
              e.printStackTrace();
              return  null;
          }
      }
   
   
  public void recherchePersonneListener(){

      PersonneDataTableBean data=(PersonneDataTableBean) BeanUtil.getBean("personneDataTableBean");
        try {
        	
          List<Personne> l=  (List<Personne>) this.personneService.getPersonneS(data.getNom(), data.getPrenom());
          data.setPersonnes(l);   
         
        } catch (Exception e) {
            e.printStackTrace();
                 }
    
    	
    }

    public String updatePersonneAction() {
    	PersonneDataTableBean data=(PersonneDataTableBean) BeanUtil.getBean("personneDataTableBean");
        try {
        	  Personne personne=this.personneService.getPersonne(data.getSelectedPersonne().getId());
        	  personne.setNom(data.getSelectedPersonne().getNom());
        	  personne.setPrenom(data.getSelectedPersonne().getPrenom());
        	  personne.setEmail(data.getSelectedPersonne().getEmail());
        	  personne.setSalaire(data.getSelectedPersonne().getSalaire());
        	  personne.setDateNaissance(data.getSelectedPersonne().getDateNaissance());
            this.personneService.updatePersonne( personne);
        
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            return "failure";
        }
    }

    public String deletePersonneAction() {
    	PersonneDataTableBean data=(PersonneDataTableBean) BeanUtil.getBean("personneDataTableBean");
       try {
        	Personne personne=this.personneService.getPersonne(data.getSelectedPersonne().getId());
        	if(personne.getSalaire()<=800){
        		BeanUtil.addErrorMessage("error.supp.personne");
        		return null;
        	}
            this.personneService.deletePersonne( personne);
            data.getPersonnes().remove(personne);
          
            return "success";
        } catch (Exception e) {
        	
            e.printStackTrace();
            return "failure";
        }
    }

 
    public String retour(){
    	PersonneDataTableBean data=(PersonneDataTableBean) BeanUtil.getBean("personneDataTableBean");
    	data.clean();
    	return "successR";
    }
    
    public String chargerPersonneUpdate(){
     
	    	
			 
		 return "success";
		}
    
    
    public String chargerPersonneDelete(){ 
 
        return "success";
    }

	public void setPersonneService(PersonneService personneService) {
		this.personneService = personneService;
	}


    
}
