package Exercise06;

public class CoffeeMaker {
    private int maxCapacity;
    private int currentCapacity;

    public CoffeeMaker(){}
    public CoffeeMaker(int maxCapacity, int currentCapacity) {
        this.maxCapacity = maxCapacity;
        this.currentCapacity = currentCapacity;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }
    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getCurrentCapacity() {
        return currentCapacity;
    }
    public void setCurrentCapacity(int currentCapacity) {
        this.currentCapacity = currentCapacity;
    }

    @Override
    public String toString() {
        return "CoffeeMaker{" +
                "maxCapacity=" + maxCapacity +
                ", currentAmount=" + currentCapacity +
                '}';
    }
}
