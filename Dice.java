import java.util.Random;
import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the no of dice: ");
        int User_input= input.nextInt();

        Random ran=new Random();
        System.out.println("\nHey User! You Rolled");
        int Total=0;
        int Computer_input=0;
        for(int i=0;i<User_input;i++){
            Computer_input= ran.nextInt(6)+1;
            Total=Total+Computer_input;
            System.out.println((i+1) + ". " +Computer_input);
        }
        System.out.println("\nTotal: " + Total);
    }
}