import java.util.*;
import java.io.*;
public class P10Forests {
   public static void main (String[] args) throws FileNotFoundException {
      Scanner console = new Scanner (new File("E:/Google Drive/Cleveland/3. Senior Year/8. Computer Competition/1. contest_winter_2012/JudgesData/trees.dat")); //StudentData JudgesData
      int[] people = new int[console.nextInt()+1];
      int[] trees = new int[console.nextInt()+1];
      while (console.hasNextInt()) {
         int person = console.nextInt();
         int tree = console.nextInt();
         trees[tree]++;
         people[person]++;
      }
      int heard = 0;
      for (int x = 1; x < trees.length; x++) {
         if (trees[x] == people.length-1) {
            heard = x;
         }
      }
      
      System.out.println(heard);
      
   } 
}

