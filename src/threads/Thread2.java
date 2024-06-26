package threads;

public class Thread2 implements Runnable{

    @Override
    public void run() {
        int k = 1;
        for(int i = 1; i <= 10; i++){
            k = k * i;
            System.out.println("Factorial is ->" + k);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
