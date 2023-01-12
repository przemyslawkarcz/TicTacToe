package PlayerInput;

import Game.OX_Game;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlayerInputDataTest {

    @Test
    public void takesCoordinatesAndPlayerSymbolSelection(){

        OX_Game ox_game = new OX_Game();

        String horizontally = "1";
        String vertically = "1";
        String o_or_x = "text";

        String[][] table2D = ox_game.takesNextMoveInGame(horizontally, vertically, o_or_x);

        Assertions.assertEquals("text", table2D[0][0]);

    }

    @Test
    public void charactersEnteringWithNullInput(){

        OX_Game game = new OX_Game();

        String horizontally = "2";
        String vertically = "2";
        String x_or_o = null;

        String[][] table2D = game.takesNextMoveInGame(horizontally, vertically, x_or_o);

        Assertions.assertNull(table2D[1][1]);

    }

}
