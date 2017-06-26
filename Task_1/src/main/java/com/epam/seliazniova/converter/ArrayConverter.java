package com.epam.seliazniova.converter;
import java.util.*;
/**
 * Created by Iryna_Seliazniova on 6/21/2017.
 */
public class ArrayConverter {
    //try catch
    public static ArrayList<Double[]> convertArrayStringToDouble(ArrayList<String[]> arrayList){
        ArrayList<Double[]> convertedArrayList = new ArrayList<Double[]>();
        for (String[] l: arrayList){
            Double[] aggregatedArray = new Double[l.length];
            for (int i = 0; i < l.length; ++i) {
                aggregatedArray[i] = Double.parseDouble(l[i]);
            }
            convertedArrayList.add(aggregatedArray);
        }
        return convertedArrayList;
    }
}
