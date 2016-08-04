package XO.controllers;

import org.junit.Test;
import XO.model.Field;
import XO.model.Point;
import XO.model.Figure;
import XO.model.exceptoins.AlreadyOccupiedException;
import XO.model.exceptoins.InvalidCoordinatException;

import static org.junit.Assert.*;


public class MoveControllerTest {
    @Test
    public void applyFigure() throws Exception {
        final Field field = new Field();
        final Point point = new Point(0,0);
        final Figure figure = Figure.X;
        final MoveController move = new MoveController();
        move.applyFigure(field,point,figure);
        assertEquals(figure,field.getFigure(point));

    }

    @Test
    public void applyFigureAlreadyOccupiedExceotion() throws InvalidCoordinatException, AlreadyOccupiedException {
        final Field field = new Field();
        final Point point = new Point(0,0);
        final Figure figure = Figure.X;
        field.setFigure(point,figure);
        final MoveController move = new MoveController();
        try {
            move.applyFigure(field, point, figure);
            fail();
        }catch( AlreadyOccupiedException e){}

    }

    @Test
    public void applyFigureInvalidCoordinatExceotion() throws InvalidCoordinatException, AlreadyOccupiedException {
        final Field field = new Field();
        final Point point = new Point(-1,0);
        final Figure figure = Figure.X;
        final MoveController move = new MoveController();
        try {
            move.applyFigure(field, point, figure);
            fail();
        }catch( InvalidCoordinatException e){}

    }



}