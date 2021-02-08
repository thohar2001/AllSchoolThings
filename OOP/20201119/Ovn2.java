import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Ovn2 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService exe = Executors.newCachedThreadPool();


        Command j1 = new Command("j1");
        Command j2 = new Command("j2");
        Command j3 = new Command("j3");
        Command j4 = new Command("j4");
        Command j5 = new Command("j5");

        exe.submit(j1);
        exe.submit(j2);
        exe.submit(j3);
        exe.submit(j4);
        exe.submit(j5);
        exe.shutdown();
        exe.awaitTermination(1, TimeUnit.MINUTES);

        
    }

}