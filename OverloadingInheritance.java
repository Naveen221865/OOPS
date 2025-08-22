package program;

class Shape {   // Base class
    void area() {
        System.out.println("Area method with no parameters");
    }

    void area(int side) {
        System.out.println("Area of square: " + (side * side));
    }
}

class Rectangle extends Shape {
    void area(int length, int width) {
        System.out.println("Area of rectangle: " + (length * width));
    }
}

public class OverloadingInheritance {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(); // Use Rectangle so we can access all methods

        rect.area();           // No parameter method from Shape
        rect.area(5);          // Square area method from Shape
        rect.area(6, 4);       // Rectangle area method from Rectangle
    }
}
