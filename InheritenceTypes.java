package module2;

/*
 * Inheritance Types in Java:
 * 1. Single Inheritance
 * 2. Multilevel Inheritance
 * 3. Hierarchical Inheritance
 * 4. Hybrid Inheritance
 *
 * Note:
 * Java does not support multiple inheritance using classes,
 * so hybrid inheritance is shown using classes + interfaces.
 */

// Base class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// 1. Single Inheritance
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// 2. Multilevel Inheritance
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy is weeping");
    }
}

// 3. Hierarchical Inheritance
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

// Interface used for Hybrid Inheritance
interface Pet {
    void play();
}

interface Friendly {
    void greet();
}

// 4. Hybrid Inheritance
// Combination of class inheritance + multiple interfaces
class HybridDog extends Animal implements Pet, Friendly {
    public void play() {
        System.out.println("HybridDog is playing");
    }

    public void greet() {
        System.out.println("HybridDog is greeting");
    }
}

public class InheritenceTypes {
    public static void main(String[] args) {

        // Single inheritance
        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        System.out.println();

        // Multilevel inheritance
        Puppy puppy = new Puppy();
        puppy.eat();
        puppy.bark();
        puppy.weep();

        System.out.println();

        // Hierarchical inheritance
        Cat cat = new Cat();
        cat.eat();
        cat.meow();

        System.out.println();

        // Hybrid inheritance
        HybridDog hybridDog = new HybridDog();
        hybridDog.eat();
        hybridDog.play();
        hybridDog.greet();
    }
}