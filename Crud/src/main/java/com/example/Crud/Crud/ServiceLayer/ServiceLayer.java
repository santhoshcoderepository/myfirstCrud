package com.example.Crud.Crud.ServiceLayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.Crud.Crud.Person.Person;
import com.example.Crud.Crud.Person.PersonRepo;

@Service
public class ServiceLayer
{
    @Autowired
    PersonRepo repo;
	
	public ResponseEntity<Person> postMethod(Person p)
	{
		repo.save(p);
		return new ResponseEntity<Person>(HttpStatus.ACCEPTED);
	}
}
 