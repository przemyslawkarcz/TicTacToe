import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrintsTest {

    @Test
    public void printsWelcomeContent(){

        Prints prints = new Prints();
        String welcomeContent = prints.printsWelcomeContent();

        Assertions.assertEquals("* * * Welcome to the TicTacToe game * * *", welcomeContent);

    }


    @Test
    public void printsWinnings(){

        Prints prints = new Prints();
        String winnings = prints.printsWinnings();

        Assertions.assertEquals("Win", winnings);

    }


}
