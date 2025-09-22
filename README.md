# Assignment1-SOFE3650U
Design Patterns
UML Diagram:
<img width="952" height="737" alt="image" src="https://github.com/user-attachments/assets/63b47f32-4c52-42d7-a85a-acfcca9c1647" />

Our Repository comes as a package for running our Smart Device Factory.

It contains 3 interfaces, SmartDeviceFactory, Lock and Bulb.

BrandAFactory and BrandBFactory implement SmartDeviceFactory,
while the two brands of locks and bulbs implement Lock and Bulb respectfully.

Using the factory method pattern, constructors for the brands of bulb and locks
are placed within either brands factories under their respective methods, not
within the classes themselves, allowing for different values dependant on their origins.

We also used the abstract factory method to create both brands of smart devices, relying
on interfaces instead of concrete classes to decouple the various lock and bulb classes.

Our main method is within the CustomerPortal class, with some basic output to display
that the code is running seamlessly.

We also used JUnit to test specifics within the program, such as if objects are created
from the proper factory and outputs match other objects from each factory. Below are
screenshots from the IDE showcasing our program passing all basic test cases. All test
cases can be found under CustomerPortalTest.

<img width="831" height="149" alt="image" src="https://github.com/user-attachments/assets/c1dc2d6b-31f4-4382-b8aa-47749956ea21" />
