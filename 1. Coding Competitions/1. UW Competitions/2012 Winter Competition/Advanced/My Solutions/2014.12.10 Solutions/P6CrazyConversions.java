import java.util.*;
import java.io.*;
public class P6CrazyConversions {
   public static void main (String[] args) throws FileNotFoundException {
      Scanner console = new Scanner (new File("E:/Google Drive/Cleveland/3. Senior Year/8. Computer Competition/1. contest_winter_2012/JudgesData/conversions.dat")); //StudentData JudgesData
      int num = console.nextInt();

      for (int a = 1; a <= num; a++) {
         convert(console);
         System.out.println();
      }
      
   } 
   
   public static void convert (Scanner console) {
      double a = console.nextInt();
      double b = console.nextInt();
      double c = console.nextInt();
      double d = console.nextInt();
      
      double crash = a/4+7*b;
      double dash = (a + b * b)/(a + 1/b) + a/b;
      double mash = 1/ (1/a - 1/b);
      double trash = 4/(a/b) * Math.sqrt( (1+5/(c+d))/a) - a/(c+d);
      
      System.out.printf("%.2f\n", crash);
      System.out.printf("%.2f\n", dash);
      System.out.printf("%.2f\n", mash);
      System.out.printf("%.2f\n", trash);
   }
}

