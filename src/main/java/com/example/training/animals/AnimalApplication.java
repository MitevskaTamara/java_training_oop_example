package com.example.training.animals;

import com.example.training.Cat;

public class AnimalApplication {
  public static void main(String[] args) {
    //modify variable and function in order to test modifiers from any class in same package
    Animal animal = new Animal();
    animal.testModifiers();
    animal.eat();
    System.out.println(animal.breed);

    //modify variable and function in order to test modifiers from child class in same package
    Dog dog = new Dog();
    dog.eat();
    System.out.println(dog.breed);

    //modify variable and function in order to test modifiers from a subclass outside the same package
    Cat cat = new Cat();
    cat.eat();
    System.out.println(cat.breed);
  }
}
