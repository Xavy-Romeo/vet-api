package com.personal.vetapi.model.animal.bird;

import com.personal.vetapi.model.animal.Animal;
import com.personal.vetapi.model.animal.Species;
import com.personal.vetapi.model.user.User;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.Entity;

@Entity(name = "birds")
public class Bird extends Animal {

    @ColumnDefault("false")
    private Boolean hasWingsClipped;

    public Bird() {};

    public Bird(String name, Species species, String breed, String color, User owner, Boolean hasWingsClipped) {
        super(name, species, breed, color, owner);
        this.hasWingsClipped = hasWingsClipped;
    };

    public Boolean getHasWingsClipped() {
        return hasWingsClipped;
    };

    public Bird setHasWingsClipped(Boolean hasWingsClipped) {
        this.hasWingsClipped = hasWingsClipped;
        return this;
    };
};
