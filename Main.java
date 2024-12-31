import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Mini Project

        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);
        int UserNumber = 0;

        do{

            System.out.println("Guess My Number(1-100): ");
            UserNumber = sc.nextInt();

            if (UserNumber == myNumber){
                System.out.println("Yeah!! U hv guessed the Correct Number");
                break;
            }
            else if (UserNumber > myNumber){
                System.out.println("The Number u hv guessed is Larger than My number");
            }
            else {
                System.out.println("The Number u hv guessed is Smaller than My number");
            }
        }while (UserNumber >=0 );

        System.out.println("My Number was: ");
        System.out.println(myNumber);
    }
}