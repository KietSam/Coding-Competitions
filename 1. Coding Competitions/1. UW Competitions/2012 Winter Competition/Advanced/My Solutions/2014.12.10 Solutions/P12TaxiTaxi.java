import java.util.*;
import java.io.*;
public class P12TaxiTaxi {
   public static void main (String[] args) throws FileNotFoundException {
      Scanner console = new Scanner (new File("E:/Google Drive/Cleveland/3. Senior Year/8. Computer Competition/1. contest_winter_2012/JudgesData/taxi.dat")); //StudentData JudgesData
      int num = console.nextInt();
      
      for (int a = 1; a <= num; a++) {
         double sum = 0;
         double miles = console.nextDouble();
         double seconds = console.nextInt();
         System.out.println(miles-0.2 <= 0 ? String.format("$%.2f",0.5+Math.ceil(seconds/60)*.2) : String.format("$%.2f",0.5+Math.ceil((miles-.2)/.2)*.22+Math.ceil(seconds/60)*.2));
      }
      
   } 
}

