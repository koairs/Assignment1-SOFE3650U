public interface Lock {
    void setBatteryConsumption(int consumption);

    int getBatteryConsumption();

    void lock();

    void unlock();
}
