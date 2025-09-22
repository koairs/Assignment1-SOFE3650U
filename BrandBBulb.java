public class BrandBBulb implements Bulb{
    private int powerUsage;

    public void setPowerUsage(int powerUsage) {
        this.powerUsage = powerUsage;
    }

    public void turnOn() {
        System.out.println("This Brand B bulb is turned now on. Using "+ powerUsage + " watts.");
    }

    public void turnOff() {
        System.out.println("This Brand B bulb is turned off.");
    }
}
