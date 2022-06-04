package two_oops;

class Employee {
    int id;
    String name;
    private String address;

    public void setAddress(String address) {
        this.address = address;
    }

    public void printDetails() {
        System.out.println("Name = " + name + ", Id = " + id + ", Address = " + address);
    }

    Employee() {
        this.id = -1;
        this.name = "";
        this.address = "";
    }

    Employee(int a, String b) {
        this.id = a;
        this.name = b;
        this.address = "";
    }
}

public class One {
    public static void main(String[] args) {

        Employee dj1 = new Employee();
        dj1.id = 1;
        dj1.name = "Dushyant1";
//        System.out.println("Name = "+dj1.name+", Id = "+dj1.id);
        dj1.printDetails();

        Employee dj2 = new Employee(2, "Dushyant2");
        dj2.printDetails();
        dj2.setAddress("Address of dj2");


    }
}
