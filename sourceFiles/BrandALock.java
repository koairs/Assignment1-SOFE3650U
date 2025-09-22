public class BrandALock implements Lock {
    private int batteryConsumption;

    public void setBatteryConsumption(int batteryConsumption) {
        this.batteryConsumption = batteryConsumption;
    }

    public int getBatteryConsumption() {
        return batteryConsumption;
    }

    public void lock() {
        System.out.println("This Brand A lock is now locked. Battery consumption of " + batteryConsumption + ".");
    }
    public void unlock() {
        System.out.println("This Brand A lock is unlocked.");
    }
}
