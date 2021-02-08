public class Ex1 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        }
        catch(RuntimeException ex) {
            ex.printStackTrace();
        }
    }
}
