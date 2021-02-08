public class Command implements Runnable {
    private String thePrint = "";

    public Command(String thePrintString) {
        thePrint = thePrintString;
    }
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(thePrint);
        }
    }
}
