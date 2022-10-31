package org.example.filteringbyuserdata;

import java.util.Random;

public enum Gender {
    male, female;

    public static Gender getRandomGender() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}
