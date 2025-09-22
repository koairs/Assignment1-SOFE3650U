class BrandBFactory implements SmartDeviceFactory{

    public Bulb createBulb() {
        Bulb bulb = new BrandBBulb();
        bulb.setPowerUsage(15);
        return bulb;
    }

    public Lock createLock() {
        Lock lock = new BrandBLock();
        lock.setBatteryConsumption(20);
        return lock;
    }
}
