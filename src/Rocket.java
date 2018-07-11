import java.util.ArrayList;
import java.util.List;

public class Rocket {
    String rocketId;
    List<Propellants> propellantList = new ArrayList<Propellants>();


    public Rocket(String rocketId) throws Exception {
        if(rocketId.length()!=8) {
            throw new Exception("Error: ID is incorrect");
        }
        this.rocketId = rocketId;

    }


    public String getRocketId() {
        return rocketId;
    }


    public void addPropellantList(int i) throws Exception {
        propellantList.add(new Propellants(i));
    }

    public List<Propellants> getPropellantList() {
        return propellantList;
    }
}
