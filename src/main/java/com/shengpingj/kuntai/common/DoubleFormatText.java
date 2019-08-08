package com.shengpingj.kuntai.common;

import java.text.DecimalFormat;

public class DoubleFormatText {
    public static String doubleFormat(double d){
        DecimalFormat df = new DecimalFormat("#0.00000");
        return df.format(d);
    }
}
