import java.util.Scanner;
import java.util.Random;
public class HighorLow {
    static void main() {

        Random gen = new Random();
        Scanner in = new Scanner(System.in);
        int ranNum = gen.nextInt(10) + 1;
        int guess = 0;
        boolean done = false;
        String trash = "";
        IO.print("Guess a number [1-10] and I'll tell you high or low: ");

        do {
            if (in.hasNextInt()) {
                guess = in.nextInt();
                in.nextLine();
                if (guess >= 1 && guess <= 10) {
                    if (guess > ranNum) {
                        IO.println(guess + " is higher than " + ranNum);
                        done = true;
                    } else if (guess < ranNum) {
                        IO.println(guess + " is Lower than " + ranNum);
                        done = true;
                    } else if (guess == ranNum) {
                        IO.print("On the money! You win!");
                        done = true;
                    }
                }
                else
                {
                    IO.println("You must enter a valid guess in range [1-10] not " + guess);
                    IO.println("Try again");
                }
            }
            else
            {
                trash = in.nextLine();
                IO.println("You must enter a valid guess, not " + trash);
                IO.println("Try again");
            }
        }while (!done) ;
    }
}