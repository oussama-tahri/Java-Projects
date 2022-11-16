import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            //we will create a table for [Rock = r  -&-  Paper = p  -&- Scissor = s]

            String[] rps = {"r", "p", "s"};

            //Random will take the length of rps and return an Integer value ( 0 -or- 1 -or- 2 )
            // we will name it as ComputerMove

            String ComputerMove = rps[new Random().nextInt(rps.length)];

            //the player will enter a value

            String PlayerMove;
            while (true) {
                System.out.println("Please Enter a Value (r,p or s) : ");
                PlayerMove = scanner.nextLine();
                if (PlayerMove.equals("r") || PlayerMove.equals("p") || PlayerMove.equals("s")) {
                    break;
                } else
                    System.out.println("ERROR" + "  --" + PlayerMove + "--  " + "Choose a Valid Move");
            }
            System.out.println("The Computer Played : " + ComputerMove);
            if (PlayerMove.equals(ComputerMove)) {
                System.out.println("The Game was s Tie");
            } else if (PlayerMove.equals("r")) {
                if (ComputerMove.equals("p")) {
                    System.out.println("YOU LOSE !!");
                } else if (ComputerMove.equals("s")) {
                    System.out.println("YOU WIN !!");
                }
            } else if (PlayerMove.equals("p")) {
                if (ComputerMove.equals("s")) {
                    System.out.println("YOU LOSE !!");
                } else if (ComputerMove.equals("r")) {
                    System.out.println("YOU WIN !!");
                }


            } else if (PlayerMove.equals("s")) {
                if (ComputerMove.equals("r")) {
                    System.out.println("YOU LOSE !!");
                } else if (ComputerMove.equals("p")) {
                    System.out.println("YOU WIN !!");
                }
            }
            System.out.println("Wanna Play Again (YES or NO)");
            String PlayMode = scanner.nextLine();
            if(!PlayMode.equals("yes")){
                break;
            }
        }
    }
}