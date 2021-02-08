import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OvningSex {
    public static void main(String[] args) {
        List<Exchange> currencies = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        /**
         * växlingskurser till euro
         */
        currencies.add(new Exchange("SEK", 0.096));
        currencies.add(new Exchange("NOK", 0.092));
        currencies.add(new Exchange("DKK", 0.13));
        currencies.add(new Exchange("GBP", 1.1));

        System.out.println("Vi hanterar växlingar i: EUR, SEK, NOK, DKK, GBP");
        System.out.println("Vad vill du växla från?");

        String fromCurrency = scan.nextLine().toUpperCase();

        System.out.println("Vad vill du växla till?");

        String toCurrency = scan.nextLine().toUpperCase();

        System.out.println("Hur många " + fromCurrency + " vill du växla?");

        double amount = scan.nextInt();
        double result = 0;

        for(Exchange currency : currencies) {
            if (fromCurrency.equals(currency.getCurrency())) {
                amount = currency.convertToEuro(amount);
                result = amount;
            }
        }

        for(Exchange currency : currencies) {
            if(toCurrency.equals(currency.getCurrency()) && !fromCurrency.equals("EURO")) {
                result = currency.convertFromEuro(amount);
            }
        }
        System.out.println("Det blir " + String.format("%.2f", result) + " " + toCurrency);


        

    }
}