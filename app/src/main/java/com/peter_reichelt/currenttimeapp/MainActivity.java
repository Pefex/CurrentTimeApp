package com.peter_reichelt.currenttimeapp;

import static com.peter_reichelt.currenttimeapp.LocalTime2.addition;
import static com.peter_reichelt.currenttimeapp.LocalTime2.getLocalTime2;
import static java.time.LocalDateTime.now;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Calendar c = Calendar.getInstance();
        SimpleDateFormat dateformat = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss aa");
        String datetime = dateformat.format(c.getTime());
        System.out.println(datetime);

        //LocalDateTime now = now();

        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

        //SimpleDateFormat simpleDateFormatTime = new SimpleDateFormat("HH:mm", Locale.getDefault());
        //String strTime = simpleDateFormatTime.format(now.getTime());

        //String currentTimeString = DateFormat.getTimeInstance().format(new Date());

        //System.out.println(currentTimeString);

        //SimpleDateFormat sdf = new SimpleDateFormat("'Date\n'dd-MM-yyyy '\n\nand\n\nTime\n'HH:mm:ss z");
        //String currentDateAndTime = sdf.format(new Date());

        //System.out.println("current:" + currentDateAndTime);


        /*ZonedDateTime now = ZonedDateTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println(now);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy    HH:mm:ss z");
        String formattedDateTime = now.format(formatter);
        System.out.println(formattedDateTime);

        formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss ");
        formattedDateTime = now.format(formatter);
        System.out.println(formattedDateTime);
*/




    }

    public void onButtonClick(View v){
        TextView unix_time = ((TextView) findViewById(R.id.unixTime));
        TextView local_time = ((TextView) findViewById(R.id.localTime));
        TextView local_time2 = ((TextView) findViewById(R.id.localTime2));
/*
        Date now = new Date();
        long ut3 = now.getTime()/ 1000;
        System.out.println("UNIX Time: " + ut3);

        TimeZone tz = TimeZone.getDefault();
        int offset = tz.getOffset(now.getTime());
        long localTime = ut3 + offset / 1000;
        System.out.println("Lokale Zeit: " + new Date(localTime * 1000));

        unix_time.setText("UNIX-Zeit: " + ut3);
*/
        long time = System.currentTimeMillis();
        unix_time.setText("UNIX-Zeit: " + time);


        int ergebnis = addition(3, 6);

        System.out.println("Ergebnis Addition: " + ergebnis);

        System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
        System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
        System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
        System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");

        String localTime_2 = getLocalTime2();

        System.out.println("Neue Zeit: " + localTime_2);

        local_time2.setText("Neue Zeit: " + localTime_2);








    }












}