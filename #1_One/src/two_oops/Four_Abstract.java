package two_oops;
// Abstract class -> Having at least one Abstract Function

import java.lang.reflect.Constructor;

abstract class Class1{
    Class1(){
        System.out.println("Constructor in Class1");
    }
    public void Hello(){
        System.out.println("HELLO in Class1");
    }

    //You have to declare class as abstract if class contain abstract method
    abstract public void greet();
}

class Class2 extends Class1 {

    @Override
    public void greet() {
        System.out.println("Overriding in Class2");
    }
}

public class Four_Abstract {
    public static void main(String[] args) {

    }
}
