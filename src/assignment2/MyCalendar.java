/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JTextPane;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;

/**
 *
 * @author matthewbelgre
 */
public class MyCalendar {


    int q, m, y;// day month, year
    int k; // year  % 100
    int j;// year / 100
    int week;
    int h;// day of the week
    String monthName;// name of month
    int a; //sets the range for week of month
    int space;// sets the space for the calendar print
    int b; // first week break
    int c; // break

    public MyCalendar(MyDate a) {
        q = a.getDay();//gets the day
        m = a.getMonth();// gets the month
        y = a.getYear();// gets the year
        j = y / 100;
        k = y % 100;
    }

    public Day getFirstDayOfMonth() {// returns the first day of any month 

        if (getMonth() == 13 || getMonth() == 14) {

            h = (1 + (((13 * (getMonth() + 1)) / 5)) + (k - 1) + ((k - 1) / 4) + (j / 4) + (5 * j)) % 7;
        } else {    // adjusts the formula for january and february
            h = (1 + (((13 * (getMonth() + 1)) / 5)) + k + (k / 4) + (j / 4) + (5 * j)) % 7;
        }

        Day dayOfWeek = Day.none;

        switch (h) {
            case 0:
                dayOfWeek = Day.Saturday;
                break;
            case 1:
                dayOfWeek = Day.Sunday;
                break;
            case 2:
                dayOfWeek = Day.Monday;
                break;
            case 3:
                dayOfWeek = Day.Tuesday;
                break;
            case 4:
                dayOfWeek = Day.Wednesday;
                break;
            case 5:
                dayOfWeek = Day.Thursday;
                break;
            case 6:
                dayOfWeek = Day.Friday;
        }
        return dayOfWeek;
    }

    public Day getDayOfWeek() { // returns the day for any date 

        if (getMonth() == 13 || getMonth() == 14) {

            h = (q + (((13 * (getMonth() + 1)) / 5)) + (k - 1) + ((k - 1) / 4) + (j / 4) + (5 * j)) % 7;
        } else {
            h = (q + (((13 * (getMonth() + 1)) / 5)) + k + (k / 4) + (j / 4) + (5 * j)) % 7;
        }

        Day dayOfWeek = Day.none;

        switch (h) {
            case 0:
                dayOfWeek = Day.Saturday;
                break;
            case 1:
                dayOfWeek = Day.Sunday;
                break;
            case 2:
                dayOfWeek = Day.Monday;
                break;
            case 3:
                dayOfWeek = Day.Tuesday;
                break;
            case 4:
                dayOfWeek = Day.Wednesday;
                break;
            case 5:
                dayOfWeek = Day.Thursday;
                break;
            case 6:
                dayOfWeek = Day.Friday;
        }
        return dayOfWeek;
    }

    public int getMonth() {
        int month = 0;
        switch (m) {
            case 3:
                month = 3;
                monthName = "March";
                break;                          //returns month as a value with january and february
            case 4:
                month = 4;                       //returning values of 13 and 14 respectively
                monthName = "April";             // returns the month name
                break;
            case 5:
                month = 5;
                monthName = "May";
                break;
            case 6:
                month = 6;
                monthName = "June";
                break;
            case 7:
                month = 7;
                monthName = "July";
                break;
            case 8:
                month = 8;
                monthName = "August";
                break;
            case 9:
                month = 9;
                monthName = "September";
                break;
            case 10:
                month = 10;
                monthName = "October";
                break;
            case 11:
                month = 11;
                monthName = "November";
                break;
            case 12:
                month = 12;
                monthName = "December";
                break;
            case 1:
                month = 13;
                monthName = "January";
                break;
            case 2:
                month = 14;
                monthName = "February";
                break;
        }
        return month;
    }

    public int getWeekOfMonth() {

        switch (getFirstDayOfMonth()) {
            case Monday:
                a = 7;
                break;
            case Tuesday:
                a = 6;
                break;
            case Wednesday:
                a = 5;                 //returns the week of the month
                break;
            case Thursday:
                a = 4;
                break;
            case Friday:
                a = 3;
                break;
            case Saturday:
                a = 2;
                break;
            case Sunday:
                a = 8;
                break;
        }
        if (q < a) {
            week = 1;
        } else if (q > (a - 1) && q < (a + 7)) {
            week = 2;
        } else if (q > (a + 6) && q < (a + 14)) {       // updates the range for week of month by adjusting a in relation to q(days)
            week = 3;
        } else if (q > (a + 13) && q < (a + 21)) {
            week = 4;
        } else if (q > (a + 20) && q < (a + 28)) {
            week = 5;
        } else {
            week = 6;
        }
        return week;
    }

