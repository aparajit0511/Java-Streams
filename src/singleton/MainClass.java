package singleton;

public class MainClass {

    public static void main(String[] args) {


        // Eager Initialization
        Singleton obj = Singleton.getInstance();
        System.out.println(obj);
    }

}
