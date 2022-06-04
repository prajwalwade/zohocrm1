package com.zovocrm1.services;

import java.util.List;

import com.zovocrm1.entities.Lead;

public interface LeadService {

	public void saveLead (Lead lead);

	public List<Lead> findAllLeads();

	public Lead getLead(long id);

	public void deleteLead(long id);
}
