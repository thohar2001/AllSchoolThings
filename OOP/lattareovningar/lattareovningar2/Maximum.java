public class Maximum implements Operation {

    private String name = "Maximum";

    public int operation(int[] array) {
        int highestnumber = array[0];
        for (int numbers : array) {
            if (numbers > highestnumber) {
                highestnumber = numbers;
            }
        }
        return highestnumber;
    }
    public String getName() {
        return this.name;
    }
}
