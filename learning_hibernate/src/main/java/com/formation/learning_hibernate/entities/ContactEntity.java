package com.formation.learning_hibernate.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContactEntity {
    
    private Integer id;
    private String name;
    private String email;
    private String message;

}

