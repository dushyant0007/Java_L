package g_seven;


class Animal {

    // inner class
    class Reptile {
        public void displayInfo() {
            System.out.println("I am a reptile.");
        }
    }
    // static class
    static class Mammal {
        int x = 5;

        public void displayInfo() {
            System.out.println("I am a mammal.");
            eat();
        }
    }

    public static  void eat() {
        System.out.println("I eat food.");
    }

}

public class Five {

    public static void main(String[] args) {
        // object creation of the outer class
        Animal animal = new Animal();

        // object creation of the non-static class
        Animal.Reptile reptile = animal.new Reptile();
        reptile.displayInfo();

        // object creation of the static nested class
        Animal.Mammal mammal = new Animal.Mammal();
        mammal.displayInfo();

    }

    }
