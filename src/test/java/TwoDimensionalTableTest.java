import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoDimensionalTableTest {

    @Test
    public void fullFillTable2DWithDefaultValues_01(){

        TwoDimensionalTable twoDimensionalTable = new TwoDimensionalTable();
        String[][] table2D = twoDimensionalTable.getTable2D();

        twoDimensionalTable.fullFillTable2DWithDefaultValues();

        boolean b = false;

        if (table2D[0][0].equals("_")){

            b = true;

        }

        Assertions.assertTrue(b);

    }

    @Test
    public void fullFillTable2DWithDefaultValues_02(){

        TwoDimensionalTable twoDimensionalTable = new TwoDimensionalTable();
        String[][] table2D = twoDimensionalTable.getTable2D();

        twoDimensionalTable.fullFillTable2DWithDefaultValues();

        boolean b = false;

        if (table2D[0][0].equals(".")){

            b = true;

        }

        Assertions.assertFalse(b);

    }

    @Test
    public void fullFillTable2DWithDefaultValues_03(){

        TwoDimensionalTable twoDimensionalTable = new TwoDimensionalTable();
        String[][] table2D = twoDimensionalTable.getTable2D();

        twoDimensionalTable.fullFillTable2DWithDefaultValues();

        Assertions.assertEquals("_", table2D[0][0]);

    }

    @Test
    public void fullFillTable2DWithDefaultValues_04(){

        TwoDimensionalTable twoDimensionalTable = new TwoDimensionalTable();
        String[][] table2D = twoDimensionalTable.getTable2D();

        twoDimensionalTable.fullFillTable2DWithDefaultValues();

        Assertions.assertNotEquals(",", table2D[0][0]);

    }


}
