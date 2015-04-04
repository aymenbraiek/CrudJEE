package com.formation.daoImpl;



import java.sql.SQLException;
import java.util.Collection;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.formation.bean.PersonneBean;
import com.formation.dao.PersonneDao;
import com.formation.objects.Personne;

public class PersonneDaoImpl extends HibernateDaoSupport implements PersonneDao  {

		 
	public PersonneDaoImpl() {

	
	}

	@Override
	public void deletePersonne(Personne personne) throws SQLException {
		// TODO Auto-generated method stub
	
    getHibernateTemplate().delete(personne);
	}

	@Override
	public Personne getPersonne(Integer id) throws SQLException {
		// TODO Auto-generated method stub
		return  (Personne) getSession().get(Personne.class, id);
		
	}

	@Override
	public Collection<Personne> getPersonneS() throws SQLException {
		// TODO Auto-generated method stub
		return getSession().createCriteria("from com.formation.objects.Personne").list(); 
	}

	@Override
	public Collection<Personne> getPersonneS(String nom, String prenom)
			throws SQLException {
		// TODO Auto-generated method stub
		Criteria cr=getSession().createCriteria(Personne.class);
		cr.add(Restrictions.ilike("nom", "%"+nom+"%"));
		cr.add(Restrictions.ilike("prenom", "%"+prenom+"%"));	
		return cr.list();

	}

	@Override
	public void savePersonne(Personne personne) throws SQLException {
		// TODO Auto-generated method stub
getHibernateTemplate().save(personne);		
	}

	@Override
	public void updatePersonne(Personne personne) throws SQLException {
		// TODO Auto-generated method stub
		getHibernateTemplate().update(personne);
	}

		
}
