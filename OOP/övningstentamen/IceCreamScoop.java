import java.util.Objects;

public class IceCreamScoop {
    private String taste;
    private Double weight;

    public IceCreamScoop(String taste, double weight) {
        this.taste = taste;
        this.weight = weight;
    }

    public String toString() {
        return taste + " (weight: (" + weight + "g)) ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IceCreamScoop)) {
            return false;
        }

        IceCreamScoop converted = (IceCreamScoop) o;

        return Objects.equals(converted.taste, this.taste);
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = 1;

        result = prime * result + (this.taste.hashCode());

        return result;

    }
}
