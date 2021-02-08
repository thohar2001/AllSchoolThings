import java.util.Objects;

public class Computer implements Comparable<Computer> {
    private String name;
    private Double ghz;
    private Integer ram;
    private Integer harddrive;

    public Computer(String name, double ghz, int ram, int harddrive) {
        this.name = name;
        this.ghz = ghz;
        this.ram = ram;
        this.harddrive = harddrive;
    }

    public String getName() {
        return name;
    }

    public Double getGhz() {
        return ghz;
    }

    public Integer getRam() {
        return ram;
    }
    public Integer getHarddrive() {
        return harddrive;
    }

    public int compareTo(Computer c) {
        Integer total = 0;
        total = harddrive.compareTo(c.harddrive);
        total = total + ghz.compareTo(c.ghz);
        total = total + ram.compareTo(c.ram);
        return total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof Computer)) {
            return false;
        }

        Computer c = (Computer) o;

        return Objects.equals(this.ghz, c.ghz) && Objects.equals(this.harddrive, c.harddrive) 
                 && Objects.equals(this.ram, c.ram);
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = 1;

        result = prime + ghz.hashCode();
        result = result * prime + ram.hashCode();
        result = result * prime + harddrive.hashCode();

        return result;
    }

    @Override
    public String toString() {
        String s = String.format("Name: %s\nProcessor(Ghz): %.2f\nRam: %d GB\nHarddrive(Gb): %d", name, ghz.doubleValue(), ram.intValue(), harddrive);
        return s;    
    }


}
