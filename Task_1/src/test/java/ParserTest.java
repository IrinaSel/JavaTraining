import com.epam.seliazniova.parser.Parser;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Iryna_Seliazniova on 6/25/2017.
 */
public class ParserTest {
    @Test
    public void parseStringTest() throws Exception {
        ArrayList<Double[]> expectedString= new ArrayList<Double[]>();
        ArrayList<String> actualString= new ArrayList<String>();
        Double[] expectedStringTest = new Double[]{1.0,1.0,1.0,-1.0,-1.0,1.0,-1.0,1.0,-1.0,1.0,-1.0,-1.0};
        String actualStringTest= "1.0,1.0,1.0,-1.0,-1.0,1.0,-1.0,1.0,-1.0,1.0,-1.0,-1.0";
        expectedString.add(expectedStringTest);
        actualString.add(actualStringTest);
        Double[] parserString = Parser.parseString(actualString).get(0);
        assertArrayEquals(expectedString.get(0), parserString);
    }
}