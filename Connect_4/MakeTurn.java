package Connect_4;

import Connect_4.Board;

import java.util.Scanner;
/**
 * Write a description of class AllInOne here.
 *
 * @author (Arian Dehghani)
 * @version (a version number or a date)
 */


public class MakeTurn
{
   static int cl;
    public static void makeTurn(Board board, char badge, char Player)
    {
        Scanner scanner = new Scanner(System.in);//making new scanner 
        do
        {
            // 1. Ask for a column
            System.out.println("Player " + Player + " turn: ");// to say witch player should play now 
            String s = scanner.next();//getting input from player
             cl = Integer.parseInt(s);//get the input from player to know the number of column

            //  Check if it's between 0 and 6
            if (cl > 6)
            {
                System.out.println("Your input is not valid. Please enter a number between 0 and 6: ");
                continue;
            }

            // Place a badge of players
            for (int u = 6 - 1; u >= 0; u--)
            {
                if (board.getInput(u, cl) == ' ')
                {
                    board.setInput(u, cl, badge);
                    return;
                }
            }

            // check the column is full or not column is full
            System.out.println("Column " + cl + " has no more space. Choose column:");

        } while (true);
        
    }
    public static int getCl()
    {
        return cl;//to get the column number that player put
    }
}
