

public class Prints {

    public void printsTable2D(){

        System.out.println("     1   2   3  ");
        System.out.println(" |||||||||||||||" + "");

        for (int i = 0; i < TwoDimensionalTable.table2D.length; i++) {

            System.out.print((i + 1) + "||| ");

            for (int j = 0; j < TwoDimensionalTable.table2D[i].length; j++) {

                System.out.print(TwoDimensionalTable.table2D[i][j] + " | ");

            }

            System.out.println();

        }

        System.out.println();

    }

    public String printsWelcomeContent(){

        String welcome = "* * * Welcome to the TicTacToe game * * *";
        String the_game = "\nThe game allows you to make up to 9 moves.";
        String select = "Select the coordinates under which you would like to put 'o' or 'x'.";
        String enter = "Enter coordinates first horizontally, then vertically and then chosen symbol.\n";

        System.out.println(welcome);
        System.out.println(the_game);
        System.out.println(select);
        System.out.println(enter);

        return welcome;

    }

    public String printsWinnings(){

        String win = "Win";

        System.out.println(win);

        return win;

    }

}
