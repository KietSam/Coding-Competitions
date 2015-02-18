import java.util.*;
import java.io.*;
public class P5CDCollection {
   public static void main (String[] args) throws FileNotFoundException {
      Scanner console = new Scanner (new File("E:/Google Drive/Cleveland/3. Senior Year/8. Computer Competition/1. contest_winter_2012/JudgesData/cds.dat")); //StudentData JudgesData
      
      int count1 = console.nextInt();
      int count2 = console.nextInt();
      console.nextLine();
      while (!(count1 == 0 && count2 == 0)) {
         System.out.println(calculateSame(count1, count2, console));
         count1 = console.nextInt();
         count2 = console.nextInt();
         //console.nextLine();
      }
            
   } 
   
   public static int calculateSame (int count1, int count2, Scanner console) {
      int[] jack = new int[count1];
      int[] jill = new int[count2];
      
      int count = 0;
      
      for (int x = 0; x < jack.length; x++) {
         jack[x] = console.nextInt();
         //console.nextLine();    
      }
      
      for (int x = 0; x < jill.length; x++) {
         jill[x] = console.nextInt();
         for (int a = 0; a < jack.length; a++) {
            if (jack[a] == jill[x]) {
               count++;
            }
         }
      }
      
      return count;
   
   }
}

