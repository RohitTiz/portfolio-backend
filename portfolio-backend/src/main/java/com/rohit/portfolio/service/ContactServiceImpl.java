package com.rohit.portfolio.service;

import com.rohit.portfolio.dto.ContactRequestDTO;
import com.rohit.portfolio.dto.ContactResponseDTO;
import com.rohit.portfolio.model.Contact;
import com.rohit.portfolio.repository.ContactRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ContactServiceImpl implements ContactService {

    private final ContactRepository contactRepository;

    @Override
    public ContactResponseDTO saveContact(ContactRequestDTO contactRequestDTO) {
        log.info("📬 Saving contact from: {}", contactRequestDTO.getEmail());

        // Convert DTO to Entity
        Contact contact = new Contact();
        contact.setName(contactRequestDTO.getName());
        contact.setEmail(contactRequestDTO.getEmail());
        contact.setMessage(contactRequestDTO.getMessage());
        contact.setIsRead(false);

        // Save to database
        Contact savedContact = contactRepository.save(contact);

        log.info("✅ Contact saved successfully with ID: {}", savedContact.getId());

        return new ContactResponseDTO(
                true,
                "Thank you! Your message has been received. I'll get back to you soon.",
                savedContact.getId()
        );
    }
}