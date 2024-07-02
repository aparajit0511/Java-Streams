package singleton;

public class LazySingleton {
    
    private static LazySingleton obj ;
    
    private LazySingleton(){
        System.out.println("LAzy Singelton");
    }
    
    public static synchronized LazySingleton getInstance(){
        if(obj == null){
            obj = new LazySingleton();
        }
        return obj;
    }

    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                LazySingleton obj = LazySingleton.getInstance();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                LazySingleton obj1 = LazySingleton.getInstance();
            }
        });

        t1.start();
        t2.start();

    } // main
} // class
