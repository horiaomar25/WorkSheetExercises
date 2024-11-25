import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /* ----------------- CONTROL FLOW EXERCISES ---------*/

        /*---------------------------------------- TASK 1 ---------------------------------------*/
        /*
         * INSTRUCTIONS: Write a Java program using if-else statement to check if a number is a positive, negative, or 0.
         * */

        /*

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int num = reader.nextInt();

        if(num > 0){
            System.out.println("This number is positive");
        } else if(num <  0){
            System.out.println("This number is negative");
        } else {
            System.out.println("This number is zero");
        }

        */

        /*---------------------------------------- TASK 2 ----------------------------------------*/

        /*
         * INSTRUCTIONS: Write a Java program using a switch statement to print the name of the day base on the day number.
         * */

       /*

       Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number and find out the day:");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("It is Monday");
                break;
            case 2:
                System.out.println("It is Tuesday");
                break;
            case 3:
                System.out.println("It is Wednesday");
                break;
            case 4:
                System.out.println("It is Thursday");
                break;
            case 5:
                System.out.println("It is Friday");
                break;
            case 6:
                System.out.println("It is Saturday");
                break;
            case 7:
                System.out.println("It is Sunday");
                break;
            default:
                System.out.println("Invalid input");
        }

        */

        /* --------------------------------- 2.2 ITERATIVE CONSTRUCTS -----------------------------*/

        /*------------------------------------ TASK 3 -------------------------------------------- */
        /*
         * INSTRUCTIONS: WRITE A JAVA PROGRAM USING A FOR LOOP TO PRINT THE FIRST 10 NUMBERS OF THE
         * FIBONNACI SEQUENCE
         * */

        // FIBONACCI always start with 0,1 and must continue by adding the previous 2 elements:
        // 0,1,1,2,3,5,8,13

        // Initialize the value of the fibonacci number to go up. In this case, we want the first 10 numbers of fibonacci sequence.
       /* int n = 10;
        // We know the first 2 numbers of the fibonacci sequence is 0, 1
        int a = 0;
        int b = 1;

        // start the loop
        for (int i = 0; i < n ; i++) {
            System.out.print(a + " "); // Prints the current number and leaves a space so its readable in the command line
            int next = a + b; // adding 0 and 1 together now this value is 1.
            a = b; // a is now equal to 1 which also represents the second value
            b = next; // now b is 1.
        } */

        /* --------------------------- TASK 4 --------------------------------*/
        /*
         * Write a Java program using a while loop to print numbers from 1 to 100.
         * */

       /* int limitNumber = 0;

        while(limitNumber < 100){
            limitNumber++;
            System.out.print(limitNumber + " ");
        } */

        /* ---------------------- TASK 5 ---------------------------------*/

        /*
         * INSTRUCTIONS: 3. Write a Java program using a do-while loop to prompt the user to enter a positive number. The program should keep asking until a positive number is entered.
         *  */

       /*

       Scanner input = new Scanner(System.in);
        System.out.println("Write down a positive number: ");
        int number = 0;

        do {
            number = input.nextInt();

            if (number >= 0) {
                System.out.println("Well done! This is a positive number!");
            } else {
                System.out.println("No this is a negative number! Please try again!");
                System.out.print("Write down a positive number: ");
            }

        } while (number < 0);
           */
/* ----------------------------- JUMP STATEMENT EXCERCISES ------------------------*/

                  /*-------------------- TASK 6 ---------------------*/
        /*
        * INSTRUCTIONS: 1. Write a Java program using a break statement to exit a loop when a specified value is found in an array.
        * */

        int[] numbers = {6,3,7,9,14,21,25};
        int firstMultipleOf5 = 0;

        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 5 == 0){
                firstMultipleOf5 = numbers[i];
                break;
            }

        }

        System.out.println(firstMultipleOf5);

        /* --------------------- TASK 7 ----------------------*/

        /*
        * INSTRUCTIONS: 2. Write a Java program using a continue statement to skip even numbers
        * in a loop that prints numbers from 1 to 20. */

       /* int oddNumbers = 0;

        for (int i = 1; i < 20; i++) {
            if(i % 2 == 0){
                continue; // Nothing can come after this because it will skip what is inside this
            }
            System.out.print(i + " "); // The print must be placed outside for the next iteration
        }

        */


    }
}