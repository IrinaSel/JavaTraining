import com.epam.seliazniova.reader.DataReader;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;
import java.util.ArrayList;

/**
 * Created by Iryna_Seliazniova on 6/26/2017.
 */
@RunWith(value = Parameterized.class)
public class DataReaderTest {
    private String filename;
    private ArrayList<String> expectedString;

    public DataReaderTest(String filename, ArrayList<String> expectedString) {
        this.filename = filename;
        this.expectedString = expectedString;
    }

    @Parameterized.Parameters
    public static Collection data() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("1,2,3 2,2,4 3,43,2 4,3,4");
        arrayList.add("0,0,0 1,0,0 0.5,0.866,0 0.5,0.288,1.732");
        arrayList.add("1,1,1 -1,-1,1 -1,1,-1 1,-1,-1");
        return Arrays.asList(new Object[][] {
                { "data.txt", arrayList }
        });
    }
    @Test
    public void readFileTest(){
        assertTrue(expectedString.equals(DataReader.readFile(filename)));
    }

    @Test
    public void readAbsentFileTest() throws Exception {
        assertNull(DataReader.readFile("no_file.txt"));
    }


}