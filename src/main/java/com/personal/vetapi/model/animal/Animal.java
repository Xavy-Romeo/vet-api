package com.personal.vetapi.model.animal;

import com.personal.vetapi.model.user.User;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

@Entity(name = "animals")
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long animalId;

    @Column(name = "pet_name")
    @ColumnDefault("J. Doe")
    private String name;

    @Column(nullable = false)
    @ManyToOne
    private User owner;

    public Animal() {};

    public Animal(String name, User owner) {
        this.name = name;
        this.owner = owner;
    };

    public String getName() {
        return name;
    }

    public Animal setName(String name) {
        this.name = name;
        return this;
    }

    public User getOwner() {
        return owner;
    }

    public Animal setOwner(User owner) {
        this.owner = owner;
        return this;
    }
};
