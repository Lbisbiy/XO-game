package XO.controllers;

import XO.model.Figure;
import XO.model.Field;
import XO.model.Point;
import XO.model.exceptoins.AlreadyOccupiedException;
import XO.model.exceptoins.InvalidCoordinatException;

public class WinnerController {

    public Figure getWinner(final Field field){

        Figure winner = null;
        Figure check;
        try {
            check = checkHorisontal(field);
            if(check!=null){
                winner = check;
            }
            check = checkVertical(field);
            if(check!=null){
                winner = check;
            }
            check = checkDiagonal(field);
            if(check!=null){
                winner = check;
            }
            check = checkObrDiagonal(field);
            if(check!=null){
                winner = check;
            }
        }catch(final InvalidCoordinatException e){
            winner = null;
        }catch(final AlreadyOccupiedException e){
            winner = null;
        }

        return winner;

    }
    private Figure checkHorisontal(Field field) throws InvalidCoordinatException, AlreadyOccupiedException {
        for (int i = 0; i < field.getINT_SIZE(); i++){
            final Point p1 = new Point(i,0);
            final Point p2 = new Point(i,1);
            final Point p3 = new Point(i,2);
            if(field.getFigure(p1) == field.getFigure(p2) && field.getFigure(p1) == field.getFigure(p3) && field.getFigure(p1) != null){
                return field.getFigure(p1);
            }
        }
        return null;
    }

    private Figure checkVertical(Field field) throws InvalidCoordinatException, AlreadyOccupiedException {
        for (int i = 0; i < field.getINT_SIZE(); i++){
            final Point p1 = new Point(0,i);
            final Point p2 = new Point(1,i);
            final Point p3 = new Point(2,i);
            if(field.getFigure(p1) == field.getFigure(p2) && field.getFigure(p1) == field.getFigure(p3) && field.getFigure(p1) != null){
                return field.getFigure(p1);
            }
        }
        return null;
    }

    private Figure checkDiagonal(Field field) throws InvalidCoordinatException, AlreadyOccupiedException {

        final Point p1 = new Point(0,0);
        final Point p2 = new Point(1,1);
        final Point p3 = new Point(2,2);
        if(field.getFigure(p1) == field.getFigure(p2) && field.getFigure(p1) == field.getFigure(p3) && field.getFigure(p1) != null) {
            return field.getFigure(p1);
        }
        return null;
    }

    private Figure checkObrDiagonal(Field field) throws InvalidCoordinatException, AlreadyOccupiedException {

        final Point p1 = new Point(0,2);
        final Point p2 = new Point(1,1);
        final Point p3 = new Point(2,0);
        if(field.getFigure(p1) == field.getFigure(p2) && field.getFigure(p1) == field.getFigure(p3) && field.getFigure(p1) != null) {
            return field.getFigure(p1);
        }
        return null;
    }

}
