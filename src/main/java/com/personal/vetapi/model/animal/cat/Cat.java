package com.personal.vetapi.model.animal.cat;

import com.personal.vetapi.model.animal.Animal;
import com.personal.vetapi.model.user.User;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Cat extends Animal {

    @Column(nullable = false)
    private Double weight;
    @ColumnDefault("false")
    private boolean isSpayedOrNeutered;
    @ColumnDefault("false")
    private boolean needsVaccination;

    public Cat() {};

    public Cat(String name, Species species, String breed, String color, User owner, Double weight, boolean isSpayedOrNeutered, boolean needsVaccination) {
        super(name, species, breed, color, owner);
        this.weight = weight;
        this.isSpayedOrNeutered = isSpayedOrNeutered;
        this.needsVaccination = needsVaccination;
    };

    public Double getWeight() {
        return weight;
    };

    public Cat setWeight(Double weight) {
        this.weight = weight;
        return this;
    };

    public boolean isSpayedOrNeutered() {
        return isSpayedOrNeutered;
    };

    public Cat setSpayedOrNeutered(boolean spayedOrNeutered) {
        isSpayedOrNeutered = spayedOrNeutered;
        return this;
    };

    public boolean isNeedsVaccination() {
        return needsVaccination;
    };

    public Cat setNeedsVaccination(boolean needsVaccination) {
        this.needsVaccination = needsVaccination;
        return this;
    };
};
