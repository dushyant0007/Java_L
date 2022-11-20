package c_multithreading;

class ThreadOne implements Runnable{
    @Override
    public void run() {
        while (true){
            System.out.println("This is Tread One function");
        }
    }
}
class ThreadTow implements Runnable{
    @Override
    public void run() {
        while (true){
            System.out.println("This is Tread Tow function");
        }
    }
}

public class Two {
    public static void main(String[] args) {
        ThreadOne tOne = new ThreadOne();
        Thread t1 = new Thread(tOne);

        ThreadTow tTow = new ThreadTow();
        Thread t2 = new Thread(tTow);

        t1.start();
        t2.start();

    }
}
