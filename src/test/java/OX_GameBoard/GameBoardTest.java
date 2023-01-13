package OX_GameBoard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameBoardTest {

    @Test
    public void fullFillTable2DWithDefaultValues_01(){

        GameBoard gameBoard = new GameBoard();

        String[][] table2D = gameBoard.getTable2D();

        gameBoard.takesGameBoardWithInitialData();

        boolean b = false;

        if (table2D[0][0].equals("_")){

            b = true;

        }

        Assertions.assertTrue(b);

    }

    @Test
    public void fullFillTable2DWithDefaultValues_02(){

        GameBoard gameBoard = new GameBoard();

        String[][] table2D = gameBoard.getTable2D();

        gameBoard.takesGameBoardWithInitialData();

        boolean b = false;

        if (table2D[0][0].equals(".")){

            b = true;

        }

        Assertions.assertFalse(b);

    }

    @Test
    public void fullFillTable2DWithDefaultValues_03(){

        GameBoard gameBoard = new GameBoard();

        String[][] table2D = gameBoard.getTable2D();

        gameBoard.takesGameBoardWithInitialData();

        Assertions.assertEquals("_", table2D[0][0]);

    }

    @Test
    public void fullFillTable2DWithDefaultValues_04(){

        GameBoard gameBoard = new GameBoard();

        String[][] table2D = gameBoard.getTable2D();

        gameBoard.takesGameBoardWithInitialData();

        Assertions.assertNotEquals(",", table2D[0][0]);

    }
    
}
