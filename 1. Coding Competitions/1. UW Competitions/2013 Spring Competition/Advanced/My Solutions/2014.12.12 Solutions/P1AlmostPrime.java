import java.util.*;
import java.io.*;
public class P1AlmostPrime {
   public static void main (String[] args) throws FileNotFoundException {
      Scanner console = new Scanner (new File("E:/Google Drive/Cleveland/3. Senior Year/8. Computer Competition/2. contest_spring_2013/judge data/almostprime.dat")); //StudentData JudgesData
      
      
      while (console.hasNextInt()) {
         int reach = console.nextInt();
         int count = 1;
         int almostPrime = 4;
         while (count != reach) {
            almostPrime++;
            if (factors(almostPrime) == 3) {
               count++;
            }
         }
         System.out.println(almostPrime);
      }
      
   } 
   public static int factors (int a) {
      int count = 1;
      for (int x = 2; x <= a; x++) {
         if (a%x==0) {
            count++;
         }
      }
      return count;
   }
   
}

