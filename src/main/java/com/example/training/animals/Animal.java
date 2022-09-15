package com.example.training.animals;

public class Animal {
  public String breed;

  public Animal() {
    this.breed = "Beagle";
  }
  public void eat() {
    System.out.println("Animal is eating!");
  }

  //modify breed and eat in order to test modifiers from the same class
  public void testModifiers() {
    this.eat();
    System.out.println(this.breed);
  }
}
