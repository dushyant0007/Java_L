package one;
import java.util.Locale;
import java.util.Scanner;

public class Three_Strings {
    public static void main(String[] args) {
        // Strings are  immutable in java
        String name = "Dushyant";
        String nname = new String("Dushyant");
        System.out.println(name);
        System.out.println(nname);

        int a = 160;
        float b = 23.93f;

        System.out.printf("The first number is %d and the second number is %f", a,b);
        System.out.println();

//        Scanner sc = new Scanner(System.in);
//        String x = sc.nextLine();
//        String y=  sc.next();
//
//        System.out.println(x+" - "+y);
//        System.out.println("x.length -> "+x.length()+" , "+"x.toLowerCase -> "+x.toLowerCase());

        System.out.println(name.substring(1));
        System.out.println(name.substring(1,5));

        System.out.println(name.replace('u', 'p'));
        System.out.println(name.replace("n", "nn"));

        System.out.println(name.startsWith("Har"));
        System.out.println(name.endsWith("dd"));

        System.out.println(name.charAt(4));

        String modifiedName = "Dushshyayant";
        System.out.println(modifiedName.indexOf("yay"));
        System.out.println(modifiedName.indexOf("yan", 4));
        System.out.println(modifiedName.lastIndexOf("u", 7));

        System.out.println(name.equals("Dushyant"));
        System.out.println(name.equalsIgnoreCase("dushyaNT"));

        System.out.println("I am escape sequence \"double quote\" ");



    }
}
