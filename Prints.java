package pl.com.sda.homework.Wlasne_Projekty.TicTacToe;

import static pl.com.sda.homework.Wlasne_Projekty.TicTacToe.TwoDimensionalTable.*;

public class Prints {

    public void printsTable2D(){

        System.out.println("     1   2   3  ");
        System.out.println(" |||||||||||||||" + "");

        for (int i = 0; i < table2D.length; i++) {

            System.out.print((i + 1) + "||| ");

            for (int j = 0; j < table2D[i].length; j++) {

                System.out.print(table2D[i][j] + " | ");

            }

            System.out.println();

        }

        System.out.println();

    }

    public void printsWelcomeContent(){

        System.out.println("* * * Welcome to the TicTacToe game * * *");
        System.out.println("\nThe game allows you to make up to 9 moves.");
        System.out.println("Select the coordinates under which you would like to put 'o' or 'x'.");
        System.out.println("Enter coordinates first horizontally, then vertically and then chosen symbol.\n");

    }

    public void printsWinnings(){

        System.out.println("Win!");

    }

}
