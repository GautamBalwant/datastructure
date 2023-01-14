package com.function.example;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MyDate {

    private String dayName;
    private Date currentDate;
    private Date nextDate;


    public MyDate() {
        super();
        this.currentDate = Calendar.getInstance().getTime();
        this.dayName = getDayName(currentDate);

        this.nextDate = getNextDate(currentDate);
    }

    public Date getNextDate(Date date){
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DAY_OF_YEAR,1);
        Date dateNew = cal.getTime();
        return dateNew;
    }

    public String getDayName(Date date){
        SimpleDateFormat df = new SimpleDateFormat("EEEE");
        return df.format(date);

    }

    public boolean isWeekend(Date date){
        Calendar cal = Calendar.getInstance();

        return cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY;

    }

}
