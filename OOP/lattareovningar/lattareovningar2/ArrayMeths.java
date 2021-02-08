public class ArrayMeths {
    public static int minimum(int[] array) {
        int lowestNumber = array[0];
        for (int numbers : array) {
            if(numbers < lowestNumber) {
                lowestNumber = numbers;
            }
        }
        return lowestNumber;
    }

    public static int maximum(int[] array) {
        int highestnumber = array[0];
        for(int numbers : array) {
            if(numbers > highestnumber) {
                highestnumber = numbers;
            }
        }
        return highestnumber;
    }
}
