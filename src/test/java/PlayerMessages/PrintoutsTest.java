package PlayerMessages;

import OX_GameBoard.GameBoard;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrintoutsTest {

    @Test
    public void printsTable2D(){

        GameBoard gameBoard = new GameBoard();
        String[][] table2D = gameBoard.getTable2D();
        String[][] table2D_2 = gameBoard.getTable2D();

        Assertions.assertEquals(table2D_2, table2D);

    }

    @Test
    public void printsTable2D_2(){

        GameBoard gameBoard = new GameBoard();
        String[][] table2D = gameBoard.getTable2D();

        String[][] tableTest = new String[][]{};

        Assertions.assertNotEquals(tableTest, table2D);

    }

    @Test
    public void printsWelcomeContent(){

        PrintoutsFacade printoutsFacade = new PrintoutsFacade();
        String welcomeContent = printoutsFacade.getPrintsWelcomeContent();

        Assertions.assertEquals("* * * Welcome to the TicTacToe game * * *", welcomeContent);

    }

    @Test
    public void printsWinnings01(){

        Printouts printouts = new Printouts();
        String winnings = printouts.printsWinnings();

        Assertions.assertEquals("Win! Game over!", winnings);

    }

    @Test
    public void printsWinnings02(){

        Printouts printouts = new Printouts();
        String winnings = printouts.printsWinnings();

        Assertions.assertNotEquals("Win! Over!", winnings);

    }

}
