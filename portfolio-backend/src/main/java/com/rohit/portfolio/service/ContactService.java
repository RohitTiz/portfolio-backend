package com.rohit.portfolio.service;

import com.rohit.portfolio.dto.ContactRequestDTO;
import com.rohit.portfolio.dto.ContactResponseDTO;

public interface ContactService {
    ContactResponseDTO saveContact(ContactRequestDTO contactRequestDTO);
}