package OX_GameBoard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameBoardTest {

    @Test
    public void fullFillTable2DWithDefaultValues_01(){

        GameBoard gameBoard = new GameBoard();
        GameBoardFacade gameBoardFacade = new GameBoardFacade();

        String[][] table2D = gameBoard.getTable2D();

        gameBoardFacade.getResultFromTakesGameBoardWithInitialData();

        boolean b = false;

        if (table2D[0][0].equals("_")){

            b = true;

        }

        Assertions.assertTrue(b);

    }

    @Test
    public void fullFillTable2DWithDefaultValues_02(){

        GameBoard gameBoard = new GameBoard();
        GameBoardFacade gameBoardFacade = new GameBoardFacade();

        String[][] table2D = gameBoard.getTable2D();

        gameBoardFacade.getResultFromTakesGameBoardWithInitialData();

        boolean b = false;

        if (table2D[0][0].equals(".")){

            b = true;

        }

        Assertions.assertFalse(b);

    }

    @Test
    public void fullFillTable2DWithDefaultValues_03(){

        GameBoard gameBoard = new GameBoard();
        GameBoardFacade gameBoardFacade = new GameBoardFacade();

        String[][] table2D = gameBoard.getTable2D();

        gameBoardFacade.getResultFromTakesGameBoardWithInitialData();

        Assertions.assertEquals("_", table2D[0][0]);

    }

    @Test
    public void fullFillTable2DWithDefaultValues_04(){

        GameBoard gameBoard = new GameBoard();
        GameBoardFacade gameBoardFacade = new GameBoardFacade();

        String[][] table2D = gameBoard.getTable2D();

        gameBoardFacade.getResultFromTakesGameBoardWithInitialData();

        Assertions.assertNotEquals(",", table2D[0][0]);

    }



}
