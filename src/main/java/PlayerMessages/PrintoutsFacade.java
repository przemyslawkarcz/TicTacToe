package PlayerMessages;

public class PrintoutsFacade {

    public void getPrintsTable2D(){

        Printouts printouts = new Printouts();
        printouts.printsTable2D();

    }

    public String getPrintsWelcomeContent(){

        Printouts printouts = new Printouts();
        return printouts.printsWelcomeContent();

    }

    public String getPrintsWinnings(){

        Printouts printouts = new Printouts();
        return printouts.printsWinnings();

    }

}
