package XO.controllers;

import org.junit.Test;
import XO.model.*;
import static org.junit.Assert.*;

/**
 * Created by www.mobilkom.ru on 06.08.2016.
 */
public class CurrentMoveControllerTest {
    @Test
    public void checkMoveThenResultO() throws Exception {
        final CurrentMoveController currentMoveController = new CurrentMoveController();
        final Field field = new Field();

        final Point point = new Point(0,0);
        final Point point1 = new Point(0,1);
        field.setFigure(point,Figure.X);
        field.setFigure(point1,Figure.X);
        final Point point2 = new Point(0,2);
        field.setFigure(point2,Figure.O);

        assertEquals(Figure.O,currentMoveController.checkMove(field));
    }

    @Test
    public void checkMoveThenResultX() throws Exception {
        final CurrentMoveController currentMoveController = new CurrentMoveController();
        final Field field = new Field();

        final Point point = new Point(0,0);
        final Point point1 = new Point(0,1);
        field.setFigure(point,Figure.X);
        field.setFigure(point1,Figure.O);

        assertEquals(Figure.X,currentMoveController.checkMove(field));
    }


}