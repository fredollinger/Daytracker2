package com.fredollinger.day_tracker2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Date;
import java.util.Calendar;

public class DTDate {
    private Calendar now;
    private long secondsPerDay = 60 * 60 * 24;
    private long initTime;
    private String saveFileName = "day_tracker_initial_time.txt";

    public DTDate() {
        now = Calendar.getInstance();
        loadInitialTime();
    }

    public void loadInitialTime() {
	File f = new File(saveFileName);
	if(f.exists() && !f.isDirectory()) { 
	    System.out.println("dir exists");
            initTime = readInitTimeFromFile();
        }
	else {
            initTime = getCurrentTimeSeconds();
	    System.out.println("dir does not exist");
	}
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

    // If the file is corrupt, return current time,
    // and save it to a file.
    //
    // Otherwise, read the last time saved from a file
    public long readInitTimeFromFile() {
        BufferedReader reader = null;
        long lInitTime = getCurrentTimeSeconds();

	try {
            reader = new BufferedReader(new FileReader(saveFileName));
            String line = null;
            if ((line = reader.readLine()) != null) {
                lInitTime = Long.parseLong(line);
            }
	} catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                } 
            }
            catch (Exception e) {
            }
        }

        saveStringToFile(saveFileName, Long.toString(lInitTime));
        return lInitTime;
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

    public void saveCurrentTime() {
        saveStringToFile(saveFileName, Long.toString(initTime));
    }

    public void resetInitialTime() {
        initTime = getCurrentTimeSeconds();
	saveCurrentTime();
    }

    public static void main(String[] args) {
        DTDate d = new DTDate();
        System.out.println(d.calculateElapsedDays());
        d.saveCurrentTime();
        // d.saveStringToFile("test", d.daysElapsedString());
    }

}
