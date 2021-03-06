import org.junit.Test;
import static org.junit.Assert.*;
import com.epam.seliazniova.entity.Point;
import com.epam.seliazniova.action.PointAction;

/**
 * Created by Iryna_Seliazniova on 6/13/2017.
 */
public class PointActionTest {
    @Test
    public void pointDistanceTest(){
        Point point1 = new Point(4,3,7);
        Point point2 = new Point(5,7,3);
        assertEquals(5.74, PointAction.pointDistance(point1,point2),0.01);
    }

}