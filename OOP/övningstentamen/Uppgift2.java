public class Uppgift2 {
    public static void main(String[] args) {
        IceCream icecream = new IceCream(Container.WAFER);
        IceCream icecream2 = new IceCream(Container.WAFER);
        IceCreamScoop vanilla = new IceCreamScoop("Vanilla", 127);
        IceCreamScoop chocolate = new IceCreamScoop("Chocolate", 115);
        IceCreamScoop raspberry = new IceCreamScoop("Raspberry", 115);
        
        icecream.addScoop(vanilla);
        icecream.addScoop(chocolate);
        icecream.addScoop(raspberry);

        icecream2.addScoop(chocolate);
        icecream2.addScoop(vanilla);
        icecream2.addScoop(raspberry);

        System.out.println(icecream.toString());
        System.out.println("\n" + icecream.equals(icecream2));

    }
}
