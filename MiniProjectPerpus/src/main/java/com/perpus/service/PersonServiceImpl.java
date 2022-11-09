package com.perpus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.perpus.dao.PersonDao;
import com.perpus.model.Person;

@Service
public class PersonServiceImpl implements PersonService {
	@Autowired
	private PersonDao personDao;

	@Override
	@Transactional
	public void registerPerson(Person person) {
		// TODO Auto-generated method stub
		personDao.registerPerson(person);
	}

	@Override
	public Person loginPerson(Person person) {
		// TODO Auto-generated method stub
		return personDao.loginPerson(person);
	}
}