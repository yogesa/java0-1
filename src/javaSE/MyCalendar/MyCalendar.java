package javaSE.MyCalendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyCalendar {
    public static void main(String[] args) {
        Calendar c =  Calendar.getInstance();
        System.out.println(c.getTime());
        c.set(2021,7,10);
        System.out.println(c.getTime());
        System.out.println(c.getWeekYear());
        c.set(Calendar.YEAR,2020);
        System.out.println(c.getWeekYear());

        c.add(Calendar.MONDAY,3);
        System.out.println(c.getTime());

        int dat = c.get(Calendar.DATE);
        System.out.println(dat);

        System.out.println(c.get(Calendar.SECOND));

        Calendar gc = GregorianCalendar.getInstance();
        Calendar gc1 = new GregorianCalendar(2020,10,10,10,10,10);
        System.out.println(gc1.getTime());
        System.out.println(gc.getTime());

        Calendar caa = new GregorianCalendar();
        System.out.println(caa.getTime());







    }
}
