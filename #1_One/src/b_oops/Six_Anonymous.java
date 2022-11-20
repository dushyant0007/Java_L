package b_oops;

// Interface having only one method is called FunctionalInterface
@FunctionalInterface
interface DemoAno {
    void meth1(int a);
//    void meth2();
}


 class HarryFunc implements DemoAno{
    @Override
    public void meth1(int a) {
        System.out.println("This is method 1");
    }
}

class AnonyDemo implements DemoAno{
    public void display(){
        System.out.println("Hello");
    }

    @Override
    public void meth1(int a) {
        System.out.println("I am meth1");
    }

//    @Override
//    public void meth2() {
//        System.out.println("I am meth2");
//    }
}

public class Six_Anonymous {

    public static void main(String[] args) {
        DemoAno odd = new AnonyDemo();
        odd.meth1(7);

        // Anonymous Class
//        DemoAno obj = new DemoAno() {
//            @Override
//            public void meth1() {
//                System.out.println("I am meth1");
//            }
//
//            @Override
//            public void meth2() {
//                System.out.println("I am meth2");
//            }
//        };
//        obj.meth1();

        // Lambda Expressions // Used for  FunctionalInterface

        DemoAno objj = new HarryFunc();
        objj.meth1(4);

        DemoAno obj = (a) -> {
            System.out.println("I am method 1 from this lambda " + a);
        };
        obj.meth1(6);
    }
}

class Lambda_Expression{
    // Look above
}