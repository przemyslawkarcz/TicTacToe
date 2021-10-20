

public class Symbols {

    public String checksEnteredSymbolForCoordinates(String someSymbol) {

        //checks length

        int length = someSymbol.length();

        if (length > 1) {

            System.out.println("One symbol is allowed!");
            System.exit(0);

        }

        //checks if it is an integer

        char c = someSymbol.charAt(0);

        if (!Character.isDigit(c)) {

            System.out.println("Integers are allowed!");
            System.exit(0);

        }

        //checks if it is in range between 1 and 3

        int parseInt = Integer.parseInt(someSymbol);
        int one = 1;
        int two = 2;
        int three = 3;

        if ((parseInt == one) || (parseInt == two || parseInt == three)){

        }else {

            System.out.println("Digits in range 1 - 3 are allowed!");
            System.exit(0);

        }

        return someSymbol;

    }

    public String checksEnteredSymbol_O_or_X(String someSymbol){

        //checks length

        int length = someSymbol.length();

        if (length > 1) {

            System.out.println("One symbol is allowed!");
            System.exit(0);

        }

        //checks if it is a String or Character

        char c = someSymbol.charAt(0);

        if (Character.isDigit(c)){

            System.out.println("Characters are allowed!");
            System.exit(0);


        }

        //checks if it is an 'o' or 'O' or 'x' or 'X'
        String o = "o";
        String O = "O";
        String x = "x";
        String X = "X";

        if ((someSymbol.equals(o)) || (someSymbol.equals(O)) || (someSymbol.equals(x)) || (someSymbol.equals(X))){

        }else {

            System.out.println("Symbols 'o', 'O', 'x', 'X' are allowed!");
            System.exit(0);

        }

        return someSymbol;
    }

}
