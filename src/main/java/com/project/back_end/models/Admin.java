package com.project.back_end.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
<<<<<<< HEAD
@Table(name = "admins") // optional, but good practice
=======
@Table(name = "admins")
>>>>>>> 9e3c62a (Initial commit: backend setup with Spring Boot and database)
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

<<<<<<< HEAD
    @NotNull(message = "username cannot be null")
    private String username;

    @NotNull(message = "password cannot be null")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY) // hides from API responses
    private String password;

    // ----- Constructors -----
    public Admin() {}

=======
    @NotNull(message = "Username cannot be null")
    @Column(nullable = false, unique = true)
    private String username;

    @NotNull(message = "Password cannot be null")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @Column(nullable = false)
    private String password;

    // Default constructor required by JPA
    public Admin() {
    }

    // Parameterized constructor for convenience
>>>>>>> 9e3c62a (Initial commit: backend setup with Spring Boot and database)
    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

<<<<<<< HEAD
    // ----- Getters and Setters -----
=======
    // Getters and Setters

>>>>>>> 9e3c62a (Initial commit: backend setup with Spring Boot and database)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
<<<<<<< HEAD
=======

>>>>>>> 9e3c62a (Initial commit: backend setup with Spring Boot and database)
