import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DataInputTest {

    @Test
    public void charactersEnteringWithDataInput(){

        Game game = new Game();
        TwoDimensionalTable twoDimensionalTable = new TwoDimensionalTable();

        String horizontally = "1";
        String vertically = "1";
        String o_or_x = "text";

        String[][] table2D = game.makesMoveInGame(horizontally, vertically, o_or_x);

        Assertions.assertEquals("text", table2D[0][0]);

    }

    @Test
    public void charactersEnteringWithNullInput(){

        Game game = new Game();

        String horizontally = "2";
        String vertically = "2";
        String x_or_o = null;

        String[][] table2D = game.makesMoveInGame(horizontally, vertically, x_or_o);

        Assertions.assertNull(table2D[1][1]);

    }

}
