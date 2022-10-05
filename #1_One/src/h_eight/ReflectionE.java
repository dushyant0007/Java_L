package h_eight;

import java.lang.Class;
import java.lang.reflect.*;

class Dog_E {

    // public constructor without parameter
    public Dog_E() {
    }

    // private constructor with a single parameter
    private Dog_E(int age) {
    }

}

public class ReflectionE {
    public static void main(String[] args) {

            // create an object of Dog
            Dog_E d1 = new Dog_E();

            // create an object of Class
            // using getClass()
            Class obj = d1.getClass();

            // get all constructors of Dog (Public + Private)
            Constructor[] constructors = obj.getDeclaredConstructors();

            for (Constructor c : constructors) {

                // get the name of constructors
                System.out.println("Constructor Name: " + c.getName());

                // get the access modifier of constructors
                // converts it into string form
                int modifier = c.getModifiers();
                String mod = Modifier.toString(modifier);
                System.out.println("Modifier: " + mod);

                // get the number of parameters in constructors
                System.out.println("Parameters: " + c.getParameterCount());
                System.out.println("");
            }
        }
}



