package h_eight;

//The ordinal() method returns the position of an enum constant.
//The compareTo() method compares the enum constants based on their ordinal value.
//The toString() method returns the string representation of the enum constants.
//The name() method returns the defined name of an enum constant in string form. The returned value from the name() method is final.
//The valueOf() method takes a string and returns an enum constant having the same string name.

enum S_size {
    SMALL, MEDIUM, LARGE, EXTRA_LARGE;

    public String getSize() {

        // this will refer to the object SMALL
        return switch (this) {
            case SMALL -> "small";
            case MEDIUM -> "medium";
            case LARGE -> "large";
//            case EXTRA_LARGE -> "extra large";
            default -> null;
        };
    }

    public static void main(String[] args) {

        // call getSize()
        // using the object SMALL
        System.out.println("The size of the pizza is " + S_size.SMALL.getSize());
    }
}

public class EnumsClass {
}
