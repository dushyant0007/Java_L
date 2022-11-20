package c_multithreading;

    class MyThr1 extends Thread{
        public MyThr1(String name){
            super(name);
        }
        public void run(){
            int i = 34;

            while(true){
//            System.out.println("I am a thread");
                System.out.println("Thank you: " + this.getName());
            }

        }
    }
public class Three_Constructor {
        public static void main(String[] args) {

            // Ready Queue: T1 T2 T3 T4 T5
            MyThr1 t1 = new MyThr1("Dj1");
            MyThr1 t2 = new MyThr1("Dj2");
            MyThr1 t3 = new MyThr1("Dj3");
            MyThr1 t4 = new MyThr1("Dj4");
            MyThr1 t5 = new MyThr1("Dj5 (most Important)");
//            t5.setPriority(Thread.MAX_PRIORITY);
            t5.setPriority(7);
            t1.setPriority(6);
            t2.setPriority(Thread.MAX_PRIORITY);
            t3.setPriority(1);
            t4.setPriority(Thread.MIN_PRIORITY);
            t5.setPriority(Thread.MIN_PRIORITY);

            t1.start();
            t2.start();
            t3.start();
            t4.start();
            t5.start();

        }
    }
