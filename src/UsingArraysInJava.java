public class UsingArraysInJava {
    public static void main(String[] args) {
        /*------------------------ Array WorkSheet Exercises - Lesson 4 ----------- */

        /*------------ INTRODUCTION TO ARRAYS ------------------*/

        // 1. Declare and Intialize a single dimensional array
        int[] numbers = {1, 2, 3, 10, 32, 60};

        // 2. Write a Java Program that prints the first and the last element of an array
        int firstElement = numbers[0];
        System.out.println("The first element of the numbers array is: " + firstElement);

        int lastElement = numbers[numbers.length - 1];
        System.out.println("The last element of the numbers array is: " + lastElement);


        //  2. Find the Average of an array of integers
        int total = 0;

        int[] numbers2 = {1, 2, 3, 10, 32, 60};
       // PURPOSE OF THIS LOOP: Calculate the total
        for(int i = 0; i < numbers2.length; i++) {
            total += numbers[i];
            // Do not put the average calculation inside the loop as it will keep given new values
        }

       // Calculate the average - divide the sum of the array to the
        int average = total / numbers2.length;

       // Print the result
        System.out.println("The total is: " + total);
        System.out.println("The average is: " + average);


        /*------------ MULTI DIMENSIONAL ARRAYS ------------------*/
        // 1. Declare and initialise a 2x3 multi-dimensional array in Java.
       int[][] multipleDimensionalArray = new int[2][3];

       int[][] multipleDimensionalArray2 = {
               {1, 2, 3}, // 2 arrays with 3 elements each.
               {4, 5, 6},
       };







    }


}

