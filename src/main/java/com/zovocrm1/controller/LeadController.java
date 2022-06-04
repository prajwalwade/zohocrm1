package com.zovocrm1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zovocrm1.entities.Contact;
import com.zovocrm1.entities.Lead;
import com.zovocrm1.services.ContactService;
import com.zovocrm1.services.LeadService;

@Controller
public class LeadController {

	@Autowired
	private LeadService leadService;
	
	@Autowired
	private ContactService contactService;
	
	@RequestMapping("/view")
	public String viewCreateLeadPage () {
		return "create_lead";
		
	}
	@RequestMapping("/saveLead")
	public String saveOneLead(@ModelAttribute("lead") Lead lead, ModelMap model) {
		leadService.saveLead(lead);
		model.addAttribute("lead",lead );
		return "lead_info";
		
	}
	@RequestMapping("/listallleads")
	public String listAllLead (ModelMap model) {
		List<Lead> leads = leadService.findAllLeads();
		model.addAttribute("leads",leads);
		return "lead_result";
		
	}
	@RequestMapping("/getLeadById")
	public String getLeadById(@RequestParam("id")long id, ModelMap model) {
		Lead lead=leadService.getLead(id);
		model.addAttribute("lead", lead);
		return "lead_info";
		
	}
	@RequestMapping("/convertLead")
	public String convertLead(@RequestParam("id")long id, ModelMap model) {
		Lead lead=leadService.getLead(id);
		Contact contact = new Contact();
		contact.setFirstName(lead.getFirstName());
		contact.setLastName(lead.getLastName());
		contact.setEmail(lead.getEmail());
		contact.setLeadSource(lead.getLeadSource());
		contact.setMobile(lead.getMobile());
		contactService.saveContact(contact);
		
		leadService.deleteLead(id);
		
		List<Contact> contacts = contactService.findAllContacts();
		model.addAttribute("contacts", contacts);
		return "contact_result";
		
	}
}
