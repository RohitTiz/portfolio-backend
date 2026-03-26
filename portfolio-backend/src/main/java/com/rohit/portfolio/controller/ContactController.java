package com.rohit.portfolio.controller;

import com.rohit.portfolio.dto.ContactRequestDTO;
import com.rohit.portfolio.dto.ContactResponseDTO;
import com.rohit.portfolio.service.ContactService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contacts")
@CrossOrigin(origins = {"http://localhost:5173", "http://127.0.0.1:5173"})  // ✅ Add this
@RequiredArgsConstructor
@Slf4j
public class ContactController {

    private final ContactService contactService;

    @PostMapping
    public ResponseEntity<ContactResponseDTO> submitContact(@Valid @RequestBody ContactRequestDTO request) {
        log.info("📨 Received contact request from: {}", request.getEmail());

        ContactResponseDTO response = contactService.saveContact(request);

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping("/health")
    public ResponseEntity<String> healthCheck() {
        return ResponseEntity.ok("Backend is running!");
    }
}