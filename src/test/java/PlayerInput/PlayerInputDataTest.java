package PlayerInput;

import Game.OX_GameFacade;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlayerInputDataTest {

    @Test
    public void gameRunner(){

        OX_GameFacade oxGameFacade = new OX_GameFacade();

        String horizontally = "1";
        String vertically = "1";
        String o_or_x = "text";

        String[][] table2D = oxGameFacade.getTakesNextMoveInGame(horizontally, vertically, o_or_x);

        Assertions.assertEquals("text", table2D[0][0]);

    }

    @Test
    public void charactersEnteringWithNullInput(){

        OX_GameFacade oxGameFacade = new OX_GameFacade();

        String horizontally = "2";
        String vertically = "2";
        String x_or_o = null;

        String[][] table2D = oxGameFacade.getTakesNextMoveInGame(horizontally, vertically, x_or_o);

        Assertions.assertNull(table2D[1][1]);

    }

}
