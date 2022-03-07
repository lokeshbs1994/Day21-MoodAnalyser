package com.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    @Test
    public void givenMessage_WhenSad_ShouldReturnSad(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I am in Sad mood");
        Assert.assertEquals("SAD",mood);
    }

    @Test
    public void givenMessage_WhenHappy_ShouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I am in any mood");
        Assert.assertEquals("HAPPY",mood);
    }

    // passing parameter through constructor
    @Test
    public void givenMessage_WhenProper_ShouldReturnSad() {
        MoodAnalyser moodanalyser = new MoodAnalyser("I am in Sad mood");
        String mood = moodanalyser.analyseMood();
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenMessage_WhenProper_ShouldReturnHappy() {
        MoodAnalyser moodanalyser = new MoodAnalyser("I am in happy mood");
        String mood = moodanalyser.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }

}
