package com.formation.learning_hibernate.entities;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContactEntity {
    
    private Integer id;

    @NotBlank
    @Pattern(
        regexp="^[\\p{L}\\- ]{4,100}$", 
        flags ={Pattern.Flag.CASE_INSENSITIVE,Pattern.Flag.DOTALL},
        message="{contact.name.regex.message}"
        )
    private String name;

    @NotBlank(message = "Le mail est obligatoire")
    @Email
    private String email;

    @NotBlank(message = "Le message est obligatoire")
    @Size(min=25, max=1000, message="le message doit contenir de 25 à 1000 caractères")
    private String message;

}

