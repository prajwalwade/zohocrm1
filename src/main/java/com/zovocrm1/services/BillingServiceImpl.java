package com.zovocrm1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zovocrm1.entities.Billing;
import com.zovocrm1.repositories.BillingRepository;

@Service
public class BillingServiceImpl implements BillingService {

	@Autowired
	private BillingRepository billingRepo;
	
	@Override
	public void generateOneBill(Billing bill) {
	billingRepo.save(bill);

	}

}
