public class Sum implements Operation {
    private String name = "Sum";

    public int operation(int[] array) {
        int sum = 0;
        for(int numbers : array) {
            sum += numbers;
        }
        return sum;
    }

    public String getName() {
        return this.name;
    }
}
