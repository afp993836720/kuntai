package com.shengpingj.kuntai.common;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TodayDate {
    private static final String STARTTIME = " 00:00:00";
    private static final String ENDTIME = " 24:00:00";

    public static long startTime(){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
        String string = sdf.format(date);
        long time = Timestamp.valueOf(string + STARTTIME).getTime();
        return time;
    }
    public static long endTime(){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
        String string = sdf.format(date);
        long time = Timestamp.valueOf(string + ENDTIME).getTime();
        return time;
    }
    public static long StringConverLong(String time){
        return Timestamp.valueOf(time).getTime();
    }
}
