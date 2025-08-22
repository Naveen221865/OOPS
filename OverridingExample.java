package program;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class OverridingExample {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound(); // Animal's method

        Dog d = new Dog();
        d.sound(); // Dog's overridden method

        Animal obj = new Dog();
        obj.sound(); // Dog's overridden method (runtime polymorphism)
    }
}
