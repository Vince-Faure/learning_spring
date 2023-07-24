package com.formation.learning_hibernate.entities;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContactEntity {
    
    private Integer id;
    private String name;
    private String email;
    private String message;

}

