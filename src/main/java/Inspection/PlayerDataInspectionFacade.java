package Inspection;

public class PlayerDataInspectionFacade {

    public String getChecksEnteredSymbolForCoordinates(String someSymbol){

        PlayerDataInspection playerDataInspection = new PlayerDataInspection();
        return playerDataInspection.checksEnteredSymbolForCoordinates(someSymbol);

    }

    public String getChecksEnteredSymbol_O_or_X(String someSymbol){

        PlayerDataInspection playerDataInspection = new PlayerDataInspection();
        return playerDataInspection.checksEnteredSymbol_O_or_X(someSymbol);

    }

    public void getResultFromMovesNumber(int movesNumber){

        PlayerDataInspection playerDataInspection = new PlayerDataInspection();
        playerDataInspection.checksMovesNumberInGame(movesNumber);

    }

}
