package com.codeclan.example.rockpaperscissors;

import android.content.Context;
import android.preference.PreferenceManager;

/**
 * Created by user on 01/03/2017.
 */

public class KeepCountOfScore {

    private static final String PREF_HUMAN_SCORE = "0";
    private static final String PREF_CPU_SCORE = "1";

    public static int getHumanScore(Context context){

        return PreferenceManager.getDefaultSharedPreferences(context)
                .getInt(PREF_HUMAN_SCORE, 0);
    }

    public static int getCPUScore(Context context){
        return PreferenceManager.getDefaultSharedPreferences(context)
                .getInt(PREF_CPU_SCORE, 0);
    }

    public static void incrementHumanScore(Context context){
        int humanScore = getHumanScore(context);

        PreferenceManager.getDefaultSharedPreferences(context)
                .edit()
                .putInt(PREF_HUMAN_SCORE, humanScore + 1)
                .apply();
    }

    public static void incrementCPUScore(Context context){
        int cpuScore = getCPUScore(context);

        PreferenceManager.getDefaultSharedPreferences(context)
                .edit()
                .putInt(PREF_CPU_SCORE, cpuScore + 1)
                .apply();
    }

}
