/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lessons;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Mohamed
 */
public class DateTimeAPI {

    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        ld = LocalDate.parse("2015-01-01");
        System.out.println(ld);

        ld = LocalDate.parse("02/02/2010", DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        System.out.println(ld);

        String isoDate = ld.toString();
        System.out.println(isoDate);
        ld = LocalDate.parse(isoDate);
        System.out.println(ld);

        //print in month day year format
        String formatted = ld.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        System.out.println(formatted);

        // format anything you want
        formatted = ld.format(DateTimeFormatter.ofPattern("MM==dd+yyyy"));
        System.out.println(formatted);

        formatted = ld.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println(formatted);

        formatted = ld.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println(formatted);

        //Future Past and Date difference
        //subtracting days
        LocalDate past = ld.minusDays(8);
        formatted = past.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println(formatted);

        // minus months
        past = ld.minusMonths(3);
        formatted = past.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println(formatted);

        Period diff = ld.until(past);
        System.out.println(diff);
        System.out.println(diff.getMonths());

        // positive
        diff = past.until(ld);
        System.out.println(diff.getMonths());

        //Time stamp
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        // lower case m is only minutes. capital M is months
        formatted = ldt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss"));
        System.out.println(formatted);

        //Date Object vs Gregorian Calendar
        Date legacyDate = new Date();
        System.out.println(legacyDate);

        //usually only for debuggin
        GregorianCalendar legacyCalendar = new GregorianCalendar();
        System.out.println(legacyCalendar);
        //

        ZonedDateTime zdt = ZonedDateTime.ofInstant(legacyDate.toInstant(), ZoneId.systemDefault());
        ld = zdt.toLocalDate();
        System.out.println(ld);

        zdt = legacyCalendar.toZonedDateTime();
        ld = zdt.toLocalDate();
        System.out.println(ld);

    }

}
