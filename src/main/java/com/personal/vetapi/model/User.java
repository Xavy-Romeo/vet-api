package com.personal.vetapi.model;

import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

@Entity(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int user_id;

    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false, unique = true)
    private String username;
    @Column(nullable = false, unique = true)
    private String password;
    @Column(nullable = false)
    private String email;

    @Enumerated
    @ColumnDefault("0")
    private Role role;

    public User() {};

    public User(String firstName, String lastName, String username, String password, String email, Role role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
    };

    public int getUser_id() {
        return user_id;
    };

    public User setUser_id(int user_id) {
        this.user_id = user_id;
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

};
