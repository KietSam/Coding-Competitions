import java.util.*;
import java.io.*;
public class P2KoolAid {
   public static void main (String[] args) throws FileNotFoundException {
      Scanner console = new Scanner (new File("E:/Google Drive/Cleveland/3. Senior Year/8. Computer Competition/2. contest_spring_2013/JudgesData/KoolAid.dat")); //StudentData JudgesData
      int num = console.nextInt();
      
      for (int a = 1; a <= num; a++) {
         double totalLiters = console.nextInt()*0.5;
         int large = 0;
         int medium = 0;
         int small = 0;
         large = (int)Math.floor(totalLiters/2);
         totalLiters -= large*2;
         medium = (int)Math.floor(totalLiters/1);
         totalLiters -= medium;
         small = (int)Math.floor(totalLiters/0.5);
         System.out.print(large > 0 ? (large + " large "): "");
         System.out.print(medium > 0 ? (medium + " medium "): "");
         System.out.println(small > 0 ? (small + " small "): "");
      }
      
   } 
}

