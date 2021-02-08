public class Average implements Operation {
    private String name = "Average";

    public int operation(int[] array) {
        int sum = 0;
        for(int numbers : array) {
            sum += numbers;
        }
        sum = (sum/array.length);
        return sum;
    }

    public String getName() {
        return this.name;
    }
}
