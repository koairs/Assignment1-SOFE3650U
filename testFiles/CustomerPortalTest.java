import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CustomerPortalTest {

    @Test
    void testCreationOfBrandABulb(){
        SmartDeviceFactory factoryA = new BrandAFactory();

        Bulb bulbA = factoryA.createBulb();

        assertTrue(bulbA instanceof BrandABulb);   //Just testing if object creation works as intended
    }

    @Test
    void testPowerUsageOfBrandABulb(){
        SmartDeviceFactory factoryA = new BrandAFactory();

        Bulb bulbA1 = factoryA.createBulb();

        Bulb bulbA2 = factoryA.createBulb();

        assertEquals(bulbA1.getPowerUsage(), bulbA2.getPowerUsage());       //We compare them to each other as the factory method pattern will set it
    }

    @Test
    void testCreationOfBrandBLock(){
        SmartDeviceFactory factoryB = new BrandBFactory();

        Lock lockB = factoryB.createLock();

        assertTrue(lockB instanceof BrandBLock);        //Just testing if object creation works as intended
    }

    @Test
    void testBatteryCapacityOfBrandBLock(){
        SmartDeviceFactory factoryB = new BrandBFactory();

        Lock lockB1 = factoryB.createLock();

        Lock lockB2 = factoryB.createLock();

        assertEquals(lockB1.getBatteryConsumption(), lockB2.getBatteryConsumption());       //We compare them to each other as the factory method pattern will set it

    }

}