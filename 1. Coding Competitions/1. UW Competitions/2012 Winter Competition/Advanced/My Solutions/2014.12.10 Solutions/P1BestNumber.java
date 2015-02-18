import java.util.*;
import java.io.*;
public class P1BestNumber {
   public static void main (String[] args) throws FileNotFoundException {
      Scanner console = new Scanner (new File("E:/Google Drive/Cleveland/3. Senior Year/8. Computer Competition/1. contest_winter_2012/JudgesData/bestnumber.dat"));
      int count = console.nextInt();
      console.nextLine();
      String a = console.nextLine();
      System.out.println(count + " " + a);
      double sum = 1;
      
      for (int x = 1; x <= count; x++) {
         double temp = console.nextDouble();mport java.util.*;
         import java.io.*;
         if (a.equals("biggest")) {
            if (temp >= 1) {
               sum *= temp;
            }
            else {
               sum /= temp;
            }
         }
         else {
            if (temp >= 1) {
               sum /= temp;
            }
            else {
               sum *= temp;
            }
         }
      }

      System.out.println(sum);
      
   } 
}
