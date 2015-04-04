package com.formation.objects;

import java.io.Serializable;
import java.util.Date;



 
public class Personne implements Serializable{
	
	private Integer id;
	private String nom;
	private String prenom;
	private Date dateNaissance;
	private String email;
	private Double salaire;
	public Integer getId() {
		return this.id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public Personne(Integer id, String nom, String prenom, Date dateNaissance,
			String email, Double salaire) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.email = email;
		this.salaire = salaire;
	}
	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personne other = (Personne) obj;
		if (this.id == null) {
			if (other.id != null)
				return false;
		} else if (!this.id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Personne [id=" + this.id + ", nom=" + this.nom + ", prenom="
				+ this.prenom + "]";
	}
	
	
	
	
	
	
	
}
