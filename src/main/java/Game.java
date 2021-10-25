

public class Game{

    public String[][] makesMoveInGame(String horizontally, String vertically, String circle_or_cross){

        Prints prints = new Prints();
        TwoDimensionalTable twoDimensionalTable = new TwoDimensionalTable();

        int parseIntHorizontally = Integer.parseInt(horizontally);
        int parseIntVertically = Integer.parseInt(vertically);

        String[][] returnedTable2D = twoDimensionalTable.getTable2D();

        returnedTable2D[parseIntHorizontally - 1][parseIntVertically - 1] = circle_or_cross;

        prints.printsTable2D();

        return returnedTable2D;
    }

}
