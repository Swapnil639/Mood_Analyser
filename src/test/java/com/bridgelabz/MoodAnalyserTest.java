package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    MoodAnalyser moodAnalyser=new MoodAnalyser();
    @Test
    public void givenTheMoodShouldReturnSad(){
        String mood=moodAnalyser.analyseMood("I am in sad mood");
        Assertions.assertEquals("SAD",mood);
    }
    @Test
    public void givenTheMoodShouldReturnHappy(){
        String mood=moodAnalyser.analyseMood("I am in happy mood");
        Assertions.assertEquals("HAPPY",mood);
    }
}
