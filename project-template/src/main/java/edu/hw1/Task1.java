package edu.hw1;

public final class Task1 {
    private static final int SECONDS_IN_MINUTE = 60;
    private Task1(){}

    public static int minutesToSeconds(String time){
        var splitTime = time.split(":");
        int minutes = Integer.parseInt(splitTime[0]);
        int seconds = Integer.parseInt(splitTime[1]);
        if(seconds < SECONDS_IN_MINUTE){
            return  minutes*SECONDS_IN_MINUTE + seconds;
        }
        return -1;
    }
}
