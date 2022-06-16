package com.example.backendproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "contact_us")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContactUs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "full_name")
    private String fullName;
    private String email;
    @Column(name = "phone_number")
    private String phoneNumber;
    private String product;
    @Column(name = "message")
    private String message;
}
