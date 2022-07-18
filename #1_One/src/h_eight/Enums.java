package h_eight;

//In Java, an enum (short for enumeration) is a type that has a fixed set of constant values. We use the enum keyword to declare enums.
enum Size {
    SMALL, MEDIUM, LARGE, EXTRA_LARGE
}

class Test {
    XSize pizzaSize;
    public Test(XSize pizzaSize) {
        this.pizzaSize = pizzaSize;
    }
    public void orderPizza() {
        switch (pizzaSize) {
            case SMALL -> System.out.println("I ordered a small size pizza.");
            case MEDIUM -> System.out.println("I ordered a medium size pizza.");
            case LARGE -> System.out.println("I ordered a large size pizza");
            default -> System.out.println("I don't know which one to order.");
        }
    }
}

class Main {
    public static void main(String[] args) {
        Test t1 = new Test(XSize.MEDIUM);
        t1.orderPizza();
    }
}
public class Enums {
}
