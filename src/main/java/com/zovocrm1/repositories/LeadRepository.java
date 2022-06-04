package com.zovocrm1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zovocrm1.entities.Lead;

@Repository
public interface LeadRepository extends JpaRepository<Lead, Long> {

}
