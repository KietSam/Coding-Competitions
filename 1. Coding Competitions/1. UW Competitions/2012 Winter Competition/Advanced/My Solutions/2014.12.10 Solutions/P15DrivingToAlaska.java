import java.util.*;
import java.io.*;
public class P15DrivingToAlaska {
   public static void main (String[] args) throws FileNotFoundException {
      Scanner console = new Scanner (new File("E:/Google Drive/Cleveland/3. Senior Year/8. Computer Competition/1. contest_winter_2012/JudgesData/drive.dat")); //StudentData JudgesData
      int num = console.nextInt();
      while (num != 0) {
         //System.out.println(num);
         int[] arr = new int[num];
         for (int x = 0; x < arr.length; x++) {
            arr[x] = console.nextInt();
         }
         Arrays.sort(arr);
         //System.out.println(Arrays.toString(arr));
         boolean possible = true;
         for (int x = 0; x < arr.length-1; x++) {
            if (arr[x+1] - arr[x] > 200) {
               x = arr.length;
               possible = false;
            }
         }
         int back = (1422-arr[arr.length-1])*2;
         if (back > 200) {
            possible = false;
         }
         System.out.println(possible ? "POSSIBLE" : "IMPOSSIBLE");
         num = console.nextInt();
      }
      
   } 
   
   
}

