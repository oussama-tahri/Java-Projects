import java.util.Scanner;

import static java.util.Scanner.*;

public class Main {
    public static void main(String[] args) {


        int x;
        do {
            //we will allow the user to insert a value
            Scanner scanner = new Scanner(System.in);
            x = scanner.nextInt();
            if(x<=0 || x>10){
                System.out.println("try another number");}
            // scanner.close();
        }while(x<=0 || x>10);

        do {

            System.out.println("table de multiplication de : "+x);
            int i;
            for (i = 0; i <= 10; i++) {
                System.out.println(x + " * " + i + " =" + x * i);
            }
            x++;

        }while(x<11);


    }
}