    public String printDateInfo() {
        System.out.println("");
        switch (getWeekOfMonth()) {          //Prints the date in dd//mm//yyyy format, and shows week of month and month name
            case 1:
                return q + "/" + m + "/" + y + " is a " + getDayOfWeek()
                        + " and located in the first week of " + monthName;

            case 2:
                return q + "/" + m + "/" + y + " is a " + getDayOfWeek()
                        + " and located in the second week of " + monthName;

            case 3:
                return q + "/" + m + "/" + y + " is a " + getDayOfWeek()
                        + " and located in the third week of " + monthName;

            case 4:
                return q + "/" + m + "/" + y + " is a " + getDayOfWeek()
                        + " and located in the fourth week of " + monthName;

            case 5:
                return q + "/" + m + "/" + y + " is a " + getDayOfWeek()
                        + " and located in the fifth week of " + monthName;

            case 6:
                return q + "/" + m + "/" + y + " is a " + getDayOfWeek()
                        + " and located in the sixth week of " + monthName;

        }
        return null;
    }
//determines if year is a leap year
    public boolean isLeapYear() {
        boolean isLeapYear;

        if (y % 4 != 0) {
            isLeapYear = false;
        } else if (y % 100 != 0) {           // determines whether the year is a leap year
            isLeapYear = true;
        } else if (y % 400 != 0) {
            isLeapYear = false;
        } else {
            isLeapYear = true;
        }

        return isLeapYear;
    }
//finds given days based on what has been entered for intialisation
    private int getDaysInMonth() {

        int daysInMonth = (int) (28 + (Math.floor(m / 8.0) + m) % 2 + 2 % m + 2 * Math.floor(1.0 / m));

        if (m == 2 && isLeapYear()) {               //returns the number of days in the month
            daysInMonth += 1;
        }
        return daysInMonth;
    }
  //finds given days according to month  
     public int findDaysInMonth(int month) {

        int daysInMonth = (int) (28 + (Math.floor(month / 8.0) + month) % 2 + 2 % month + 2 * Math.floor(1.0 / month));

        if (month == 2 && isLeapYear()) {               //returns the number of days in the month
            daysInMonth += 1;
        }
        return daysInMonth;
    }



    public String printCalendar(String month) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        //tells computer to save system.out calls to the print stream
        PrintStream old = System.out;
        // Tell Java to use stream you have created
        System.setOut(ps);

        System.out.println(month);
        System.out.println("==========================");

        System.out.printf("%-4s %-4s %-4s %-4s %-4s %-7s %-6s%n", "SUN", "MON",
                "TUE", "WED", "THU", "FRI", "SAT");
        System.out.println("==========================");
        switch (getFirstDayOfMonth()) {

            case Sunday:
                space = 0;
                b = 7;
                c = 0;
                break;
            case Monday:
                space = 1;
                b = 6;
                c = b;
                break;                        
            case Tuesday:      // adjusts b and c according to position on calendar
                space = 2;     //Gives us mod value to determine spaces required 
                b = 5;          //according to first day of the mo
                c = b;
                break;
            case Wednesday:
                space = 3;
                b = 4;
                c = b;
                break;
            case Thursday:
                space = 4;
                b = 3;
                c = b;
                break;
            case Friday:
                space = 5;
                b = 2;
                c = b;
                break;
            case Saturday:
                space = 6;
                b = 1;
                c = b;
                break;
        }
        for (int d = 1; d < (space + 1); d++) {
            String startSpace = "";
            System.out.printf("%-9s", startSpace);//prints spaces before the first day of month, according to where they fall
        };

        for (int i = 1; i <= getDaysInMonth(); i++) {
            String singleDigit = String.valueOf(i);
            
            if (singleDigit.length() < 2) {
                System.out.printf("%-8s", i );
            } else {
                System.out.printf("%-7s", i);
            }

            if (i < (b + 1) && i % b == 0) {
                System.out.println();
            } //prints calendar with spaces according to position of first day
            else if ((i) % 7 == c) {
                System.out.println();
            }
        }

        System.out.flush();
        System.setOut(old);
        return baos.toString();

    }
    
    public void highLightDate(JTextPane component, String searchPattern){
              Pattern pattern = Pattern.compile(searchPattern);
    Matcher matcher = pattern.matcher(component.getText());
    // Check all occurrences
    while (matcher.find()) {
        int startChar = matcher.start();
        int endChar = matcher.end();

         Highlighter h = component.getHighlighter();
        h.removeAllHighlights();

        try {
          h.addHighlight(startChar, endChar + 2, DefaultHighlighter.DefaultPainter);
          break;
        } catch (Exception ble) {
        }
    }
    }

}
