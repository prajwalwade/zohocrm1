package com.zovocrm1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zovocrm1.entities.Billing;

public interface BillingRepository extends JpaRepository<Billing, Long> {

}
