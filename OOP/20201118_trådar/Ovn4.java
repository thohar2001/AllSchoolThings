
public class Ovn4 {
    public static void main(String[] args) throws InterruptedException {
        Thread hello = new Thread(() -> {
            while(true) {
                System.out.println("Hello");
            }
        });

        hello.setDaemon(true);
        hello.start();

        Thread.sleep(500);
    }
}
