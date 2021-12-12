package org.hanson.matt.invest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InvestmentUtil1 {
    public static void main(String[] args) throws Exception {
        Logger logger = Logger.getLogger(InvestmentUtil1.class.getName());

        if (args.length < 1) {
            System.out.println("usage: InvestmentUtil1 <symbol1> <symbol2> ...");
            //return;
        }

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringAppConfig.class);

        // https://finance.yahoo.com/quote/FBIFX/history?period1=1629590400&period2=1637539200&interval=1d&filter=history&frequency=1d&includeAdjustedClose=true
        LocalDate localDate = LocalDate.parse("2021-11-22");

        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        //        formatter.parse("");
        //Instant instant = Instant.from(localDate.atStartOfDay());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sdf.parse("2021-11-12");

        long period1 = d.getTime() / 1000; //instant.getEpochSecond();
        logger.log(Level.FINE, "Period1 = " + period1);

        Date date = new Date(1637452800000L);
        long t = date.getTime();
        logger.log(Level.FINE, "Date = " + date.getTime());
    }
}
