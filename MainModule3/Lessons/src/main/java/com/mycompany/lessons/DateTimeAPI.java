/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lessons;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

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
    }
    
}
