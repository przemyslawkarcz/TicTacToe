package PlayerInput;

import Credit.AwardsFacade;
import Game.OX_GameFacade;
import Inspection.PlayerDataInspectionFacade;
import OX_GameBoard.GameBoardFacade;
import PlayerMessages.PrintoutsFacade;
import Inspection.PlayerDataInspectionFacade;

import java.util.Scanner;

public class PlayerInputData {

    protected static void gameRunner(){

        Scanner scanner = new Scanner(System.in);
        OX_GameFacade ox_gameFacade = new OX_GameFacade();
        GameBoardFacade gameBoardFacade = new GameBoardFacade();
        PrintoutsFacade printoutsFacade = new PrintoutsFacade();
        PlayerDataInspectionFacade playerDataInspectionFacade = new PlayerDataInspectionFacade();
        AwardsFacade awardsFacade = new AwardsFacade();

        String enteredSymbolForHorizontalCoordinates;
        String enteredSymbolForVerticalCoordinates;
        String enteredSymbol_o_or_x = "";

        int movesCounter = 1;

        printoutsFacade.getPrintsWelcomeContent();

        gameBoardFacade.getResultFromTakesGameBoardWithInitialData();

        printoutsFacade.getPrintsTable2D();

        int movesNumberInGame = 9;
        for (int i = 0; i < movesNumberInGame; i++) {

            int enteredDataInOneMove = 3;
            for (int j = 0; j < enteredDataInOneMove; j++) {

                System.out.print("Move No.: " + movesCounter++);

                System.out.print("\nVertical coordinate: ");
                enteredSymbolForHorizontalCoordinates = playerDataInspectionFacade.getChecksEnteredSymbolForCoordinates(scanner.next());

                System.out.print("Horizontal coordinate: ");
                enteredSymbolForVerticalCoordinates = playerDataInspectionFacade.getChecksEnteredSymbolForCoordinates(scanner.next());

                System.out.print("'o' or 'x': ");
                enteredSymbol_o_or_x = playerDataInspectionFacade.getChecksEnteredSymbol_O_or_X(scanner.next());
                System.out.println();

                ox_gameFacade.getTakesNextMoveInGame(enteredSymbolForHorizontalCoordinates, enteredSymbolForVerticalCoordinates, enteredSymbol_o_or_x);

                awardsFacade.getAwards();

                playerDataInspectionFacade.getResultFromMovesNumber(movesCounter);

            }

        }

    }

}
