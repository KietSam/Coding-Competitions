import java.util.*;
import java.io.*;
public class P7PeriodicPermutations {
   public static void main (String[] args) throws FileNotFoundException {
      Scanner console = new Scanner (new File("C:/Users/Kiet/Google Drive/Cleveland/3. Senior Year/8. Computer Competition/2. contest_spring_2013/JudgesData/periodic2.dat")); //StudentData JudgesData
      String[] symbols = new String[100];
      for (int a = 0; a < 100; a++) {
         symbols[a] = console.next();
      }
      int num = console.nextInt();
      console.nextLine();
      for (int a = 1; a <= num; a++) {
         String word = console.next();
         System.out.println(checkWorks(word, symbols) ? "yes" : "no");
      }
      
   } 
   
   public static boolean checkWorks (String word, String [] symbols) {
      String temp = "";
      if (word.equals("")) {
         return true;
      }
      int a = 2;
      if (word.length() == 1) {
         a = 1;
      }
      for (int x = 0; x < a; x++) {
         temp += word.charAt(x);
         for (int y = 0; y < 100; y++) {
            if (temp.equals(symbols[y].toLowerCase())) {
               if (checkWorks(word.substring(x+1), symbols) == true) {
                  return true;
               }
            }
         }
      }
      return false;
   }
   
}

