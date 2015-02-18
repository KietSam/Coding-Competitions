import java.util.*;
import java.io.*;
public class P2Factorials {
   public static void main (String[] args) throws FileNotFoundException {
      Scanner console = new Scanner (new File("E:/Google Drive/Cleveland/3. Senior Year/8. Computer Competition/1. contest_winter_2012/JudgesData/factorial.dat"));
      int count = console.nextInt();
      //console.nextLine();
      int end = 1;
      for (int x = 1; x <= count; x++) {
         end *= x;
      }
      System.out.println(end);
   } 
}
