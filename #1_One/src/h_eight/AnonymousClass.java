package h_eight;
//A nested class that doesn't have any name is known as an anonymous class.

class Polygon {
    public void display() {
        System.out.println("Inside the Polygon class");
    }
}

class AnonymousDemo {
    public void createClass() {

        // creation of anonymous class extending class Polygon
        // Same syntax even if Polygon is an interface
        Polygon p1 = new Polygon() {
            public void display() {
                System.out.println("Inside an anonymous class.");
            }
        };
        p1.display();
    }
}

public class AnonymousClass {
    public static void main(String[] args) {
        AnonymousDemo an = new AnonymousDemo();
        an.createClass();
    }
}
