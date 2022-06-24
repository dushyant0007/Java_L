package h_eight;

//In Java, reflection allows us to inspect and manipulate classes, interfaces, constructors, methods, and fields at run time.

//There is a class in Java named Class that keeps all the information about objects and classes at runtime.
//The object of Class can be used to perform reflection.

//There exists three ways to create objects of Class:

//class Dog {...}
//
//    // create object of Class
//// to reflect the Dog class
//    Class a = Class.forName("Dog");


//// create an object of Dog class
//Dog d1 = new Dog();
//
//// create an object of Class
//// to reflect Dog
//        Class b = d1.getClass();


//// create an object of Class
//// to reflect the Dog class
//        Class c = Dog.class;


import java.lang.Class;
import java.lang.reflect.*;

class Animal {
}

// put this class in different Dog.java file
class Dog extends Animal {
    public void display() {
        System.out.println("I am a dog.");
    }
}

// put this in Main.java file
public class ReflectionA {
    public static void main(String[] args) {
        try {
            // create an object of Dog
            Dog_D d1 = new Dog_D();

            // create an object of Class
            // using getClass()
            Class obj = d1.getClass();

            // get name of the class
            String name = obj.getName();
            System.out.println("Name: " + name);

            // get the access modifier of the class
            int modifier = obj.getModifiers();

            // convert the access modifier to string
            String mod = Modifier.toString(modifier);
            System.out.println("Modifier: " + mod);

            // get the superclass of Dog
            Class superClass = obj.getSuperclass();
            System.out.println("Superclass: " + superClass.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



