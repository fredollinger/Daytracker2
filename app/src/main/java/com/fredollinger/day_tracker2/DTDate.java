package com.fredollinger.day_tracker2;

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



    public String daysElapsedString() {
        long days = calculateElapsedDays();
        return Long.toString(days);
    }

    public void saveStringToFile(String file, String str) {
        BufferedWriter out = null;
        try {
            FileWriter fstream = new FileWriter(file); //true tells to append data.
            out = new BufferedWriter(fstream);
            out.write(str);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (Exception e) {
                    System.err.println("Error: " + e.getMessage());
                }
            }
        }
    }

    public static void main(String[] args) {
        DTDate d = new DTDate();
        System.out.println(d.calculateElapsedDays());
        d.saveStringToFile("test", d.daysElapsedString());
    }
}
