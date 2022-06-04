package two_oops;

//Interface -> Having all methods as abstract

interface abc{
    abstract public void abcone();
    abstract public void abctow();
}

interface cde extends abc{
    // Inheritance in interface
    abstract public void cdeone();
    abstract public void cdetow();
}


interface I{
    // Variables in Interface are Final
    int a = 40;
    abstract public void one();
    abstract public void tow();

    private void greet(){
        System.out.println("Hello");
    }

    //IF we update the interface then we have to go to all the classes and define that method
    // To solve the problem we use default keyword
    default void three(){
        greet();
        System.out.println("This is the default method in the interface");
        System.out.println("we don't need to override the method and we can if we want to");
    }

}

class K implements I{

    @Override
    public void one() {
        System.out.println("Overriding Method one of interface I");
    }

    @Override
    public void tow() {
        System.out.println("Overriding method tow of interface I");
    }
}


public class Five_Interface {
    public static void main(String[] args) {

    }
}
