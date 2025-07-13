package com.wdd.studentmanager.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Classname DateFormatUtil
 * @Description None
 * @Date 2024/7/2 13:22
 * 
 */
public class DateFormatUtil {
    public static String getFormatDate(Date date, String format){
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date);
    }
}
