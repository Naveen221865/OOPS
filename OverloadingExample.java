package program;

public class OverloadingExample {

    void display() {
        System.out.println("Display method with no parameters");
    }

    void display(int a) {
        System.out.println("Display method with one integer: " + a);
    }

    void display(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        OverloadingExample obj = new OverloadingExample();

        obj.display();             // no arguments
        obj.display(10);           // integer argument
        obj.display("Naveen", 18);  // string and integer arguments
    }
}
