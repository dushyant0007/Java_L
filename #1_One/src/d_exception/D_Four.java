package d_exception;

class NegativeRadiusException extends Exception {
    @Override
    public String toString() {
        return " .toString => Radius cannot be negative!";
    }

    @Override
    public String getMessage() { return " .getMessage => Radius cannot be negative!"; }
}

public class D_Four {

    public static double area(int r) throws NegativeRadiusException {
        if (r < 0) {
            throw new NegativeRadiusException();
        }
        return Math.PI * r * r;
    }

    public static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static void main(String[] args) {
        try {
//            System.out.println( divide(6, 0));
            double ar = area(-8);
            System.out.println(ar);
        } catch (Exception e) {
            System.out.println("Exception");
            System.out.println(e);
        }

    }
}

