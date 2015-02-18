import java.util.*;
import java.io.*;
public class P4AboveAverage {

   public static void main (String[] args) throws FileNotFoundException {
      Scanner console = new Scanner (new File("E:/Google Drive/Cleveland/3. Senior Year/8. Computer Competition/1. contest_winter_2012/JudgesData/average.dat")); //StudentData JudgesData
      int count = console.nextInt();
      console.nextLine();
      for (int x = 1; x <= count; x++) {
         String temp = console.nextLine();
         System.out.println(calculatePercentage(temp) + "%");
      }
      
   } 
   
   public static String calculatePercentage (String arr) {
      Scanner console = new Scanner(arr);
      int count = console.nextInt();
      int[] store = new int[count];
      int sum = 0;
      
      for (int x = 0; x < count; x++) {
         store[x] = console.nextInt();
         sum += store[x];
      }
      
      double average = (double)sum/count;
      int numAbove = 0;
      for (int x = 0; x < count; x++) {
         if (store[x] > average) {
            numAbove++;
         }
      }
      
      return String.format("% .3f", (double)numAbove/count*100);
   }
   
}
