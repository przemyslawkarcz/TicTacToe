import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrintsTest {

    @Test
    public void printsTable2D(){

        TwoDimensionalTable twoDimensionalTable = new TwoDimensionalTable();
        String[][] table2D = twoDimensionalTable.getTable2D();
        String[][] table2D_2 = twoDimensionalTable.getTable2D();

        Assertions.assertEquals(table2D_2, table2D);

    }

    @Test
    public void printsTable2D_2(){

        TwoDimensionalTable twoDimensionalTable = new TwoDimensionalTable();
        String[][] table2D = twoDimensionalTable.getTable2D();

        String[][] tableTest = new String[][]{};

        Assertions.assertNotEquals(tableTest, table2D);

    }

    @Test
    public void printsWelcomeContent(){

        Prints prints = new Prints();
        String welcomeContent = prints.printsWelcomeContent();

        Assertions.assertEquals("* * * Welcome to the TicTacToe game * * *", welcomeContent);

    }


    @Test
    public void printsWinnings01(){

        Prints prints = new Prints();
        String winnings = prints.printsWinnings();

        Assertions.assertEquals("Win! Game over!", winnings);

    }

    @Test
    public void printsWinnings02(){

        Prints prints = new Prints();
        String winnings = prints.printsWinnings();

        Assertions.assertNotEquals("Win! Over!", winnings);

    }

}
