package com.shengpingj.kuntai.common;

import java.text.SimpleDateFormat;
import java.util.Date;

public class IntegerConverDate {
    public static String IntegerCovDate(long d){
        Date date = new Date(d);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return simpleDateFormat.format(date);
    }

}
