package XO.model;

import org.junit.Test;

import static org.junit.Assert.*;


public class PlayerTest {
    @Test
    public void getName() throws Exception {
        final Player player = new Player("Anna", Figure.X);
        assertEquals("Anna",player.getName());
    }

    @Test
    public void getFigure() throws Exception {
        final Player player = new Player("Anna", Figure.X);
        assertEquals(Figure.X,player.getFigure());
    }

}