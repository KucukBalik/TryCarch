import java.util.Scanner;

public class Usingtrycatch {
    public static void main(String[] args) {

        try(Scanner myScan = new Scanner(System.in))
        {
            while(true)
            {
                //Check if the number is between 0 - 9
                System.out.println("Please enter a number between 0 and 9");

                try{

                    String input = myScan.nextLine();
                    int myNum = Integer.parseInt(input);

                    if (myNum >= 0 && myNum <= 9)
                    {

                        System.out.println("Your number is " + myNum);
                        break;
                    }

                    else
                    {
                        System.out.println("Your number is not between 0 and 9");
                    }


                }
                catch(NumberFormatException nfe) {
                    System.out.println("Invalid input please try a number between 0 and 9");
                }
            }
        }


    }
}
