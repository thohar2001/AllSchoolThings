import java.util.Scanner;

public class OvningSju {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Skriv in ett ord: ");
        String ord = scan.nextLine();
        StringBuilder byggord = new StringBuilder();

        for(int i = 0; i < ord.length(); i++) {
            byggord.append(ord.charAt(i));
            System.out.println(byggord.toString());
        }

    }
}
