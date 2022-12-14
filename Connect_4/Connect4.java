package Connect_4;

import Connect_4.Board;

import java.util.Scanner;

/**
 * Write a description of class AllInOne here.
 *
 * @author (Arian Dehghani)
 * @version (a version number or a date)
 */
public class Connect4
{
    public static char[] Badge = new char[]{'X', 'O'};// the badges title 
    public static char[] playerNum = new char[]{'1', '2'};//player 1 and 2
    
   
    public static void main(String[] args)
    {

            int m = 7 * 6;//all possible moves 


            int Plchange = 0;//it will help to get badge and change the player turn
            Scanner scanner = new Scanner(System.in);
        
        
            Board board = new Board();//insert our board
            CheckWinner cw = new CheckWinner(board);//It will check the winner from checkwinner class
            
            board.BoardFiller();//insert our board filler
            board.printBoard();//insert our printboard 
            


            System.out.println("Welcome to the Connect4 :");
            System.out.println("For starting game Enter a number between 0 and 6 for choosing a column.");
            System.out.println();
            do
            {
                // 1. get a badge
                char Player = playerNum[Plchange];//help to know player which is his turn
                char badge = Badge[Plchange];//help to get the player badge

                //  make a turn
                MakeTurn.makeTurn(board, badge, Player);
                board.printBoard();
                --m;// decreasing moves
                Plchange = 1 - Plchange;//changing the player turn
                if (m == 0)//that mean board is full
                {
                    System.out.println("Game Tie");
                    System.out.println("Thank you for using this game");
                    break;
                }
                // Find the winner by checking all functions
                if (cw.checkWinHorizontal() || cw.checkWinVertical() || cw.checkLeftWard Win() || cw.checkRightWard Win())// running all winner checker 
                {
                    System.out.println("******************Player " + Player + " HAS WON !******************");
                    break;
                }
                
                
            } while (true);
        
    }
    
}

                            
                   
       