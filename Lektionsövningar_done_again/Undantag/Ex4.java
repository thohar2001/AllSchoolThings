public class Ex4 {

    public static void catchStuff() {
        try {
            evilStuff();
        }
        catch (EgetException ex) {
            System.err.println(ex.getMessage());
            ex.printStackTrace();
        }

    }

    public static void evilStuff() throws EgetException {
        throw new EgetException("Done goofed boy.");
    }
    public static void main(String[] args) {

        catchStuff();
    }
}
