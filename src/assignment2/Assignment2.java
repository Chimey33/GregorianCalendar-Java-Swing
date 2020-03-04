/*CSIT 111 Assignment 2
 * Matthew Ryan Belgre
 * mrb242
 * 6110782
 */
package assignment2;
import java.util.Scanner;
/**
 *
 * @author matthewbelgre
 */
public class Assignment2{
       public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        String color = ANSI_RED + "a";
//        System.out.printf("%-7s",color,"%-7s");
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter the date as day month year:");
//        String d1 = s.next();
//        String d2 = s.next();
//       String d3 = s.next();
//        int d = stringConverter(d1);
//       int m = stringConverter(d2);
//       int y = stringConverter(d3);
//        //int m = s.nextInt();                    //asks for user input
//       // int y = s.nextInt();
//        MyDate a = new MyDate(d, m, y);
//        MyCalendar b = new MyCalendar(a);
//        System.out.printf("%-7s",color,"%-7s");
//        // b.printDateInfo();
//       //System.out.println("");
//     //  b.printCalendar();
//       for(int i = 0; i < 100; i++){
//        if (a.isDateValid()){
//        b.printDateInfo();                  //if valid will print calendar
//       System.out.println("");      
//        b.printCalendar();
//        break;}
//        else if(!a.isDateValid() ){
//         System.out.println("Please enter a valid date:");
//        System.out.println("Enter the date as day month year:");}
//        d = s.nextInt();
//        m = s.nextInt();            //if invalid will ask for user input until a valid entry is made
//        y = s.nextInt();
//        MyDate g = new MyDate(d, m, y);
//        MyCalendar h = new MyCalendar(g);
//       if (g.isDateValid()){
//         h.printDateInfo();
//         System.out.println("");    //once a valid entry is made, calendar will print
//         h.printCalendar(); 
//         break;}
         new CalendarPrint().setVisible(true);
        }
        

       
       
 }
//  public static int stringConverter(String a){
//        
//      String newString= "";
//       
//        for (int i=0; i< a.length(); i ++){
//            if(a.charAt(i)== '0'|| a.charAt( i)== '1'||a.charAt( i)== '2'||a.charAt( i)== '3'|| a.charAt( i)== '4'|| a.charAt( i)== '5'||
//                    a.charAt(i)== '6'||a.charAt(i)== '7'||a.charAt(i)== '8'||a.charAt(i)== '9'){
//                if(a.charAt(i)== ' '){break;}
//                newString= newString + a.charAt(i);
//            }
//        }
//       int stringToInt = Integer.parseInt(newString);
//       return stringToInt;
//   }  


  
 