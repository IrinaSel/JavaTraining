import com.epam.seliazniova.action.TetrahedronAction;
import com.epam.seliazniova.entity.*;
import org.junit.Test;
import static org.junit.Assert.*;
import static java.lang.Math.*;

/**
 * Created by Iryna_Seliazniova on 6/13/2017.
 */
public class TetrahedronActionTest {
    @Test
    public static void tetrahedronVolumeTest(){
        Point point1 = new Point(0,0,0);
        Point point2 = new Point(1,0,0);
        Point point3 = new Point(0.5,sqrt(3)/2,0);
        Point point4 = new Point(0.5,sqrt(3)/6,1/sqrt(3));
        Tetrahedron tetrahedron = new Tetrahedron(point1,point2,point3,point4);
        double expectedVolume =  TetrahedronAction.tetrahedronVolume(tetrahedron);
        double actualVolume = sqrt(2)/12;
        assertEquals(expectedVolume,actualVolume,0.01);

    }
}