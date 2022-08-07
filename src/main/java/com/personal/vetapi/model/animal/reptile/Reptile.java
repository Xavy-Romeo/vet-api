package com.personal.vetapi.model.animal.reptile;

import com.personal.vetapi.model.animal.Animal;
import com.personal.vetapi.model.animal.Species;
import com.personal.vetapi.model.user.User;

import javax.persistence.Entity;

@Entity(name = "reptiles")
public class Reptile extends Animal {

  private ReptileSpecies reptileSpecies;

  public Reptile() {};

  public Reptile(String name, Species species, String breed, String color, User owner, ReptileSpecies reptileSpecies) {
    super(name, species, breed, color, owner);
    this.reptileSpecies = reptileSpecies;
  };
};
