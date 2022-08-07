package com.personal.vetapi.model.animal;

import com.personal.vetapi.model.user.User;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

@MappedSuperclass
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long animalId;

    @Column(name = "pet_name")
    @ColumnDefault("J. Doe")
    private String name;

    @Column(nullable = false)
    @Enumerated
    private Species species;
    @Column(nullable = false)
    private String breed;
    @Column(nullable = false)
    private String color;

    @Column(nullable = false)
    @ManyToOne
    private User owner;

    public Animal() {};

    public Animal(String name, Species species, String breed, String color, User owner) {
        this.name = name;
        this.species = species;
        this.breed = breed;
        this.color = color;
        this.owner = owner;
    };

    public String getName() {
        return name;
    };

    public Animal setName(String name) {
        this.name = name;
        return this;
    };

    public Species getSpecies() {
        return species;
    };

    public Animal setSpecies(Species species) {
        this.species = species;
        return this;
    };

    public String getBreed() {
        return breed;
    };

    public Animal setBreed(String breed) {
        this.breed = breed;
        return this;
    };

    public String getColor() {
        return color;
    };

    public Animal setColor(String color) {
        this.color = color;
        return this;
    };

    public User getOwner() {
        return owner;
    };

    public Animal setOwner(User owner) {
        this.owner = owner;
        return this;
    };
};
