package com.company;

import java.util.*;
import java.time.*;
import java.text.*;

public class DateOfWeek {

    public String[] getDays(){
        Calendar c = Calendar.getInstance();
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        DateFormat df = new SimpleDateFormat("E dd/MM/yyyy");
        String[] days=new String[2];
        days[0]=df.format(c.getTime());
    //    for (int i = 0; i <6; i++) {
            c.add(Calendar.DATE, 6);
     //   }
        days[1]=df.format(c.getTime());
        return days;
    }
}
