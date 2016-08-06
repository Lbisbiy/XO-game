package XO.model;


import XO.model.exceptoins.InvalidCoordinatException;
import XO.model.exceptoins.AlreadyOccupiedException;

public class Field {

    private final int INT_SIZE = 3;

    private final int MAX_SIZE = 3;

    private final int MIN_SIZE = 0;

    private final Figure[][] field = new Figure[INT_SIZE][INT_SIZE];

    public int getINT_SIZE() {
        return INT_SIZE;
    }

    public int getMAX_SIZE() {
        return MAX_SIZE;
    }

    public int getMIN_SIZE() {
        return MIN_SIZE;
    }

    public Figure[][] getField() {
        return field;
    }

    public Figure getFigure(final Point point) throws InvalidCoordinatException{

        if(!checkPoint(point)){
            throw new InvalidCoordinatException();
        }

        return field[point.getX()][point.getY()];

    }

    public void setFigure(final Point point, final Figure figure) throws InvalidCoordinatException, AlreadyOccupiedException{

        if(!checkPoint(point)){
            throw new InvalidCoordinatException();
        }

        if(!checkFigure(point)){
            throw new AlreadyOccupiedException();
        }

        field[point.getX()][point.getY()] = figure;

    }

    private boolean checkPoint(final Point point){
        return checkCoordinat(point.getX()) && checkCoordinat(point.getY());
    }

    private boolean checkCoordinat(final int x){
        return x >= MIN_SIZE && x < MAX_SIZE;
    }

    private boolean checkFigure(final Point point){
        return field[point.getX()][point.getY()] == null;
    }
}
