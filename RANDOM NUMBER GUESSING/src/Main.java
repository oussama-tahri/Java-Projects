import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        // randNumber (entre 1-100)
        int randNumber = random.nextInt(100)+1;
        Scanner scanner = new Scanner(System.in);
        //number of tries
        int tries =0;
        while(true) {
            int guess = scanner.nextInt();
            //we will count every try from the user
            tries++;
            if(randNumber==guess){
                System.out.println("Correct !!");
                System.out.println("It took you "+tries+ " tries");
                break;
            }else if(randNumber>guess){
                System.out.println("The number is higher");
            }else
                System.out.println("the number is lower");


        }
    }
}
