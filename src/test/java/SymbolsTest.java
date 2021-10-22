import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SymbolsTest {

    @Test
    public void checksEnteredSymbolForCoordinates_Length_01(){

        Symbols symbols = new Symbols();
        String s = symbols.checksEnteredSymbolForCoordinates("3");

        int length = s.length();

        Assertions.assertEquals(1, length);

    }

    @Test
    public void checksEnteredSymbolForCoordinates_Length_02(){

        Symbols symbols = new Symbols();
        String s = symbols.checksEnteredSymbolForCoordinates("3");

        int length = s.length();

        Assertions.assertNotEquals(10, length);

    }

    @Test
    public void checksEnteredSymbolForCoordinates_Integer_01(){

        Symbols symbols = new Symbols();
        String s = symbols.checksEnteredSymbolForCoordinates("2");

        int i = Integer.parseInt(s);

        int test = 2;

        Assertions.assertEquals(test, i);

    }

    @Test
    public void checksEnteredSymbolForCoordinates_Integer_02(){

        Symbols symbols = new Symbols();
        String s = symbols.checksEnteredSymbolForCoordinates("2");

        int i = Integer.parseInt(s);

        int test = 20;

        Assertions.assertNotEquals(test, i);

    }

    @Test
    public void checksEnteredSymbolForCoordinates_IntegerInRangeFrom1To3_01(){

        Symbols symbols = new Symbols();
        String s = symbols.checksEnteredSymbolForCoordinates("3");

        int i = Integer.parseInt(s);

        int [] tableI = new int[]{i};
        
        int [] table1_3 = new int[]{1, 2, 3};

        boolean b = false;

        for (int j = 0; j < table1_3.length; j++) {

            for (int k = 0; k < tableI.length; k++) {

                if (table1_3[j] == tableI[k]){

                    b = true;

                }

            }

        }

        Assertions.assertTrue(b);

    }

    @Test
    public void checksEnteredSymbolForCoordinates_IntegerInRangeFrom1To3_02(){

        Symbols symbols = new Symbols();
        String s = symbols.checksEnteredSymbolForCoordinates("1");

        int i = Integer.parseInt(s);

        int [] tableI = new int[]{i};

        int [] table1_3 = new int[]{0, 4, 5, 6, 7, 8, 9};

        boolean b = false;

        for (int j = 0; j < table1_3.length; j++) {

            for (int k = 0; k < tableI.length; k++) {

                if (table1_3[j] != tableI[k]){

                    b = true;

                }

            }

        }

        Assertions.assertTrue(b);

    }

}
