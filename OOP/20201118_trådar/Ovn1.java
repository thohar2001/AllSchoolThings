public class Ovn1 {

    public static class HelloThread implements Runnable {
        @Override
        public void run() {
            for(int i = 0; i < 1000; i++) {
                System.out.println("Hello");
            }
            
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Thread hello = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("Hello");
            }
        });
        hello.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("World");
        }
        // join() gör att tråden kör tills den är färdig, sen "joinar" den med huvudtråden som sedan kör sitt.
        hello.join();

        System.out.println("Time to quit!");
    }
}