package XO.controllers;

import XO.model.Figure;
import XO.model.Field;
import XO.model.Point;
import XO.model.exceptoins.InvalidCoordinatException;

public class CurrentMoveController {

    public Figure checkMove(final Field field ) throws InvalidCoordinatException{

        int quantityX = 0;

        int quantityY = 0;

        for(int i = 0; i < field.getINT_SIZE(); i++) {
            for (int j = 0; j < field.getINT_SIZE(); j++) {
                final Point point = new Point(i,j);
                if(Figure.X.equals(field.getFigure(point)))
                    quantityX++;
                if(Figure.O.equals(field.getFigure(point)))
                    quantityY++;
            }
        }
        if( quantityX > quantityY )
            return Figure.O;
        else
            return Figure.X;

    }



}
