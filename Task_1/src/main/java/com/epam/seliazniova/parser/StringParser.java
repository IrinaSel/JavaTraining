package com.epam.seliazniova.parser;

import com.epam.seliazniova.validator.Validator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.Nullable;

import java.util.*;
import static com.epam.seliazniova.converter.ArrayConverter.convertArrayStringToDouble;

/**
 * Created by Iryna_Seliazniova on 6/18/2017.
 */
public class StringParser {

    final  static Logger LOG = LogManager.getLogger();

    @Nullable
    public static ArrayList<Double[]> parseString(ArrayList<String> fileLine){
        ArrayList<String[]> coordinate= new ArrayList<String[]>();
        String[] aggregatedCoordinates =null;
        for(String line: fileLine){
            if(Validator.validateFormatOfString(line)){
                aggregatedCoordinates = line.split("[ ,]");
            }
            else {
                LOG.warn("Can't parse string. Returned value is null");
                return null;
            }
            coordinate.add(aggregatedCoordinates);
        }
        return convertArrayStringToDouble(coordinate);

    }
}
