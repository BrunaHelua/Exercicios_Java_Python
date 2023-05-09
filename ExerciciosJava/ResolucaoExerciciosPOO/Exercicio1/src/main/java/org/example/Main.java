package org.example;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LocalDate myDateObj = LocalDate.now();
        System.out.println("Before formatting: " + myDateObj);
        String date_s = " 2011-01-18 00:00:00.0";
        Scanner inputReg = new Scanner(System.in);

        DateFormat df = new SimpleDateFormat("DD/MM/YYYY");

       // SimpleDateFormat dt = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
       // Date date = dt.parse(date_s);
        //SimpleDateFormat dt1 = new SimpleDateFormat("yyyy-mm-dd");
       // System.out.println(dt1.format(date));
        //DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        //String formattedDate = myDateObj.format(myFormatObj);
        //System.out.println("After formatting: " + formattedDate);
    }
}