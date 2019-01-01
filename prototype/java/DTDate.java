package com.fredollinger;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Date;
import java.util.Calendar;

public class DTDate {

    private Calendar now;
    private long secondsPerDay = 60 * 60 * 24;
    private long initTime;

    public DTDate() {
        now = Calendar.getInstance();
	loadInitialTime();
    }

    // TODO: Actually load a time STUB for testing
    public void loadInitialTime() {
        initTime = 1546022333;
    }

    public long getCurrentTimeSeconds() {
         Date currentDate = new Date();
       	 return currentDate.getTime() / 1000;
    }

    public long calculateElapsedDays() {
        return ((getCurrentTimeSeconds() - initTime) / secondsPerDay);
    }

    public static void main(String[] args) {
	DTDate d = new DTDate();
        System.out.println(d.calculateElapsedDays());
        // System.out.println("Current Time Sec");
        // System.out.println(d.getCurrentTimeSeconds());
    }

}
