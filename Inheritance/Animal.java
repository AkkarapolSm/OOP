package Inheritance;

public class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}
class Dog extends Animal {

    void run() {
        System.out.println("Running Quick Quick");
    }

    void bark() {
        System.out.println("Barking Hong Hong");
    }
}
