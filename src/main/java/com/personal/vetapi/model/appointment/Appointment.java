package com.personal.vetapi.model.appointment;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity(name = "appointments")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long appointmentId;

    @Column(nullable = false)
    private String fullName;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false, length = 10)
    private String phoneNumber;
    @Column(nullable = false)
    private String petName;
    private String message;

    @Column(nullable = false)
    private AppointmentType appointmentType;
    @Column(nullable = false)
    private LocalDate appointmentDate;
    @Column(nullable = false)
    private LocalTime appointmentTime;

    @CreationTimestamp
    private LocalDateTime requestedTimeStamp;

    public Appointment() {};

    public Appointment(String fullName, String email, String phoneNumber, String petName, String message, AppointmentType appointmentType, LocalDate appointmentDate, LocalTime appointmentTime, LocalDateTime requestedTimeStamp) {
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.petName = petName;
        this.message = message;
        this.appointmentType = appointmentType;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
        this.requestedTimeStamp = requestedTimeStamp;
    };

    public Long getAppointmentId() {
        return appointmentId;
    };

    public Appointment setAppointmentId(Long appointmentId) {
        this.appointmentId = appointmentId;
        return this;
    };

    public String getFullName() {
        return fullName;
    };

    public Appointment setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    };

    public String getEmail() {
        return email;
    };

    public Appointment setEmail(String email) {
        this.email = email;
        return this;
    };

    public String getPhoneNumber() {
        return phoneNumber;
    };

    public Appointment setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    };

    public String getPetName() {
        return petName;
    };

    public Appointment setPetName(String petName) {
        this.petName = petName;
        return this;
    };

    public String getMessage() {
        return message;
    };

    public Appointment setMessage(String message) {
        this.message = message;
        return this;
    };

    public AppointmentType getAppointmentType() {
        return appointmentType;
    };

    public Appointment setAppointmentType(AppointmentType appointmentType) {
        this.appointmentType = appointmentType;
        return this;
    };

    public LocalDate getAppointmentDate() {
        return appointmentDate;
    };

    public Appointment setAppointmentDate(LocalDate appointmentDate) {
        this.appointmentDate = appointmentDate;
        return this;
    };

    public LocalTime getAppointmentTime() {
        return appointmentTime;
    };

    public Appointment setAppointmentTime(LocalTime appointmentTime) {
        this.appointmentTime = appointmentTime;
        return this;
    };

    public LocalDateTime getRequestedTimeStamp() {
        return requestedTimeStamp;
    };

    public Appointment setRequestedTimeStamp(LocalDateTime requestedTimeStamp) {
        this.requestedTimeStamp = requestedTimeStamp;
        return this;
    };
};
