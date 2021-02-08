public class Subclass extends Base {
    private Integer i = 1;

    public void setName(String name) {
        super.setName(name+Integer.valueOf(i).toString());
    }

    public String getName() {
        return super.getName();
    }
}