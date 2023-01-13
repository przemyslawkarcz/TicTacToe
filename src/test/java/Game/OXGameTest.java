package Game;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OXGameTest {

    @Test
    public void makesMoveInGameTestWithDataInput01(){

        OX_Game oxGame = new OX_Game();

        String horizontally = "3";
        String vertically = "3";
        String o_or_X = "text";

        String[][] table2D = oxGame.takesNextMoveInGame(horizontally, vertically, o_or_X);

        Assertions.assertEquals("text", table2D[2][2]);

    }

    @Test
    public void makesMoveInGameTestWithDataInput02(){

        OX_Game oxGame = new OX_Game();

        String horizontally = "3";
        String vertically = "3";
        String o_or_X = "text";

        String[][] table2D = oxGame.takesNextMoveInGame(horizontally, vertically, o_or_X);

        Assertions.assertNotNull(table2D[2][2]);

    }

    @Test
    public void makesMoveInGameTestWithNullInput(){

        OX_Game oxGame = new OX_Game();

        String horizontally = "3";
        String vertically = "3";
        String o_or_X = null;

        String[][] table2D = oxGame.takesNextMoveInGame(horizontally, vertically, o_or_X);

        Assertions.assertNull(table2D[2][2]);

    }

}
