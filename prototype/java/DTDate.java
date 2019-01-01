package com.fredollinger;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Date;
import java.util.Calendar;

public class DTDate {

    private Calendar now;
    // private Date currentDate;
    private long secondsPerDay = 60 * 60 * 24;
    private long initTime;

    public DTDate() {
        now = Calendar.getInstance();
        // currentDate = new Date();
	loadInitialTime();
    }

    // TODO: Actually load a time STUB for testing
    public void loadInitialTime() {
        initTime = 1546022333;
    }

    public long getCurrentTime() {
       	 return 1546301110;
    }

    public long calculateElapsedDays() {
        return ((getCurrentTime() - initTime) / secondsPerDay);
    }

    public static void main(String[] args) {
        System.out.println("Hello, World");
	DTDate d = new DTDate();
        // System.out.println(d.getCurrentTime());
        System.out.println(d.calculateElapsedDays());
    }

}
