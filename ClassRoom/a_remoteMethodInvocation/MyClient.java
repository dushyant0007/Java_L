import java.rmi.*;  
public class MyClient{  
public static void main(String args[]){  
try{  
Adder stub=(Adder)Naming.lookup("rmi://localhost:5000/sonoo");  
int ans = stub.add(Integer.valueOf(args[0]),Integer.valueOf(args[1])); 
System.out.println(ans);
}catch(Exception e){}  
}  
}  