package pl.com.sda.homework.Wlasne_Projekty.TicTacToe;

public class Closure {

    public void stopsGameWithWin(){

        System.exit(0);

    }

    public void stopsGameJustInTime(String keyWord_stop){

        if (keyWord_stop.equals("stop")){

            System.exit(0);

        }

    }



}
