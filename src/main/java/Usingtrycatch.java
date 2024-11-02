import java.util.Scanner;

public class Usingtrycatch {

    public static void main(String[] args) {
        System.out.println("Please enter a number between 0 and 9");
        Scanner myScan = new Scanner(System.in);

        //Read user inout as a string
        String input = myScan.nextLine();

        //Read user input as a integer
        int myNum = Integer.parseInt(input);



        //Check if the number is between 0 - 9

        if(myNum >= 0 && myNum <= 9) {
            System.out.println("Your number is " + myNum);
        }
        else {
            System.out.println("Your number is not between 0 and 9");
        }

    }
}
