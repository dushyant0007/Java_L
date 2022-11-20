package a_one;

public class Four_Conditional_Statement {
    public static void main(String[] args) {

        {
            int x = 20;
            if (x < 10) {
                System.out.println("The x is smaller the 10");
            } else if (x == 10) {
                System.out.println("The x is equal to 10");
            } else {
                System.out.println("The x is bigger the 10");
            }
        }

        int age = 21;
        switch (age){
            case 1 :
                System.out.println("The age is 1");
                break;
            case 12 :
                System.out.println("The age is 12");
                break;
            case 18:
                System.out.println("The age is 18");
                break;
            case 21 :
                System.out.println("The age is 21");
                break;
            default:
                System.out.println("This is default");
        }


        switch (age) {
            case 1 -> {
                System.out.println("The age is 1");
                System.out.println("The age is very small");
            }
            case 12 -> System.out.println("The age is 12");
            case 18 -> System.out.println("The age is 18");
            case 21 -> System.out.println("The age is 21");
            default -> System.out.println("This is default");
        }

        int t = 12;
        while (t < 20){
            System.out.println(t);
            t++;
        }

        do {
            System.out.println(t+" DO While Loop");
            t++;
        }while (t!=40);

        for (int i = 0; i<=99 ; i++){
            System.out.println("The value i of is "+ i);
        }


//        for (int i=0;i<50;i++){
//            System.out.println(i);
//            System.out.println("Java is great");
//            if(i==2){
//                System.out.println("Ending the loop");
//                break;
//                // This break going to break the  for-loop when i == 2
//            }
//        }

            for(int i=0;i<50;i++){
            if(i==2){
                System.out.println("Ending the loop");
                continue;
                // The-continue is going to skip the iteration of loop when i == 2
            }
                System.out.println(i);
                System.out.println("Java is great");
        }

//        int i=0;
//        do{
//            i++;
//            if(i==2){
//                System.out.println("Ending the loop");
//                continue;
//            }
//            System.out.println(i);
//            System.out.println("Java is great");
//
//        }while(i<5);
//        System.out.println("Loop ends here");


    }
    }


