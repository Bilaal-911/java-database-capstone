package com.project.back_end.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "appointments")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

<<<<<<< HEAD
    // ---- Relationships ----
    @ManyToOne
    @JoinColumn(name = "doctor_id", nullable = false)
    @NotNull(message = "Doctor is required")
    private Doctor doctor;

    @ManyToOne
    @JoinColumn(name = "patient_id", nullable = false)
    @NotNull(message = "Patient is required")
    private Patient patient;

    // ---- Appointment details ----
    @Future(message = "Appointment time must be in the future")
    @NotNull(message = "Appointment time cannot be null")
    private LocalDateTime appointmentTime;

    @NotNull(message = "Status cannot be null")
    private int status; // 0 = Scheduled, 1 = Completed

    // ---- Constructors ----
    public Appointment() {}

    public Appointment(Doctor doctor, Patient patient, LocalDateTime appointmentTime, int status) {
=======
    @NotNull(message = "Doctor must be assigned")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "doctor_id", nullable = false)
    private Doctor doctor;

    @NotNull(message = "Patient must be assigned")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;

    @NotNull(message = "Appointment time must be provided")
    @Future(message = "Appointment time must be in the future")
    @Column(name = "appointment_time", nullable = false)
    private LocalDateTime appointmentTime;

    @NotNull(message = "Status is required")
    @Column(nullable = false)
    private Integer status; // 0 = scheduled, 1 = completed

    // Default constructor required by JPA
    public Appointment() {
    }

    // Parameterized constructor
    public Appointment(Doctor doctor, Patient patient, LocalDateTime appointmentTime, Integer status) {
>>>>>>> 9e3c62a (Initial commit: backend setup with Spring Boot and database)
        this.doctor = doctor;
        this.patient = patient;
        this.appointmentTime = appointmentTime;
        this.status = status;
    }
<<<<<<< HEAD
    @Size(max = 200)
    private String reasonForVisit;

    @Size(max = 500)
    private String notes;

    // ---- Helper methods ----
    @Transient
    public LocalDateTime getEndTime() {
        return appointmentTime != null ? appointmentTime.plusHours(1) : null;
=======

    // Transient method: end time is not stored in DB
    @Transient
    public LocalDateTime getEndTime() {
        return appointmentTime.plusHours(1);
>>>>>>> 9e3c62a (Initial commit: backend setup with Spring Boot and database)
    }

    @Transient
    public LocalDate getAppointmentDate() {
<<<<<<< HEAD
        return appointmentTime != null ? appointmentTime.toLocalDate() : null;
=======
        return appointmentTime.toLocalDate();
>>>>>>> 9e3c62a (Initial commit: backend setup with Spring Boot and database)
    }

    @Transient
    public LocalTime getAppointmentTimeOnly() {
<<<<<<< HEAD
        return appointmentTime != null ? appointmentTime.toLocalTime() : null;
    }

    // ---- Getters and Setters ----
=======
        return appointmentTime.toLocalTime();
    }

    // Getters and Setters

>>>>>>> 9e3c62a (Initial commit: backend setup with Spring Boot and database)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public LocalDateTime getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(LocalDateTime appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

<<<<<<< HEAD
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
=======
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}


>>>>>>> 9e3c62a (Initial commit: backend setup with Spring Boot and database)
