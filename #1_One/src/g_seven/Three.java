package g_seven;

class MotherBoard1 {

    // static nested class
    static class USB {
        int usb2 = 2;
        int usb3 = 1;

        int getTotalPorts() {
            return usb2 + usb3;
        }
    }
}

public class Three {
    public static void main(String[] args) {

        // create an object of the static nested class
        // using the name of the outer class
        MotherBoard1.USB usb = new MotherBoard1.USB();
        System.out.println("Total Ports = " + usb.getTotalPorts());
    }
}

