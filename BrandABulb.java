public class BrandABulb implements Bulb{
    private int powerUsage;

    public void setPowerUsage(int powerUsage) {
        this.powerUsage = powerUsage;
    }

    public void turnOn() {
        System.out.println("This Brand A bulb is turned now on. Using "+ powerUsage + " watts.");
    }

    public void turnOff() {
        System.out.println("This Brand A bulb is turned off.");
    }
}
