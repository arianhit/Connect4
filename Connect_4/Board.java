package Connect_4;

public class Board {
    public char[][] board = new char[6][7];//to creat the board with 6 row and 7 column




    public void printBoard()
    {
        System.out.println("              0   1   2   3   4   5   6");//print numbers of row
        System.out.println("            -----------------------------");//printing - to separate numbers
        for (int r = 0; r < 6; r++)//creating loop for row
        {
            System.out.print("            | ");//printing | to put space between
            for (int c = 0; c < 7; c++)//loop for columns
            {
                System.out.print(board[r][c] + " | ");//printing | to put space between
            }
            System.out.println();
            System.out.print("            -----------------------------");//printing - to separate numbers
            System.out.println();

        }
        System.out.println("              0   1   2   3   4   5   6");//print numbers of row
        System.out.println();
    }//printing the board

    public void BoardFiller()
    {
        for (int r = 0; r < 6; r++)//loop for rows
        {
            for (int c = 0; c < 7; c++)//loop for columns
            {
                board[r][c] = ' ';//printing space
            }
        }
    }// Fills the empty spaces

    public void setInput(int r, int c, char i)
    {
        board[r][c] = i;//seting input
    }

    public char getInput(int r, int c)
    {
        return board[r][c];//getting input
    }



    public char[][] getBoard()
    {
        return board;//geting board
    }

}
