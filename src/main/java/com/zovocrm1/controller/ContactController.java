package com.zovocrm1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zovocrm1.entities.Contact;
import com.zovocrm1.services.ContactService;

@Controller
public class ContactController {

	@Autowired
	private ContactService contactService;
	
	@RequestMapping("/listallcontacts")
	public String listAllContacts(ModelMap model) {
		List<Contact> contacts = contactService.findAllContacts();
		model.addAttribute("contacts", contacts);
		return "contact_result";
		
	}
	@RequestMapping("/getContactById")
	public String getContactById(@RequestParam("id")long id, ModelMap model) {
		Contact contact = contactService.getContact(id);
		model.addAttribute("contact", contact);
		return "generate_bill";
	}
}
