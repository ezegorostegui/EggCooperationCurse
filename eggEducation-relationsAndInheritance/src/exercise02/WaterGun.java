package exercise02;

public class WaterGun {
    private double initialPosition;
    private double waterPosition;


    public WaterGun() {}
    public WaterGun(double initialPosition, double waterPosition) {
        this.initialPosition = initialPosition;
        this.waterPosition = waterPosition;
    }


    public void fillGun(){
        setInitialPosition(Math.floor(Math.random() * 10 + 1));
        setWaterPosition(Math.floor(Math.random() * 10 + 1));
    }
    public boolean wet(double initialPosition, double waterPosition){
        boolean wet;
        if(initialPosition == waterPosition){
            wet = true;
        } else {
            wet = false;
        }
        return wet;
    }
    public void nextShoot(){

    }


    public double getInitialPosition() {
        return initialPosition;
    }
    public void setInitialPosition(double initialPosition) {
        this.initialPosition = initialPosition;
    }

    public double getWaterPosition() {
        return waterPosition;
    }
    public void setWaterPosition(double waterPosition) {
        this.waterPosition = waterPosition;
    }



    @Override
    public String toString() {
        return "WaterGun{" +
                "initialPosition=" + initialPosition +
                ", waterPosition=" + waterPosition +
                '}';
    }
}
