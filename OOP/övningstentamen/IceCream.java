import java.util.Objects;

public class IceCream {
    Container container;
    IceCreamScoop[] scoops = new IceCreamScoop[5];

    public IceCream(Container container) {
        this.container = container;
    }

    public void addScoop(IceCreamScoop scoop) throws IndexOutOfBoundsException {
        for (int i = 0; i < scoops.length; i++) {
            if (scoops[i] == null) {
                scoops[i] = scoop;
                break;
            }
        }
    }

    public int size() {
        int size = 0;

        for (int i = 0; i < scoops.length; i++) {
            if (scoops[i] != null) {
                size++;
            }
        }
        return size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IceCream)) {
            return false;
        }
        IceCream ob = (IceCream) o;

        boolean sameScoops = false;
        for (int i = 0; i < scoops.length; i++) {
            if (scoops[i] != null && ob.scoops[i] != null)
            sameScoops = scoops[i].equals(ob.scoops[i]);
            if (sameScoops == false) {
                sameScoops = false;
                break;
            }
        }


        return sameScoops && Objects.equals(ob.container, this.container);
    }
    @Override
    public int hashCode() {
        int prime = 17;
        int result = 1;

        for (int i = 0; i < scoops.length; i++) {
            if (scoops[i] != null) {
                result = prime * result + (scoops[i].hashCode());
            }
        }

        result = prime * result + (container.hashCode());

        return result;
    }

    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("You have ordered an ice cream with container: " + container  + "\n");
        string.append("With scoops: \n");
        for (int i = 0; i < scoops.length; i++) {
            if (scoops[i] != null) {
                string.append(scoops[i] + "\n");
            }
        }

        return string.toString();

    }
}
