package Inspection;

public class PlayerDataInspectionFacade {

    public String getChecksEnteredSymbolForCoordinates(String someSymbol){

        PlayerDataInspection playerDataInspection = new PlayerDataInspection();
        return playerDataInspection.checksEnteredSymbolForCoordinates(someSymbol);

    }

}
