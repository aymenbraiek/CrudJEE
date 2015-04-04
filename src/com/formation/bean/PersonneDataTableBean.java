package com.formation.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.faces.model.ListDataModel;

import com.formation.objects.Personne;

public class PersonneDataTableBean implements Serializable{

  
	private static final long serialVersionUID = 1L;
	private Collection<Personne> personnes = null;
  
	private String nom;
	private String prenom;
	private Date dateNaissance;
	private String email;
	private Double salaire;
	
    private Personne selectedPersonne;
    

	public PersonneDataTableBean() {
		super();
		personnes=new ArrayList<Personne>();
	}



	public Collection<Personne> getPersonnes() {
		return this.personnes;
	}



	public void setPersonnes(Collection<Personne> personnes) {
		this.personnes = personnes;
	}



	public String getNom() {
		return this.nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getPrenom() {
		return this.prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public Date getDateNaissance() {
		return this.dateNaissance;
	}



	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}



	public String getEmail() {
		return this.email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public Double getSalaire() {
		return this.salaire;
	}



	public void setSalaire(Double salaire) {
		this.salaire = salaire;
	}



	public Personne getSelectedPersonne() {
		return this.selectedPersonne;
	}



	public void setSelectedPersonne(Personne selectedPersonne) {
		this.selectedPersonne = selectedPersonne;
	}



	public void clean() {
		this.nom="";
		this.prenom="";
		this.email="";
		this.salaire=0.0;
		this.dateNaissance=null;
		
	}
	
    
}
