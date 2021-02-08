
public class Ex3 {
    public static int imBadYouKnowIt(int value) {
        Integer[] arr = { Integer.valueOf(0), null, Integer.valueOf(2) };
        int i = (int) (Math.random() * 5);
        return value / arr[i];
    }

    public static void main(String[] args) {
        try {
            imBadYouKnowIt(1);
        }
        catch (ArithmeticException ex) {
            System.err.println(ex.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.err.println(ex.getMessage());
        }
        catch (NullPointerException ex) {
            ex.printStackTrace();
        }
            
        
    }
}
