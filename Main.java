import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Random rand = new Random();
        int secret = rand.nextInt(100) + 1;
        int guess = 0;

        System.out.println("Guess a Number Between 1-100");
        int attempts = 0;
        while (guess != secret) {
             guess = input.nextInt();
             attempts++;
            if (guess>secret){
                System.out.println("Your Guess is Too High");
            } else if (guess<secret) {
                System.out.println("Your Guess is Too Low");
            }
        }

        System.out.println("You got it in " + attempts + " attempts! 🎉");

    }
}