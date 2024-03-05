// Motorcycle class extending Vehicle
public class Motorcycle extends Vehicle{
    int numWheels; // A dataspace to contain Number of wheels

    // Constructor
    Motorcycle(String make, String model, int year, int numWheels){
        super(make, model, year); // Calling parent constructor
        this.numWheels = numWheels; // Setting number of wheels
    }

    // Method for performing a wheelie
    void Wheelie(){
        System.out.println("The " + this.make + " " +  this.model + " is performing a wheelie!");
    }

    // Overriding displayInfo method from Vehicle
    @Override
    public void displayInfo(){
        System.out.println("Make = " + make);
        System.out.println("Model = " + model);
        System.out.println("Year = " + year);
        System.out.println("Number of Wheels = " + numWheels);
    }
}