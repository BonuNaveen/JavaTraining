package QATEST;
import java.util.*;

public class dicegame {
    public static void main(String[] args) {
        System.out.println("Enter Your Number");
        Scanner sc= new Scanner(System.in);
        int number =sc.nextInt();
        while(number > 10) {
            if (number > 6) {
                System.out.println("You won the game");
                break;
            } else {
                System.out.println("You lost the game");
                break;
            }
        }

    }
}
