public abstract class Vehicle {
    // abstract to be unable to instantiate an object of this class (instantiate subclass)
    double speed;

    void go ( ) {
        System.out.println("This vehicle is going");
    }
}
