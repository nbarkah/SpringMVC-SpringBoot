package com.perpus.dao;

import com.perpus.model.Person;

public interface PersonDao {
	public void registerPerson(Person person);

	public Person loginPerson(Person person);
}