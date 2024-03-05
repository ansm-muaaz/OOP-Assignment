public class Task1 {

    /*
    * Summary
    * This progarm :
    * - initailizes an array with 5 random values
    * - uses indexing to access and modify values
    * - uses a for loop to iterate through the array and print each value
    */

    public static void main(String[] args) {

        // Array Declaration and Initialization using arbitrary values
        int[] scores = {85, 90, 75, 80, 95};
        // Alternate method of array initialization without assigning values
        // int[] scores = new int[5];

        // Array Indexing and Modification
        // Accessing the third element and storing it in thirdScore
        int thirdScore = scores[2];
        System.out.println("thirdScore = " + thirdScore);

        // Modifying the value of the second element to double its original value
        scores[1] *= 2;
        System.out.println("Updated second score = " + scores[1] );


        // Array Iteration
        System.out.println("Scores:");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + "\t"); // Printing each element of the scores array
        }
        System.out.println();
    }

}
