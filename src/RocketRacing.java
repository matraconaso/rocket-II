import java.util.List;

public class RocketRacing {
    public static void main(String[] args) throws Exception {
        Rocket r1 = new Rocket("32WESSDS" );
        Rocket r2 = new Rocket("LDSFJA32" );

        r1.setPropeList(10);
        r1.setPropeList(30);
        r1.setPropeList(80);
        r2.setPropeList(30);
        r2.setPropeList(40);
        r2.setPropeList(50);
        r2.setPropeList(50);
        r2.setPropeList(30);
        r2.setPropeList(10);

        List<Propellants> arrayProp = r1.getPropeList();
        System.out.print("Rocket:" + r1.getRocketId() + " (amount: " + arrayProp.size() + ")(");
        int x=0;
        for(Propellants propeL : arrayProp){
            x++;
            System.out.print(propeL.getPower());
            if (x!=arrayProp.size())  System.out.print(",");
        }
        System.out.print(")\n");

        List<Propellants> arrayProp2 = r2.getPropeList();
        System.out.print("Rocket:" + r2.getRocketId() + " (amount: " + arrayProp2.size() + ")(");
        int x2=0;
        for(Propellants propeL2 : arrayProp2){
            x2++;
            System.out.print(propeL2.getPower());
            if (x2!=arrayProp2.size())  System.out.print(",");
        }
        System.out.print(")");


    }
}
