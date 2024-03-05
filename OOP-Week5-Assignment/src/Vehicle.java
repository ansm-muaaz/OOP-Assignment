// Vehicle class
public class Vehicle {
    String make; // Make of the vehicle
    String model; // Model of the vehicle
    int year; // Year of the vehicle

    // Default constructor
    public Vehicle(){}

    // Parameterized constructor
    public Vehicle(String make, String model, int year){
        this.make = make; // Setting make
        this.model = model; // Setting model
        this.year = year; // Setting year
    }

    // Method to display vehicle information
    public void displayInfo(){
        System.out.println("Make = " + make);
        System.out.println("Model = " + model);
        System.out.println("Year = " + year);
    }
}
