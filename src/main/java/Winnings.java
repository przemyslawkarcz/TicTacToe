

public class Winnings {

    public static String x = "x";
    public static String o = "o";
    Closure closure = new Closure();
    Prints prints = new Prints();
    TwoDimensionalTable twoDimensionalTable = new TwoDimensionalTable();

    public void checksWinnings(){

        checksWinningsThrough00To22();
        checksWinningsThrough20To02();

        checksWinningsThrough00To02();
        checksWinningsThrough10To12();
        checksWinningsThrough20To22();

        checksWinningsThrough00To20();
        checksWinningsThrough01To21();
        checksWinningsThrough02To22();

    }

    //oblique wins

    public void checksWinningsThrough00To22(){

        String[][] table2D = twoDimensionalTable.getTable2D();

        if ((table2D[0][0].equalsIgnoreCase(x) && table2D[1][1].equalsIgnoreCase(x) && table2D[2][2].equalsIgnoreCase(x))||
                (table2D[0][0].equalsIgnoreCase(o) && table2D[1][1].equalsIgnoreCase(o) && table2D[2][2].equalsIgnoreCase(o))){

            prints.printsWinnings();

            closure.stopsGameWithWin();

        }

    }

    public void checksWinningsThrough20To02(){

        String[][] table2D = twoDimensionalTable.getTable2D();

        if ((table2D[2][0].equalsIgnoreCase(x) && table2D[1][1].equalsIgnoreCase(x) && table2D[0][2].equalsIgnoreCase(x))||
                (table2D[2][0].equalsIgnoreCase(o) && table2D[1][1].equalsIgnoreCase(o) && table2D[0][2].equalsIgnoreCase(o))){

            prints.printsWinnings();

            closure.stopsGameWithWin();

        }

    }

    //horizontal wins

    public void checksWinningsThrough00To02(){

        String[][] table2D = twoDimensionalTable.getTable2D();

        if ((table2D[0][0].equalsIgnoreCase(x) && table2D[0][1].equalsIgnoreCase(x) && table2D[0][2].equalsIgnoreCase(x))||
                (table2D[0][0].equalsIgnoreCase(o) && table2D[0][1].equalsIgnoreCase(o) && table2D[0][2].equalsIgnoreCase(o))){

            prints.printsWinnings();

            closure.stopsGameWithWin();

        }

    }

    public void checksWinningsThrough10To12(){

        String[][] table2D = twoDimensionalTable.getTable2D();

        if ((table2D[1][0].equalsIgnoreCase(x) && table2D[1][1].equalsIgnoreCase(x) && table2D[1][2].equalsIgnoreCase(x))||
                (table2D[1][0].equalsIgnoreCase(o) && table2D[1][1].equalsIgnoreCase(o) && table2D[1][2].equalsIgnoreCase(o))){

            prints.printsWinnings();

            closure.stopsGameWithWin();

        }

    }

    public void checksWinningsThrough20To22(){

        String[][] table2D = twoDimensionalTable.getTable2D();

        if ((table2D[2][0].equalsIgnoreCase(x) && table2D[2][1].equalsIgnoreCase(x) && table2D[2][2].equalsIgnoreCase(x))||
                (table2D[2][0].equalsIgnoreCase(o) && table2D[2][1].equalsIgnoreCase(o) && table2D[2][2].equalsIgnoreCase(o))){

            prints.printsWinnings();

            closure.stopsGameWithWin();

        }

    }

    //vertical wins

    public void checksWinningsThrough00To20(){

        String[][] table2D = twoDimensionalTable.getTable2D();

        if ((table2D[0][0].equalsIgnoreCase(x) && table2D[1][0].equalsIgnoreCase(x) && table2D[2][0].equalsIgnoreCase(x))||
                (table2D[0][0].equalsIgnoreCase(o) && table2D[1][0].equalsIgnoreCase(o) && table2D[2][0].equalsIgnoreCase(o))){

            prints.printsWinnings();

            closure.stopsGameWithWin();

        }

    }


    public void checksWinningsThrough01To21(){

        String[][] table2D = twoDimensionalTable.getTable2D();

        if ((table2D[0][1].equalsIgnoreCase(x) && table2D[1][1].equalsIgnoreCase(x) && table2D[2][1].equalsIgnoreCase(x))||
                (table2D[0][1].equalsIgnoreCase(o) && table2D[1][1].equalsIgnoreCase(o) && table2D[2][1].equalsIgnoreCase(o))){

            prints.printsWinnings();

            closure.stopsGameWithWin();

        }

    }

    public void checksWinningsThrough02To22(){

        String[][] table2D = twoDimensionalTable.getTable2D();

        if ((table2D[0][2].equalsIgnoreCase(x) && table2D[1][2].equalsIgnoreCase(x) && table2D[2][2].equalsIgnoreCase(x))||
                (table2D[0][2].equalsIgnoreCase(o) && table2D[1][2].equalsIgnoreCase(o) && table2D[2][2].equalsIgnoreCase(o))){

            prints.printsWinnings();

            closure.stopsGameWithWin();

        }

    }


}
