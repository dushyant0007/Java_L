package three_multithreading;

class MyThread1 extends Thread{
    @Override
    public void run() {
        int i = 0;
        while (i<200) {
            System.out.println(i + " My thread 1 is running and i am happy");
            i++;
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run() {
        int i = 0;
        while (i<200){
            System.out.println(i +" My thread 2 is running and i am happy");
            i++;
        }
    }
}


public class One {
    public static void main(String[] args) {

        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();

    }
}
