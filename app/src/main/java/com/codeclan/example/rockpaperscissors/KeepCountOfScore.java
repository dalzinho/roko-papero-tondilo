package com.codeclan.example.rockpaperscissors;

import android.content.Context;
import android.preference.PreferenceManager;

/**
 * Created by user on 01/03/2017.
 */

public class KeepCountOfScore {

    private static final String PREF_HUMAN_SCORE = "0";
    private static final String PREF_CPU_SCORE = "0";

    public static int getHumanScore(Context context){

        return PreferenceManager.getDefaultSharedPreferences(context)
                .getInt(PREF_HUMAN_SCORE, 0);
    }

    public static void incrementHumanScore(Context context){
        int score = getHumanScore(context);

        PreferenceManager.getDefaultSharedPreferences(context)
                .edit()
                .putInt(PREF_HUMAN_SCORE, score + 1)
                .apply();
    }


}
