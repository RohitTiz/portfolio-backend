package com.rohit.portfolio.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContactResponseDTO {
    private boolean success;
    private String message;
    private Long contactId;
}