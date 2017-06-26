import com.epam.seliazniova.converter.ArrayConverter;
import com.epam.seliazniova.reader.DataReader;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Objects;

import static org.junit.Assert.*;

/**
 * Created by Iryna_Seliazniova on 6/26/2017.
 */
public class ArrayConverterTest {
    @Test
    public void convertArrayStringToDoubleTest() throws Exception {
        ArrayList<Double[]> convertedArray= new ArrayList<Double[]>();
        Double[] convertedArrayTest = new Double[]{0.0,0.0,0.0};
        ArrayList<String[]> toConvertString= new ArrayList<String[]>();
        String[] toConvertStringTest= new String[]{"0.0","0.0","0.0"};
        convertedArray.add(convertedArrayTest);
        toConvertString.add(toConvertStringTest);
        assertArrayEquals(convertedArray.get(0),ArrayConverter.convertArrayStringToDouble(toConvertString).get(0));
    }

}