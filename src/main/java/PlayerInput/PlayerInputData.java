package PlayerInput;

import Credit.Awards;
import Game.OX_Game;
import Inspection.PlayerDataInspection;
import OX_GameBoard.GameBoard;
import PlayerMessages.Printouts;
import java.util.Scanner;

public class PlayerInputData {

    public static void takesCoordinatesAndPlayerSymbolSelection(){

        Scanner scanner = new Scanner(System.in);
        OX_Game ox_game = new OX_Game();
        GameBoard gameBoard = new GameBoard();
        Printouts printouts = new Printouts();
        PlayerDataInspection playerDataInspection = new PlayerDataInspection();
        Awards awards = new Awards();

        String enteredSymbolForHorizontalCoordinates;
        String enteredSymbolForVerticalCoordinates;
        String enteredSymbol_o_or_x = "";

        int movesCounter = 1;

        printouts.printsWelcomeContent();

        gameBoard.takesGameBoardWithInitialData();

        printouts.printsTable2D();

        int movesNumberInGame = 9;
        for (int i = 0; i < movesNumberInGame; i++) {

            int enteredDataInOneMove = 3;
            for (int j = 0; j < enteredDataInOneMove; j++) {

                System.out.print("Move No.: " + movesCounter++);

                System.out.print("\nVertical coordinate: ");
                enteredSymbolForHorizontalCoordinates = playerDataInspection.checksEnteredSymbolForCoordinates(scanner.next());

                System.out.print("Horizontal coordinate: ");
                enteredSymbolForVerticalCoordinates = playerDataInspection.checksEnteredSymbolForCoordinates(scanner.next());

                System.out.print("'o' or 'x': ");
                enteredSymbol_o_or_x = playerDataInspection.checksEnteredSymbol_O_or_X(scanner.next());
                System.out.println();

                ox_game.takesNextMoveInGame(enteredSymbolForHorizontalCoordinates, enteredSymbolForVerticalCoordinates, enteredSymbol_o_or_x);

                awards.checksWinnings();

            }

        }

    }

}