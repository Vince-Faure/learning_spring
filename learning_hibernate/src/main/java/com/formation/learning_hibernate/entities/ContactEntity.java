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
    @Size(min= 3, max=30)
    @Pattern(regexp="^[\\p{L}\\- ]{4,100}$", flags ={Pattern.Flag.CASE_INSENSITIVE,Pattern.Flag.DOTALL})
    private String name;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    @Size(min=25, max=1000)
    private String message;

}

