package com.rest.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.rest.model.Person;

@Component
public class PersonDAO {

	// Dummy database. Initialize with some dummy values.
	private static List<Person> persons;
	{
		persons = new ArrayList();
		persons.add(new Person("sameer", 1234.21, "cricket"));
		persons.add(new Person("shaurya", 7894.45, "ride"));
		persons.add(new Person("sagar", 365.66, "book"));
		persons.add(new Person("saket", 63.00, "dance"));
	}

	/**
	 * Returns list of customers from dummy database.
	 * 
	 * @return list of customers
	 */
	public List getAll() {
		return persons;
	}

}