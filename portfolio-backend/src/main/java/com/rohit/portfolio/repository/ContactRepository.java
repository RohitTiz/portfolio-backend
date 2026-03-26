package com.rohit.portfolio.repository;

import com.rohit.portfolio.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
    // No need to write any code here - JpaRepository provides all CRUD methods
}