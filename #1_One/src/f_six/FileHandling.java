package f_six;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) throws IOException {

        // To create file and other information about file
        File myFile = new File("Hello.txt");
        try {
            boolean x = myFile.createNewFile();
            if (x) {
                System.out.println("File is created");
            } else System.out.println("File is already created");
        } catch (IOException e) {
            System.out.println("Unable to create this file");
            throw new RuntimeException(e);
        }


        //Write File
        try {
            FileWriter fileWriter = new FileWriter("Hello.txt");
            int i = 0;
            while (i < 9) {
                fileWriter.write(i + " This is the first java course\n");
                fileWriter.write("8989\n");
                fileWriter.write(String.valueOf(new FileHandling()) + "\n");
                i++;
            }
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Append File
        FileWriter fw = new FileWriter("Hello.txt", true);
        fw.write("taoei oamop");
        fw.close();


        //Read File
        // or  File reader object
        Scanner sc = new Scanner(myFile);
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
        sc.close();


    }
}
