package d_exception;

//Unchecked Exceptions: They are not checked at compile-time but at run-time.
// For example: ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, exceptions under Error class, etc.
//unchecked exception. It's usually not necessary to handle unchecked exceptions.

// Checked Exceptions: They are checked at compile-time. For example, IOException, InterruptedException, etc.

public class A_One {

    public static void main(String[] args) {
        int [][] arr = new int[3][4];
        arr[2][3] = 0;

        int a = 6000;
        int b = 0;
        // Without Try:
//        int c = a / b;
//        System.out.println("The result is " + c);
        // With Try:
        try {
            int c = a / b;
            System.out.println("The result is " + c);
        } catch (Exception e) {
            System.out.println("We failed to divide. Reason: ");
            System.out.println(e);
            System.out.println("Error => "+ e.getMessage());
        }
        System.out.println("End of the program");
    }
}
