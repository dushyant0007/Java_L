package b_oops;

//                    accessible in  same class    Same package  Diff package
//public                   Yes;                                  yes;               yes;
//protected            Yes;                                   yes;              yes;
//default                Yes;                                   yes;               No;
//private                 Yes;                                   NO;               No;




class Base {
    int x;

    public Base() {
        x = 0;
        System.out.println("Base class constructor");
    }

    public Base(int x) {
        this.x = x;
        System.out.println("Base class constructor");
    }
}

class Derived extends Base {
    int y;

    public Derived() {
        y = 0;
        System.out.println("Derived class constructor");
    }

    public Derived(int y) {
        this.y = y;
        System.out.println("Derived class constructor");
    }

    public Derived(int x, int y) {
        // Calling base call constructor should be in first line because java first call base class constructor
        super(x); //Super refers to base class constructor who have one int argument
        this.y = y;
        System.out.println("Derived class constructor");
    }
    public void method(){
        System.out.println("In Derived class");
    }
}
class ChildOfDerived extends  Derived{

    @Override
    public void method(){
        System.out.println("Method in child of Derived class");
    }
    ChildOfDerived(){
        System.out.println("I am a child of derived constructor");
    }
    ChildOfDerived(int x, int y, int z){
        super(x, y);
        System.out.println("I am an overloaded constructor of Derived with value of z as: " + z);
    }

}

public class Two_Inheritance {
    public static void main(String[] args) {

        //First base class constructor going to run and derived /
        //Derived obj1 = new Derived();
        //Derived obj2 = new Derived(10);
        Derived obj3 = new Derived(10, 32);

    }
}
