package org.hanson.matt.invest.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.logging.Level;

public class StringToUnixEpochDate {
    public long getEpoch(String theDate, String theDateFormat) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(theDateFormat);
        Date d = sdf.parse(theDate);
        long epoch = d.getTime() / 1000;
        //logger.log(Level.FINE, "Period1 = " + period1);
        return epoch;
    }

//    public long getTodaysEpoch() {
//        LocalDate localDate = LocalDate.now();
//        return -1;
//    }
}
