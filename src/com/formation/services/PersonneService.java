package com.formation.services;


import java.sql.SQLException;
import java.util.Collection;

import com.formation.objects.Personne;

public interface PersonneService {
	  public Personne getPersonne(Integer id) throws SQLException ;
	  
	    public void savePersonne(Personne personne) throws SQLException ;

	  
	    public void updatePersonne(Personne personne) throws SQLException ;

	  
	    public Collection<Personne> getPersonneS() throws SQLException ;

	 
	    public void deletePersonne(Personne personne) throws SQLException ;
	    

	    public Collection<Personne> getPersonneS(String nom,String prenom) throws SQLException ;
}
