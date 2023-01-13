package Game;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OXGameTest {

    @Test
    public void makesMoveInGameTestWithDataInput01(){

        OX_GameFacade oxGameFacade = new OX_GameFacade();

        String horizontally = "3";
        String vertically = "3";
        String o_or_X = "text";

        String[][] table2D = oxGameFacade.getTakesNextMoveInGame(horizontally, vertically, o_or_X);

        Assertions.assertEquals("text", table2D[2][2]);

    }

    @Test
    public void makesMoveInGameTestWithDataInput02(){

        OX_GameFacade oxGameFacade = new OX_GameFacade();

        String horizontally = "3";
        String vertically = "3";
        String o_or_X = "text";

        String[][] table2D = oxGameFacade.getTakesNextMoveInGame(horizontally, vertically, o_or_X);

        Assertions.assertNotNull(table2D[2][2]);

    }

    @Test
    public void makesMoveInGameTestWithNullInput(){

        OX_GameFacade oxGameFacade = new OX_GameFacade();

        String horizontally = "3";
        String vertically = "3";
        String o_or_X = null;

        String[][] table2D = oxGameFacade.getTakesNextMoveInGame(horizontally, vertically, o_or_X);

        Assertions.assertNull(table2D[2][2]);

    }

}
