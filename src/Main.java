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
        int n = 10;
        // We know the first 2 numbers of the fibonacci sequence is 0, 1
        int a = 0;
        int b = 1;

        // start the loop
        for (int i = 0; i < n ; i++) {
            System.out.print(a + " "); // Prints the current number and leaves a space so its readable in the command line
            int next = a + b; // adding 0 and 1 together now this value is 1.
            a = b; // a is now equal to 1 which also represents the second value
            b = next; // now b is 1.
        }







    }
}