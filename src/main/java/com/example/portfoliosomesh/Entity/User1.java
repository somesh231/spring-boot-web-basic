package com.example.portfoliosomesh.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User1{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;


}
