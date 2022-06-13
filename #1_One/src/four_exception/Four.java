package four_exception;

class NegativeRadiusException extends Exception {
    @Override
    public String toString() {
        return "Radius cannot be negative!";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative!";
    }
}

public class Four {

    public static double area(int r) throws NegativeRadiusException {
        if (r < 0) {
            throw new NegativeRadiusException();
        }
        return Math.PI * r * r;
    }

    public static int divide(int a, int b) throws ArithmeticException {
        // Made By Harry
        return a / b;
    }

    public static void main(String[] args) {
        // Shivam - uses divide function created by Harry
        try {
//            System.out.println( divide(6, 0));
            double ar = area(6);
            System.out.println(ar);
        } catch (Exception e) {
            System.out.println("Exception");
        }


    }
}

