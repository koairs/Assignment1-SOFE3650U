class BrandAFactory implements SmartDeviceFactory{

    public Bulb createBulb(){
        Bulb bulb = new BrandABulb();
        bulb.setPowerUsage(25);
        return bulb;
    }

    public Lock createLock(){
        Lock lock = new BrandALock();
        lock.setBatteryConsumption(22);
        return lock;
    }

}
