public class Propellants {
    int powerProp;


    public Propellants(int powerProp) throws Exception{
        if(powerProp <=0) {
            throw new Exception("Must be mayor to zero");
        }
        this.powerProp = powerProp;
    }



    public int getPower() {
        return powerProp;
    }
}
