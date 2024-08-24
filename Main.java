//number game
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\tWELLCOME TO NUMBER GAME");
        Scanner o = new Scanner(System.in);
        int guess,j=0;
        boolean playAgain=true;
        while(playAgain) {
        int number = (int) (Math.random() * 100);
        Loop:for(j=1;j<=10;j++) {
            System.out.print("Guess The Number: ");
            guess = o.nextInt();
            if (guess == number) {
                System.out.println("Guess Is Correct!");
                System.out.println("Press 1 To Play Again Or Press 2 To Finish Game");
                int choice=o.nextInt();
                if(choice==1)
                    break;
                else {
                    playAgain = false;
                    break;
                }
            }
            else if (guess > number)
                System.out.println("Guess Is High!");
            else

                System.out.println("Guess Is Low!");
            if (j == 10) {
                System.out.print("Press 1 To Play Again Or Press 2 To Finish Game");
                int op = o.nextInt();
                System.out.println("Number Was: " + number);
                if (op == 1) {
                    continue Loop;
                }
                else {
                    playAgain = false;
                    break;
                }
            }
        }
        }
        int score=100-(j-1)*10;
        System.out.println("SCORE= "+score);
        System.out.println("You Played Well!!");

    }
}