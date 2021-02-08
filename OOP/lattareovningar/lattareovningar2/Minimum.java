public class Minimum implements Operation {

    private String name = "Minimum";

    public int operation(int[] array) {
        int lowestNumber = array[0];
        for (int numbers : array) {
            if(numbers < lowestNumber) {
                lowestNumber = numbers;
            }
        }
        return lowestNumber;    
    }
    public String getName() {
        return this.name;
    }
}