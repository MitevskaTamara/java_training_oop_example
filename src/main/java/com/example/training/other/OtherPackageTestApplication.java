package com.example.training.other;

import com.example.training.animals.Animal;

public class OtherPackageTestApplication {
  public static void main(String[] args) {
    Animal animal = new Animal();
    animal.eat();
    System.out.println(animal.breed);
  }
}
