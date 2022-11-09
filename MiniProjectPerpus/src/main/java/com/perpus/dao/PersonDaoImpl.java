package com.perpus.dao;

import javax.persistence.NoResultException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.perpus.model.Person;

@Repository
@Transactional
public class PersonDaoImpl implements PersonDao {
	@Autowired
	private SessionFactory factory;

	@Override
	public void registerPerson(Person person) {
		// TODO Auto-generated method stub
		Session session = factory.getCurrentSession();
		session.save(person);
	}

	@Override
	public Person loginPerson(Person person) {
		// TODO Login
		Session session = factory.getCurrentSession();
		try {
			Query<Person> query = session.createQuery(
					"from Person where person_username =:userName and person_password =:password",
					Person.class);
			query.setParameter("userName", person.getUserName());
			query.setParameter("password", person.getPassword());
			person = query.getSingleResult();
			return person;
		} catch (NoResultException e) {
			// TODO: handle exception
			return null;
		}
	}
}
