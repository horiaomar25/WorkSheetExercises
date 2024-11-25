public class MoreExercises {
    public static void main(String[] args) {
        /*------------------------ Array WorkSheet Exercises ----------- */

        // Declare and Intialize a single dimensional array
        // Declare and Initialize a single-dimensional array
        int[] numbers = {1, 2, 3, 10, 32, 60};

        // Find the Average of an array of integers
        int total = 0;


       // PURPOSE OF THIS LOOP: Calculate the total
        for(int i = 0; i < numbers.length; i++) {
            total += numbers[i];
            // Do not put the average calculation inside the loop as it will keep given new values
        }

       // Calculate the average
        int average = total / numbers.length;

       // Print the result
        System.out.println("The total is: " + total);
        System.out.println("The average is: " + average);
    }


}

