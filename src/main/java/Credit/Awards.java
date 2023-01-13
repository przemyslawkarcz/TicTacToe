package Credit;

import OX_GameBoard.GameBoard;
import PlayerMessages.Printouts;
import Shutdown.GameInterruptClass;

public class Awards {

    protected static String x = "x";
    protected static String o = "o";
    GameInterruptClass gameInterruptClass = new GameInterruptClass();
    Printouts printouts = new Printouts();
    GameBoard gameBoard = new GameBoard();

    protected void checksWinnings(){

        checksWinningsThrough00To22();
        checksWinningsThrough20To02();

        checksWinningsThrough00To02();
        checksWinningsThrough10To12();
        checksWinningsThrough20To22();

        checksWinningsThrough00To20();
        checksWinningsThrough01To21();
        checksWinningsThrough02To22();

    }

    protected void checksWinningsThrough00To22(){

        String[][] table2D = gameBoard.getTable2D();

        if ((table2D[0][0].equalsIgnoreCase(x) && table2D[1][1].equalsIgnoreCase(x) && table2D[2][2].equalsIgnoreCase(x))||
                (table2D[0][0].equalsIgnoreCase(o) && table2D[1][1].equalsIgnoreCase(o) && table2D[2][2].equalsIgnoreCase(o))){

            printouts.printsWinnings();

            gameInterruptClass.stopsGameWithWin();

        }

    }

    protected void checksWinningsThrough20To02(){

        String[][] table2D = gameBoard.getTable2D();

        if ((table2D[2][0].equalsIgnoreCase(x) && table2D[1][1].equalsIgnoreCase(x) && table2D[0][2].equalsIgnoreCase(x))||
                (table2D[2][0].equalsIgnoreCase(o) && table2D[1][1].equalsIgnoreCase(o) && table2D[0][2].equalsIgnoreCase(o))){

            printouts.printsWinnings();

            gameInterruptClass.stopsGameWithWin();

        }

    }

    protected void checksWinningsThrough00To02(){

        String[][] table2D = gameBoard.getTable2D();

        if ((table2D[0][0].equalsIgnoreCase(x) && table2D[0][1].equalsIgnoreCase(x) && table2D[0][2].equalsIgnoreCase(x))||
                (table2D[0][0].equalsIgnoreCase(o) && table2D[0][1].equalsIgnoreCase(o) && table2D[0][2].equalsIgnoreCase(o))){

            printouts.printsWinnings();

            gameInterruptClass.stopsGameWithWin();

        }

    }

    protected void checksWinningsThrough10To12(){

        String[][] table2D = gameBoard.getTable2D();

        if ((table2D[1][0].equalsIgnoreCase(x) && table2D[1][1].equalsIgnoreCase(x) && table2D[1][2].equalsIgnoreCase(x))||
                (table2D[1][0].equalsIgnoreCase(o) && table2D[1][1].equalsIgnoreCase(o) && table2D[1][2].equalsIgnoreCase(o))){

            printouts.printsWinnings();

            gameInterruptClass.stopsGameWithWin();

        }

    }

    protected void checksWinningsThrough20To22(){

        String[][] table2D = gameBoard.getTable2D();

        if ((table2D[2][0].equalsIgnoreCase(x) && table2D[2][1].equalsIgnoreCase(x) && table2D[2][2].equalsIgnoreCase(x))||
                (table2D[2][0].equalsIgnoreCase(o) && table2D[2][1].equalsIgnoreCase(o) && table2D[2][2].equalsIgnoreCase(o))){

            printouts.printsWinnings();

            gameInterruptClass.stopsGameWithWin();

        }

    }

    protected void checksWinningsThrough00To20(){

        String[][] table2D = gameBoard.getTable2D();

        if ((table2D[0][0].equalsIgnoreCase(x) && table2D[1][0].equalsIgnoreCase(x) && table2D[2][0].equalsIgnoreCase(x))||
                (table2D[0][0].equalsIgnoreCase(o) && table2D[1][0].equalsIgnoreCase(o) && table2D[2][0].equalsIgnoreCase(o))){

            printouts.printsWinnings();

            gameInterruptClass.stopsGameWithWin();

        }

    }

    protected void checksWinningsThrough01To21(){

        String[][] table2D = gameBoard.getTable2D();

        if ((table2D[0][1].equalsIgnoreCase(x) && table2D[1][1].equalsIgnoreCase(x) && table2D[2][1].equalsIgnoreCase(x))||
                (table2D[0][1].equalsIgnoreCase(o) && table2D[1][1].equalsIgnoreCase(o) && table2D[2][1].equalsIgnoreCase(o))){

            printouts.printsWinnings();

            gameInterruptClass.stopsGameWithWin();

        }

    }

    protected void checksWinningsThrough02To22(){

        String[][] table2D = gameBoard.getTable2D();

        if ((table2D[0][2].equalsIgnoreCase(x) && table2D[1][2].equalsIgnoreCase(x) && table2D[2][2].equalsIgnoreCase(x))||
                (table2D[0][2].equalsIgnoreCase(o) && table2D[1][2].equalsIgnoreCase(o) && table2D[2][2].equalsIgnoreCase(o))){

            printouts.printsWinnings();

            gameInterruptClass.stopsGameWithWin();

        }

    }

}
