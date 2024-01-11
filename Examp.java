// Superclass
class Animal {
    void makeSound() {
        System.out.println("Some generic sound");
    }
}

// Subclass
class Dog extends Animal {
    // Overrides the makeSound method in the superclass
    @Override
    void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

// Subclass
class Cat extends Animal {
    // Overrides the makeSound method in the superclass
    @Override
    void makeSound() {
        System.out.println("Meow!");
    }


//public class TestOverride {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        // Calls the overridden methods
        animal1.makeSound();  // Outputs: Woof! Woof!
        animal2.makeSound();  // Outputs: Meow!
    }
}
