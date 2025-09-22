public class CustomerPortal {
    public static void main(String[] args) {
        SmartDeviceFactory factoryA = new BrandAFactory();
        SmartDeviceFactory factoryB = new BrandBFactory();

        Bulb bulbA = factoryA.createBulb();

        Lock lockB = factoryB.createLock();

        bulbA.turnOn();

        lockB.lock();
    }
}
