package Game;

import OX_GameBoard.GameBoard;
import PlayerMessages.Printouts;

public class OX_Game {

    protected String[][] takesNextMoveInGame(String horizontally, String vertically, String circle_or_cross){

        Printouts prints = new Printouts();
        GameBoard gameBoard = new GameBoard();

        int parseIntHorizontally = Integer.parseInt(horizontally);
        int parseIntVertically = Integer.parseInt(vertically);

        String[][] returnedTable2D = gameBoard.getTable2D();

        returnedTable2D[parseIntHorizontally - 1][parseIntVertically - 1] = circle_or_cross;

        prints.printsTable2D();

        return returnedTable2D;
    }

}
