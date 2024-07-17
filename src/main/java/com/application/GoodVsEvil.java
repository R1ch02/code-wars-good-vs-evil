package com.application;

public class GoodVsEvil {

    private static final String GOOD_WIN = "Battle Result: Good triumphs over Evil";
    private static final String EVIL_WIN = "Battle Result: Evil eradicates all trace of Good";
    private static final String TIE = "Battle Result: No victor on this battle field";

    public static String battle(String goodAmounts, String evilAmounts) {

        String[] goodParts = goodAmounts.split(" ");
        String[] evilParts = evilAmounts.split(" ");
        int[] goodArmy = {1,2,3,3,4,10};
        int[] evilArmy = {1,2,2,2,3,5,10};


        int worth = 0;

        for (int i = 0; i < goodParts.length; i++) {
            worth += Integer.parseInt(goodParts[i])*goodArmy[i];
        }
        for (int j = 0; j < evilParts.length; j++) {
            worth -= Integer.parseInt(evilParts[j])*evilArmy[j];
        }

        if (worth > 0) return GOOD_WIN;
        if (worth < 0) return EVIL_WIN;
        return TIE;
    }
}