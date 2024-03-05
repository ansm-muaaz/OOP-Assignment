import java.util.*;


public class Task2 {
    /*
     * Summary
     * This progarm :
     * - initailizes an ArrayList 'fruits' with 6 strings as its elements
     * - uses .add and .remove methods to modify the arraylist
     * - uses a for-each loop to iterate through the array and print each value
     */
    public static void main(String[] args) {

        //Initailizing the ArrayList 'fruits' with six elements
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Apple","Banana","Orange","Kiwi", "Lime", "Plum"));

        // ArrayList Operations
        // Adding a new fruit to the fruits ArrayList
        fruits.add("Mango");
        System.out.println("The ArrayList 'fruits' after addin a new fruit : " + fruits);

        // Remove the second fruit from the list (index 1)
        fruits.remove(1);
        System.out.println("The ArrayList 'fruits' after removing second element : " + fruits);


        // Printing the ArrayList iterating through each element

        System.out.println("\nFruits:");
        // Using for loop to print each fruit where the variable i iterates through eac element of the ArrayList fruits
        for (String i : fruits) {
            System.out.print(i + "\t");
        }
        System.out.println();

    }

}
