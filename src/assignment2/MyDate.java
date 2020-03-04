/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.Scanner;

/**
 *
 * @author matthewbelgre
 */
public class MyDate{
      int day, month, year;
  
      
 public MyDate(int d, int m, int y){
     day = d;
     month = m;         //constructor
     year = y;
 }
 public int getDay(){
     return day;        //returns day
 }
  public int getMonth(){
     return month;      //returns month
 }     
  public int getYear(){
     return year;       // returns year
 }  
    public boolean isLeapYear() {
            boolean isLeapYear;
         
          if(year % 4 != 0){
           isLeapYear = false;
          }else if(year % 100 != 0){
              isLeapYear = true; 
          }else if(year % 400!= 0){
              isLeapYear = false; //determines if year is leap year
          }else{
              isLeapYear = true;
          }
      
 
        return isLeapYear;
    }
  public boolean isDateValid(){
      boolean isValid;
     //determines whether the inpt date is correct
          Scanner in = null;
       if(year < 1582||year < 1583  && month < 10 ||year < 1583 && day <= 15 && month <= 10 ||
        day == 0|| month == 0 || month > 12 || month == 1 && day > 31||month == 2 && isLeapYear() && day > 29||
        month == 2 && (!isLeapYear()) && day > 28|| month == 3 && day > 31|| month == 4 && day > 30||
        month==5 && day > 31|| month == 6 && day > 30 ||month == 7 && day > 31 ||
        month == 8 && day > 31 || month == 9 && day > 30 || month == 10 && day > 31 ||
        month == 11 && day > 30 || month == 12 && day > 31){
           isValid = false;
       }else{
           isValid = true;
       }
       
      
      return isValid;
  }
     
      
      
  }
    

 enum Day{ Saturday, Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, none
    
}

     
 

