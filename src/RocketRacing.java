import java.util.List;

public class RocketRacing {
    public static void main(String[] args) throws Exception {
        Rocket[] rockets = new Rocket[2];
        String[] rocketsArrayIds = {"32WESSDS" ,"LDSFJA32"};
        initializeRockets(rocketsArrayIds,rockets);
        int[] propellantsArray0 = {10,30,80};
        additionProppellants(rockets[0],propellantsArray0);
        int[] propellantsArray1 = {30,40,50,50,30,10};
        additionProppellants(rockets[1],propellantsArray1);
        Rocket[] arrayRockets = {rockets[0],rockets[1]};
        printRockets(arrayRockets);
    }
    public static  void initializeRockets(String[] rocketsId, Rocket[] rockets) throws Exception {

        for (int i=0;i<rocketsId.length;i++) {
            rockets[i] = new Rocket(rocketsId[i]);
        }

    }
    public static void additionProppellants(Rocket rocketName, int[] proppelantsPower) throws Exception {
        for(int i=0; i< proppelantsPower.length;i++){
            rocketName.addPropellantList(proppelantsPower[i]);
        }

    }
    public static void printRockets(Rocket[] rocketsIds){
        for(int i=0; i< rocketsIds.length;i++) {
            List<Propellants> arrayPropellants = rocketsIds[i].getPropellantList();
            System.out.print("Rocket:" + rocketsIds[i].getRocketId() + " (amount: " + arrayPropellants.size() + ")(");
            int it = 0;
            for (Propellants propellantsL : arrayPropellants) {
                it++;
                System.out.print(propellantsL.getPower());
                if (it != arrayPropellants.size()) System.out.print(",");
            }
            System.out.print(")\n");
        }
    }


}
