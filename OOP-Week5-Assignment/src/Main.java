// Main class
public class Main {

    // Main method
    public static void main(String[] args) {
        // Initializing Car objects
        Car c1 = new Car("Mitsubishi", "Pajero",2003, 6);
        Car c2 = new Car("Toyoto", "Probox", 2015, 4);

        // Initializing Motorcycle objects
        Motorcycle m1 = new Motorcycle("Honda", "Gold Wing", 2013,2);
        Motorcycle m2 = new Motorcycle("Harley-Davidson", "Freewheeler", 2023, 3);

        // Displaying information
        // about the cars using displayInfo() method from Car class
        // that overrides  displayInfo() from Vehicle class
        System.out.println("\nThe Cars:");
        System.out.println("\nInfo on C1"); c1.displayInfo();
        System.out.println("\nInfo on C2"); c2.displayInfo();

        // Displaying information about
        // the motorcycles using displayInfo() method from Motorcycle class
        // that overrides  displayInfo() from Vehicle class
        System.out.println("\nThe Motorcycles:");
        System.out.println("\nInfo on M1"); m1.displayInfo();
        System.out.println("\nInfo on M2"); m2.displayInfo();

        // Performing actions on the car and motorcycle objects
        System.out.println();
        c1.start();
        c2.start();
        m1.Wheelie();
        m2.Wheelie();
    }
}
