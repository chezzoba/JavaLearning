public class Car extends Vehicle {

    

    String make = "Chevrolet";
    String model = "Corvette";
    int year = 2020;
    String color = "blue";
    double price = 50000.;

    void drive ( ) {
        System.out.println("You drive the car");
    }

    public String toString ( ) {
        String string = String.format(
            "Car(make=%s, model=%s, year=%d, color=%s, price=%.2f)", 
            this.make, this.model, this.year, this.color, this.price);
        return string;
    }
    
}
