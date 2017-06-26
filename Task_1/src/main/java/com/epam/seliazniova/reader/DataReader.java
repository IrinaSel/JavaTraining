package com.epam.seliazniova.reader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.lang.*;
import java.util.*;

/**
 * Created by Iryna_Seliazniova on 6/18/2017.
 */
public class DataReader {

    final  static Logger LOG = LogManager.getLogger();

    public ArrayList<String> readFile(String fileName){
        ArrayList<String> fileLine = null;
        String line = null;
            try {
                File file = new File(fileName);
                FileReader fileReader = new FileReader(file);
                Scanner scanner = new Scanner(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                fileLine = new ArrayList<String>();
                while(scanner.hasNextLine()){
                    fileLine.add(scanner.nextLine());
                }
            }
            catch  (FileNotFoundException e) {
                LOG.info("Can't find the file!");
            }
            catch (IOException exception) {
                LOG.info("Can't read the file!");
            }
        return fileLine;
    }
}
