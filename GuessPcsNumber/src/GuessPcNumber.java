import java.util.Scanner;

public class GuessPcNumber {
    public static void main(String[] args) {

        // Generate a random number to be guessed
        int number = (int) (Math.random() * 101);

        Scanner input = new Scanner(System.in);
        System.out.println(" Guess a magic number between 0 and 100! ");

        System.out.println("Enter your guess: ");
        int guess = input.nextInt();

        if (guess == number)
            System.out.println(" Correct! The number is " + number);
        else if (guess > number)
            System.out.println(" To bad, your guess was to high, try again ");
        else
            System.out.println(" To bad, your guess was to low, try again ");


        while (guess != number) {
            System.out.println(" Enter your guess: ");
            guess = input.nextInt();

        if (guess == number)
            System.out.println(" Correct! The number is " + number);
        else if (guess > number)
            System.out.println(" To bad, your guess was to high, try again ");
        else
            System.out.println(" To bad, your guess was to low, try again ");
    }

    }
}
