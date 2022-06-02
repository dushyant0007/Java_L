package one;
import java.util.Scanner;

public class Five_Array {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        int [] marks = new int[10];
        int [][] twoD = new int[4][5];

        for (int i = 0;i<twoD.length;i++){
            for (int j = 0 ; j<twoD[i].length;j++){
                twoD[i][j] = sc.nextInt();
            }
        }

        for (int [] x : twoD){
            for (int y : x){
                System.out.print(y+" ");
            }
            System.out.println();
        }


        int [][][] threeD = {
                {{12, 43, 24, 256},{3,9,84,8,5},{85,55,43}},
                {{345, 98, 87, 77},{4,564,346,35,77,33},{31,562}},
        };

        System.out.println(threeD[1][0][3]);

    }
}
