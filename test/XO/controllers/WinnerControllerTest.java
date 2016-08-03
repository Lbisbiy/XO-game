package XO.controllers;

import XO.model.Figure;
import XO.model.Field;
import XO.model.Point;
import XO.model.exceptoins.AlreadyOccupiedException;
import XO.model.exceptoins.InvalidCoordinatException;
import org.junit.Test;

import static org.junit.Assert.*;


public class WinnerControllerTest {
    @Test
    public void getWinnerWhenFirstLine() throws Exception {
        final Field field = new Field();
        final Point p1 = new Point(0,0);
        final Point p2 = new Point(0,1);
        final Point p3 = new Point(0,2);
        field.setFigure(p1,Figure.X);
        field.setFigure(p2,Figure.X);
        field.setFigure(p3,Figure.X);
        WinnerController winnerController = new WinnerController();
        assertEquals(Figure.X,winnerController.getWinner(field));
    }

    @Test
    public void getWinnerWhenSecondLine() throws Exception {
        final Field field = new Field();
        final Point p1 = new Point(1,0);
        final Point p2 = new Point(1,1);
        final Point p3 = new Point(1,2);
        field.setFigure(p1,Figure.X);
        field.setFigure(p2,Figure.X);
        field.setFigure(p3,Figure.X);
        WinnerController winnerController = new WinnerController();
        assertEquals(Figure.X,winnerController.getWinner(field));
    }
    @Test
    public void getWinnerWhenLastLine() throws Exception {
        final Field field = new Field();
        final Point p1 = new Point(2,0);
        final Point p2 = new Point(2,1);
        final Point p3 = new Point(2,2);
        field.setFigure(p1,Figure.X);
        field.setFigure(p2,Figure.X);
        field.setFigure(p3,Figure.X);
        WinnerController winnerController = new WinnerController();
        assertEquals(Figure.X,winnerController.getWinner(field));
    }
    @Test
    public void getWinnerWhenFirstColumn() throws Exception {
        final Field field = new Field();
        final Point p1 = new Point(0,0);
        final Point p2 = new Point(1,0);
        final Point p3 = new Point(2,0);
        field.setFigure(p1,Figure.X);
        field.setFigure(p2,Figure.X);
        field.setFigure(p3,Figure.X);
        WinnerController winnerController = new WinnerController();
        assertEquals(Figure.X,winnerController.getWinner(field));
    }
    @Test
    public void getWinnerWhenSecondColumn() throws Exception {
        final Field field = new Field();
        final Point p1 = new Point(0,1);
        final Point p2 = new Point(1,1);
        final Point p3 = new Point(2,1);
        field.setFigure(p1,Figure.X);
        field.setFigure(p2,Figure.X);
        field.setFigure(p3,Figure.X);
        WinnerController winnerController = new WinnerController();
        assertEquals(Figure.X,winnerController.getWinner(field));
    }
    @Test
    public void getWinnerWhenLastColumn() throws Exception {
        final Field field = new Field();
        final Point p1 = new Point(0,2);
        final Point p2 = new Point(1,2);
        final Point p3 = new Point(2,2);
        field.setFigure(p1,Figure.X);
        field.setFigure(p2,Figure.X);
        field.setFigure(p3,Figure.X);
        WinnerController winnerController = new WinnerController();
        assertEquals(Figure.X,winnerController.getWinner(field));
    }
    @Test
    public void getWinnerWhenDiagonal() throws Exception {
        final Field field = new Field();
        final Point p1 = new Point(0,0);
        final Point p2 = new Point(1,1);
        final Point p3 = new Point(2,2);
        field.setFigure(p1,Figure.X);
        field.setFigure(p2,Figure.X);
        field.setFigure(p3,Figure.X);
        WinnerController winnerController = new WinnerController();
        assertEquals(Figure.X,winnerController.getWinner(field));
    }
    @Test
    public void getWinnerWhenObrDiagonal() throws Exception {
        final Field field = new Field();
        final Point p1 = new Point(0,2);
        final Point p2 = new Point(1,1);
        final Point p3 = new Point(2,0);
        field.setFigure(p1,Figure.X);
        field.setFigure(p2,Figure.X);
        field.setFigure(p3,Figure.X);
        WinnerController winnerController = new WinnerController();
        assertEquals(Figure.X,winnerController.getWinner(field));
    }

}