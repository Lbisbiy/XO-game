package XO.model;

import org.junit.Test;

import static org.junit.Assert.*;


public class PointTest {
    @Test
    public void getX() throws Exception {
        final Point point = new Point(2,2);
        assertEquals(2,point.getX());
    }

    @Test
    public void getY() throws Exception {
        final Point point = new Point(2,2);
        assertEquals(2,point.getY());
    }

}