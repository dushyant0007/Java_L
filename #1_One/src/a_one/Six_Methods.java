package a_one;

public class Six_Methods {

 // Only static methods can be called by static method
//  public static int Sum(int a,int b){
//     return a+b;
// }
  public  int sum(int a,int b){
        return a+b;
    }

    // Taking infinite arguments
    public static int sumAll(int ...arr){
      int ans = 0;
      for (int x : arr) ans = ans+x;
      return ans;

    }

    public static void main(String[] args) {

        int a = 19;
        int b = 15;
//        int c = sum(a,b);

        Six_Methods pq = new Six_Methods();
         int c =  pq.sum(a,b);
        System.out.println(c);

        System.out.println("The sum all  = "+sumAll(1,2,3,4,99));

    }

}
