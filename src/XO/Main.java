package XO;

import XO.model.Figure;
import XO.model.Game;
import XO.model.Player;
import XO.model.Field;
import XO.view.XOview;


public class Main {

    public static void main (final String args[]){

        final String name1 = "A";

        final String name2 = "B";

        final Player[] players= new Player[2];

        players[0] = new Player(name1,Figure.X);

        players[1] = new Player(name2,Figure.O);

        final Game gameXO = new Game(players, "XO", new Field() );

        final XOview consoleView = new XOview();

        consoleView.show(gameXO);

        while (consoleView.mowe(gameXO)){

            consoleView.show(gameXO);

        }


    }
}
