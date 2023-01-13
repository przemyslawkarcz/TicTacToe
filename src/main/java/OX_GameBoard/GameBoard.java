package OX_GameBoard;

public class GameBoard {

    public static String[][] table2D = new String[3][3];

    protected void takesGameBoardWithInitialData(){

        table2D[0][0] = "_";
        table2D[0][1] = "_";
        table2D[0][2] = "_";
        table2D[1][0] = "_";
        table2D[1][1] = "_";
        table2D[1][2] = "_";
        table2D[2][0] = "_";
        table2D[2][1] = "_";
        table2D[2][2] = "_";

    }

    public GameBoard() {}

    public String[][] getTable2D() {
        return table2D;
    }

    public void setTable2D(String[][] table2D) {
        GameBoard.table2D = table2D;
    }

}
