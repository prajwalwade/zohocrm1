package com.zovocrm1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;

import com.zovocrm1.entities.Contact;


@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

}
