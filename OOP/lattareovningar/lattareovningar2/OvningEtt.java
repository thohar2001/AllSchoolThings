import java.util.Scanner;

public class OvningEtt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Measurement[] measurements = new Measurement[5];

        int lowestWind = 0;

        for(int i = 0; i < measurements.length; i++) {
            int value = scan.nextInt();
            measurements[i] = new Measurement(value, "m/s");
        }

        lowestWind = measurements[0].getvalue();
        for(Measurement wind : measurements) {
            if(wind.getvalue() < lowestWind) {
                lowestWind = wind.getvalue();
                }
            }
        System.out.println("Lägsta vinden: " + lowestWind);
        if(Measurement.isNegative(lowestWind)){
            System.out.println("This measurement is negative");
        }
        }
    }
