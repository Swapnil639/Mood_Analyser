package com.bridgelabz;

public class MoodAnalyser {
    String message;
    public MoodAnalyser() {

    }

    public MoodAnalyser(String message) {
        this.message=message;
    }

    public String analyseMood(String message) {
        if (message.contains("I am in sad mood")){
            return "SAD";
        } else if (message.contains("I am in happy mood")) {
            return "HAPPY";
        }
        return null;
    }

    public String analyseMoodConstructor() {
        if (message.contains("I am in sad mood")){
            return "SAD";
        } else if (message.contains("I am in happy mood")) {
            return "HAPPY";
        }
        return null;
    }


}
