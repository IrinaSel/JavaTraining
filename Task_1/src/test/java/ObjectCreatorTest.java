import org.junit.Test;
import com.epam.seliazniova.entity.Point;
import com.epam.seliazniova.objectCreator.ObjectCreator;
import com.epam.seliazniova.entity.Tetrahedron;
import java.util.ArrayList;

import static java.lang.Math.sqrt;

import static org.junit.Assert.*;

/**
 * Created by Iryna_Seliazniova on 6/26/2017.
 */
public class ObjectCreatorTest {
    @Test
    public void createPointTest() throws Exception {
        Double[] pointCoordinate = new Double[]{1.0,2.3,4.5};
        Point expectedPoint =  new Point(1.0,2.3,4.5);
        Point actualPoint = ObjectCreator.createPoint(pointCoordinate);
        assertEquals(expectedPoint,actualPoint);
    }

    @Test
    public void createTetrahedronTest() throws Exception {
        Point point1 = new Point(1,1,1);
        Point point2 = new Point(-1,-1,1);
        Point point3 = new Point(-1,1,-1);
        Point point4 = new Point(1,-1,-1);
        Double[] tetrahedronCoordinate = new Double[]{1.0,1.0,1.0,-1.0,-1.0,1.0,-1.0,1.0,-1.0,1.0,-1.0,-1.0};
        ArrayList<Point> expectedTetrahedronPoint = new ArrayList<Point>();
        expectedTetrahedronPoint.add(point1);
        expectedTetrahedronPoint.add(point2);
        expectedTetrahedronPoint.add(point3);
        expectedTetrahedronPoint.add(point4);
        Tetrahedron expectedTetrahedron = new Tetrahedron(expectedTetrahedronPoint);
        assertEquals(expectedTetrahedron,ObjectCreator.createTetrahedron(tetrahedronCoordinate));
    }

}