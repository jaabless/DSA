import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Number_Guessing_Game {
    public static void main(String[] args){
        System.out.println("WELCOME TO THE GAME \nGUESS A NUMBER BETWEEN 1 AND 100\nYOU HAVE 3 ATTEMPTS");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        int userGuess = 0,i=1;

        while (userGuess != numberToGuess && i<4){
            try {
                System.out.print("\nENTER THE NUMBER:");
                userGuess = scanner.nextInt();

                if (userGuess < numberToGuess){
                    System.out.println("NUMBER TOO LOW");
                } else if (userGuess > numberToGuess) {
                    System.out.println("NUMBER TOO HIGH");
                } else {
                    System.out.println("YOU WON");
                }
                i++;
            } catch (InputMismatchException e){
                System.out.println("!!PLEASE INPUT A DIGIT");
                scanner.nextLine();
            }

        }
        System.out.println("!! TIME OUT");
        System.out.println("ANSWER = "+numberToGuess);



    }
}
