package com.moodanalyser;

import java.util.Locale;

public class MoodAnalyser {

    private static String message;

    //constructor return the message- parameterised conctructor
    public MoodAnalyser(String message) {
        this.message = message;
    }

    public MoodAnalyser() {
    }

    public String analyseMood(String message) {
        this.message = message;
        return analyseMood();
    }
    public String analyseMood() {   // Analysing mood using method analyse mood with parameter passed
        try {
            if (message.toLowerCase().contains("sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch (NullPointerException e) {
            return "HAPPY";
        }
    }
}