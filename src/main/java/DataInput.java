

import java.util.Scanner;

public class DataInput {




    public static void charactersEntering(){

        Prints prints = new Prints();
        Scanner scanner = new Scanner(System.in);
        Symbols symbols = new Symbols();
        Game game = new Game();
        TwoDimensionalTable twoDimensionalTable = new TwoDimensionalTable();
        Winnings winnings = new Winnings();

        String enteredSymbolForHorizontalCoordinates;
        String enteredSymbolForVerticalCoordinates;
        String enteredSymbol_o_or_x = "";

        int movesCounter = 1;

        prints.printsWelcomeContent();

        twoDimensionalTable.fullFillTable2DWithDefaultValues();

        prints.printsTable2D();

        int movesNumberInGame = 9;
        for (int i = 0; i < movesNumberInGame; i++) {

            int enteredDataInOneMove = 3;
            for (int j = 0; j < enteredDataInOneMove; j++) {

                System.out.print("Move No.: " + movesCounter++);

                System.out.print("\nVertical coordinate: ");
                enteredSymbolForHorizontalCoordinates = symbols.checksEnteredSymbolForCoordinates(scanner.next());

                System.out.print("Horizontal coordinate: ");
                enteredSymbolForVerticalCoordinates = symbols.checksEnteredSymbolForCoordinates(scanner.next());

                System.out.print("'o' or 'x': ");
                enteredSymbol_o_or_x = symbols.checksEnteredSymbol_O_or_X(scanner.next());
                System.out.println();

                game.makesMoveInGame(enteredSymbolForHorizontalCoordinates, enteredSymbolForVerticalCoordinates, enteredSymbol_o_or_x);

                winnings.checksWinnings();

            }

        }

    }

}
