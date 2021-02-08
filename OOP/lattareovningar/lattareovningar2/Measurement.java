public class Measurement {
    private int value = 0;
    private String unit = "";

    public Measurement(int value, String unit) {
        this.value = value;
        this.unit = unit;
    }

    public Measurement() {
        this(0, "mm/s");
    }

    public static boolean isNegative(int wind) {
        boolean isTrue = false;
        if (wind < 0) {
            isTrue = true;
        }
        return isTrue;
    }

    public int getvalue() {
        return value;
    }

    public void setvalue(int value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String toString() {
        String print = String.format(this.value + " " + this.unit);
        return print;
    }
}
