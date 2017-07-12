package com.epam.seliazniova.entity.converter;

import java.text.NumberFormat;
import java.util.ArrayList;

/**
 * Created by Iryna_Seliazniova on 7/12/2017.
 */
public class ConvertArrayList {
    public static <T> String ArrayListToString(ArrayList<T> arrayList){
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String result = "";
        for(T elem : arrayList){
           result= result.concat(elem.toString())+'\n';
        }
        return result;
    }
}
