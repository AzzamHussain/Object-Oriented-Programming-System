// Abstract class
abstract class Shape {
    // Abstract method
    abstract void draw();

    // Concrete method
    void display() {
        System.out.println("This is a shape.");
    }
}

// Concrete class extending the abstract class
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }


//public class AbstractionExample {
    public static void main(String[] args) {
        // Creating an instance of Circle
        Circle circle = new Circle();

        // Calling methods from abstract class
        circle.draw();
        circle.display();
    }
}
