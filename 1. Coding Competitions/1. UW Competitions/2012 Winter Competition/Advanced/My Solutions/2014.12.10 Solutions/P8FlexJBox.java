import java.util.*;
import java.io.*;
public class P8FlexJBox {
   public static void main (String[] args) throws FileNotFoundException {
      Scanner console = new Scanner (new File("E:/Google Drive/Cleveland/3. Senior Year/8. Computer Competition/1. contest_winter_2012/JudgesData/flexjbox.dat")); //StudentData JudgesData
      int num = console.nextInt();
      for (int a = 1; a <= num; a++) {
         printBox(console);
         System.out.println();
      }
      
   } 
   
   public static void printBox (Scanner console) {
      int height = console.nextInt();
      int width = console.nextInt();
      int xJ = console.nextInt();
      int yJ = console.nextInt();
      
      for (int x = 0; x < height; x++) {
         for (int y = 0; y < width; y++) {
            if (x == xJ && y == yJ) {
               System.out.print("J");
            }
            else {
               System.out.print("*");
            }
         }
         System.out.println();
      }
      
   }
}

