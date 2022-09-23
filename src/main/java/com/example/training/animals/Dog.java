package com.example.training.animals;

public class Dog extends Animal implements AnimalBehaviour{
  public Dog() {}

  @Override
  public void run() {
    System.out.println("Animal is running!");
  }

  public String breadName() {
    return this.breed;
  }
}
