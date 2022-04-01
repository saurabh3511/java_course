package project;
import javax.swing.*;
import java.util.*;

public class proj03_3_Guess_The_Number {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc =new Scanner(System.in);
        int ourGuess;
        int guesscount=0;
        boolean guessNumber = false;

        Random random =new Random();
        int randomguess = random.nextInt(100)+1;

        while(!guessNumber && guesscount<100){
            System.out.println("Guess the Number");
            ourGuess = sc.nextInt();
            if(ourGuess==randomguess){
                System.out.println("congratulation! you won");
                System.out.print("your guess the number in "+  guesscount+" try");
                guessNumber= true;
            }else if(ourGuess>randomguess){
                System.out.println("guess is too high. Try again.");
            }else{
                System.out.println("guess is too low. Try again.");
            }

            guesscount++;
        }



    }
}
