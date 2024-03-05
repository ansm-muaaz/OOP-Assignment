public class Vehicle {
       String make;
       String model;
       int year;
        public Vehicle(){}

       public Vehicle(String make, String model, int year){
           this.make = make;
           this.model = model;
           this.year = year;
       }
       public void displayInfo(){

           System.out.println("make = " + make);
           System.out.println("model = " + model);
           System.out.println("year = " + year);
       }


}
