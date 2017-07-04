package com.epam.seliazniova.validator;

import com.epam.seliazniova.entity.AbstractPublication;
import com.epam.seliazniova.enumeration.Genre;
import com.epam.seliazniova.enumeration.PublicationType;
import org.apache.commons.lang3.EnumUtils;

/**
 * Created by Iryna_Seliazniova on 7/4/2017.
 */
public class PublicationValidator {
    public boolean validatePublicationType(String publicationType){
        if(EnumUtils.isValidEnum(PublicationType.class, publicationType.toUpperCase())){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean validateBookGenre(String genre){
        if(EnumUtils.isValidEnum(Genre.class,genre.toUpperCase())){
            return true;
        }
        else{
            return false;
        }
    }
}
