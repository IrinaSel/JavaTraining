package com.epam.seliazniova.enums;

import java.text.NumberFormat;

/**
 * Created by Iryna_Seliazniova on 7/10/2017.
 */
public enum  Crew {
    STAGEDIRECTOR {
        public float getCost() {
            return 12000;
        }
    }, MUSICIAN {
        public float getCost() {
            return 1300;
        }
    }, ACTORS {
        public float getCost() {
            return 2000;
        }
    };

    @Override
    public String toString() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        return String.format("%30s",super.toString().toLowerCase()+" "+formatter.format(this.getCost()));
    }

    public abstract float getCost();
}
