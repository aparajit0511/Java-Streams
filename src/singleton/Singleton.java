package singleton;

public class Singleton {
    private static Singleton obj = new Singleton();
    
    private Singleton(){
        System.out.println("Singleton was called");
    }
    
    public static Singleton getInstance(){
        return obj;
    }

//    public static void main(String[] args) {
//        Singleton obj = Singleton.getInstance();
//        System.out.println(obj);
//    }
}
