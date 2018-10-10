import java.util.Scanner;

    public class GuessingGame
    {
        public static void main(String [] args)
        {
            System.out.println("Guess the number!");
            System.out.println("Type 1 for numbers 1-10");
            System.out.println("Type 2 for numbers 1-100");
            System.out.println("Type 3 for numbers 1-1000");
            System.out.println("Type 4 for numbers 1-10000");
            //Creates a new scanner here
            Scanner difficulty = new.Scanner(System.in);
            String number = difficulty.nextLine();
        }
    }