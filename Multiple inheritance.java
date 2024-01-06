// Define the first class
class Animal {
    void makeSound() {
        System.out.println("Generic animal sound");
    }
}

// Define the second class
class Mammal {
    void giveBirth() {
        System.out.println("Mammal gives birth");
    }
}

// Implement a class that extends both Animal and Mammal
class Dog extends Animal {
    void bark() {
        System.out.println("Woof! Woof!");
    }


// Test the multiple inheritance
//public class MultipleInheritanceExample {
    public static void main(String[] args) {
        // Create an instance of the Dog class
        Dog myDog = new Dog();

        // Call methods from both Animal and Mammal
        myDog.makeSound();
        myDog.bark();
        // Since Dog extends Animal, you can also access methods from Animal directly
        //myDog.giveBirth(); // This will not compile, as Dog doesn't directly extend Mammal
    }
}

