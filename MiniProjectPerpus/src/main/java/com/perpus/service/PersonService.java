package com.perpus.service;

import com.perpus.model.Person;

public interface PersonService {
	public void registerPerson(Person person);

	public Person loginPerson(Person person);
}