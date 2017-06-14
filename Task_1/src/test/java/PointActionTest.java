import org.junit.Test;
import static org.junit.Assert.*;
import com.epam.seliazniova.entity.Point;
import com.epam.seliazniova.entity.PointAction;

/**
 * Created by Iryna_Seliazniova on 6/13/2017.
 */
public class PointActionTest {
    @Test
    public void pointDistanceTest(){
        Point point1 = new Point(4,3,7);
        Point point2 = new Point(5,7,3);
        PointAction pointAction = new PointAction();
        assertEquals(5.74, pointAction.pointDistance(point1,point2),0.01);
    }

}