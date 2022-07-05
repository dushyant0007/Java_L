package h_eight;

enum XSize {

    // enum constants calling the enum constructors
    SMALL("The size is small."),
    MEDIUM("The size is medium."),
    LARGE("The size is large."),
    EXTRALARGE("The size is extra large.");

    private final String pizzaSize;

    // private enum constructor
    private XSize(String pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public String getSize() {
        return pizzaSize;
    }
}


public class EnumsConstructor {
    public static void main(String[] args) {
    XSize size = XSize.SMALL;
    System.out.println(size.getSize());
}
}
