package com.epam.seliazniova.entity.enums;

import java.text.NumberFormat;

/**
 * Created by Iryna_Seliazniova on 7/10/2017.
 */
public enum DevelopmentOperation {
   SCENARIO {
        public float getCost() {
            return 950;
        }
    }, ADVERTISEMENT {
        public float getCost() {
            return 500;
        }
    }, MONTAGE {
        public float getCost() {
            return 10000;
        }
    }, EQUIPMENT {
        public float getCost() {
            return 9000;
        }
    };

    @Override
    public String toString() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        return String.format("%30s",super.toString().toLowerCase()+" "+formatter.format(this.getCost()));
    }

    public abstract float getCost();
}
