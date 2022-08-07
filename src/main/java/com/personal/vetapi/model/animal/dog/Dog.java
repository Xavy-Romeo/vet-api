package com.personal.vetapi.model.animal.dog;

import com.personal.vetapi.model.animal.Animal;
import com.personal.vetapi.model.animal.Species;
import com.personal.vetapi.model.user.User;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

@Entity(name = "dogs")
public class Dog extends Animal {

    @Column(nullable = false)
    private Double weight;
    @ColumnDefault("false")
    private boolean isSpayedOrNeutered;
    @ColumnDefault("false")
    private boolean needsVaccination;

    public Dog() {
    };

    public Dog(String name, Species species, String breed, String color, User owner, Double weight, boolean isSpayedOrNeutered, boolean needsVaccination) {
        super(name, species, breed, color, owner);
        this.weight = weight;
        this.isSpayedOrNeutered = isSpayedOrNeutered;
        this.needsVaccination = needsVaccination;
    };

    public Double getWeight() {
        return weight;
    };

    public Dog setWeight(Double weight) {
        this.weight = weight;
        return this;
    };

    public boolean isSpayedOrNeutered() {
        return isSpayedOrNeutered;
    };

    public Dog setSpayedOrNeutered(boolean spayedOrNeutered) {
        isSpayedOrNeutered = spayedOrNeutered;
        return this;
    };

    public boolean isNeedsVaccination() {
        return needsVaccination;
    };

    public Dog setNeedsVaccination(boolean needsVaccination) {
        this.needsVaccination = needsVaccination;
        return this;
    };
};
