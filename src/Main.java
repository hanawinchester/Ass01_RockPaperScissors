import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        String moveOne;
        String moveTwo;
        String playAgain = "Y";

        System.out.println("Welcome to Rock Paper Scissors!");
        do {
            Scanner in = new Scanner (System.in);
            System.out.print("Player A, please enter your move (R, P, or S): ");
            moveOne = in.nextLine();
            if (moveOne.equalsIgnoreCase("R") || moveOne.equalsIgnoreCase("P") || moveOne.equalsIgnoreCase("S"))
            {
                System.out.print("Player B, please enter your move (R, P, or S): ");
                moveTwo = in.nextLine();
                if (moveTwo.equalsIgnoreCase("R") || moveOne.equalsIgnoreCase("P") || moveOne.equalsIgnoreCase("S"))
                {
                    if (moveOne.equals(moveTwo))
                    {
                        System.out.println("Tie!");
                    }
                    else if (moveOne.equalsIgnoreCase("R") && moveTwo.equalsIgnoreCase("S"))
                    {
                        System.out.println("Rock breaks Scissors, Player A wins!");
                    }
                    else if (moveOne.equalsIgnoreCase("P") && moveTwo.equalsIgnoreCase("R"))
                    {
                        System.out.println("Paper covers Rock, Player A wins!");
                    }
                    else if (moveOne.equalsIgnoreCase("S") && moveTwo.equalsIgnoreCase("P"))
                    {
                        System.out.println("Scissors cut Paper, Player A wins!");
                    }
                    else
                    {
                        System.out.println("Player B wins! " + moveTwo + " beats " + moveOne);
                    }
                    System.out.print("Play again? (Y or N): ");
                    playAgain = in.nextLine();
                }
                else
                {
                    System.out.println("Player B input is invalid. Please restart and enter a valid move.");
                }



            }
            else
            {
                System.out.println("Player A input is invalid. Please restart and enter a valid move.");
            }

        } while (playAgain.equalsIgnoreCase("Y"));
    }
}