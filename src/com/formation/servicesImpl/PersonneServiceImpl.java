package com.formation.servicesImpl;

import java.sql.SQLException;
import java.util.Collection;

import com.formation.dao.PersonneDao;
import com.formation.daoImpl.PersonneDaoImpl;
import com.formation.objects.Personne;
import com.formation.services.PersonneService;


 
public class PersonneServiceImpl  implements PersonneService{
	 
	private PersonneDao personneDao;

				@Override
				public void updatePersonne(Personne personne) throws SQLException {
					// TODO Auto-generated method stub
					personneDao.updatePersonne(personne);
				}
				
				@Override
				public void savePersonne(Personne personne) throws SQLException {
					// TODO Auto-generated method stub
					personneDao.savePersonne(personne);
				}
				
				@Override
				public Collection<Personne> getPersonneS(String nom, String prenom)
						throws SQLException {
					// TODO Auto-generated method stub
					return personneDao.getPersonneS(nom, prenom);
				}
				
				@Override
				public Collection<Personne> getPersonneS() throws SQLException {
					// TODO Auto-generated method stub
					return personneDao.getPersonneS();
				}
				
				@Override
				public Personne getPersonne(Integer id) throws SQLException {
					// TODO Auto-generated method stub
					return personneDao.getPersonne(id);
				}
				
				@Override
				public void deletePersonne(Personne personne) throws SQLException {
					// TODO Auto-generated method stub
					personneDao.deletePersonne(personne);	
				}

				public PersonneDao getPersonneDao() {
					return personneDao;
				}

				public void setPersonneDao(PersonneDao personneDao) {
					this.personneDao = personneDao;
				}
				
	    	}