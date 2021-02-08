import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arthropod extends Animal {
    private List<String> stages;

    /*private String stageOne = "";
    private String stageTwo = "";
    private String stageThree = "";
    private String stageFour = "";
*/
    public Arthropod(String name, List<String> stages) {
        super(name);
        this.stages = new ArrayList<>();
        this.stages.addAll(stages);
        /*
        this.stageOne = stageOne;
        this.stageTwo = stageTwo;
        this.stageThree = stageThree;
        this.stageFour = stageFour;
        */
    }

    public List<String> getStages() {
        return Collections.unmodifiableList(stages);
    }

    /*
    public String getStages() {
        return this.stageOne + this.stageTwo + this.stageThree + this.stageFour;
    }
    */
}
