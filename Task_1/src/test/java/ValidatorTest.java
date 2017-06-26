import com.epam.seliazniova.validator.Validator;
import org.junit.Test;
import com.epam.seliazniova.entity.*;

import java.util.ArrayList;

import static java.lang.Math.sqrt;
import static org.junit.Assert.*;

/**
 * Created by Iryna_Seliazniova on 6/25/2017.
 */
public class ValidatorTest {
    @Test
    public void validateFormatOfStringTest() throws Exception {
        String wrongFormatString = "1,2,3 3,dfsdfs,2 3,5,3 1,qwqwqwq-,1";
        boolean expectedResult = false;
        assertEquals(expectedResult, Validator.validateFormatOfString(wrongFormatString));
    }

    @Test
    public void validateNumberOfCoordinatesTest() throws Exception {
        Double[] rightNumberOfCoordinates = new Double[]{1.0,2.0,3.2,4.3,5.4,6.2,7.0,8.0,9.0,10.2,-1.2,2.2};
        boolean expectedResult = true;
        assertEquals(expectedResult, Validator.validateNumberOfCoordinates(rightNumberOfCoordinates,12));
    }

    @Test
    public void validateIsTetrahedronTest() throws Exception {
        Point point1 = new Point(0,0,0);
        Point point2 = new Point(1,0,0);
        Point point3 = new Point(0.5,sqrt(3)/2,0);
        Point point4 = new Point(0.5,sqrt(3)/6,1/sqrt(3));
        ArrayList<Point> notTetrahedron = new ArrayList<Point>();
        notTetrahedron.add(point1);
        notTetrahedron.add(point2);
        notTetrahedron.add(point3);
        notTetrahedron.add(point4);
        boolean expectedResult = false;
        assertEquals(expectedResult, Validator.validateIsTetrahedron(notTetrahedron));
    }

}