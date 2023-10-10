package com.bridgelabz;

public class MoodAnalyser {
    public String analyseMood(String message) {
        if (message.contains("I am in sad mood")){
            return "SAD";
        } else if (message.contains("I am in happy mood")) {
            return "HAPPY";
        }
        return null;
    }
}
