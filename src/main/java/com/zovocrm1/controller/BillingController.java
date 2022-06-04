package com.zovocrm1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zovocrm1.entities.Billing;
import com.zovocrm1.services.BillingService;

@Controller
public class BillingController {

	@Autowired
	private BillingService billingService;
	
	@RequestMapping("/generate")
	public String generateBill(@ModelAttribute("bill") Billing bill) {
		billingService.generateOneBill(bill);
		
		return "billing_result";
		
	}
}
