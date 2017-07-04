package com.epam.seliazniova.parser;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;


/**
 * Created by Iryna_Seliazniova on 7/4/2017.
 */
public class StringParser {
    final  static Logger LOG = LogManager.getLogger();

    public static ArrayList<String[]> parseString(ArrayList<String> fileLine){
        ArrayList<String[]> parsedString= new ArrayList<String[]>();
        for(String line: fileLine){
            parsedString.add(line.split("[,]"));
        }
        return parsedString;
    }

}
