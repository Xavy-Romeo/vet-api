package com.personal.vetapi.model.user;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;

    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false, unique = true)
    private String username;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false, unique = true)
    private String email;

    @Enumerated
    @ColumnDefault("0")
    private Role role;

    @CreationTimestamp
    private LocalDateTime creationTimeStamp;
    @UpdateTimestamp
    private LocalDateTime updateTimeStamp;

    public User() {};

    public User(String firstName, String lastName, String username, String password, String email, Role role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
    };

    public Long getUserId() {
        return userId;
    };

    public User setUserId(Long userId) {
        this.userId = userId;
        return this;
    };

    public String getFirstName() {
        return firstName;
    };

    public User setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    };

    public String getLastName() {
        return lastName;
    };

    public User setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    };

    public String getUsername() {
        return username;
    };

    public User setUsername(String username) {
        this.username = username;
        return this;
    };

    public String getPassword() {
        return password;
    };

    public User setPassword(String password) {
        this.password = password;
        return this;
    };

    public String getEmail() {
        return email;
    };

    public User setEmail(String email) {
        this.email = email;
        return this;
    };

    public Role getRole() {
        return role;
    };

    public User setRole(Role role) {
        this.role = role;
        return this;
    };

    public LocalDateTime getCreationTimeStamp() {
        return creationTimeStamp;
    };

    public User setCreationTimeStamp(LocalDateTime creationTimeStamp) {
        this.creationTimeStamp = creationTimeStamp;
        return this;
    };

    public LocalDateTime getUpdateTimeStamp() {
        return updateTimeStamp;
    };

    public User setUpdateTimeStamp(LocalDateTime updateTimeStamp) {
        this.updateTimeStamp = updateTimeStamp;
        return this;
    };
};
