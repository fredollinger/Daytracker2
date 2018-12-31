package com.fredollinger;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Date;
import java.util.Calendar;

public class DTDate {

    private Calendar now;
    private Date currentDate;
    private int secondsPerDay = 60 * 60 * 24;

    public DTDate() {
        now = Calendar.getInstance();
        currentDate = new Date();
    }

    public static void main(String[] args) {
        System.out.println("Hello, World");
	DTDate dtd = new DTDate();
    }

}
