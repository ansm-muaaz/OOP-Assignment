// Car class extending Vehicle
public class Car extends Vehicle{
    int numDoors; // Number of doors

    // Constructor
    Car(String make, String model, int year, int numDoors){
        super(make, model, year); // Calling parent constructor
        this.numDoors = numDoors; // Setting number of doors
    }

    // Method for starting the car
    void start(){
        System.out.println("The " + this.make + " " + this.model + " is starting!");
    }

    // Overriding displayInfo method from Vehicle
    @Override
    public void displayInfo(){
        System.out.println("Make = " + make);
        System.out.println("Model = " + model);
        System.out.println("Year = " + year);
        System.out.println("Number of Doors = " + numDoors);
    }
}
