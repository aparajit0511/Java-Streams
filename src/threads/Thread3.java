package threads;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Thread3 implements Runnable{
    @Override
    public void run() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        for(int i=1;i<=20;i++){
            System.out.println( "Current date time "+ dtf.format(now));
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
