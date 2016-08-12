package XO.view;

import XO.controllers.CurrentMoveController;
import XO.controllers.MoveController;
import XO.controllers.WinnerController;
import XO.model.Figure;
import XO.model.Game;
import XO.model.Field;
import XO.model.Point;
import XO.model.exceptoins.AlreadyOccupiedException;
import XO.model.exceptoins.InvalidCoordinatException;

import java.util.Scanner;


public class XOview {

    private final CurrentMoveController currentMoveController = new CurrentMoveController();

    private final WinnerController winnerController = new  WinnerController();

    private final MoveController moveController = new  MoveController();

    public void show(final Game game){

        final Field field = game.getField();
        for(int i=0;i<field.getINT_SIZE();i++){
            printline(field,i);
        }

    }

    public boolean mowe(final Game game)  {

        final Figure currentFigure;
        try {
            currentFigure = currentMoveController.checkMove(game.getField());

        if (currentFigure == null){
            final Figure winner = winnerController.getWinner(game.getField());
            if(winner == null){
                System.out.println("No winner");
                return false;
            }else{
                System.out.format("Winner is %s\n", winner);
                return false;
            }
        }
        System.out.format("Input point for %s\n", currentFigure);
        final Point point = askPoint();
        try {
            moveController.applyFigure(game.getField(),point, currentFigure);
        } catch (InvalidCoordinatException | AlreadyOccupiedException e) {
            e.printStackTrace();
        }
        } catch (InvalidCoordinatException e) {
            e.printStackTrace();
        }
        return true;

    }

    private Point askPoint(){
        return new Point(askCoordinate("X"),askCoordinate("Y"));
    }

    private int askCoordinate(final String cooordinateName){

        System.out.format("Pls, input point %s\n", cooordinateName);
        final Scanner in = new Scanner(System.in);
        final int num = in.nextInt();
        return num;

    }

    private void printline(final Field field, int x){

        System.out.print("|");
        for(int i =0;i < field.getINT_SIZE();i++){

             Figure figure = null;
            try {
                figure = field.getFigure(new Point(x,i));
            }catch (final InvalidCoordinatException e) {
                e.printStackTrace();
            }
            System.out.print( figure != null ? figure : " ");
            System.out.print("|");
        }
        System.out.println();
        separator();

    }

    private void separator(){
        System.out.println("~~~~~~~");
    }
}
