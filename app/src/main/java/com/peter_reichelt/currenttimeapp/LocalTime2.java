package com.peter_reichelt.currenttimeapp;

import android.util.Log;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class LocalTime2 {
    int a;
    int b;


    public LocalTime2(int a, int b) {
        this.a = a;
        this.b = b;
        //this.c = c;

    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

   // public int getC() {
    //    return c;
   // }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }


    public static int addition(int a, int b){
         int c = a+b;
        return c;
    }

    public static String getLocalTime2(){
        ZonedDateTime now = ZonedDateTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println(now);
        Log.d("LocalTimeError", now.toString());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy    HH:mm:ss z");
        String formattedDateTime = now.format(formatter);
        System.out.println(formattedDateTime);

        formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss ");
        formattedDateTime = now.format(formatter);
        System.out.println(formattedDateTime);
        return formattedDateTime;
    }

}
