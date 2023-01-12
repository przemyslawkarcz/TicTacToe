package Credit;

import OX_GameBoard.GameBoard;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AwardsTest {

    @Test
    public void checksWinningsThrough00_22(){

        GameBoard gameBoard = new GameBoard();

        String[][] table2D = gameBoard.getTable2D();

        table2D[0][0] = "o";
        table2D[1][1] = "o";
        table2D[2][2] = "o";

        boolean b = false;

        if ((table2D[0][0].equalsIgnoreCase(table2D[1][1]) && table2D[1][1].equalsIgnoreCase(table2D[2][2]))){

            b = true;

        }

        Assertions.assertTrue(b);

    }

    @Test
    public void checksWinningsThrough20_02(){

        GameBoard gameBoard = new GameBoard();

        String[][] table2D = gameBoard.getTable2D();

        table2D[2][0] = "o";
        table2D[1][1] = "o";
        table2D[0][2] = "o";

        boolean b = false;

        if ((table2D[2][0].equalsIgnoreCase(table2D[1][1]) && table2D[1][1].equalsIgnoreCase(table2D[0][2]))){

            b = true;

        }

        Assertions.assertTrue(b);

    }

    @Test
    public void checksWinningsThrough00_02(){

        GameBoard gameBoard = new GameBoard();

        String[][] table2D = gameBoard.getTable2D();

        table2D[0][0] = "o";
        table2D[0][1] = "o";
        table2D[0][2] = "o";

        boolean b = false;

        if ((table2D[0][0].equalsIgnoreCase(table2D[0][1]) && table2D[0][1].equalsIgnoreCase(table2D[0][2]))){

            b = true;

        }

        Assertions.assertTrue(b);

    }

    @Test
    public void checksWinningsThrough10_12(){

        GameBoard gameBoard = new GameBoard();

        String[][] table2D = gameBoard.getTable2D();

        table2D[1][0] = "o";
        table2D[1][1] = "o";
        table2D[1][2] = "o";

        boolean b = false;

        if ((table2D[1][0].equalsIgnoreCase(table2D[1][1]) && table2D[1][1].equalsIgnoreCase(table2D[1][2]))){

            b = true;

        }

        Assertions.assertTrue(b);

    }

    @Test
    public void checksWinningsThrough20_22(){

        GameBoard gameBoard = new GameBoard();

        String[][] table2D = gameBoard.getTable2D();

        table2D[2][0] = "o";
        table2D[2][1] = "o";
        table2D[2][2] = "o";

        boolean b = false;

        if ((table2D[2][0].equalsIgnoreCase(table2D[2][1]) && table2D[2][1].equalsIgnoreCase(table2D[2][2]))){

            b = true;

        }

        Assertions.assertTrue(b);

    }

    @Test
    public void checksWinningsThrough00_20(){

        GameBoard gameBoard = new GameBoard();

        String[][] table2D = gameBoard.getTable2D();

        table2D[0][0] = "o";
        table2D[1][0] = "o";
        table2D[2][0] = "o";

        boolean b = false;

        if ((table2D[0][0].equalsIgnoreCase(table2D[1][0]) && table2D[1][0].equalsIgnoreCase(table2D[2][0]))){

            b = true;

        }

        Assertions.assertTrue(b);

    }

    @Test
    public void checksWinningsThrough01_21(){

        GameBoard gameBoard = new GameBoard();

        String[][] table2D = gameBoard.getTable2D();

        table2D[0][1] = "o";
        table2D[1][1] = "o";
        table2D[2][1] = "o";

        boolean b = false;

        if ((table2D[0][1].equalsIgnoreCase(table2D[1][1]) && table2D[1][1].equalsIgnoreCase(table2D[2][1]))){

            b = true;

        }

        Assertions.assertTrue(b);

    }

    @Test
    public void checksWinningsThrough02_22(){

        GameBoard gameBoard = new GameBoard();

        String[][] table2D = gameBoard.getTable2D();

        table2D[0][2] = "o";
        table2D[1][2] = "o";
        table2D[2][2] = "o";

        boolean b = false;

        if ((table2D[0][2].equalsIgnoreCase(table2D[1][2]) && table2D[1][2].equalsIgnoreCase(table2D[2][2]))){

            b = true;

        }

        Assertions.assertTrue(b);

    }

}
