import java.util.Scanner;

public class Task1 {


    public static void guessingNumberGame() {

        Scanner input = new Scanner(System.in);

       
        int num = 1 + (int) (100 * Math.random());

        int x = 5;

        int i, guess;

        System.out.println("A number is chosen"+ " between 1 to 100."+ "Guess the number"+ " within 5 trials.");

        for (i = 0; i < x; i++) {

            System.out.println("Guess the number:");

     
            guess = input.nextInt();
            
            if (num == guess) {
                System.out.println("Congratulations!"+ " You guessed the number.");
                System.out.println("You Won the Game");
                break;
            } else if (num > guess&& i != x - 1) {
                System.out.println("The number is "+ "greater than " + guess);
            } else if (num < guess&& i != x - 1) {
                System.out.println("The number is" + " less than " + guess);
            }
        }

        if (i == x) {
            System.out.println("Ohhhh You Lost the game \n Try Again");
            System.out.println("You have exhausted"+ " " + x + " trials.");
            System.out.println("The number was " + num);
        }
        
    
    }

    public static void main(String arg[]) {

        guessingNumberGame();
    }
}
