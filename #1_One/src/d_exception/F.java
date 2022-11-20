package d_exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class F {

    public static void main(String[] args) {
        try {
            int array[] = new int[10];
            array[10] = 30 / 0;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

}
