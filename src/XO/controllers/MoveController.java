package XO.controllers;

import XO.model.Field;
import XO.model.Point;
import XO.model.Figure;
import XO.model.exceptoins.AlreadyOccupiedException;
import XO.model.exceptoins.InvalidCoordinatException;

public class MoveController {

    public void applyFigure(final Field field,
                            final Point point,
                            final Figure figure)throws InvalidCoordinatException, AlreadyOccupiedException   {
        if (field.getFigure(point) != null) {
            throw new AlreadyOccupiedException();
        }
        field.setFigure(point, figure);
    }

}
