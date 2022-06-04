package com.zovocrm1.services;

import java.util.List;

import com.zovocrm1.entities.Contact;


public interface ContactService {

	public void saveContact (Contact contact);

	public List<Contact> findAllContacts();

	public Contact getContact(long id);

	
}
