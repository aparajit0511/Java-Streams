package threads;

public class MyThread {
    public static void main(String[] args) {



        Thread1 thread1 = new Thread1() ;
        Thread2 thread2 = new Thread2();
        Thread3 thread3 = new Thread3();

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
//        t1.start();
//        t2.start();

        Thread t3 = new Thread(thread3);
        t3.start();

//        for(int i=1;i<10;i++){
//
//        }

    }
}
