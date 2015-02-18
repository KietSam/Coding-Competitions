import java.util.*;
import java.io.*;
public class P13TestParity {
   public static void main (String[] args) throws FileNotFoundException {
      Scanner console = new Scanner (new File("E:/Google Drive/Cleveland/3. Senior Year/8. Computer Competition/1. contest_winter_2012/JudgesData/testparity.dat")); //StudentData JudgesData
      System.out.println(63*1.25);
      while (console.hasNextInt()) {
         int store = console.nextInt();
         if (store>0 && store <= 25) {
            store *= 2;
         }
         else if (store>25 && store <= 50){
            store  = (int)Math.round(store*1.5);
         } 
         else if (store>50 && store <= 75){
            store = (int)Math.round(store*1.25);
         } 
         else if (store>75 && store <= 100){
            
         } 
         else {
            store  = (int)(store * 0.9);
         }
         System.out.print(store + " ");
      }
   } 
}

