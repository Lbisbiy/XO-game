package XO.model;

import XO.model.exceptoins.InvalidCoordinatException;
import XO.model.exceptoins.AlreadyOccupiedException;
import org.junit.Test;

import static org.junit.Assert.*;


public class FieldTest {
    @Test
    public void setFigure() throws Exception {
        final Figure figure = Figure.X;
        final Field field = new Field();
        final Point point = new Point(0,0);

        field.setFigure(point,figure);
        assertEquals(figure,field.getFigure(point));
    }

    @Test
    public void getINT_SIZE() throws Exception {
        final Field field = new Field();
        assertEquals(3,field.getINT_SIZE());
    }

    @Test
    public void getMAX_SIZE() throws Exception {
        final Field field = new Field();
        assertEquals(3,field.getMAX_SIZE());
    }

    @Test
    public void getMIN_SIZE() throws Exception {
        final Field field = new Field();
        assertEquals(0,field.getMIN_SIZE());
    }

    @Test
    public void getField() throws Exception {

    }

    @Test
    public void getFigure() throws Exception {
        final Figure figure = Figure.X;
        final Point point = new Point(0,0);
        final Field field = new Field();

        field.setFigure(point,figure);
        final Figure result = field.getFigure(point);
        assertEquals(figure,result);


    }

    @Test
    public void getFigureWhenCoordinateXInvalid() throws Exception {
        final Figure figure = Figure.X;
        final Point point = new Point(-1,0);
        final Point point1 = new Point(0,0);
        final Field field = new Field();
        field.setFigure(point1, figure);
        try {
            field.getFigure(point);
            fail();
        }catch(InvalidCoordinatException e){}

    }

    @Test
    public void getFigureWhenCoordinateXInvalidMoreMaxSize() throws Exception {
        final Figure figure = Figure.X;
        final Point point = new Point(3,0);
        final Point point1 = new Point(0,0);
        final Field field = new Field();
        field.setFigure(point1, figure);
        try {
            field.getFigure(point);
            fail();
        }catch(InvalidCoordinatException e){}

    }

    @Test
    public void getFigureWhenCoordinateYInvalid() throws Exception {
        final Figure figure = Figure.X;
        final Point point = new Point(0,-1);
        final Point point1 = new Point(0,0);
        final Field field = new Field();
        field.setFigure(point1, figure);
        try {
            field.getFigure(point);
            fail();
        }catch(InvalidCoordinatException e){}

    }

    @Test
    public void getFigureWhenCoordinateYInvalidMoreMaxSize() throws Exception {
        final Figure figure = Figure.X;
        final Point point = new Point(0,3);
        final Point point1 = new Point(0,0);
        final Field field = new Field();
        field.setFigure(point1, figure);
        try {
            field.getFigure(point);
            fail();
        }catch(InvalidCoordinatException e){}

    }

    @Test
    public void getFigureWhenInvalidPoint() throws Exception {
        final Figure figure = Figure.X;
        final Point point = new Point(-1,-1);
        final Point point1 = new Point(0,0);
        final Field field = new Field();
        field.setFigure(point1, figure);
        try {
            field.getFigure(point);
            fail();
        }catch(InvalidCoordinatException e){}

    }

    @Test
    public void getFigureWhenInvalidPointMoreMaxSize() throws Exception {
        final Figure figure = Figure.X;
        final Point point = new Point(3,3);
        final Point point1 = new Point(0,0);
        final Field field = new Field();
        field.setFigure(point1, figure);
        try {
            field.getFigure(point);
            fail();
        }catch(InvalidCoordinatException e){}

    }

    @Test
    public void setFigureWhenCoordinateXInvalid() throws Exception {
        final Figure figure = Figure.X;
        final Point point = new Point(-1,0);
        final Field field = new Field();

        try {
            field.setFigure(point, figure);
            fail();
        }catch(InvalidCoordinatException e){}

    }

    @Test
    public void setFigureWhenCoordinateXInvalidMoreMaxSize() throws Exception {
        final Figure figure = Figure.X;
        final Point point = new Point(3,0);
        final Field field = new Field();

        try {
            field.setFigure(point, figure);
            fail();
        }catch(InvalidCoordinatException e){}

    }

    @Test
    public void setFigureWhenCoordinateYInvalid() throws Exception {
        final Figure figure = Figure.X;
        final Point point = new Point(0,-1);
        final Field field = new Field();

        try {
            field.setFigure(point, figure);
            fail();
        }catch(InvalidCoordinatException e){}

    }

    @Test
    public void setFigureWhenCoordinateYInvalidMoreMaxSize() throws Exception {
        final Figure figure = Figure.X;
        final Point point = new Point(0,3);
        final Field field = new Field();

        try {
            field.setFigure(point, figure);
            fail();
        }catch(InvalidCoordinatException e){}

    }

    @Test
    public void setFigureWhenInvalidPoint() throws Exception {
        final Figure figure = Figure.X;
        final Point point = new Point(-1,-1);
        final Field field = new Field();

        try {
            field.setFigure(point, figure);
            fail();
        }catch(InvalidCoordinatException e){}

    }

    @Test
    public void setFigureWhenInvalidPointMoreMaxSize() throws Exception {
        final Figure figure = Figure.X;
        final Point point = new Point(3,3);
        final Field field = new Field();

        try {
            field.setFigure(point, figure);
            fail();
        }catch(InvalidCoordinatException e){}

    }

    @Test
    public void setFigureWhenAlreadyOccupiedException() throws Exception {
        final Figure figure = Figure.X;
        final Point point = new Point(0,0);
        final Field field = new Field();
        field.setFigure(point, figure);

        try {
            field.setFigure(point, figure);
            fail();
        }catch(AlreadyOccupiedException e){}

    }
}