import java.util.*;
import java.io.*;
import org.joda.time.*;
public class P7DayToDay {
   public static void main (String[] args) throws FileNotFoundException {
      Scanner console = new Scanner (new File("E:/Google Drive/Cleveland/3. Senior Year/8. Computer Competition/1. contest_winter_2012/JudgesData/daytoday.dat")); //StudentData JudgesData
      int num = console.nextInt();
      
      for (int a = 1; a <= num; a++) {
         System.out.println(calculateDifference(console));
      }
      
   } 
   
   public static int calculateDifference (Scanner console) {
      int month1 = console.nextInt();
      int day1 = console.nextInt();
      int year1 = console.nextInt();
      
      int month2 = console.nextInt();
      int day2 = console.nextInt();
      int year2 = console.nextInt();
      
      LocalDate date1 = new LocalDate(year1, month1, day1);
      LocalDate date2 = new LocalDate(year2, month2, day2);
      
      return Days.daysBetween(date1,date2).getDays()-1;
   } 
}

