package Inspection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlayerDataInspectionTest {

    @Test
    public void checksEnteredSymbolForCoordinates_Length_01(){

        PlayerDataInspectionFacade playerDataInspectionFacade = new PlayerDataInspectionFacade();
        String s = playerDataInspectionFacade.getChecksEnteredSymbolForCoordinates("3");

        int length = s.length();

        Assertions.assertEquals(1, length);

    }

    @Test
    public void checksEnteredSymbolForCoordinates_Length_02(){

        PlayerDataInspectionFacade playerDataInspectionFacade = new PlayerDataInspectionFacade();
        String s = playerDataInspectionFacade.getChecksEnteredSymbolForCoordinates("3");

        int length = s.length();

        Assertions.assertNotEquals(10, length);

    }

    @Test
    public void checksEnteredSymbolForCoordinates_Integer_01(){

        PlayerDataInspectionFacade playerDataInspectionFacade = new PlayerDataInspectionFacade();
        String s = playerDataInspectionFacade.getChecksEnteredSymbolForCoordinates("2");

        int i = Integer.parseInt(s);

        int test = 2;

        Assertions.assertEquals(test, i);

    }

    @Test
    public void checksEnteredSymbolForCoordinates_Integer_02(){

        PlayerDataInspectionFacade playerDataInspectionFacade = new PlayerDataInspectionFacade();
        String s = playerDataInspectionFacade.getChecksEnteredSymbolForCoordinates("2");

        int i = Integer.parseInt(s);

        int test = 20;

        Assertions.assertNotEquals(test, i);

    }

    @Test
    public void checksEnteredSymbolForCoordinates_IntegerInRangeFrom1To3_01(){

        PlayerDataInspectionFacade playerDataInspectionFacade = new PlayerDataInspectionFacade();
        String s = playerDataInspectionFacade.getChecksEnteredSymbolForCoordinates("3");

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

        PlayerDataInspectionFacade playerDataInspectionFacade = new PlayerDataInspectionFacade();
        String s = playerDataInspectionFacade.getChecksEnteredSymbolForCoordinates("1");

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

    @Test
    public void checksEnteredSymbol_O_or_X_Length_01(){

        PlayerDataInspection playerDataInspection = new PlayerDataInspection();
        String s = playerDataInspection.checksEnteredSymbol_O_or_X("x");

        int length = s.length();

        Assertions.assertEquals(1, length);

    }

    @Test
    public void checksEnteredSymbol_O_or_X_Length_02(){

        PlayerDataInspection playerDataInspection = new PlayerDataInspection();
        String s = playerDataInspection.checksEnteredSymbol_O_or_X("o");

        int length = s.length();

        Assertions.assertNotEquals(2, length);

    }

    @Test
    public void checksEnteredSymbol_O_or_X_Character_01(){

        PlayerDataInspection playerDataInspection = new PlayerDataInspection();
        String s = playerDataInspection.checksEnteredSymbol_O_or_X("x");

        char c = s.charAt(0);

        boolean b = false;

        if (!Character.isDigit(c)){

            b = true;

        }

        Assertions.assertTrue(b);

    }

    @Test
    public void checksEnteredSymbol_O_or_X_o_or_x(){

        PlayerDataInspection playerDataInspection = new PlayerDataInspection();
        String s = playerDataInspection.checksEnteredSymbol_O_or_X("o");

        char c = s.charAt(0);

        boolean b = false;

        String o = "o";
        String x = "x";

        if (!Character.isDigit(c)){

            String valueOf = String.valueOf(c);

            if (valueOf.equalsIgnoreCase(o) || valueOf.equalsIgnoreCase(x)){

                b = true;

            }

        }

        Assertions.assertTrue(b);

    }

}
