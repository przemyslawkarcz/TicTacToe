package Game;

public class OX_GameFacade {

    public String[][] getTakesNextMoveInGame(String horizontally, String vertically, String circle_or_cross){

        OX_Game ox_game = new OX_Game();
        return ox_game.takesNextMoveInGame(horizontally, vertically, circle_or_cross);

    }

}
