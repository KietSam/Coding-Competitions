import java.util.*;
import java.io.*;
public class P3GroceryTrip {
   public static void main (String[] args) throws FileNotFoundException {
      System.out.print(print());
   } 
   public static String print () throws FileNotFoundException {
      Scanner console = new Scanner (new File("E:/Google Drive/Cleveland/3. Senior Year/8. Computer Competition/1. contest_winter_2012/JudgesData/grocery2.dat"));
      int count = console.nextInt();
      console.nextLine();
      String[] arr = new String[count];
      String[] arr2 = new String[count];
      for (int x = 0; x < count; x++) {
         arr[x] = console.nextLine();
      }
      count = console.nextInt();
      console.nextLine();
      for (int x = 0; x < count; x++) {
         arr2[x] = console.nextLine();
      }
      
      for (int x = 0; x < count; x++) {
         for (int a = 0; a < arr.length; a++) {
            if (arr2[x].equals(arr[a])) {
               return "Tomatoes for youza!";
            }
         }
      }
      return "No tomatoes for youza!";
   }
}
