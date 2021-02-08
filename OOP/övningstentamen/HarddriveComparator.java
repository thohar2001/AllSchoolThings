import java.util.Comparator;

public class HarddriveComparator implements Comparator<Computer> {
    
    public int compare(Computer o, Computer c) {
        int result = o.getHarddrive().compareTo(c.getHarddrive());
        return result;
    }
}
