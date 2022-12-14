package Connect_4;

import Connect_4.Board;

import java.util.Arrays;
/**
 * Write a description of class AllInOne here.
 *
 * @author (Arian Dehghani)
 * @version (a version number or a date)
 */
public class CheckWinner
{
    Board board;


    public CheckWinner(Board boardIn)
    {
        board = boardIn;//constructor for board
    }

    
    
    private boolean horizontalWin(int r, int c)
    {
        char charToCheck =  board.getInput(r,c);//getting the row and columns of badges
        char[][] boardArray = board.getBoard(); //getting board as char[][] boardArray
        for (r = 0; r < boardArray.length; r++)
        {
            for (c = 0; c < boardArray[0].length - 3; c++)
            {
                if (charToCheck != ' ' && boardArray[r][c] == charToCheck &&
                        boardArray[r][c + 1] == charToCheck &&
                        boardArray[r][c + 2] == charToCheck &&
                        boardArray[r][c + 3] == charToCheck)
                {
                    return true;
                }
            }
        }
        return false;
    }// Conditions for vertical win

    
    private boolean verticalWin(int r, int c)
    {
        char charToCheck =  board.getInput(r,c);//getting the row and columns of badges
        char[][] boardArray = board.getBoard(); //getting board as char[][] boardArray
          for (r = 0; r < boardArray.length - 3; r++)
        {
            for (c = 0; c < boardArray[0].length; c++)
            {
                if (charToCheck != ' ' && boardArray[r][c] == charToCheck &&
                        boardArray[r + 1][c] == charToCheck &&
                        boardArray[r + 2][c] == charToCheck &&
                        boardArray[r + 3][c] == charToCheck)
                {
                    return true;
                }
            }
        }
        return false;
    }// Conditions for horizontal win

    
     private boolean RightWard Win(int r, int c)
    {
        char charToCheck =  board.getInput(r,c);//getting the row and columns of badges
        char[][] boardArray = board.getBoard(); //getting board as char[][] boardArray
          for (r = 0; r < boardArray.length - 3; r++)
        {
           for (c = 0; c < boardArray[0].length - 3; c++)
            {
                if (charToCheck != ' ' && boardArray[r][c] == charToCheck &&
                        boardArray[r + 1][c + 1] == charToCheck &&
                        boardArray[r + 2][c + 2] == charToCheck &&
                       boardArray[r + 3][c + 3] == charToCheck)
                {
                    return true;
                }
            }
        }
        return false;
    } //Conditions for RightWard win

     
    private boolean LeftWard Win(int r, int c)
    {
        char charToCheck =  board.getInput(r,c);//getting the row and columns of badges
        char[][] boardArray = board.getBoard(); //getting board as char[][] boardArray
         for (r = 3; r < boardArray.length ; r++)
        {
            for (c = 0; c < boardArray[0].length - 3; c++)
            {
                if (charToCheck != ' ' && boardArray[r][c] == charToCheck &&
                        boardArray[r - 1][c + 1] == charToCheck &&
                       boardArray[r - 2][c + 2] == charToCheck &&
                        boardArray[r - 3][c + 3] == charToCheck)
                {
                    return true;
               }
            }
        }
        return false;
    }//Conditions for LeftWard win
    
    
    // Check for vertical win
    public boolean checkWinVertical()
    {
        return verticalWin(5, MakeTurn.getCl());
    }

    // Check for horizontal win
    public boolean checkWinHorizontal()
    {
        return horizontalWin(5, MakeTurn.getCl());
    }

     //Check for Downward win
    public boolean checkLeftWard Win()
    {
        return LeftWard Win(5, MakeTurn.getCl());
    }

     //Check for Upward win
    public boolean checkRightWard Win()
    {
       return RightWard Win(5, MakeTurn.getCl());
    }


}
