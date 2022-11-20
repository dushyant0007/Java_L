package g_seven;

class MotherBoard {
    String model;

    public MotherBoard(String model) {
        this.model = model;
    }

    static class USB{
        int usb2 = 2;
        int usb3 = 1;
        int getTotalPorts(){
            // accessing the variable model of the outer class
//            non-static variable this cannot be referenced from a static context
            if(true
                  //  MotherBoard.this.model.equals("MSI")
            ) {
                return 4;
            }
            else {
                return usb2 + usb3;
            }
        }
    }
}

public class Four {

    public static void main(String[] args) {

        // create an object of the static nested class
        MotherBoard.USB usb = new MotherBoard.USB();
        System.out.println("Total Ports = " + usb.getTotalPorts());
    }
}

