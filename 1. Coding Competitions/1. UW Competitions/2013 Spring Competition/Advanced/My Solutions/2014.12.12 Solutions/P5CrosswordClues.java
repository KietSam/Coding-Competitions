import java.util.*;
import java.io.*;
public class P5CrosswordClues {
   public static void main (String[] args) throws FileNotFoundException {
      Scanner console = new Scanner (new File("E:/Google Drive/Cleveland/3. Senior Year/8. Computer Competition/2. contest_spring_2013/JudgesData/CrosswordClues.dat")); //StudentData JudgesData
      String[] bank = new String[100];
      for (int a = 0; a < 100; a++) {
         bank[a] = console.next();
      }
      while (console.hasNext()) {
         String word = console.next();
         int length = word.length();
         boolean oneMatch = false;
         for (int a = 0; a < 100; a++) {
            
            if (bank[a].length() == length) {
               boolean matches = true;
               for (int x = 0; x < length; x++) {
                  if (word.charAt(x) != '*' && word.charAt(x) != bank[a].charAt(x)) {
                     matches = false;
                     x = length;
                  }
               }
               System.out.print(matches ? bank[a]+" " : "");
               if (matches == true) oneMatch = true;
            }
         }
         System.out.print(oneMatch == false ? "NO MATCH" : "");
         oneMatch = false;
         System.out.println();
      }
      
   } 
}

