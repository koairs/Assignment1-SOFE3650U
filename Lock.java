public interface Lock {
    void setBatteryConsumption(int consumption);

    void lock();

    void unlock();
}
